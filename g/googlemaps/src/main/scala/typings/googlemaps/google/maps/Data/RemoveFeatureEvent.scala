package typings.googlemaps.google.maps.Data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveFeatureEvent extends js.Object {
  var feature: Feature
}

object RemoveFeatureEvent {
  @scala.inline
  def apply(feature: Feature): RemoveFeatureEvent = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveFeatureEvent]
  }
}

