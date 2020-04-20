package typings.ioTs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", "ArrayType")
@js.native
class ArrayType[C /* <: Any_ */, A, O, I] protected () extends Type_[A, O, I] {
  def this(name: String, is: Is[A], validate: Validate[I, A], encode: Encode[A, O], `type`: C) = this()
  /**
    * @since 1.0.0
    */
  val _tag: typings.ioTs.ioTsStrings.ArrayType = js.native
  val `type`: C = js.native
}

