package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'minZoom'>> */
trait RequiredPickMapOptionsminMinZoom extends StObject {
  
  var minZoom: Double
}
object RequiredPickMapOptionsminMinZoom {
  
  inline def apply(minZoom: Double): RequiredPickMapOptionsminMinZoom = {
    val __obj = js.Dynamic.literal(minZoom = minZoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionsminMinZoom]
  }
  
  extension [Self <: RequiredPickMapOptionsminMinZoom](x: Self) {
    
    inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
  }
}
