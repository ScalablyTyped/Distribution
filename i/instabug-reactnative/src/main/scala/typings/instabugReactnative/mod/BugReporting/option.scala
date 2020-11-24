package typings.instabugReactnative.mod.BugReporting

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait option extends js.Object
@JSImport("instabug-reactnative", "BugReporting.option")
@js.native
object option extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[option with Double] = js.native
  
  @js.native
  sealed trait commentFieldRequired extends option
  /* 2 */ @js.native
  object commentFieldRequired extends TopLevel[commentFieldRequired with Double]
  
  @js.native
  sealed trait disablePostSendingDialog extends option
  /* 3 */ @js.native
  object disablePostSendingDialog extends TopLevel[disablePostSendingDialog with Double]
  
  @js.native
  sealed trait emailFieldHidden extends option
  /* 0 */ @js.native
  object emailFieldHidden extends TopLevel[emailFieldHidden with Double]
  
  @js.native
  sealed trait emailFieldOptional extends option
  /* 1 */ @js.native
  object emailFieldOptional extends TopLevel[emailFieldOptional with Double]
}
