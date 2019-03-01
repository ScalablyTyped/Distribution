package typings
package googlemapsLib.googleNs.mapsNs.DataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemovePropertyEvent extends js.Object {
  var feature: Feature
  var name: java.lang.String
  var oldValue: js.Any
}

object RemovePropertyEvent {
  @scala.inline
  def apply(feature: Feature, name: java.lang.String, oldValue: js.Any): RemovePropertyEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("feature")(feature)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("oldValue")(oldValue)
    __obj.asInstanceOf[RemovePropertyEvent]
  }
}

