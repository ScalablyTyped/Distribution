package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'maxZoom'>> */
trait RequiredPickMapOptionsmax extends StObject {
  
  var maxZoom: Double
}
object RequiredPickMapOptionsmax {
  
  inline def apply(maxZoom: Double): RequiredPickMapOptionsmax = {
    val __obj = js.Dynamic.literal(maxZoom = maxZoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionsmax]
  }
  
  extension [Self <: RequiredPickMapOptionsmax](x: Self) {
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
  }
}
