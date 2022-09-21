package typings.maplibreGl.anon

import typings.maplibreGl.mod.LngLatLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'center'> */
trait PickMapOptionscenter extends StObject {
  
  var center: js.UndefOr[LngLatLike] = js.undefined
}
object PickMapOptionscenter {
  
  inline def apply(): PickMapOptionscenter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionscenter]
  }
  
  extension [Self <: PickMapOptionscenter](x: Self) {
    
    inline def setCenter(value: LngLatLike): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
  }
}
