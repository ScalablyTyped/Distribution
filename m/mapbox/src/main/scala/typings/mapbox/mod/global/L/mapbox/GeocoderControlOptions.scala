package typings.mapbox.mod.global.L.mapbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeocoderControlOptions
  extends StObject
     with typings.leaflet.mod.ControlOptions {
  
  var keepOpen: js.UndefOr[Boolean] = js.undefined
}
object GeocoderControlOptions {
  
  inline def apply(): GeocoderControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeocoderControlOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeocoderControlOptions] (val x: Self) extends AnyVal {
    
    inline def setKeepOpen(value: Boolean): Self = StObject.set(x, "keepOpen", value.asInstanceOf[js.Any])
    
    inline def setKeepOpenUndefined: Self = StObject.set(x, "keepOpen", js.undefined)
  }
}
