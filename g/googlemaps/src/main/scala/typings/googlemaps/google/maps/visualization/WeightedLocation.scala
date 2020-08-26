package typings.googlemaps.google.maps.visualization

import typings.googlemaps.google.maps.LatLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeightedLocation extends js.Object {
  var location: LatLng = js.native
  var weight: Double = js.native
}

object WeightedLocation {
  @scala.inline
  def apply(location: LatLng, weight: Double): WeightedLocation = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeightedLocation]
  }
  @scala.inline
  implicit class WeightedLocationOps[Self <: WeightedLocation] (val x: Self) extends AnyVal {
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
    def setLocation(value: LatLng): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
  }
  
}

