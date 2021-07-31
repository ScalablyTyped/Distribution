package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO find source documentation
trait SaveWidgetOptions extends StObject {
  
  var attribution: js.UndefOr[Attribution] = js.undefined
  
  var place: js.UndefOr[Place] = js.undefined
}
object SaveWidgetOptions {
  
  @scala.inline
  def apply(): SaveWidgetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveWidgetOptions]
  }
  
  @scala.inline
  implicit class SaveWidgetOptionsMutableBuilder[Self <: SaveWidgetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribution(value: Attribution): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    @scala.inline
    def setPlace(value: Place): Self = StObject.set(x, "place", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceUndefined: Self = StObject.set(x, "place", js.undefined)
  }
}
