package typings.jss.mod

import typings.std.HTMLStyleElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleSheetFactoryOptions extends js.Object {
  var classNamePrefix: js.UndefOr[String] = js.native
  var element: js.UndefOr[HTMLStyleElement] = js.native
  var generateId: js.UndefOr[GenerateId] = js.native
  var index: js.UndefOr[Double] = js.native
  var link: js.UndefOr[Boolean] = js.native
  var media: js.UndefOr[String] = js.native
  var meta: js.UndefOr[String] = js.native
}

object StyleSheetFactoryOptions {
  @scala.inline
  def apply(): StyleSheetFactoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleSheetFactoryOptions]
  }
  @scala.inline
  implicit class StyleSheetFactoryOptionsOps[Self <: StyleSheetFactoryOptions] (val x: Self) extends AnyVal {
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
    def setClassNamePrefix(value: String): Self = this.set("classNamePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassNamePrefix: Self = this.set("classNamePrefix", js.undefined)
    @scala.inline
    def setElement(value: HTMLStyleElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setGenerateId(value: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String): Self = this.set("generateId", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGenerateId: Self = this.set("generateId", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setLink(value: Boolean): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    @scala.inline
    def setMedia(value: String): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    @scala.inline
    def setMeta(value: String): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
  }
  
}

