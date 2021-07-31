package typings.iitc.hooksMod.global

import typings.iitc.iitctypesMod.IITC.Field
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventFieldAdded extends StObject {
  
  var field: Field
}
object EventFieldAdded {
  
  @scala.inline
  def apply(field: Field): EventFieldAdded = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventFieldAdded]
  }
  
  @scala.inline
  implicit class EventFieldAddedMutableBuilder[Self <: EventFieldAdded] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
