package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'interactive'>> */
trait RequiredPickMapOptionsint extends StObject {
  
  var interactive: Boolean
}
object RequiredPickMapOptionsint {
  
  inline def apply(interactive: Boolean): RequiredPickMapOptionsint = {
    val __obj = js.Dynamic.literal(interactive = interactive.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionsint]
  }
  
  extension [Self <: RequiredPickMapOptionsint](x: Self) {
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
  }
}
