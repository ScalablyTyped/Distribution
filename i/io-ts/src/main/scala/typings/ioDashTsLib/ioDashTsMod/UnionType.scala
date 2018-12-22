package typings
package ioDashTsLib.ioDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", "UnionType")
@js.native
class UnionType[RTS /* <: fpDashTsLib.libArrayMod.Global.Array[Any] */, A, O, I] protected () extends Type[A, O, I] {
  def this(name: java.lang.String, is: Is[A], validate: Validate[I, A], encode: Encode[A, O], types: RTS) = this()
  val _tag: ioDashTsLib.ioDashTsLibStrings.UnionType = js.native
  val types: RTS = js.native
}

