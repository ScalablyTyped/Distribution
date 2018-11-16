package typings
package ioDashTsLib.ioDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", "TupleType")
@js.native
class TupleType[RTS /* <: ioDashTsLib.ioDashTsMod.Global.Array[Any] */, A, O, I] protected () extends Type[A, O, I] {
  def this(name: java.lang.String, is: Is[A], validate: Validate[I, A], encode: Encode[A, O], types: RTS) = this()
  val _tag: ioDashTsLib.ioDashTsLibStrings.TupleType = js.native
  val types: RTS = js.native
}

