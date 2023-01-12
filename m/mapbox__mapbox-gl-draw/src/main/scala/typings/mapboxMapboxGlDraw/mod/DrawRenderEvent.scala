package typings.mapboxMapboxGlDraw.mod

import typings.mapboxGl.mod.Map
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.drawDotrender
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawRenderEvent
  extends StObject
     with DrawEvent {
  
  @JSName("type")
  var type_DrawRenderEvent: drawDotrender
}
object DrawRenderEvent {
  
  inline def apply(target: Map): DrawRenderEvent = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("draw.render")
    __obj.asInstanceOf[DrawRenderEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DrawRenderEvent] (val x: Self) extends AnyVal {
    
    inline def setType(value: drawDotrender): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
