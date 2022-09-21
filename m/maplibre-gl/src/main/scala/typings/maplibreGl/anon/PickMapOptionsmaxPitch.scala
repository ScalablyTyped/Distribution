package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'maxPitch'> */
trait PickMapOptionsmaxPitch extends StObject {
  
  var maxPitch: js.UndefOr[Double | Null] = js.undefined
}
object PickMapOptionsmaxPitch {
  
  inline def apply(): PickMapOptionsmaxPitch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionsmaxPitch]
  }
  
  extension [Self <: PickMapOptionsmaxPitch](x: Self) {
    
    inline def setMaxPitch(value: Double): Self = StObject.set(x, "maxPitch", value.asInstanceOf[js.Any])
    
    inline def setMaxPitchNull: Self = StObject.set(x, "maxPitch", null)
    
    inline def setMaxPitchUndefined: Self = StObject.set(x, "maxPitch", js.undefined)
  }
}
