package typings.instabugReactnative.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait invocationOptions extends js.Object
@JSImport("instabug-reactnative", "invocationOptions")
@js.native
object invocationOptions extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[invocationOptions with Double] = js.native
  
  @js.native
  sealed trait invocationOptionsCommentFieldRequired extends invocationOptions
  /* 2 */ @js.native
  object invocationOptionsCommentFieldRequired extends TopLevel[invocationOptionsCommentFieldRequired with Double]
  
  @js.native
  sealed trait invocationOptionsDisablePostSendingDialog extends invocationOptions
  /* 3 */ @js.native
  object invocationOptionsDisablePostSendingDialog extends TopLevel[invocationOptionsDisablePostSendingDialog with Double]
  
  @js.native
  sealed trait invocationOptionsEmailFieldHidden extends invocationOptions
  /* 0 */ @js.native
  object invocationOptionsEmailFieldHidden extends TopLevel[invocationOptionsEmailFieldHidden with Double]
  
  @js.native
  sealed trait invocationOptionsEmailFieldOptional extends invocationOptions
  /* 1 */ @js.native
  object invocationOptionsEmailFieldOptional extends TopLevel[invocationOptionsEmailFieldOptional with Double]
}
