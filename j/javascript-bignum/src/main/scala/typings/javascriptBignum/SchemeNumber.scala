package typings.javascriptBignum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemeNumber extends js.Object {
  
  def apply(value: String): SchemeNumber = js.native
  def apply(value: Double): SchemeNumber = js.native
  
  var fn: SchemeFn = js.native
  
  def toExponential(fractionDigits: Double): String = js.native
  
  def toFixed(fractionDigits: Double): String = js.native
  
  def toPrecision(precision: Double): String = js.native
  
  def toString(radix: Double): String = js.native
}
