package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerMessagesEditable extends StObject {
  
  var confirmation: js.UndefOr[String] = js.native
}
object SchedulerMessagesEditable {
  
  @scala.inline
  def apply(): SchedulerMessagesEditable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerMessagesEditable]
  }
  
  @scala.inline
  implicit class SchedulerMessagesEditableMutableBuilder[Self <: SchedulerMessagesEditable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfirmation(value: String): Self = StObject.set(x, "confirmation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmationUndefined: Self = StObject.set(x, "confirmation", js.undefined)
  }
}
