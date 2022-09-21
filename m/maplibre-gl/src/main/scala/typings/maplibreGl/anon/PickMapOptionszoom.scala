package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'zoom'> */
trait PickMapOptionszoom extends StObject {
  
  var zoom: js.UndefOr[Double] = js.undefined
}
object PickMapOptionszoom {
  
  inline def apply(): PickMapOptionszoom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionszoom]
  }
  
  extension [Self <: PickMapOptionszoom](x: Self) {
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
