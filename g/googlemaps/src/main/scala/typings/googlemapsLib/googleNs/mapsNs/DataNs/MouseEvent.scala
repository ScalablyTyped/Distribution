package typings
package googlemapsLib.googleNs.mapsNs.DataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseEvent
  extends googlemapsLib.googleNs.mapsNs.MouseEvent {
  var feature: Feature
}

object MouseEvent {
  @scala.inline
  def apply(feature: Feature, latLng: googlemapsLib.googleNs.mapsNs.LatLng, stop: () => scala.Unit): MouseEvent = {
    val __obj = js.Dynamic.literal(feature = feature, latLng = latLng, stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[MouseEvent]
  }
}

