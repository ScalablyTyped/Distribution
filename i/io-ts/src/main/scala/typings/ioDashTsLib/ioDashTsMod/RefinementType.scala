package typings
package ioDashTsLib.ioDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", "RefinementType")
@js.native
class RefinementType[RT /* <: Any */, A, O, I] protected () extends Type[A, O, I] {
  def this(name: java.lang.String, is: Is[A], validate: Validate[I, A], encode: Encode[A, O], `type`: RT, predicate: fpDashTsLib.libFunctionMod.Predicate[A]) = this()
  val _tag: ioDashTsLib.ioDashTsLibStrings.RefinementType = js.native
  val `type`: RT = js.native
  def predicate(a: A): scala.Boolean = js.native
}

