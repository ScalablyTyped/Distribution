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
  def apply(feature: Feature, latLng: googlemapsLib.googleNs.mapsNs.LatLng, stop: js.Function0[scala.Unit]): MouseEvent = {
    val __obj = js.Dynamic.literal(feature = feature, latLng = latLng, stop = stop)
  
    __obj.asInstanceOf[MouseEvent]
  }
}

