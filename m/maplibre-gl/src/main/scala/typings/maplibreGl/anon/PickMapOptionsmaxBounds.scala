package typings.maplibreGl.anon

import typings.maplibreGl.mod.LngLatBoundsLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'maxBounds'> */
trait PickMapOptionsmaxBounds extends StObject {
  
  var maxBounds: js.UndefOr[LngLatBoundsLike] = js.undefined
}
object PickMapOptionsmaxBounds {
  
  inline def apply(): PickMapOptionsmaxBounds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionsmaxBounds]
  }
  
  extension [Self <: PickMapOptionsmaxBounds](x: Self) {
    
    inline def setMaxBounds(value: LngLatBoundsLike): Self = StObject.set(x, "maxBounds", value.asInstanceOf[js.Any])
    
    inline def setMaxBoundsUndefined: Self = StObject.set(x, "maxBounds", js.undefined)
  }
}
