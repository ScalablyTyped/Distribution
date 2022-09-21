package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotDataSourceV2Event extends StObject {
  
  def isDefaultPrevented(): Boolean
  
  var preventDefault: js.Function
  
  var sender: PivotDataSourceV2
}
object PivotDataSourceV2Event {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: PivotDataSourceV2): PivotDataSourceV2Event = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotDataSourceV2Event]
  }
  
  extension [Self <: PivotDataSourceV2Event](x: Self) {
    
    inline def setIsDefaultPrevented(value: () => Boolean): Self = StObject.set(x, "isDefaultPrevented", js.Any.fromFunction0(value))
    
    inline def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setSender(value: PivotDataSourceV2): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
