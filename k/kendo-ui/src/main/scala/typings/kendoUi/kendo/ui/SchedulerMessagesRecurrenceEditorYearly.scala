package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerMessagesRecurrenceEditorYearly extends StObject {
  
  var interval: js.UndefOr[String] = js.undefined
  
  var of: js.UndefOr[String] = js.undefined
  
  var repeatEvery: js.UndefOr[String] = js.undefined
  
  var repeatOn: js.UndefOr[String] = js.undefined
}
object SchedulerMessagesRecurrenceEditorYearly {
  
  inline def apply(): SchedulerMessagesRecurrenceEditorYearly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditorYearly]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchedulerMessagesRecurrenceEditorYearly] (val x: Self) extends AnyVal {
    
    inline def setInterval(value: String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setOf(value: String): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
    
    inline def setOfUndefined: Self = StObject.set(x, "of", js.undefined)
    
    inline def setRepeatEvery(value: String): Self = StObject.set(x, "repeatEvery", value.asInstanceOf[js.Any])
    
    inline def setRepeatEveryUndefined: Self = StObject.set(x, "repeatEvery", js.undefined)
    
    inline def setRepeatOn(value: String): Self = StObject.set(x, "repeatOn", value.asInstanceOf[js.Any])
    
    inline def setRepeatOnUndefined: Self = StObject.set(x, "repeatOn", js.undefined)
  }
}
