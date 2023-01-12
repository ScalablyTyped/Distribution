package typings.mapboxMapboxGlDraw.mod

import typings.mapboxGl.mod.Map
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.drawDotmodechange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawModeChangeEvent
  extends StObject
     with DrawEvent {
  
  var mode: DrawMode
  
  // The next mode, i.e. the mode that Draw is changing to
  @JSName("type")
  var type_DrawModeChangeEvent: drawDotmodechange
}
object DrawModeChangeEvent {
  
  inline def apply(mode: DrawMode, target: Map): DrawModeChangeEvent = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("draw.modechange")
    __obj.asInstanceOf[DrawModeChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DrawModeChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setMode(value: DrawMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setType(value: drawDotmodechange): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
