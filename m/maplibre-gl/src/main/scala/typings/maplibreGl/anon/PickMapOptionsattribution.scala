package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'attributionControl'> */
trait PickMapOptionsattribution extends StObject {
  
  var attributionControl: js.UndefOr[Boolean] = js.undefined
}
object PickMapOptionsattribution {
  
  inline def apply(): PickMapOptionsattribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionsattribution]
  }
  
  extension [Self <: PickMapOptionsattribution](x: Self) {
    
    inline def setAttributionControl(value: Boolean): Self = StObject.set(x, "attributionControl", value.asInstanceOf[js.Any])
    
    inline def setAttributionControlUndefined: Self = StObject.set(x, "attributionControl", js.undefined)
  }
}
