package typings.lodashDecorators

import typings.lodashDecorators.anon.Post
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applicatorsMod {
  
  @JSImport("lodash-decorators/applicators", "Applicator")
  @js.native
  abstract class Applicator ()
    extends typings.lodashDecorators.applicatorMod.Applicator
  
  @JSImport("lodash-decorators/applicators", "BindApplicator")
  @js.native
  class BindApplicator ()
    extends typings.lodashDecorators.bindApplicatorMod.BindApplicator
  
  @JSImport("lodash-decorators/applicators", "ComposeApplicator")
  @js.native
  class ComposeApplicator ()
    extends typings.lodashDecorators.composeApplicatorMod.ComposeApplicator {
    def this(_config: Post) = this()
  }
  
  @JSImport("lodash-decorators/applicators", "InvokeApplicator")
  @js.native
  class InvokeApplicator ()
    extends typings.lodashDecorators.invokeApplicatorMod.InvokeApplicator
  
  @JSImport("lodash-decorators/applicators", "MemoizeApplicator")
  @js.native
  class MemoizeApplicator ()
    extends typings.lodashDecorators.memoizeApplicatorMod.MemoizeApplicator
  
  @JSImport("lodash-decorators/applicators", "PartialApplicator")
  @js.native
  class PartialApplicator ()
    extends typings.lodashDecorators.partialApplicatorMod.PartialApplicator
  
  @JSImport("lodash-decorators/applicators", "PartialValueApplicator")
  @js.native
  class PartialValueApplicator ()
    extends typings.lodashDecorators.partialValueApplicatorMod.PartialValueApplicator
  
  @JSImport("lodash-decorators/applicators", "PartialedApplicator")
  @js.native
  class PartialedApplicator ()
    extends typings.lodashDecorators.partialedApplicatorMod.PartialedApplicator
  
  @JSImport("lodash-decorators/applicators", "PostValueApplicator")
  @js.native
  class PostValueApplicator ()
    extends typings.lodashDecorators.postValueApplicatorMod.PostValueApplicator
  
  @JSImport("lodash-decorators/applicators", "PreValueApplicator")
  @js.native
  class PreValueApplicator ()
    extends typings.lodashDecorators.preValueApplicatorMod.PreValueApplicator
  
  @JSImport("lodash-decorators/applicators", "WrapApplicator")
  @js.native
  class WrapApplicator ()
    extends typings.lodashDecorators.wrapApplicatorMod.WrapApplicator
}
