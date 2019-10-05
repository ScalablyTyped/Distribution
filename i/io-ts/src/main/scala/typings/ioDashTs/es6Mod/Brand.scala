package typings.ioDashTs.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Brand[B] extends js.Object

@JSImport("io-ts/es6", "brand")
@js.native
object brand extends js.Object {
  def apply[C /* <: Any */, N /* <: String */, B /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {readonly [ K in N ]: symbol}
    */ typings.ioDashTs.ioDashTsStrings.brand with js.Any */](
    codec: C,
    predicate: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Refinement<C['_A'], Branded<C['_A'], B>> */ js.Any,
    name: N
  ): BrandC[C, B] = js.native
}

