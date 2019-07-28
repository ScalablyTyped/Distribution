package typings.googlemaps.googleNs.mapsNs.DataNs

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
    val __obj = js.Dynamic.literal(feature = feature, name = name, oldValue = oldValue)
  
    __obj.asInstanceOf[RemovePropertyEvent]
  }
}

