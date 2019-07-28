package typings.ioDashTs.ioDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", "UnionType")
@js.native
class UnionType[CS /* <: js.Array[Any] */, A, O, I] protected () extends Type[A, O, I] {
  def this(name: String, is: Is[A], validate: Validate[I, A], encode: Encode[A, O], types: CS) = this()
  val _tag: typings.ioDashTs.ioDashTsStrings.UnionType = js.native
  val types: CS = js.native
}

