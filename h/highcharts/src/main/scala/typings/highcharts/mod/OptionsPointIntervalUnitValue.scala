package typings.highcharts.mod

import typings.highcharts.highchartsStrings.day_
import typings.highcharts.highchartsStrings.month_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.highcharts.highchartsStrings.day_
  - typings.highcharts.highchartsStrings.month_
  - typings.highcharts.highchartsStrings.year
*/
trait OptionsPointIntervalUnitValue extends js.Object

object OptionsPointIntervalUnitValue {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def day: day_ = this.cast("day")
  @scala.inline
  def month: month_ = this.cast("month")
  @scala.inline
  def year: typings.highcharts.highchartsStrings.year = this.cast("year")
}

