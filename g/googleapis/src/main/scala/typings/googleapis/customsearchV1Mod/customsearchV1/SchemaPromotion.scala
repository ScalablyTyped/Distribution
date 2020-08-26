package typings.googleapis.customsearchV1Mod.customsearchV1

import typings.googleapis.anon.HeightSource
import typings.googleapis.anon.HtmlTitle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPromotion extends js.Object {
  var bodyLines: js.UndefOr[js.Array[HtmlTitle]] = js.native
  var displayLink: js.UndefOr[String] = js.native
  var htmlTitle: js.UndefOr[String] = js.native
  var image: js.UndefOr[HeightSource] = js.native
  var link: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object SchemaPromotion {
  @scala.inline
  def apply(): SchemaPromotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPromotion]
  }
  @scala.inline
  implicit class SchemaPromotionOps[Self <: SchemaPromotion] (val x: Self) extends AnyVal {
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
    def setBodyLinesVarargs(value: HtmlTitle*): Self = this.set("bodyLines", js.Array(value :_*))
    @scala.inline
    def setBodyLines(value: js.Array[HtmlTitle]): Self = this.set("bodyLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyLines: Self = this.set("bodyLines", js.undefined)
    @scala.inline
    def setDisplayLink(value: String): Self = this.set("displayLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayLink: Self = this.set("displayLink", js.undefined)
    @scala.inline
    def setHtmlTitle(value: String): Self = this.set("htmlTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlTitle: Self = this.set("htmlTitle", js.undefined)
    @scala.inline
    def setImage(value: HeightSource): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

