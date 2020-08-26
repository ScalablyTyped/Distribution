package typings.markdownItAnchor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnchorOptions extends js.Object {
  var callback: js.UndefOr[
    js.Function2[/* token */ typings.markdownIt.tokenMod.^, /* anchor_info */ AnchorInfo, Unit]
  ] = js.native
  var level: js.UndefOr[Double] = js.native
  var permalink: js.UndefOr[Boolean] = js.native
  var permalinkBefore: js.UndefOr[Boolean] = js.native
  var permalinkClass: js.UndefOr[String] = js.native
  var permalinkHref: js.UndefOr[js.Function1[/* slug */ String, String]] = js.native
  var permalinkSymbol: js.UndefOr[String] = js.native
  var renderPermalink: js.UndefOr[
    js.Function4[
      /* slug */ String, 
      /* opts */ this.type, 
      /* state */ typings.markdownIt.parserCoreMod.^, 
      /* idx */ Double, 
      Unit
    ]
  ] = js.native
  var slugify: js.UndefOr[js.Function1[/* str */ String, String]] = js.native
}

object AnchorOptions {
  @scala.inline
  def apply(): AnchorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnchorOptions]
  }
  @scala.inline
  implicit class AnchorOptionsOps[Self <: AnchorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCallback(value: (/* token */ typings.markdownIt.tokenMod.^, /* anchor_info */ AnchorInfo) => Unit): Self = this.set("callback", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setPermalink(value: Boolean): Self = this.set("permalink", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermalink: Self = this.set("permalink", js.undefined)
    @scala.inline
    def setPermalinkBefore(value: Boolean): Self = this.set("permalinkBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermalinkBefore: Self = this.set("permalinkBefore", js.undefined)
    @scala.inline
    def setPermalinkClass(value: String): Self = this.set("permalinkClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermalinkClass: Self = this.set("permalinkClass", js.undefined)
    @scala.inline
    def setPermalinkHref(value: /* slug */ String => String): Self = this.set("permalinkHref", js.Any.fromFunction1(value))
    @scala.inline
    def deletePermalinkHref: Self = this.set("permalinkHref", js.undefined)
    @scala.inline
    def setPermalinkSymbol(value: String): Self = this.set("permalinkSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermalinkSymbol: Self = this.set("permalinkSymbol", js.undefined)
    @scala.inline
    def setRenderPermalink(
      value: (/* slug */ String, AnchorOptions, /* state */ typings.markdownIt.parserCoreMod.^, /* idx */ Double) => Unit
    ): Self = this.set("renderPermalink", js.Any.fromFunction4(value))
    @scala.inline
    def deleteRenderPermalink: Self = this.set("renderPermalink", js.undefined)
    @scala.inline
    def setSlugify(value: /* str */ String => String): Self = this.set("slugify", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSlugify: Self = this.set("slugify", js.undefined)
  }
  
}

