package typings.markdownItAnchor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorOptions extends js.Object {
  var callback: js.UndefOr[
    js.Function2[/* token */ typings.markdownIt.tokenMod.^, /* anchor_info */ AnchorInfo, Unit]
  ] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
  var permalink: js.UndefOr[Boolean] = js.undefined
  var permalinkBefore: js.UndefOr[Boolean] = js.undefined
  var permalinkClass: js.UndefOr[String] = js.undefined
  var permalinkHref: js.UndefOr[js.Function1[/* slug */ String, String]] = js.undefined
  var permalinkSymbol: js.UndefOr[String] = js.undefined
  var renderPermalink: js.UndefOr[
    js.Function4[
      /* slug */ String, 
      /* opts */ this.type, 
      /* state */ typings.markdownIt.parserCoreMod.^, 
      /* idx */ Double, 
      Unit
    ]
  ] = js.undefined
  var slugify: js.UndefOr[js.Function1[/* str */ String, String]] = js.undefined
}

object AnchorOptions {
  @scala.inline
  def apply(
    callback: (/* token */ typings.markdownIt.tokenMod.^, /* anchor_info */ AnchorInfo) => Unit = null,
    level: Int | Double = null,
    permalink: js.UndefOr[Boolean] = js.undefined,
    permalinkBefore: js.UndefOr[Boolean] = js.undefined,
    permalinkClass: String = null,
    permalinkHref: /* slug */ String => String = null,
    permalinkSymbol: String = null,
    renderPermalink: (/* slug */ String, AnchorOptions, /* state */ typings.markdownIt.parserCoreMod.^, /* idx */ Double) => Unit = null,
    slugify: /* str */ String => String = null
  ): AnchorOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2(callback))
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(permalink)) __obj.updateDynamic("permalink")(permalink.asInstanceOf[js.Any])
    if (!js.isUndefined(permalinkBefore)) __obj.updateDynamic("permalinkBefore")(permalinkBefore.asInstanceOf[js.Any])
    if (permalinkClass != null) __obj.updateDynamic("permalinkClass")(permalinkClass.asInstanceOf[js.Any])
    if (permalinkHref != null) __obj.updateDynamic("permalinkHref")(js.Any.fromFunction1(permalinkHref))
    if (permalinkSymbol != null) __obj.updateDynamic("permalinkSymbol")(permalinkSymbol.asInstanceOf[js.Any])
    if (renderPermalink != null) __obj.updateDynamic("renderPermalink")(js.Any.fromFunction4(renderPermalink))
    if (slugify != null) __obj.updateDynamic("slugify")(js.Any.fromFunction1(slugify))
    __obj.asInstanceOf[AnchorOptions]
  }
}

