package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/***** Events *****/
trait MapsEventListener extends js.Object {
  /**
    * Removes the listener.  Equivalent to calling
    * google.maps.event.removeListener(listener).
    */
  def remove(): Unit
}

object MapsEventListener {
  @scala.inline
  def apply(remove: () => Unit): MapsEventListener = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
  
    __obj.asInstanceOf[MapsEventListener]
  }
}

