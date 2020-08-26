package typings.googlemaps.google.maps.Data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveFeatureEvent extends js.Object {
  var feature: Feature = js.native
}

object RemoveFeatureEvent {
  @scala.inline
  def apply(feature: Feature): RemoveFeatureEvent = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveFeatureEvent]
  }
  @scala.inline
  implicit class RemoveFeatureEventOps[Self <: RemoveFeatureEvent] (val x: Self) extends AnyVal {
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
  }
  
}

