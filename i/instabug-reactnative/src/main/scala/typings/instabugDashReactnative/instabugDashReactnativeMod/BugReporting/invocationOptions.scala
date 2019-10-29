package typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait invocationOptions extends js.Object

@JSImport("instabug-reactnative", "BugReporting.invocationOptions")
@js.native
object invocationOptions extends js.Object {
  @js.native
  sealed trait commentFieldRequired
    extends typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationOptions
  
  @js.native
  sealed trait disablePostSendingDialog
    extends typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationOptions
  
  @js.native
  sealed trait emailFieldHidden
    extends typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationOptions
  
  @js.native
  sealed trait emailFieldOptional
    extends typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationOptions
  
  /* 2 */ val commentFieldRequired: typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationOptions.commentFieldRequired with Double = js.native
  /* 3 */ val disablePostSendingDialog: typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationOptions.disablePostSendingDialog with Double = js.native
  /* 0 */ val emailFieldHidden: typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationOptions.emailFieldHidden with Double = js.native
  /* 1 */ val emailFieldOptional: typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationOptions.emailFieldOptional with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationOptions with Double
  ] = js.native
}

