package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object is returned from various mouse events on the map and overlays,
  * and contains all the fields shown below.
  */
trait MouseEvent extends StObject {
  
  /**
    * The latitude/longitude that was below the cursor when the event
    * occurred.
    */
  var latLng: LatLng
  
  /** Prevents this event from propagating further. */
  def stop(): Unit
}
object MouseEvent {
  
  inline def apply(latLng: LatLng, stop: () => Unit): MouseEvent = {
    val __obj = js.Dynamic.literal(latLng = latLng.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[MouseEvent]
  }
  
  extension [Self <: MouseEvent](x: Self) {
    
    inline def setLatLng(value: LatLng): Self = StObject.set(x, "latLng", value.asInstanceOf[js.Any])
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
