package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerMessagesEditable extends StObject {
  
  var confirmation: js.UndefOr[String] = js.undefined
}
object SchedulerMessagesEditable {
  
  inline def apply(): SchedulerMessagesEditable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerMessagesEditable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchedulerMessagesEditable] (val x: Self) extends AnyVal {
    
    inline def setConfirmation(value: String): Self = StObject.set(x, "confirmation", value.asInstanceOf[js.Any])
    
    inline def setConfirmationUndefined: Self = StObject.set(x, "confirmation", js.undefined)
  }
}
