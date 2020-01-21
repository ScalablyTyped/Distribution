package typings.ioTs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", "RefinementType")
@js.native
class RefinementType[C /* <: Any_ */, A, O, I] protected () extends Type_[A, O, I] {
  def this(
    name: String,
    is: Is[A],
    validate: Validate[I, A],
    encode: Encode[A, O],
    `type`: C,
    predicate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Predicate<A> */ js.Any
  ) = this()
  val _tag: typings.ioTs.ioTsStrings.RefinementType = js.native
  val predicate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Predicate<A> */ js.Any = js.native
  val `type`: C = js.native
}

