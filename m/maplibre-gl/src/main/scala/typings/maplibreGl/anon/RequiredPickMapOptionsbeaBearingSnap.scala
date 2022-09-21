package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'bearingSnap'>> */
trait RequiredPickMapOptionsbeaBearingSnap extends StObject {
  
  var bearingSnap: Double
}
object RequiredPickMapOptionsbeaBearingSnap {
  
  inline def apply(bearingSnap: Double): RequiredPickMapOptionsbeaBearingSnap = {
    val __obj = js.Dynamic.literal(bearingSnap = bearingSnap.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionsbeaBearingSnap]
  }
  
  extension [Self <: RequiredPickMapOptionsbeaBearingSnap](x: Self) {
    
    inline def setBearingSnap(value: Double): Self = StObject.set(x, "bearingSnap", value.asInstanceOf[js.Any])
  }
}
