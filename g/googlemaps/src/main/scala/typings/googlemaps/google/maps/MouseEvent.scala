package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This object is returned from various mouse events on the map and overlays,
  * and contains all the fields shown below.
  */
trait MouseEvent extends js.Object {
  /**
    * The latitude/longitude that was below the cursor when the event
    * occurred.
    */
  var latLng: LatLng
  /** Prevents this event from propagating further. */
  def stop(): Unit
}

object MouseEvent {
  @scala.inline
  def apply(latLng: LatLng, stop: () => Unit): MouseEvent = {
    val __obj = js.Dynamic.literal(latLng = latLng, stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[MouseEvent]
  }
}

