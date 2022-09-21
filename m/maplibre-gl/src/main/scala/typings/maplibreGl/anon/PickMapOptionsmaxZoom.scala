package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'maxZoom'> */
trait PickMapOptionsmaxZoom extends StObject {
  
  var maxZoom: js.UndefOr[Double | Null] = js.undefined
}
object PickMapOptionsmaxZoom {
  
  inline def apply(): PickMapOptionsmaxZoom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionsmaxZoom]
  }
  
  extension [Self <: PickMapOptionsmaxZoom](x: Self) {
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomNull: Self = StObject.set(x, "maxZoom", null)
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
  }
}
