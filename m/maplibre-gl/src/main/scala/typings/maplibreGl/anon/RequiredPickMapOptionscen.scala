package typings.maplibreGl.anon

import typings.maplibreGl.mod.LngLatLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'center'>> */
trait RequiredPickMapOptionscen extends StObject {
  
  var center: LngLatLike
}
object RequiredPickMapOptionscen {
  
  inline def apply(center: LngLatLike): RequiredPickMapOptionscen = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionscen]
  }
  
  extension [Self <: RequiredPickMapOptionscen](x: Self) {
    
    inline def setCenter(value: LngLatLike): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
  }
}
