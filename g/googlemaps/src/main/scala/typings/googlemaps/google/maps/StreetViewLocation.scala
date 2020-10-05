package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreetViewLocation extends js.Object {
  var description: js.UndefOr[String] = js.native
  var latLng: js.UndefOr[LatLng] = js.native
  var pano: js.UndefOr[String] = js.native
  var shortDescription: js.UndefOr[String] = js.native
}

object StreetViewLocation {
  @scala.inline
  def apply(): StreetViewLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreetViewLocation]
  }
  @scala.inline
  implicit class StreetViewLocationOps[Self <: StreetViewLocation] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setLatLng(value: LatLng): Self = this.set("latLng", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatLng: Self = this.set("latLng", js.undefined)
    @scala.inline
    def setPano(value: String): Self = this.set("pano", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePano: Self = this.set("pano", js.undefined)
    @scala.inline
    def setShortDescription(value: String): Self = this.set("shortDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortDescription: Self = this.set("shortDescription", js.undefined)
  }
  
}

