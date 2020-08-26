package typings.kendoUi.kendo.dataviz.diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathOptions extends js.Object {
  var data: js.UndefOr[String] = js.native
  var endCap: js.UndefOr[String | PathEndCap] = js.native
  var fill: js.UndefOr[String | PathFill] = js.native
  var height: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var startCap: js.UndefOr[String | PathStartCap] = js.native
  var stroke: js.UndefOr[PathStroke] = js.native
  var width: js.UndefOr[Double] = js.native
  var x: js.UndefOr[Double] = js.native
  var y: js.UndefOr[Double] = js.native
}

object PathOptions {
  @scala.inline
  def apply(): PathOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathOptions]
  }
  @scala.inline
  implicit class PathOptionsOps[Self <: PathOptions] (val x: Self) extends AnyVal {
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setEndCap(value: String | PathEndCap): Self = this.set("endCap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndCap: Self = this.set("endCap", js.undefined)
    @scala.inline
    def setFill(value: String | PathFill): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setStartCap(value: String | PathStartCap): Self = this.set("startCap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartCap: Self = this.set("startCap", js.undefined)
    @scala.inline
    def setStroke(value: PathStroke): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

