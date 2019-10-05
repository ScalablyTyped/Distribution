package typings.ioDashTs.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/es6", "refinement")
@js.native
object refinement extends js.Object {
  def apply[C /* <: Any */](
    codec: C,
    predicate: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Predicate<TypeOf<C>> */ js.Any
  ): RefinementC[C] = js.native
  def apply[C /* <: Any */](
    codec: C,
    predicate: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Predicate<TypeOf<C>> */ js.Any,
    name: String
  ): RefinementC[C] = js.native
}

