package typings.instabugDashReactnative.instabugDashReactnativeMod

import org.scalablytyped.runtime.TopLevel
import typings.instabugDashReactnative.instabugDashReactnativeMod.invocationOptions.invocationOptionsCommentFieldRequired
import typings.instabugDashReactnative.instabugDashReactnativeMod.invocationOptions.invocationOptionsDisablePostSendingDialog
import typings.instabugDashReactnative.instabugDashReactnativeMod.invocationOptions.invocationOptionsEmailFieldHidden
import typings.instabugDashReactnative.instabugDashReactnativeMod.invocationOptions.invocationOptionsEmailFieldOptional
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[invocationOptions with Double] = js.native
  /* 2 */ @js.native
  object invocationOptionsCommentFieldRequired extends TopLevel[invocationOptionsCommentFieldRequired with Double]
  
  /* 3 */ @js.native
  object invocationOptionsDisablePostSendingDialog extends TopLevel[invocationOptionsDisablePostSendingDialog with Double]
  
  /* 0 */ @js.native
  object invocationOptionsEmailFieldHidden extends TopLevel[invocationOptionsEmailFieldHidden with Double]
  
  /* 1 */ @js.native
  object invocationOptionsEmailFieldOptional extends TopLevel[invocationOptionsEmailFieldOptional with Double]
  
}

