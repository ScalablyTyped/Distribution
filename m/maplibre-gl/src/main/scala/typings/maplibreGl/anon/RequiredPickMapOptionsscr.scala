package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'scrollZoom'>> */
trait RequiredPickMapOptionsscr extends StObject {
  
  var scrollZoom: Boolean
}
object RequiredPickMapOptionsscr {
  
  inline def apply(scrollZoom: Boolean): RequiredPickMapOptionsscr = {
    val __obj = js.Dynamic.literal(scrollZoom = scrollZoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionsscr]
  }
  
  extension [Self <: RequiredPickMapOptionsscr](x: Self) {
    
    inline def setScrollZoom(value: Boolean): Self = StObject.set(x, "scrollZoom", value.asInstanceOf[js.Any])
  }
}
