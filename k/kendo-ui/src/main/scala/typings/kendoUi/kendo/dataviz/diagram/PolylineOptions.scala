package typings.kendoUi.kendo.dataviz.diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolylineOptions extends js.Object {
  var endCap: js.UndefOr[String | PolylineEndCap] = js.native
  var fill: js.UndefOr[String | PolylineFill] = js.native
  var name: js.UndefOr[String] = js.native
  var startCap: js.UndefOr[String | PolylineStartCap] = js.native
  var stroke: js.UndefOr[PolylineStroke] = js.native
}

object PolylineOptions {
  @scala.inline
  def apply(): PolylineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolylineOptions]
  }
  @scala.inline
  implicit class PolylineOptionsOps[Self <: PolylineOptions] (val x: Self) extends AnyVal {
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
    def setEndCap(value: String | PolylineEndCap): Self = this.set("endCap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndCap: Self = this.set("endCap", js.undefined)
    @scala.inline
    def setFill(value: String | PolylineFill): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setStartCap(value: String | PolylineStartCap): Self = this.set("startCap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartCap: Self = this.set("startCap", js.undefined)
    @scala.inline
    def setStroke(value: PolylineStroke): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
  }
  
}

