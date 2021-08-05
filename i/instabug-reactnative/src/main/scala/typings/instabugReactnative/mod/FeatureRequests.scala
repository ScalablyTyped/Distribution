package typings.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FeatureRequests {
  
  @JSImport("instabug-reactnative", "FeatureRequests")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait actionTypes extends StObject
  @JSImport("instabug-reactnative", "FeatureRequests.actionTypes")
  @js.native
  object actionTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.instabugReactnative.mod.FeatureRequests.actionTypes & Double] = js.native
    
    @js.native
    sealed trait addCommentToFeature
      extends StObject
         with typings.instabugReactnative.mod.FeatureRequests.actionTypes
    /* 3 */ val addCommentToFeature: typings.instabugReactnative.mod.FeatureRequests.actionTypes.addCommentToFeature & Double = js.native
    
    @js.native
    sealed trait allActions
      extends StObject
         with typings.instabugReactnative.mod.FeatureRequests.actionTypes
    /* 0 */ val allActions: typings.instabugReactnative.mod.FeatureRequests.actionTypes.allActions & Double = js.native
    
    @js.native
    sealed trait reportBug
      extends StObject
         with typings.instabugReactnative.mod.FeatureRequests.actionTypes
    /* 1 */ val reportBug: typings.instabugReactnative.mod.FeatureRequests.actionTypes.reportBug & Double = js.native
    
    @js.native
    sealed trait requestNewFeature
      extends StObject
         with typings.instabugReactnative.mod.FeatureRequests.actionTypes
    /* 2 */ val requestNewFeature: typings.instabugReactnative.mod.FeatureRequests.actionTypes.requestNewFeature & Double = js.native
  }
  
  inline def setEmailFieldRequired(
    isEmailFieldRequired: Boolean,
    actionTypes: js.Array[typings.instabugReactnative.mod.FeatureRequests.actionTypes]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setEmailFieldRequired")(isEmailFieldRequired.asInstanceOf[js.Any], actionTypes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setEnabled(isEnabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEnabled")(isEnabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def show(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")().asInstanceOf[Unit]
}
