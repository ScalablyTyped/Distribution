package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'crossSourceCollisions'>> */
trait RequiredPickMapOptionscro extends StObject {
  
  var crossSourceCollisions: Boolean
}
object RequiredPickMapOptionscro {
  
  inline def apply(crossSourceCollisions: Boolean): RequiredPickMapOptionscro = {
    val __obj = js.Dynamic.literal(crossSourceCollisions = crossSourceCollisions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionscro]
  }
  
  extension [Self <: RequiredPickMapOptionscro](x: Self) {
    
    inline def setCrossSourceCollisions(value: Boolean): Self = StObject.set(x, "crossSourceCollisions", value.asInstanceOf[js.Any])
  }
}
