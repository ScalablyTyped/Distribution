package typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting

import org.scalablytyped.runtime.TopLevel
import typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationEvent.floatingButton
import typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationEvent.none
import typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationEvent.screenshot
import typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationEvent.shake
import typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationEvent.twoFingersSwipe
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationEvent with Double
  ] = js.native
  /* 4 */ @js.native
  object floatingButton extends TopLevel[floatingButton with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object screenshot extends TopLevel[screenshot with Double]
  
  /* 1 */ @js.native
  object shake extends TopLevel[shake with Double]
  
  /* 3 */ @js.native
  object twoFingersSwipe extends TopLevel[twoFingersSwipe with Double]
  
}

