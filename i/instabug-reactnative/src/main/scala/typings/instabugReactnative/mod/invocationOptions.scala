package typings.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait invocationOptions extends StObject
@JSImport("instabug-reactnative", "invocationOptions")
@js.native
object invocationOptions extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[invocationOptions with Double] = js.native
  
  @js.native
  sealed trait invocationOptionsCommentFieldRequired extends invocationOptions
  /* 2 */ val invocationOptionsCommentFieldRequired: typings.instabugReactnative.mod.invocationOptions.invocationOptionsCommentFieldRequired with Double = js.native
  
  @js.native
  sealed trait invocationOptionsDisablePostSendingDialog extends invocationOptions
  /* 3 */ val invocationOptionsDisablePostSendingDialog: typings.instabugReactnative.mod.invocationOptions.invocationOptionsDisablePostSendingDialog with Double = js.native
  
  @js.native
  sealed trait invocationOptionsEmailFieldHidden extends invocationOptions
  /* 0 */ val invocationOptionsEmailFieldHidden: typings.instabugReactnative.mod.invocationOptions.invocationOptionsEmailFieldHidden with Double = js.native
  
  @js.native
  sealed trait invocationOptionsEmailFieldOptional extends invocationOptions
  /* 1 */ val invocationOptionsEmailFieldOptional: typings.instabugReactnative.mod.invocationOptions.invocationOptionsEmailFieldOptional with Double = js.native
}
