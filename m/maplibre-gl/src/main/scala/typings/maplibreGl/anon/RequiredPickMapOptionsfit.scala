package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'fitBoundsOptions'>> */
trait RequiredPickMapOptionsfit extends StObject {
  
  var fitBoundsOptions: js.Object
}
object RequiredPickMapOptionsfit {
  
  inline def apply(fitBoundsOptions: js.Object): RequiredPickMapOptionsfit = {
    val __obj = js.Dynamic.literal(fitBoundsOptions = fitBoundsOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionsfit]
  }
  
  extension [Self <: RequiredPickMapOptionsfit](x: Self) {
    
    inline def setFitBoundsOptions(value: js.Object): Self = StObject.set(x, "fitBoundsOptions", value.asInstanceOf[js.Any])
  }
}
