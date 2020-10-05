package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KmlMouseEvent extends js.Object {
  var featureData: KmlFeatureData = js.native
  var latLng: LatLng = js.native
  var pixelOffset: Size = js.native
}

object KmlMouseEvent {
  @scala.inline
  def apply(featureData: KmlFeatureData, latLng: LatLng, pixelOffset: Size): KmlMouseEvent = {
    val __obj = js.Dynamic.literal(featureData = featureData.asInstanceOf[js.Any], latLng = latLng.asInstanceOf[js.Any], pixelOffset = pixelOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[KmlMouseEvent]
  }
  @scala.inline
  implicit class KmlMouseEventOps[Self <: KmlMouseEvent] (val x: Self) extends AnyVal {
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
    def setFeatureData(value: KmlFeatureData): Self = this.set("featureData", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatLng(value: LatLng): Self = this.set("latLng", value.asInstanceOf[js.Any])
    @scala.inline
    def setPixelOffset(value: Size): Self = this.set("pixelOffset", value.asInstanceOf[js.Any])
  }
  
}

