package typings.leafletGeosearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LatLngLiteral extends js.Object {
  var lat: Double = js.native
  var lng: Double = js.native
}

object LatLngLiteral {
  @scala.inline
  def apply(lat: Double, lng: Double): LatLngLiteral = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[LatLngLiteral]
  }
  @scala.inline
  implicit class LatLngLiteralOps[Self <: LatLngLiteral] (val x: Self) extends AnyVal {
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
    def setLat(value: Double): Self = this.set("lat", value.asInstanceOf[js.Any])
    @scala.inline
    def setLng(value: Double): Self = this.set("lng", value.asInstanceOf[js.Any])
  }
  
}

