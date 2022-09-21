package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'touchPitch'> */
trait PickMapOptionstouchPitch extends StObject {
  
  var touchPitch: js.UndefOr[Boolean] = js.undefined
}
object PickMapOptionstouchPitch {
  
  inline def apply(): PickMapOptionstouchPitch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionstouchPitch]
  }
  
  extension [Self <: PickMapOptionstouchPitch](x: Self) {
    
    inline def setTouchPitch(value: Boolean): Self = StObject.set(x, "touchPitch", value.asInstanceOf[js.Any])
    
    inline def setTouchPitchUndefined: Self = StObject.set(x, "touchPitch", js.undefined)
  }
}
