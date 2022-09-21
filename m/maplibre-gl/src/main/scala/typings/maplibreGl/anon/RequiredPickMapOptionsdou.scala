package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'doubleClickZoom'>> */
trait RequiredPickMapOptionsdou extends StObject {
  
  var doubleClickZoom: Boolean
}
object RequiredPickMapOptionsdou {
  
  inline def apply(doubleClickZoom: Boolean): RequiredPickMapOptionsdou = {
    val __obj = js.Dynamic.literal(doubleClickZoom = doubleClickZoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionsdou]
  }
  
  extension [Self <: RequiredPickMapOptionsdou](x: Self) {
    
    inline def setDoubleClickZoom(value: Boolean): Self = StObject.set(x, "doubleClickZoom", value.asInstanceOf[js.Any])
  }
}
