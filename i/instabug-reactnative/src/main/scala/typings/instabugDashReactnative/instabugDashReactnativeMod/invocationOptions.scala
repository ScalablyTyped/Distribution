package typings.instabugDashReactnative.instabugDashReactnativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait invocationOptions extends js.Object

@JSImport("instabug-reactnative", "invocationOptions")
@js.native
object invocationOptions extends js.Object {
  @js.native
  sealed trait invocationOptionsCommentFieldRequired extends invocationOptions
  
  @js.native
  sealed trait invocationOptionsDisablePostSendingDialog extends invocationOptions
  
  @js.native
  sealed trait invocationOptionsEmailFieldHidden extends invocationOptions
  
  @js.native
  sealed trait invocationOptionsEmailFieldOptional extends invocationOptions
  
  /* 2 */ val invocationOptionsCommentFieldRequired: typings.instabugDashReactnative.instabugDashReactnativeMod.invocationOptions.invocationOptionsCommentFieldRequired with Double = js.native
  /* 3 */ val invocationOptionsDisablePostSendingDialog: typings.instabugDashReactnative.instabugDashReactnativeMod.invocationOptions.invocationOptionsDisablePostSendingDialog with Double = js.native
  /* 0 */ val invocationOptionsEmailFieldHidden: typings.instabugDashReactnative.instabugDashReactnativeMod.invocationOptions.invocationOptionsEmailFieldHidden with Double = js.native
  /* 1 */ val invocationOptionsEmailFieldOptional: typings.instabugDashReactnative.instabugDashReactnativeMod.invocationOptions.invocationOptionsEmailFieldOptional with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[invocationOptions with Double] = js.native
}

