package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.highcharts.highchartsStrings.category
  - typings.highcharts.highchartsStrings.datetime
  - typings.highcharts.highchartsStrings.linear
  - typings.highcharts.highchartsStrings.logarithmic
  - typings.highcharts.highchartsStrings.treegrid
*/
trait AxisTypeValue extends js.Object

object AxisTypeValue {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def category: typings.highcharts.highchartsStrings.category = this.cast("category")
  @scala.inline
  def datetime: typings.highcharts.highchartsStrings.datetime = this.cast("datetime")
  @scala.inline
  def linear: typings.highcharts.highchartsStrings.linear = this.cast("linear")
  @scala.inline
  def logarithmic: typings.highcharts.highchartsStrings.logarithmic = this.cast("logarithmic")
  @scala.inline
  def treegrid: typings.highcharts.highchartsStrings.treegrid = this.cast("treegrid")
}

