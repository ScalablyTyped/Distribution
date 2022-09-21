package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'maplibreLogo'>> */
trait RequiredPickMapOptionsmap extends StObject {
  
  var maplibreLogo: Boolean
}
object RequiredPickMapOptionsmap {
  
  inline def apply(maplibreLogo: Boolean): RequiredPickMapOptionsmap = {
    val __obj = js.Dynamic.literal(maplibreLogo = maplibreLogo.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionsmap]
  }
  
  extension [Self <: RequiredPickMapOptionsmap](x: Self) {
    
    inline def setMaplibreLogo(value: Boolean): Self = StObject.set(x, "maplibreLogo", value.asInstanceOf[js.Any])
  }
}
