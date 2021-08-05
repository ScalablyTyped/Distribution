package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreetViewAddressControlOptions extends StObject {
  
  var position: js.UndefOr[ControlPosition] = js.undefined
}
object StreetViewAddressControlOptions {
  
  inline def apply(): StreetViewAddressControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreetViewAddressControlOptions]
  }
  
  extension [Self <: StreetViewAddressControlOptions](x: Self) {
    
    inline def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
