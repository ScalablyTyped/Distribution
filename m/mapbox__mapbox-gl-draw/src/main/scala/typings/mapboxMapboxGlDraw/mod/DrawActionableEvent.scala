package typings.mapboxMapboxGlDraw.mod

import typings.mapboxGl.mod.Map
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.drawDotactionable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawActionableEvent
  extends StObject
     with DrawEvent {
  
  var actions: DrawActionableState
  
  @JSName("type")
  var type_DrawActionableEvent: drawDotactionable
}
object DrawActionableEvent {
  
  inline def apply(actions: DrawActionableState, target: Map): DrawActionableEvent = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("draw.actionable")
    __obj.asInstanceOf[DrawActionableEvent]
  }
  
  extension [Self <: DrawActionableEvent](x: Self) {
    
    inline def setActions(value: DrawActionableState): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setType(value: drawDotactionable): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
