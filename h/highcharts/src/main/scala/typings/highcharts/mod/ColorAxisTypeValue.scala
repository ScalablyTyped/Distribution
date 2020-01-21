package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.highcharts.highchartsStrings.linear
  - typings.highcharts.highchartsStrings.logarithmic
*/
trait ColorAxisTypeValue extends js.Object

object ColorAxisTypeValue {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def linear: typings.highcharts.highchartsStrings.linear = this.cast("linear")
  @scala.inline
  def logarithmic: typings.highcharts.highchartsStrings.logarithmic = this.cast("logarithmic")
}

