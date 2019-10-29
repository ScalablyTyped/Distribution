package typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait option extends js.Object

@JSImport("instabug-reactnative", "BugReporting.option")
@js.native
object option extends js.Object {
  @js.native
  sealed trait commentFieldRequired extends option
  
  @js.native
  sealed trait disablePostSendingDialog extends option
  
  @js.native
  sealed trait emailFieldHidden extends option
  
  @js.native
  sealed trait emailFieldOptional extends option
  
  /* 2 */ val commentFieldRequired: typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.option.commentFieldRequired with Double = js.native
  /* 3 */ val disablePostSendingDialog: typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.option.disablePostSendingDialog with Double = js.native
  /* 0 */ val emailFieldHidden: typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.option.emailFieldHidden with Double = js.native
  /* 1 */ val emailFieldOptional: typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.option.emailFieldOptional with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[option with Double] = js.native
}

