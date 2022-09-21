package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'interactive'> */
trait PickMapOptionsinteractive extends StObject {
  
  var interactive: js.UndefOr[Boolean] = js.undefined
}
object PickMapOptionsinteractive {
  
  inline def apply(): PickMapOptionsinteractive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionsinteractive]
  }
  
  extension [Self <: PickMapOptionsinteractive](x: Self) {
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
  }
}
