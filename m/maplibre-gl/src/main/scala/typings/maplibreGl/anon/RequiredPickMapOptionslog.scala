package typings.maplibreGl.anon

import typings.maplibreGl.mod.ControlPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'logoPosition'>> */
trait RequiredPickMapOptionslog extends StObject {
  
  var logoPosition: ControlPosition
}
object RequiredPickMapOptionslog {
  
  inline def apply(logoPosition: ControlPosition): RequiredPickMapOptionslog = {
    val __obj = js.Dynamic.literal(logoPosition = logoPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionslog]
  }
  
  extension [Self <: RequiredPickMapOptionslog](x: Self) {
    
    inline def setLogoPosition(value: ControlPosition): Self = StObject.set(x, "logoPosition", value.asInstanceOf[js.Any])
  }
}
