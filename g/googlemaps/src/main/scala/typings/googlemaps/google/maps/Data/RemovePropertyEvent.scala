package typings.googlemaps.google.maps.Data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemovePropertyEvent extends js.Object {
  var feature: Feature
  var name: String
  var oldValue: js.Any
}

object RemovePropertyEvent {
  @scala.inline
  def apply(feature: Feature, name: String, oldValue: js.Any): RemovePropertyEvent = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemovePropertyEvent]
  }
}

