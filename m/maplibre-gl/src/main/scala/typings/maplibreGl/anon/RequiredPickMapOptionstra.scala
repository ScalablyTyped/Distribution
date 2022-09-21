package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'trackResize'>> */
trait RequiredPickMapOptionstra extends StObject {
  
  var trackResize: Boolean
}
object RequiredPickMapOptionstra {
  
  inline def apply(trackResize: Boolean): RequiredPickMapOptionstra = {
    val __obj = js.Dynamic.literal(trackResize = trackResize.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionstra]
  }
  
  extension [Self <: RequiredPickMapOptionstra](x: Self) {
    
    inline def setTrackResize(value: Boolean): Self = StObject.set(x, "trackResize", value.asInstanceOf[js.Any])
  }
}
