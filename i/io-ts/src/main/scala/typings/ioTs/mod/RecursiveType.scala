package typings.ioTs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", "RecursiveType")
@js.native
class RecursiveType[C /* <: Any_ */, A, O, I] protected () extends Type_[A, O, I] {
  def this(
    name: String,
    is: Is[A],
    validate: Validate[I, A],
    encode: Encode[A, O],
    runDefinition: js.Function0[C]
  ) = this()
  val _tag: typings.ioTs.ioTsStrings.RecursiveType = js.native
  val `type`: C = js.native
  def runDefinition(): C = js.native
}

