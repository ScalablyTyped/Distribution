package typings.googlemaps.google.maps.Data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemovePropertyEvent extends js.Object {
  var feature: Feature = js.native
  var name: String = js.native
  var oldValue: js.Any = js.native
}

object RemovePropertyEvent {
  @scala.inline
  def apply(feature: Feature, name: String, oldValue: js.Any): RemovePropertyEvent = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovePropertyEvent]
  }
  @scala.inline
  implicit class RemovePropertyEventOps[Self <: RemovePropertyEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFeature(value: Feature): Self = this.set("feature", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldValue(value: js.Any): Self = this.set("oldValue", value.asInstanceOf[js.Any])
  }
  
}

