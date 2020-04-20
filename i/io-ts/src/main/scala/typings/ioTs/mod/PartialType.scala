package typings.ioTs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", "PartialType")
@js.native
class PartialType[P, A, O, I] protected () extends Type_[A, O, I] {
  def this(name: String, is: Is[A], validate: Validate[I, A], encode: Encode[A, O], props: P) = this()
  /**
    * @since 1.0.0
    */
  val _tag: typings.ioTs.ioTsStrings.PartialType = js.native
  val props: P = js.native
}

