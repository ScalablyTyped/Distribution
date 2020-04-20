package typings.ioTs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", "UnionType")
@js.native
class UnionType[CS /* <: js.Array[Any_] */, A, O, I] protected () extends Type_[A, O, I] {
  def this(name: String, is: Is[A], validate: Validate[I, A], encode: Encode[A, O], types: CS) = this()
  /**
    * @since 1.0.0
    */
  val _tag: typings.ioTs.ioTsStrings.UnionType = js.native
  val types: CS = js.native
}

