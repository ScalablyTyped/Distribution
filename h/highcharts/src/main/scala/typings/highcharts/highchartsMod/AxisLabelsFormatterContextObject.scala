package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisLabelsFormatterContextObject extends js.Object {
  var axis: Axis
  var chart: Chart
  var isFirst: Boolean
  var isLast: Boolean
  var pos: Double
  var value: Double
}

object AxisLabelsFormatterContextObject {
  @scala.inline
  def apply(axis: Axis, chart: Chart, isFirst: Boolean, isLast: Boolean, pos: Double, value: Double): AxisLabelsFormatterContextObject = {
    val __obj = js.Dynamic.literal(axis = axis, chart = chart, isFirst = isFirst, isLast = isLast, pos = pos, value = value)
  
    __obj.asInstanceOf[AxisLabelsFormatterContextObject]
  }
}

