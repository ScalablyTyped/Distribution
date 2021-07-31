package typings.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait invocationOptions extends StObject
@JSImport("instabug-reactnative", "invocationOptions")
@js.native
object invocationOptions extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[invocationOptions & Double] = js.native
  
  @js.native
  sealed trait invocationOptionsCommentFieldRequired
    extends StObject
       with invocationOptions
  /* 2 */ val invocationOptionsCommentFieldRequired: typings.instabugReactnative.mod.invocationOptions.invocationOptionsCommentFieldRequired & Double = js.native
  
  @js.native
  sealed trait invocationOptionsDisablePostSendingDialog
    extends StObject
       with invocationOptions
  /* 3 */ val invocationOptionsDisablePostSendingDialog: typings.instabugReactnative.mod.invocationOptions.invocationOptionsDisablePostSendingDialog & Double = js.native
  
  @js.native
  sealed trait invocationOptionsEmailFieldHidden
    extends StObject
       with invocationOptions
  /* 0 */ val invocationOptionsEmailFieldHidden: typings.instabugReactnative.mod.invocationOptions.invocationOptionsEmailFieldHidden & Double = js.native
  
  @js.native
  sealed trait invocationOptionsEmailFieldOptional
    extends StObject
       with invocationOptions
  /* 1 */ val invocationOptionsEmailFieldOptional: typings.instabugReactnative.mod.invocationOptions.invocationOptionsEmailFieldOptional & Double = js.native
}
