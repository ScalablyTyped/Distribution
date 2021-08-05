package typings.mapbox.mod.global.L.mapbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//////////////////////////////////////////////////////////////////////
//////////////////////////////// CONTROLS ////////////////////////////
//////////////////////////////////////////////////////////////////////
trait ControlOptions
  extends StObject
     with typings.leaflet.mod.ControlOptions {
  
  var sanitizer: js.UndefOr[js.Function1[/* template */ String, String]] = js.undefined
}
object ControlOptions {
  
  inline def apply(): ControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlOptions]
  }
  
  extension [Self <: ControlOptions](x: Self) {
    
    inline def setSanitizer(value: /* template */ String => String): Self = StObject.set(x, "sanitizer", js.Any.fromFunction1(value))
    
    inline def setSanitizerUndefined: Self = StObject.set(x, "sanitizer", js.undefined)
  }
}
