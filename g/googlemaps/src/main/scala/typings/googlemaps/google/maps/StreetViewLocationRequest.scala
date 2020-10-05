package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreetViewLocationRequest extends js.Object {
  var location: LatLng | LatLngLiteral = js.native
  var preference: js.UndefOr[StreetViewPreference] = js.native
  var radius: js.UndefOr[Double] = js.native
  var source: js.UndefOr[StreetViewSource] = js.native
}

object StreetViewLocationRequest {
  @scala.inline
  def apply(location: LatLng | LatLngLiteral): StreetViewLocationRequest = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreetViewLocationRequest]
  }
  @scala.inline
  implicit class StreetViewLocationRequestOps[Self <: StreetViewLocationRequest] (val x: Self) extends AnyVal {
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
    def setLocation(value: LatLng | LatLngLiteral): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreference(value: StreetViewPreference): Self = this.set("preference", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreference: Self = this.set("preference", js.undefined)
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setSource(value: StreetViewSource): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

