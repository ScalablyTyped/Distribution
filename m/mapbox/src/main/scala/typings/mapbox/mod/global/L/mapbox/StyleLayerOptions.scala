package typings.mapbox.mod.global.L.mapbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleLayerOptions
  extends StObject
     with typings.leaflet.mod.TileLayerOptions {
  
  var sanitizer: js.UndefOr[js.Function1[/* template */ String, String]] = js.undefined
}
object StyleLayerOptions {
  
  inline def apply(): StyleLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleLayerOptions]
  }
  
  extension [Self <: StyleLayerOptions](x: Self) {
    
    inline def setSanitizer(value: /* template */ String => String): Self = StObject.set(x, "sanitizer", js.Any.fromFunction1(value))
    
    inline def setSanitizerUndefined: Self = StObject.set(x, "sanitizer", js.undefined)
  }
}
