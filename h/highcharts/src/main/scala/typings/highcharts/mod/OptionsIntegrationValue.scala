package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.highcharts.highchartsStrings.euler
  - typings.highcharts.highchartsStrings.verlet
*/
trait OptionsIntegrationValue extends js.Object

object OptionsIntegrationValue {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def euler: typings.highcharts.highchartsStrings.euler = this.cast("euler")
  @scala.inline
  def verlet: typings.highcharts.highchartsStrings.verlet = this.cast("verlet")
}

