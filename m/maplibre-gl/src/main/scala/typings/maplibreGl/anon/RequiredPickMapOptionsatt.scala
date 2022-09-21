package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'attributionControl'>> */
trait RequiredPickMapOptionsatt extends StObject {
  
  var attributionControl: Boolean
}
object RequiredPickMapOptionsatt {
  
  inline def apply(attributionControl: Boolean): RequiredPickMapOptionsatt = {
    val __obj = js.Dynamic.literal(attributionControl = attributionControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionsatt]
  }
  
  extension [Self <: RequiredPickMapOptionsatt](x: Self) {
    
    inline def setAttributionControl(value: Boolean): Self = StObject.set(x, "attributionControl", value.asInstanceOf[js.Any])
  }
}
