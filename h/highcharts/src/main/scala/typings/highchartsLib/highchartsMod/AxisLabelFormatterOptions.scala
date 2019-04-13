package typings
package highchartsLib.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisLabelFormatterOptions extends js.Object {
  var axis: AxisObject
  var chart: ChartObject
  var isFirst: scala.Double
  var isLast: scala.Double
  var value: js.Any
}

object AxisLabelFormatterOptions {
  @scala.inline
  def apply(axis: AxisObject, chart: ChartObject, isFirst: scala.Double, isLast: scala.Double, value: js.Any): AxisLabelFormatterOptions = {
    val __obj = js.Dynamic.literal(axis = axis, chart = chart, isFirst = isFirst, isLast = isLast, value = value)
  
    __obj.asInstanceOf[AxisLabelFormatterOptions]
  }
}

