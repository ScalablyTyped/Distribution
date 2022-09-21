package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'collectResourceTiming'> */
trait PickMapOptionscollectReso extends StObject {
  
  var collectResourceTiming: js.UndefOr[Boolean] = js.undefined
}
object PickMapOptionscollectReso {
  
  inline def apply(): PickMapOptionscollectReso = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionscollectReso]
  }
  
  extension [Self <: PickMapOptionscollectReso](x: Self) {
    
    inline def setCollectResourceTiming(value: Boolean): Self = StObject.set(x, "collectResourceTiming", value.asInstanceOf[js.Any])
    
    inline def setCollectResourceTimingUndefined: Self = StObject.set(x, "collectResourceTiming", js.undefined)
  }
}
