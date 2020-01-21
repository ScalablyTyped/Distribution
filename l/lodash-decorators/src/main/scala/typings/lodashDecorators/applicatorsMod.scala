package typings.lodashDecorators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/applicators", JSImport.Namespace)
@js.native
object applicatorsMod extends js.Object {
  @js.native
  abstract class Applicator ()
    extends typings.lodashDecorators.applicatorMod.Applicator
  
  @js.native
  class BindApplicator ()
    extends typings.lodashDecorators.bindApplicatorMod.BindApplicator
  
  @js.native
  class ComposeApplicator ()
    extends typings.lodashDecorators.composeApplicatorMod.ComposeApplicator {
    def this(_config: AnonPost) = this()
  }
  
  @js.native
  class InvokeApplicator ()
    extends typings.lodashDecorators.invokeApplicatorMod.InvokeApplicator
  
  @js.native
  class MemoizeApplicator ()
    extends typings.lodashDecorators.memoizeApplicatorMod.MemoizeApplicator
  
  @js.native
  class PartialApplicator ()
    extends typings.lodashDecorators.partialApplicatorMod.PartialApplicator
  
  @js.native
  class PartialValueApplicator ()
    extends typings.lodashDecorators.partialValueApplicatorMod.PartialValueApplicator
  
  @js.native
  class PartialedApplicator ()
    extends typings.lodashDecorators.partialedApplicatorMod.PartialedApplicator
  
  @js.native
  class PostValueApplicator ()
    extends typings.lodashDecorators.postValueApplicatorMod.PostValueApplicator
  
  @js.native
  class PreValueApplicator ()
    extends typings.lodashDecorators.preValueApplicatorMod.PreValueApplicator
  
  @js.native
  class WrapApplicator ()
    extends typings.lodashDecorators.wrapApplicatorMod.WrapApplicator
  
}

