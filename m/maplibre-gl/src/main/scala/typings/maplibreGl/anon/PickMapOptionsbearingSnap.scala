package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'bearingSnap'> */
trait PickMapOptionsbearingSnap extends StObject {
  
  var bearingSnap: js.UndefOr[Double] = js.undefined
}
object PickMapOptionsbearingSnap {
  
  inline def apply(): PickMapOptionsbearingSnap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionsbearingSnap]
  }
  
  extension [Self <: PickMapOptionsbearingSnap](x: Self) {
    
    inline def setBearingSnap(value: Double): Self = StObject.set(x, "bearingSnap", value.asInstanceOf[js.Any])
    
    inline def setBearingSnapUndefined: Self = StObject.set(x, "bearingSnap", js.undefined)
  }
}
