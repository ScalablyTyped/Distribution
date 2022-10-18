package typings.iitc.coreHooksMod.global

import typings.iitc.coreIitctypesMod.IITC.Field
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventFieldAdded extends StObject {
  
  var field: Field
}
object EventFieldAdded {
  
  inline def apply(field: Field): EventFieldAdded = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventFieldAdded]
  }
  
  extension [Self <: EventFieldAdded](x: Self) {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
