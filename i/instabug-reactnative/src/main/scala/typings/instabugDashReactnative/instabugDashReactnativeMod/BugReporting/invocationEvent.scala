package typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait invocationEvent extends js.Object

@JSImport("instabug-reactnative", "BugReporting.invocationEvent")
@js.native
object invocationEvent extends js.Object {
  @js.native
  sealed trait floatingButton
    extends typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationEvent
  
  @js.native
  sealed trait none
    extends typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationEvent
  
  @js.native
  sealed trait screenshot
    extends typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationEvent
  
  @js.native
  sealed trait shake
    extends typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationEvent
  
  @js.native
  sealed trait twoFingersSwipe
    extends typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationEvent
  
  /* 4 */ val floatingButton: typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationEvent.floatingButton with Double = js.native
  /* 0 */ val none: typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationEvent.none with Double = js.native
  /* 2 */ val screenshot: typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationEvent.screenshot with Double = js.native
  /* 1 */ val shake: typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationEvent.shake with Double = js.native
  /* 3 */ val twoFingersSwipe: typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationEvent.twoFingersSwipe with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationEvent with Double
  ] = js.native
}

