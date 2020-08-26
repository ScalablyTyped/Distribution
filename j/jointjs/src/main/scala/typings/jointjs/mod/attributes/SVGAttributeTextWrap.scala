package typings.jointjs.mod.attributes

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGAttributeTextWrap
  extends /* key */ StringDictionary[js.Any] {
  var ellipsis: js.UndefOr[Boolean | String] = js.native
  var height: js.UndefOr[String | Double] = js.native
  var hyphen: js.UndefOr[String] = js.native
  var maxLineCount: js.UndefOr[Double] = js.native
  var text: js.UndefOr[String] = js.native
  var width: js.UndefOr[String | Double] = js.native
}

object SVGAttributeTextWrap {
  @scala.inline
  def apply(): SVGAttributeTextWrap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGAttributeTextWrap]
  }
  @scala.inline
  implicit class SVGAttributeTextWrapOps[Self <: SVGAttributeTextWrap] (val x: Self) extends AnyVal {
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
    def setEllipsis(value: Boolean | String): Self = this.set("ellipsis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEllipsis: Self = this.set("ellipsis", js.undefined)
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHyphen(value: String): Self = this.set("hyphen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHyphen: Self = this.set("hyphen", js.undefined)
    @scala.inline
    def setMaxLineCount(value: Double): Self = this.set("maxLineCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLineCount: Self = this.set("maxLineCount", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

