package typings.instabugReactnative.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instabug-reactnative", "FeatureRequests")
@js.native
object FeatureRequests extends js.Object {
  
  def setEmailFieldRequired(
    isEmailFieldRequired: Boolean,
    actionTypes: js.Array[typings.instabugReactnative.mod.FeatureRequests.actionTypes]
  ): Unit = js.native
  
  def setEnabled(isEnabled: Boolean): Unit = js.native
  
  def show(): Unit = js.native
  
  @js.native
  sealed trait actionTypes extends js.Object
  @js.native
  object actionTypes extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.instabugReactnative.mod.FeatureRequests.actionTypes with Double] = js.native
    
    @js.native
    sealed trait addCommentToFeature
      extends typings.instabugReactnative.mod.FeatureRequests.actionTypes
    /* 3 */ @js.native
    object addCommentToFeature extends TopLevel[addCommentToFeature with Double]
    
    @js.native
    sealed trait allActions
      extends typings.instabugReactnative.mod.FeatureRequests.actionTypes
    /* 0 */ @js.native
    object allActions extends TopLevel[allActions with Double]
    
    @js.native
    sealed trait reportBug
      extends typings.instabugReactnative.mod.FeatureRequests.actionTypes
    /* 1 */ @js.native
    object reportBug extends TopLevel[reportBug with Double]
    
    @js.native
    sealed trait requestNewFeature
      extends typings.instabugReactnative.mod.FeatureRequests.actionTypes
    /* 2 */ @js.native
    object requestNewFeature extends TopLevel[requestNewFeature with Double]
  }
}
