package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisLabelsFormatterContextObject extends js.Object {
  var axis: Axis
  var chart: Chart_
  var isFirst: Boolean
  var isLast: Boolean
  var pos: Double
  var value: Double
}

object AxisLabelsFormatterContextObject {
  @scala.inline
  def apply(axis: Axis, chart: Chart_, isFirst: Boolean, isLast: Boolean, pos: Double, value: Double): AxisLabelsFormatterContextObject = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], isFirst = isFirst.asInstanceOf[js.Any], isLast = isLast.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisLabelsFormatterContextObject]
  }
}

