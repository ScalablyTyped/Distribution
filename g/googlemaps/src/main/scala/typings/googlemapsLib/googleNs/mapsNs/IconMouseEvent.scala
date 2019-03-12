package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconMouseEvent extends MouseEvent {
  /**
    * The place ID of the place that was clicked.
    * This place ID can be used to query more information about the feature
    * that was clicked.
    */
  var placeId: java.lang.String
}

object IconMouseEvent {
  @scala.inline
  def apply(latLng: LatLng, placeId: java.lang.String, stop: () => scala.Unit): IconMouseEvent = {
    val __obj = js.Dynamic.literal(latLng = latLng, placeId = placeId, stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[IconMouseEvent]
  }
}

