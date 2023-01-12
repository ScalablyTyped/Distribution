package typings.mapboxMapboxGlDraw.mod

import typings.mapboxGl.mod.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawEvent extends StObject {
  
  var target: Map
  
  var `type`: DrawEventType
}
object DrawEvent {
  
  inline def apply(target: Map, `type`: DrawEventType): DrawEvent = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DrawEvent] (val x: Self) extends AnyVal {
    
    inline def setTarget(value: Map): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: DrawEventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
