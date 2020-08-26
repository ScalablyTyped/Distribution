package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparklineSeriesItemMarkersBorder extends js.Object {
  var color: js.UndefOr[String | js.Function] = js.native
  var width: js.UndefOr[Double | js.Function] = js.native
}

object SparklineSeriesItemMarkersBorder {
  @scala.inline
  def apply(): SparklineSeriesItemMarkersBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineSeriesItemMarkersBorder]
  }
  @scala.inline
  implicit class SparklineSeriesItemMarkersBorderOps[Self <: SparklineSeriesItemMarkersBorder] (val x: Self) extends AnyVal {
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
    def setColor(value: String | js.Function): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setWidth(value: Double | js.Function): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

