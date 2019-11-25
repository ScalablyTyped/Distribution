package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.highcharts.highchartsStrings.percentage
  - typings.highcharts.highchartsStrings.pixels
  - typings.highcharts.highchartsStrings.weight
*/
trait OptionsUnitValue extends js.Object

object OptionsUnitValue {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def percentage: typings.highcharts.highchartsStrings.percentage = this.cast("percentage")
  @scala.inline
  def pixels: typings.highcharts.highchartsStrings.pixels = this.cast("pixels")
  @scala.inline
  def weight: typings.highcharts.highchartsStrings.weight = this.cast("weight")
}

