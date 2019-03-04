package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseEvent extends js.Object {
  /**
    * The latitude/longitude that was below the cursor when the event
    * occurred.
    */
  var latLng: LatLng
  /** Prevents this event from propagating further. */
  def stop(): scala.Unit
}

object MouseEvent {
  @scala.inline
  def apply(latLng: LatLng, stop: js.Function0[scala.Unit]): MouseEvent = {
    val __obj = js.Dynamic.literal(latLng = latLng, stop = stop)
  
    __obj.asInstanceOf[MouseEvent]
  }
}

