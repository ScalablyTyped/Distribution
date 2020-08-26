package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileLayoutContainer extends js.Object {
  var bodyTemplate: js.UndefOr[String | js.Function] = js.native
  var colSpan: js.UndefOr[Double] = js.native
  var header: js.UndefOr[TileLayoutContainerHeader] = js.native
  var rowSpan: js.UndefOr[Double] = js.native
}

object TileLayoutContainer {
  @scala.inline
  def apply(): TileLayoutContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileLayoutContainer]
  }
  @scala.inline
  implicit class TileLayoutContainerOps[Self <: TileLayoutContainer] (val x: Self) extends AnyVal {
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
    def setBodyTemplate(value: String | js.Function): Self = this.set("bodyTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyTemplate: Self = this.set("bodyTemplate", js.undefined)
    @scala.inline
    def setColSpan(value: Double): Self = this.set("colSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColSpan: Self = this.set("colSpan", js.undefined)
    @scala.inline
    def setHeader(value: TileLayoutContainerHeader): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setRowSpan(value: Double): Self = this.set("rowSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowSpan: Self = this.set("rowSpan", js.undefined)
  }
  
}

