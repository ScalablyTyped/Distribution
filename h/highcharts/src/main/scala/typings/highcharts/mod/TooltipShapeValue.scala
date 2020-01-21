package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.highcharts.highchartsStrings.callout
  - typings.highcharts.highchartsStrings.circle
  - typings.highcharts.highchartsStrings.square
*/
trait TooltipShapeValue extends js.Object

object TooltipShapeValue {
  @scala.inline
  def callout: typings.highcharts.highchartsStrings.callout = this.cast("callout")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def circle: typings.highcharts.highchartsStrings.circle = this.cast("circle")
  @scala.inline
  def square: typings.highcharts.highchartsStrings.square = this.cast("square")
}

