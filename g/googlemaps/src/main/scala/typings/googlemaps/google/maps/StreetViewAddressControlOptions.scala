package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreetViewAddressControlOptions extends StObject {
  
  var position: js.UndefOr[ControlPosition] = js.native
}
object StreetViewAddressControlOptions {
  
  @scala.inline
  def apply(): StreetViewAddressControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreetViewAddressControlOptions]
  }
  
  @scala.inline
  implicit class StreetViewAddressControlOptionsMutableBuilder[Self <: StreetViewAddressControlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
