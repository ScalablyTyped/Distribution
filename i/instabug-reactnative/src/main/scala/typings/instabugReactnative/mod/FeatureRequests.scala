package typings.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FeatureRequests {
  
  @js.native
  sealed trait actionTypes extends StObject
  @JSImport("instabug-reactnative", "FeatureRequests.actionTypes")
  @js.native
  object actionTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.instabugReactnative.mod.FeatureRequests.actionTypes with Double] = js.native
    
    @js.native
    sealed trait addCommentToFeature
      extends typings.instabugReactnative.mod.FeatureRequests.actionTypes
    /* 3 */ val addCommentToFeature: typings.instabugReactnative.mod.FeatureRequests.actionTypes.addCommentToFeature with Double = js.native
    
    @js.native
    sealed trait allActions
      extends typings.instabugReactnative.mod.FeatureRequests.actionTypes
    /* 0 */ val allActions: typings.instabugReactnative.mod.FeatureRequests.actionTypes.allActions with Double = js.native
    
    @js.native
    sealed trait reportBug
      extends typings.instabugReactnative.mod.FeatureRequests.actionTypes
    /* 1 */ val reportBug: typings.instabugReactnative.mod.FeatureRequests.actionTypes.reportBug with Double = js.native
    
    @js.native
    sealed trait requestNewFeature
      extends typings.instabugReactnative.mod.FeatureRequests.actionTypes
    /* 2 */ val requestNewFeature: typings.instabugReactnative.mod.FeatureRequests.actionTypes.requestNewFeature with Double = js.native
  }
  
  @JSImport("instabug-reactnative", "FeatureRequests.setEmailFieldRequired")
  @js.native
  def setEmailFieldRequired(
    isEmailFieldRequired: Boolean,
    actionTypes: js.Array[typings.instabugReactnative.mod.FeatureRequests.actionTypes]
  ): Unit = js.native
  
  @JSImport("instabug-reactnative", "FeatureRequests.setEnabled")
  @js.native
  def setEnabled(isEnabled: Boolean): Unit = js.native
  
  @JSImport("instabug-reactnative", "FeatureRequests.show")
  @js.native
  def show(): Unit = js.native
}
