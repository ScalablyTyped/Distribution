package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipPositionerPointObject extends js.Object {
  /**
    * If `tooltip.split` option is enabled and positioner is called for each of
    * the boxes separately, this property indicates the call on the xAxis
    * header, which is not a point itself.
    */
  var isHeader: Boolean = js.native
  /**
    * The reference point relative to the plot area. Add chart.plotLeft to get
    * the full coordinates.
    */
  var plotX: Double = js.native
  /**
    * The reference point relative to the plot area. Add chart.plotTop to get
    * the full coordinates.
    */
  var plotY: Double = js.native
}

object TooltipPositionerPointObject {
  @scala.inline
  def apply(isHeader: Boolean, plotX: Double, plotY: Double): TooltipPositionerPointObject = {
    val __obj = js.Dynamic.literal(isHeader = isHeader.asInstanceOf[js.Any], plotX = plotX.asInstanceOf[js.Any], plotY = plotY.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipPositionerPointObject]
  }
  @scala.inline
  implicit class TooltipPositionerPointObjectOps[Self <: TooltipPositionerPointObject] (val x: Self) extends AnyVal {
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
    def setIsHeader(value: Boolean): Self = this.set("isHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlotX(value: Double): Self = this.set("plotX", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlotY(value: Double): Self = this.set("plotY", value.asInstanceOf[js.Any])
  }
  
}

