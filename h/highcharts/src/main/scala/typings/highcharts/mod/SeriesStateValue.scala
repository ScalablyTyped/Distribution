package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.highcharts.highchartsStrings.hover
  - typings.highcharts.highchartsStrings.inactive
  - typings.highcharts.highchartsStrings.normal
  - typings.highcharts.highchartsStrings.select
*/
trait SeriesStateValue extends js.Object

object SeriesStateValue {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hover: typings.highcharts.highchartsStrings.hover = this.cast("hover")
  @scala.inline
  def inactive: typings.highcharts.highchartsStrings.inactive = this.cast("inactive")
  @scala.inline
  def normal: typings.highcharts.highchartsStrings.normal = this.cast("normal")
  @scala.inline
  def select: typings.highcharts.highchartsStrings.select = this.cast("select")
}

