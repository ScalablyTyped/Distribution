package typings.highcharts.mod

import typings.highcharts.highchartsStrings.chart_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.highcharts.highchartsStrings.chart_
  - typings.highcharts.highchartsStrings.flap
  - typings.highcharts.highchartsStrings.offset
  - typings.highcharts.highchartsStrings.ortho
*/
trait OptionsPosition3dValue extends js.Object

object OptionsPosition3dValue {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chart: chart_ = this.cast("chart")
  @scala.inline
  def flap: typings.highcharts.highchartsStrings.flap = this.cast("flap")
  @scala.inline
  def offset: typings.highcharts.highchartsStrings.offset = this.cast("offset")
  @scala.inline
  def ortho: typings.highcharts.highchartsStrings.ortho = this.cast("ortho")
}

