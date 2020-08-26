package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxisLabelsFormatterContextObject[T] extends js.Object {
  var axis: Axis = js.native
  var chart: Chart_ = js.native
  var isFirst: Boolean = js.native
  var isLast: Boolean = js.native
  var pos: Double = js.native
  var value: T = js.native
}

object AxisLabelsFormatterContextObject {
  @scala.inline
  def apply[T](axis: Axis, chart: Chart_, isFirst: Boolean, isLast: Boolean, pos: Double, value: T): AxisLabelsFormatterContextObject[T] = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], isFirst = isFirst.asInstanceOf[js.Any], isLast = isLast.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisLabelsFormatterContextObject[T]]
  }
  @scala.inline
  implicit class AxisLabelsFormatterContextObjectOps[Self <: AxisLabelsFormatterContextObject[_], T] (val x: Self with AxisLabelsFormatterContextObject[T]) extends AnyVal {
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
    def setAxis(value: Axis): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def setChart(value: Chart_): Self = this.set("chart", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFirst(value: Boolean): Self = this.set("isFirst", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLast(value: Boolean): Self = this.set("isLast", value.asInstanceOf[js.Any])
    @scala.inline
    def setPos(value: Double): Self = this.set("pos", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

