package typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting

import org.scalablytyped.runtime.TopLevel
import typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationOptions.commentFieldRequired
import typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationOptions.disablePostSendingDialog
import typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationOptions.emailFieldHidden
import typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationOptions.emailFieldOptional
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationOptions with Double
  ] = js.native
  /* 2 */ @js.native
  object commentFieldRequired extends TopLevel[commentFieldRequired with Double]
  
  /* 3 */ @js.native
  object disablePostSendingDialog extends TopLevel[disablePostSendingDialog with Double]
  
  /* 0 */ @js.native
  object emailFieldHidden extends TopLevel[emailFieldHidden with Double]
  
  /* 1 */ @js.native
  object emailFieldOptional extends TopLevel[emailFieldOptional with Double]
  
}

