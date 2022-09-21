package typings.maplibreGl.anon

import typings.maplibreGl.mod.LngLatBoundsLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'bounds'> */
trait PickMapOptionsbounds extends StObject {
  
  var bounds: js.UndefOr[LngLatBoundsLike] = js.undefined
}
object PickMapOptionsbounds {
  
  inline def apply(): PickMapOptionsbounds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionsbounds]
  }
  
  extension [Self <: PickMapOptionsbounds](x: Self) {
    
    inline def setBounds(value: LngLatBoundsLike): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
  }
}
