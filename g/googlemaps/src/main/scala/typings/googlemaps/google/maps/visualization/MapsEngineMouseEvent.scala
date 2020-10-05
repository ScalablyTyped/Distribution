package typings.googlemaps.google.maps.visualization

import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO find source documentation
@js.native
trait MapsEngineMouseEvent extends js.Object {
  var featureId: js.UndefOr[String] = js.native
  var infoWindowHtml: js.UndefOr[String] = js.native
  var latLng: js.UndefOr[LatLng] = js.native
  var pixelOffset: js.UndefOr[Size] = js.native
}

object MapsEngineMouseEvent {
  @scala.inline
  def apply(): MapsEngineMouseEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapsEngineMouseEvent]
  }
  @scala.inline
  implicit class MapsEngineMouseEventOps[Self <: MapsEngineMouseEvent] (val x: Self) extends AnyVal {
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
    def setFeatureId(value: String): Self = this.set("featureId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureId: Self = this.set("featureId", js.undefined)
    @scala.inline
    def setInfoWindowHtml(value: String): Self = this.set("infoWindowHtml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfoWindowHtml: Self = this.set("infoWindowHtml", js.undefined)
    @scala.inline
    def setLatLng(value: LatLng): Self = this.set("latLng", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatLng: Self = this.set("latLng", js.undefined)
    @scala.inline
    def setPixelOffset(value: Size): Self = this.set("pixelOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelOffset: Self = this.set("pixelOffset", js.undefined)
  }
  
}

