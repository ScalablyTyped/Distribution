package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'touchZoomRotate'>> */
trait RequiredPickMapOptionstou extends StObject {
  
  var touchZoomRotate: Boolean
}
object RequiredPickMapOptionstou {
  
  inline def apply(touchZoomRotate: Boolean): RequiredPickMapOptionstou = {
    val __obj = js.Dynamic.literal(touchZoomRotate = touchZoomRotate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionstou]
  }
  
  extension [Self <: RequiredPickMapOptionstou](x: Self) {
    
    inline def setTouchZoomRotate(value: Boolean): Self = StObject.set(x, "touchZoomRotate", value.asInstanceOf[js.Any])
  }
}
