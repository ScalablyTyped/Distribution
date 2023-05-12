package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToggleButtonToggleEvent extends StObject {
  
  var checked: Boolean
  
  var group: String
  
  var id: String
  
  var sender: ToggleButton
  
  var target: JQuery
}
object ToggleButtonToggleEvent {
  
  inline def apply(checked: Boolean, group: String, id: String, sender: ToggleButton, target: JQuery): ToggleButtonToggleEvent = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToggleButtonToggleEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToggleButtonToggleEvent] (val x: Self) extends AnyVal {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSender(value: ToggleButton): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: JQuery): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
