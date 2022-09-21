package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'minPitch'>> */
trait RequiredPickMapOptionsmin extends StObject {
  
  var minPitch: Double
}
object RequiredPickMapOptionsmin {
  
  inline def apply(minPitch: Double): RequiredPickMapOptionsmin = {
    val __obj = js.Dynamic.literal(minPitch = minPitch.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionsmin]
  }
  
  extension [Self <: RequiredPickMapOptionsmin](x: Self) {
    
    inline def setMinPitch(value: Double): Self = StObject.set(x, "minPitch", value.asInstanceOf[js.Any])
  }
}
