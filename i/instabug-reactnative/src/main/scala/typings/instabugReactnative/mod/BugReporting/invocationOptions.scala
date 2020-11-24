package typings.instabugReactnative.mod.BugReporting

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait invocationOptions extends js.Object
@JSImport("instabug-reactnative", "BugReporting.invocationOptions")
@js.native
object invocationOptions extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[invocationOptions with Double] = js.native
  
  @js.native
  sealed trait commentFieldRequired extends invocationOptions
  /* 2 */ @js.native
  object commentFieldRequired extends TopLevel[commentFieldRequired with Double]
  
  @js.native
  sealed trait disablePostSendingDialog extends invocationOptions
  /* 3 */ @js.native
  object disablePostSendingDialog extends TopLevel[disablePostSendingDialog with Double]
  
  @js.native
  sealed trait emailFieldHidden extends invocationOptions
  /* 0 */ @js.native
  object emailFieldHidden extends TopLevel[emailFieldHidden with Double]
  
  @js.native
  sealed trait emailFieldOptional extends invocationOptions
  /* 1 */ @js.native
  object emailFieldOptional extends TopLevel[emailFieldOptional with Double]
}
