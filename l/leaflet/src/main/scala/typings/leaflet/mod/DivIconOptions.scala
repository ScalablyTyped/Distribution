package typings.leaflet.mod

import typings.leaflet.leafletBooleans.`false`
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DivIconOptions extends BaseIconOptions {
  var bgPos: js.UndefOr[PointExpression] = js.native
  var html: js.UndefOr[String | HTMLElement | `false`] = js.native
}

object DivIconOptions {
  @scala.inline
  def apply(): DivIconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DivIconOptions]
  }
  @scala.inline
  implicit class DivIconOptionsOps[Self <: DivIconOptions] (val x: Self) extends AnyVal {
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
    def setBgPos(value: PointExpression): Self = this.set("bgPos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgPos: Self = this.set("bgPos", js.undefined)
    @scala.inline
    def setHtml(value: String | HTMLElement | `false`): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
  }
  
}

