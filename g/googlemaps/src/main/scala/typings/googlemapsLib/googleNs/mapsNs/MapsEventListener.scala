package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/***** Events *****/
trait MapsEventListener extends js.Object {
  /**
    * Removes the listener.  Equivalent to calling
    * google.maps.event.removeListener(listener).
    */
  def remove(): scala.Unit
}

object MapsEventListener {
  @scala.inline
  def apply(remove: () => scala.Unit): MapsEventListener = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
  
    __obj.asInstanceOf[MapsEventListener]
  }
}

