package typings.javascriptDashBignum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemeNumber extends js.Object {
  var fn: SchemeFn = js.native
  def apply(value: String): SchemeNumber = js.native
  def apply(value: Double): SchemeNumber = js.native
  def toExponential(fractionDigits: Double): String = js.native
  def toFixed(fractionDigits: Double): String = js.native
  def toPrecision(precision: Double): String = js.native
  def toString(radix: Double): String = js.native
}

