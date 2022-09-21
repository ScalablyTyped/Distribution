package typings.maplibreGl.anon

import typings.maplibreGl.mod.LngLatBoundsLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'maxBounds'>> */
trait RequiredPickMapOptionsmaxMaxBounds extends StObject {
  
  var maxBounds: LngLatBoundsLike
}
object RequiredPickMapOptionsmaxMaxBounds {
  
  inline def apply(maxBounds: LngLatBoundsLike): RequiredPickMapOptionsmaxMaxBounds = {
    val __obj = js.Dynamic.literal(maxBounds = maxBounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionsmaxMaxBounds]
  }
  
  extension [Self <: RequiredPickMapOptionsmaxMaxBounds](x: Self) {
    
    inline def setMaxBounds(value: LngLatBoundsLike): Self = StObject.set(x, "maxBounds", value.asInstanceOf[js.Any])
  }
}
