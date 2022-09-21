package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'maxTileCacheSize'>> */
trait RequiredPickMapOptionsmaxMaxTileCacheSize extends StObject {
  
  var maxTileCacheSize: Double
}
object RequiredPickMapOptionsmaxMaxTileCacheSize {
  
  inline def apply(maxTileCacheSize: Double): RequiredPickMapOptionsmaxMaxTileCacheSize = {
    val __obj = js.Dynamic.literal(maxTileCacheSize = maxTileCacheSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionsmaxMaxTileCacheSize]
  }
  
  extension [Self <: RequiredPickMapOptionsmaxMaxTileCacheSize](x: Self) {
    
    inline def setMaxTileCacheSize(value: Double): Self = StObject.set(x, "maxTileCacheSize", value.asInstanceOf[js.Any])
  }
}
