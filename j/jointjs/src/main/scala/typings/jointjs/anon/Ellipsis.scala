package typings.jointjs.anon

import typings.std.RegExp
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ellipsis extends js.Object {
  var ellipsis: js.UndefOr[Boolean | String] = js.native
  var eol: js.UndefOr[String] = js.native
  var hyphen: js.UndefOr[String | RegExp] = js.native
  var maxLineCount: js.UndefOr[Double] = js.native
  var separator: js.UndefOr[String | js.Any] = js.native
  var svgDocument: js.UndefOr[SVGElement] = js.native
}

object Ellipsis {
  @scala.inline
  def apply(): Ellipsis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ellipsis]
  }
  @scala.inline
  implicit class EllipsisOps[Self <: Ellipsis] (val x: Self) extends AnyVal {
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
    def setEol(value: String): Self = this.set("eol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEol: Self = this.set("eol", js.undefined)
    @scala.inline
    def setHyphen(value: String | RegExp): Self = this.set("hyphen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHyphen: Self = this.set("hyphen", js.undefined)
    @scala.inline
    def setMaxLineCount(value: Double): Self = this.set("maxLineCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLineCount: Self = this.set("maxLineCount", js.undefined)
    @scala.inline
    def setSeparator(value: String | js.Any): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    @scala.inline
    def setSvgDocument(value: SVGElement): Self = this.set("svgDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvgDocument: Self = this.set("svgDocument", js.undefined)
  }
  
}

