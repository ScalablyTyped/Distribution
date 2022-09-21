package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'minZoom'> */
trait PickMapOptionsminZoom extends StObject {
  
  var minZoom: js.UndefOr[Double | Null] = js.undefined
}
object PickMapOptionsminZoom {
  
  inline def apply(): PickMapOptionsminZoom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionsminZoom]
  }
  
  extension [Self <: PickMapOptionsminZoom](x: Self) {
    
    inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    inline def setMinZoomNull: Self = StObject.set(x, "minZoom", null)
    
    inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
  }
}
