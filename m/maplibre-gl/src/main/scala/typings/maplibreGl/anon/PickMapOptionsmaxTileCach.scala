package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'maxTileCacheSize'> */
trait PickMapOptionsmaxTileCach extends StObject {
  
  var maxTileCacheSize: js.UndefOr[Double] = js.undefined
}
object PickMapOptionsmaxTileCach {
  
  inline def apply(): PickMapOptionsmaxTileCach = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionsmaxTileCach]
  }
  
  extension [Self <: PickMapOptionsmaxTileCach](x: Self) {
    
    inline def setMaxTileCacheSize(value: Double): Self = StObject.set(x, "maxTileCacheSize", value.asInstanceOf[js.Any])
    
    inline def setMaxTileCacheSizeUndefined: Self = StObject.set(x, "maxTileCacheSize", js.undefined)
  }
}
