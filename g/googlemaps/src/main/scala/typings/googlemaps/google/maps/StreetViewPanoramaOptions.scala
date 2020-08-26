package typings.googlemaps.google.maps

import typings.googlemaps.googlemapsStrings.html4
import typings.googlemaps.googlemapsStrings.html5
import typings.googlemaps.googlemapsStrings.webgl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreetViewPanoramaOptions extends js.Object {
  var addressControl: js.UndefOr[Boolean] = js.native
  var addressControlOptions: js.UndefOr[StreetViewAddressControlOptions] = js.native
  var clickToGo: js.UndefOr[Boolean] = js.native
  var disableDefaultUI: js.UndefOr[Boolean] = js.native
  var disableDoubleClickZoom: js.UndefOr[Boolean] = js.native
  var enableCloseButton: js.UndefOr[Boolean] = js.native
  var fullscreenControl: js.UndefOr[Boolean] = js.native
  var fullscreenControlOptions: js.UndefOr[FullscreenControlOptions] = js.native
  var imageDateControl: js.UndefOr[Boolean] = js.native
  var linksControl: js.UndefOr[Boolean] = js.native
  var mode: js.UndefOr[html4 | html5 | webgl] = js.native
  var motionTracking: js.UndefOr[Boolean] = js.native
  var motionTrackingControl: js.UndefOr[Boolean] = js.native
  var motionTrackingControlOptions: js.UndefOr[MotionTrackingControlOptions] = js.native
  var panControl: js.UndefOr[Boolean] = js.native
  var panControlOptions: js.UndefOr[PanControlOptions] = js.native
  var pano: js.UndefOr[String] = js.native
  var panoProvider: js.UndefOr[js.Function1[/* input */ String, StreetViewPanoramaData]] = js.native
  var position: js.UndefOr[LatLng | LatLngLiteral] = js.native
  var pov: js.UndefOr[StreetViewPov] = js.native
  var scrollwheel: js.UndefOr[Boolean] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var zoom: js.UndefOr[Double] = js.native
  var zoomControl: js.UndefOr[Boolean] = js.native
  var zoomControlOptions: js.UndefOr[ZoomControlOptions] = js.native
}

object StreetViewPanoramaOptions {
  @scala.inline
  def apply(): StreetViewPanoramaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreetViewPanoramaOptions]
  }
  @scala.inline
  implicit class StreetViewPanoramaOptionsOps[Self <: StreetViewPanoramaOptions] (val x: Self) extends AnyVal {
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
    def setAddressControl(value: Boolean): Self = this.set("addressControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddressControl: Self = this.set("addressControl", js.undefined)
    @scala.inline
    def setAddressControlOptions(value: StreetViewAddressControlOptions): Self = this.set("addressControlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddressControlOptions: Self = this.set("addressControlOptions", js.undefined)
    @scala.inline
    def setClickToGo(value: Boolean): Self = this.set("clickToGo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickToGo: Self = this.set("clickToGo", js.undefined)
    @scala.inline
    def setDisableDefaultUI(value: Boolean): Self = this.set("disableDefaultUI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableDefaultUI: Self = this.set("disableDefaultUI", js.undefined)
    @scala.inline
    def setDisableDoubleClickZoom(value: Boolean): Self = this.set("disableDoubleClickZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableDoubleClickZoom: Self = this.set("disableDoubleClickZoom", js.undefined)
    @scala.inline
    def setEnableCloseButton(value: Boolean): Self = this.set("enableCloseButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableCloseButton: Self = this.set("enableCloseButton", js.undefined)
    @scala.inline
    def setFullscreenControl(value: Boolean): Self = this.set("fullscreenControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullscreenControl: Self = this.set("fullscreenControl", js.undefined)
    @scala.inline
    def setFullscreenControlOptions(value: FullscreenControlOptions): Self = this.set("fullscreenControlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullscreenControlOptions: Self = this.set("fullscreenControlOptions", js.undefined)
    @scala.inline
    def setImageDateControl(value: Boolean): Self = this.set("imageDateControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageDateControl: Self = this.set("imageDateControl", js.undefined)
    @scala.inline
    def setLinksControl(value: Boolean): Self = this.set("linksControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinksControl: Self = this.set("linksControl", js.undefined)
    @scala.inline
    def setMode(value: html4 | html5 | webgl): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setMotionTracking(value: Boolean): Self = this.set("motionTracking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMotionTracking: Self = this.set("motionTracking", js.undefined)
    @scala.inline
    def setMotionTrackingControl(value: Boolean): Self = this.set("motionTrackingControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMotionTrackingControl: Self = this.set("motionTrackingControl", js.undefined)
    @scala.inline
    def setMotionTrackingControlOptions(value: MotionTrackingControlOptions): Self = this.set("motionTrackingControlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMotionTrackingControlOptions: Self = this.set("motionTrackingControlOptions", js.undefined)
    @scala.inline
    def setPanControl(value: Boolean): Self = this.set("panControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanControl: Self = this.set("panControl", js.undefined)
    @scala.inline
    def setPanControlOptions(value: PanControlOptions): Self = this.set("panControlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanControlOptions: Self = this.set("panControlOptions", js.undefined)
    @scala.inline
    def setPano(value: String): Self = this.set("pano", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePano: Self = this.set("pano", js.undefined)
    @scala.inline
    def setPanoProvider(value: /* input */ String => StreetViewPanoramaData): Self = this.set("panoProvider", js.Any.fromFunction1(value))
    @scala.inline
    def deletePanoProvider: Self = this.set("panoProvider", js.undefined)
    @scala.inline
    def setPosition(value: LatLng | LatLngLiteral): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setPov(value: StreetViewPov): Self = this.set("pov", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePov: Self = this.set("pov", js.undefined)
    @scala.inline
    def setScrollwheel(value: Boolean): Self = this.set("scrollwheel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollwheel: Self = this.set("scrollwheel", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
    @scala.inline
    def setZoomControl(value: Boolean): Self = this.set("zoomControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomControl: Self = this.set("zoomControl", js.undefined)
    @scala.inline
    def setZoomControlOptions(value: ZoomControlOptions): Self = this.set("zoomControlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomControlOptions: Self = this.set("zoomControlOptions", js.undefined)
  }
  
}

