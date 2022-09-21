package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'antialias'>> */
trait RequiredPickMapOptionsant extends StObject {
  
  var antialias: Boolean
}
object RequiredPickMapOptionsant {
  
  inline def apply(antialias: Boolean): RequiredPickMapOptionsant = {
    val __obj = js.Dynamic.literal(antialias = antialias.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionsant]
  }
  
  extension [Self <: RequiredPickMapOptionsant](x: Self) {
    
    inline def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
  }
}
