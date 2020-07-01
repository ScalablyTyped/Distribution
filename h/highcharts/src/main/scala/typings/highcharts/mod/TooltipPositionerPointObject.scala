package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipPositionerPointObject extends js.Object {
  /**
    * If `tooltip.split` option is enabled and positioner is called for each of
    * the boxes separately, this property indicates the call on the xAxis
    * header, which is not a point itself.
    */
  var isHeader: Boolean
  /**
    * The reference point relative to the plot area. Add chart.plotLeft to get
    * the full coordinates.
    */
  var plotX: Double
  /**
    * The reference point relative to the plot area. Add chart.plotTop to get
    * the full coordinates.
    */
  var plotY: Double
}

object TooltipPositionerPointObject {
  @scala.inline
  def apply(isHeader: Boolean, plotX: Double, plotY: Double): TooltipPositionerPointObject = {
    val __obj = js.Dynamic.literal(isHeader = isHeader.asInstanceOf[js.Any], plotX = plotX.asInstanceOf[js.Any], plotY = plotY.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipPositionerPointObject]
  }
}

