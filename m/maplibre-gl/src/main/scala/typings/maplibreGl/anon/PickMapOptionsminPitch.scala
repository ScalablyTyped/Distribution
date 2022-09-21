package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'minPitch'> */
trait PickMapOptionsminPitch extends StObject {
  
  var minPitch: js.UndefOr[Double | Null] = js.undefined
}
object PickMapOptionsminPitch {
  
  inline def apply(): PickMapOptionsminPitch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionsminPitch]
  }
  
  extension [Self <: PickMapOptionsminPitch](x: Self) {
    
    inline def setMinPitch(value: Double): Self = StObject.set(x, "minPitch", value.asInstanceOf[js.Any])
    
    inline def setMinPitchNull: Self = StObject.set(x, "minPitch", null)
    
    inline def setMinPitchUndefined: Self = StObject.set(x, "minPitch", js.undefined)
  }
}
