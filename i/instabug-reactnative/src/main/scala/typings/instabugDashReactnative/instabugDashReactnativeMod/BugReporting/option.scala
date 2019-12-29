package typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[option with Double] = js.native
  /* 2 */ @js.native
  object commentFieldRequired extends TopLevel[commentFieldRequired with Double]
  
  /* 3 */ @js.native
  object disablePostSendingDialog extends TopLevel[disablePostSendingDialog with Double]
  
  /* 0 */ @js.native
  object emailFieldHidden extends TopLevel[emailFieldHidden with Double]
  
  /* 1 */ @js.native
  object emailFieldOptional extends TopLevel[emailFieldOptional with Double]
  
}

