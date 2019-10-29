package typings.instabugDashReactnative.instabugDashReactnativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instabug-reactnative", "FeatureRequests")
@js.native
object FeatureRequests extends js.Object {
  @js.native
  sealed trait actionTypes extends js.Object
  
  def setEmailFieldRequired(
    isEmailFieldRequired: Boolean,
    actionTypes: js.Array[
      typings.instabugDashReactnative.instabugDashReactnativeMod.FeatureRequests.actionTypes
    ]
  ): Unit = js.native
  def setEnabled(isEnabled: Boolean): Unit = js.native
  def show(): Unit = js.native
  @js.native
  object actionTypes extends js.Object {
    @js.native
    sealed trait addCommentToFeature
      extends typings.instabugDashReactnative.instabugDashReactnativeMod.FeatureRequests.actionTypes
    
    @js.native
    sealed trait allActions
      extends typings.instabugDashReactnative.instabugDashReactnativeMod.FeatureRequests.actionTypes
    
    @js.native
    sealed trait reportBug
      extends typings.instabugDashReactnative.instabugDashReactnativeMod.FeatureRequests.actionTypes
    
    @js.native
    sealed trait requestNewFeature
      extends typings.instabugDashReactnative.instabugDashReactnativeMod.FeatureRequests.actionTypes
    
    /* 3 */ val addCommentToFeature: typings.instabugDashReactnative.instabugDashReactnativeMod.FeatureRequests.actionTypes.addCommentToFeature with Double = js.native
    /* 0 */ val allActions: typings.instabugDashReactnative.instabugDashReactnativeMod.FeatureRequests.actionTypes.allActions with Double = js.native
    /* 1 */ val reportBug: typings.instabugDashReactnative.instabugDashReactnativeMod.FeatureRequests.actionTypes.reportBug with Double = js.native
    /* 2 */ val requestNewFeature: typings.instabugDashReactnative.instabugDashReactnativeMod.FeatureRequests.actionTypes.requestNewFeature with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.instabugDashReactnative.instabugDashReactnativeMod.FeatureRequests.actionTypes with Double
      ] = js.native
  }
  
}

