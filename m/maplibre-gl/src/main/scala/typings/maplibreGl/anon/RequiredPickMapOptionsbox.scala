package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'boxZoom'>> */
trait RequiredPickMapOptionsbox extends StObject {
  
  var boxZoom: Boolean
}
object RequiredPickMapOptionsbox {
  
  inline def apply(boxZoom: Boolean): RequiredPickMapOptionsbox = {
    val __obj = js.Dynamic.literal(boxZoom = boxZoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionsbox]
  }
  
  extension [Self <: RequiredPickMapOptionsbox](x: Self) {
    
    inline def setBoxZoom(value: Boolean): Self = StObject.set(x, "boxZoom", value.asInstanceOf[js.Any])
  }
}
