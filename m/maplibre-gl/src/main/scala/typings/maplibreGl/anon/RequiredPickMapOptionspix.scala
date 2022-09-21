package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'pixelRatio'>> */
trait RequiredPickMapOptionspix extends StObject {
  
  var pixelRatio: Double
}
object RequiredPickMapOptionspix {
  
  inline def apply(pixelRatio: Double): RequiredPickMapOptionspix = {
    val __obj = js.Dynamic.literal(pixelRatio = pixelRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionspix]
  }
  
  extension [Self <: RequiredPickMapOptionspix](x: Self) {
    
    inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
  }
}
