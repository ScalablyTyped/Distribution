package typings
package javascriptDashBignumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemeNumber extends js.Object {
  var fn: SchemeFn = js.native
  def apply(value: java.lang.String): SchemeNumber = js.native
  def apply(value: scala.Double): SchemeNumber = js.native
  def toExponential(fractionDigits: scala.Double): java.lang.String = js.native
  def toFixed(fractionDigits: scala.Double): java.lang.String = js.native
  def toPrecision(precision: scala.Double): java.lang.String = js.native
  def toString(radix: scala.Double): java.lang.String = js.native
}

