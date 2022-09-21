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
  /**
    * Instabug action types.
    * @readonly
    * @enum {number}
    */
  @JSImport("instabug-reactnative", "FeatureRequests.actionTypes")
  @js.native
  object actionTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.instabugReactnative.mod.FeatureRequests.actionTypes & Double] = js.native
    
    @js.native
    sealed trait addCommentToFeature
      extends StObject
         with typings.instabugReactnative.mod.FeatureRequests.actionTypes
    /* 1 */ val addCommentToFeature: typings.instabugReactnative.mod.FeatureRequests.actionTypes.addCommentToFeature & Double = js.native
    
    @js.native
    sealed trait requestNewFeature
      extends StObject
         with typings.instabugReactnative.mod.FeatureRequests.actionTypes
    /* 0 */ val requestNewFeature: typings.instabugReactnative.mod.FeatureRequests.actionTypes.requestNewFeature & Double = js.native
  }
  
  /**
    * Sets whether users are required to enter an email address or not when
    * sending reports.
    * Defaults to YES.
    * @param {boolean} isEmailFieldRequired A boolean to indicate whether email
    * field is required or not.
    * @param {actionTypes} actionTypes An enum that indicates which action
    *                                  types will have the isEmailFieldRequired
    */
  inline def setEmailFieldRequired(
    isEmailFieldRequired: Boolean,
    actionTypes: js.Array[typings.instabugReactnative.mod.FeatureRequests.actionTypes]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setEmailFieldRequired")(isEmailFieldRequired.asInstanceOf[js.Any], actionTypes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Enables and disables everything related to feature requests.
    * @param {boolean} isEnabled 
    */
  inline def setEnabled(isEnabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEnabled")(isEnabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Shows the UI for feature requests list
    *
    */
  inline def show(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")().asInstanceOf[Unit]
}
