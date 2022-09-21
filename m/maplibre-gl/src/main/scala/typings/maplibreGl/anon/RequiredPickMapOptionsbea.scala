package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'bearing'>> */
trait RequiredPickMapOptionsbea extends StObject {
  
  var bearing: Double
}
object RequiredPickMapOptionsbea {
  
  inline def apply(bearing: Double): RequiredPickMapOptionsbea = {
    val __obj = js.Dynamic.literal(bearing = bearing.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionsbea]
  }
  
  extension [Self <: RequiredPickMapOptionsbea](x: Self) {
    
    inline def setBearing(value: Double): Self = StObject.set(x, "bearing", value.asInstanceOf[js.Any])
  }
}
