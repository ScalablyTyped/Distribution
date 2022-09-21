package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'fitBoundsOptions'> */
trait PickMapOptionsfitBoundsOp extends StObject {
  
  var fitBoundsOptions: js.UndefOr[js.Object] = js.undefined
}
object PickMapOptionsfitBoundsOp {
  
  inline def apply(): PickMapOptionsfitBoundsOp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionsfitBoundsOp]
  }
  
  extension [Self <: PickMapOptionsfitBoundsOp](x: Self) {
    
    inline def setFitBoundsOptions(value: js.Object): Self = StObject.set(x, "fitBoundsOptions", value.asInstanceOf[js.Any])
    
    inline def setFitBoundsOptionsUndefined: Self = StObject.set(x, "fitBoundsOptions", js.undefined)
  }
}
