package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'zoom'>> */
trait RequiredPickMapOptionszoo extends StObject {
  
  var zoom: Double
}
object RequiredPickMapOptionszoo {
  
  inline def apply(zoom: Double): RequiredPickMapOptionszoo = {
    val __obj = js.Dynamic.literal(zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionszoo]
  }
  
  extension [Self <: RequiredPickMapOptionszoo](x: Self) {
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
