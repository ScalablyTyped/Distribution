package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'pixelRatio'> */
trait PickMapOptionspixelRatio extends StObject {
  
  var pixelRatio: js.UndefOr[Double] = js.undefined
}
object PickMapOptionspixelRatio {
  
  inline def apply(): PickMapOptionspixelRatio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionspixelRatio]
  }
  
  extension [Self <: PickMapOptionspixelRatio](x: Self) {
    
    inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
  }
}
