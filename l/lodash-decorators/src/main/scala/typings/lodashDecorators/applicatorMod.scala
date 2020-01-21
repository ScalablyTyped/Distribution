package typings.lodashDecorators

import typings.lodashDecorators.sharedMod.ApplicateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/applicators/Applicator", JSImport.Namespace)
@js.native
object applicatorMod extends js.Object {
  @js.native
  abstract class Applicator () extends js.Object {
    @JSName("apply")
    def apply(options: ApplicateOptions): js.Any = js.native
  }
  
}

