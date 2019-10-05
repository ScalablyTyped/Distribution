package typings.googlemaps.google.maps.Data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddFeatureEvent extends js.Object {
  var feature: Feature
}

object AddFeatureEvent {
  @scala.inline
  def apply(feature: Feature): AddFeatureEvent = {
    val __obj = js.Dynamic.literal(feature = feature)
  
    __obj.asInstanceOf[AddFeatureEvent]
  }
}

