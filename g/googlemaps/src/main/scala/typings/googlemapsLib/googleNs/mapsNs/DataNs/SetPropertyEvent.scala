package typings
package googlemapsLib.googleNs.mapsNs.DataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetPropertyEvent extends js.Object {
  var feature: Feature
  var name: java.lang.String
  var newValue: js.Any
  var oldValue: js.Any
}

object SetPropertyEvent {
  @scala.inline
  def apply(feature: Feature, name: java.lang.String, newValue: js.Any, oldValue: js.Any): SetPropertyEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("feature")(feature)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("newValue")(newValue)
    __obj.updateDynamic("oldValue")(oldValue)
    __obj.asInstanceOf[SetPropertyEvent]
  }
}

