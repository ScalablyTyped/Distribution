package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'bearing'> */
trait PickMapOptionsbearing extends StObject {
  
  var bearing: js.UndefOr[Double] = js.undefined
}
object PickMapOptionsbearing {
  
  inline def apply(): PickMapOptionsbearing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionsbearing]
  }
  
  extension [Self <: PickMapOptionsbearing](x: Self) {
    
    inline def setBearing(value: Double): Self = StObject.set(x, "bearing", value.asInstanceOf[js.Any])
    
    inline def setBearingUndefined: Self = StObject.set(x, "bearing", js.undefined)
  }
}
