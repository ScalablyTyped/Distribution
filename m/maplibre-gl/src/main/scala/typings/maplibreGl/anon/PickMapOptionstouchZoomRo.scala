package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'touchZoomRotate'> */
trait PickMapOptionstouchZoomRo extends StObject {
  
  var touchZoomRotate: js.UndefOr[Boolean] = js.undefined
}
object PickMapOptionstouchZoomRo {
  
  inline def apply(): PickMapOptionstouchZoomRo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionstouchZoomRo]
  }
  
  extension [Self <: PickMapOptionstouchZoomRo](x: Self) {
    
    inline def setTouchZoomRotate(value: Boolean): Self = StObject.set(x, "touchZoomRotate", value.asInstanceOf[js.Any])
    
    inline def setTouchZoomRotateUndefined: Self = StObject.set(x, "touchZoomRotate", js.undefined)
  }
}
