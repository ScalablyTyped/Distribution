package typings.ioDashTs.ioDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", "refinement")
@js.native
object refinement extends js.Object {
  def apply[C /* <: Any */](
    codec: C,
    predicate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Predicate<TypeOf<C>> */ js.Any
  ): RefinementC[C] = js.native
  def apply[C /* <: Any */](
    codec: C,
    predicate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Predicate<TypeOf<C>> */ js.Any,
    name: String
  ): RefinementC[C] = js.native
}

