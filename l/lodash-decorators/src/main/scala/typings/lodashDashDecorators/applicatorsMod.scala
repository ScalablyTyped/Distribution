package typings.lodashDashDecorators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/applicators", JSImport.Namespace)
@js.native
object applicatorsMod extends js.Object {
  @js.native
  abstract class Applicator ()
    extends typings.lodashDashDecorators.applicatorsApplicatorMod.Applicator
  
  @js.native
  class BindApplicator ()
    extends typings.lodashDashDecorators.applicatorsBindApplicatorMod.BindApplicator
  
  @js.native
  class ComposeApplicator ()
    extends typings.lodashDashDecorators.applicatorsComposeApplicatorMod.ComposeApplicator {
    def this(_config: Anon_Post) = this()
  }
  
  @js.native
  class InvokeApplicator ()
    extends typings.lodashDashDecorators.applicatorsInvokeApplicatorMod.InvokeApplicator
  
  @js.native
  class MemoizeApplicator ()
    extends typings.lodashDashDecorators.applicatorsMemoizeApplicatorMod.MemoizeApplicator
  
  @js.native
  class PartialApplicator ()
    extends typings.lodashDashDecorators.applicatorsPartialApplicatorMod.PartialApplicator
  
  @js.native
  class PartialValueApplicator ()
    extends typings.lodashDashDecorators.applicatorsPartialValueApplicatorMod.PartialValueApplicator
  
  @js.native
  class PartialedApplicator ()
    extends typings.lodashDashDecorators.applicatorsPartialedApplicatorMod.PartialedApplicator
  
  @js.native
  class PostValueApplicator ()
    extends typings.lodashDashDecorators.applicatorsPostValueApplicatorMod.PostValueApplicator
  
  @js.native
  class PreValueApplicator ()
    extends typings.lodashDashDecorators.applicatorsPreValueApplicatorMod.PreValueApplicator
  
  @js.native
  class WrapApplicator ()
    extends typings.lodashDashDecorators.applicatorsWrapApplicatorMod.WrapApplicator
  
}

