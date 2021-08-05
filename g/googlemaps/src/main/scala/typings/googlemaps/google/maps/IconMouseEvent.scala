package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object is sent in an event when a user clicks on an icon on the map.
  * The place ID of this place is stored in the placeId member.
  * To prevent the default info window from showing up, call the stop() method
  * on this event to prevent it being propagated. Learn more about place IDs in
  * the Places API developer guide.
  */
trait IconMouseEvent
  extends StObject
     with MouseEvent {
  
  /**
    * The place ID of the place that was clicked.
    * This place ID can be used to query more information about the feature
    * that was clicked.
    */
  var placeId: String
}
object IconMouseEvent {
  
  inline def apply(latLng: LatLng, placeId: String, stop: () => Unit): IconMouseEvent = {
    val __obj = js.Dynamic.literal(latLng = latLng.asInstanceOf[js.Any], placeId = placeId.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[IconMouseEvent]
  }
  
  extension [Self <: IconMouseEvent](x: Self) {
    
    inline def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
  }
}
