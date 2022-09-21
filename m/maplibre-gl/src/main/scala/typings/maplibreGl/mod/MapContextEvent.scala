package typings.maplibreGl.mod

import typings.maplibreGl.maplibreGlStrings.webglcontextlost
import typings.maplibreGl.maplibreGlStrings.webglcontextrestored
import typings.std.WebGLContextEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapContextEvent extends StObject {
  
  var originalEvent: WebGLContextEvent
  
  var `type`: webglcontextlost | webglcontextrestored
}
object MapContextEvent {
  
  inline def apply(originalEvent: WebGLContextEvent, `type`: webglcontextlost | webglcontextrestored): MapContextEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapContextEvent]
  }
  
  extension [Self <: MapContextEvent](x: Self) {
    
    inline def setOriginalEvent(value: WebGLContextEvent): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setType(value: webglcontextlost | webglcontextrestored): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
