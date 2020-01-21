package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highcharts", "numberFormat")
@js.native
object numberFormat extends js.Object {
  def apply(number: Double, decimals: Double): String = js.native
  def apply(number: Double, decimals: Double, decimalPoint: String): String = js.native
  def apply(number: Double, decimals: Double, decimalPoint: String, thousandsSep: String): String = js.native
}

