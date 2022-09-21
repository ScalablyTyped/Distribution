package typings.maplibreGl.anon

import typings.maplibreGl.mod.ControlPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'logoPosition'> */
trait PickMapOptionslogoPositio extends StObject {
  
  var logoPosition: js.UndefOr[ControlPosition] = js.undefined
}
object PickMapOptionslogoPositio {
  
  inline def apply(): PickMapOptionslogoPositio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionslogoPositio]
  }
  
  extension [Self <: PickMapOptionslogoPositio](x: Self) {
    
    inline def setLogoPosition(value: ControlPosition): Self = StObject.set(x, "logoPosition", value.asInstanceOf[js.Any])
    
    inline def setLogoPositionUndefined: Self = StObject.set(x, "logoPosition", js.undefined)
  }
}
