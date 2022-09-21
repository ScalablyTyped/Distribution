package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'maxPitch'>> */
trait RequiredPickMapOptionsmaxMaxPitch extends StObject {
  
  var maxPitch: Double
}
object RequiredPickMapOptionsmaxMaxPitch {
  
  inline def apply(maxPitch: Double): RequiredPickMapOptionsmaxMaxPitch = {
    val __obj = js.Dynamic.literal(maxPitch = maxPitch.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionsmaxMaxPitch]
  }
  
  extension [Self <: RequiredPickMapOptionsmaxMaxPitch](x: Self) {
    
    inline def setMaxPitch(value: Double): Self = StObject.set(x, "maxPitch", value.asInstanceOf[js.Any])
  }
}
