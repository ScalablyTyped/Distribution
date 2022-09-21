package typings.maplibreGl.anon

import typings.maplibreGl.mod.GestureOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'cooperativeGestures'> */
trait PickMapOptionscooperative extends StObject {
  
  var cooperativeGestures: js.UndefOr[Boolean | GestureOptions] = js.undefined
}
object PickMapOptionscooperative {
  
  inline def apply(): PickMapOptionscooperative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionscooperative]
  }
  
  extension [Self <: PickMapOptionscooperative](x: Self) {
    
    inline def setCooperativeGestures(value: Boolean | GestureOptions): Self = StObject.set(x, "cooperativeGestures", value.asInstanceOf[js.Any])
    
    inline def setCooperativeGesturesUndefined: Self = StObject.set(x, "cooperativeGestures", js.undefined)
  }
}
