package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'touchPitch'>> */
trait RequiredPickMapOptionstouTouchPitch extends StObject {
  
  var touchPitch: Boolean
}
object RequiredPickMapOptionstouTouchPitch {
  
  inline def apply(touchPitch: Boolean): RequiredPickMapOptionstouTouchPitch = {
    val __obj = js.Dynamic.literal(touchPitch = touchPitch.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionstouTouchPitch]
  }
  
  extension [Self <: RequiredPickMapOptionstouTouchPitch](x: Self) {
    
    inline def setTouchPitch(value: Boolean): Self = StObject.set(x, "touchPitch", value.asInstanceOf[js.Any])
  }
}
