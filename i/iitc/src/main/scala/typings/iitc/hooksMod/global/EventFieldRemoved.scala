package typings.iitc.hooksMod.global

import typings.iitc.iitctypesMod.IITC.Field
import typings.iitc.iitctypesMod.IITC.FieldData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventFieldRemoved extends StObject {
  
  var data: FieldData
  
  var field: Field
}
object EventFieldRemoved {
  
  inline def apply(data: FieldData, field: Field): EventFieldRemoved = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventFieldRemoved]
  }
  
  extension [Self <: EventFieldRemoved](x: Self) {
    
    inline def setData(value: FieldData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
