package typings.googlemaps.google.maps

import typings.googlemaps.googlemapsStrings.html4
import typings.googlemaps.googlemapsStrings.html5
import typings.googlemaps.googlemapsStrings.webgl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreetViewPanoramaOptions extends js.Object {
  var addressControl: js.UndefOr[Boolean] = js.undefined
  var addressControlOptions: js.UndefOr[StreetViewAddressControlOptions] = js.undefined
  var clickToGo: js.UndefOr[Boolean] = js.undefined
  var disableDefaultUI: js.UndefOr[Boolean] = js.undefined
  var disableDoubleClickZoom: js.UndefOr[Boolean] = js.undefined
  var enableCloseButton: js.UndefOr[Boolean] = js.undefined
  var fullscreenControl: js.UndefOr[Boolean] = js.undefined
  var fullscreenControlOptions: js.UndefOr[FullscreenControlOptions] = js.undefined
  var imageDateControl: js.UndefOr[Boolean] = js.undefined
  var linksControl: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[html4 | html5 | webgl] = js.undefined
  var motionTracking: js.UndefOr[Boolean] = js.undefined
  var motionTrackingControl: js.UndefOr[Boolean] = js.undefined
  var motionTrackingControlOptions: js.UndefOr[MotionTrackingControlOptions] = js.undefined
  var panControl: js.UndefOr[Boolean] = js.undefined
  var panControlOptions: js.UndefOr[PanControlOptions] = js.undefined
  var pano: js.UndefOr[String] = js.undefined
  var panoProvider: js.UndefOr[js.Function1[/* input */ String, StreetViewPanoramaData]] = js.undefined
  var position: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  var pov: js.UndefOr[StreetViewPov] = js.undefined
  var scrollwheel: js.UndefOr[Boolean] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
  var zoomControl: js.UndefOr[Boolean] = js.undefined
  var zoomControlOptions: js.UndefOr[ZoomControlOptions] = js.undefined
}

object StreetViewPanoramaOptions {
  @scala.inline
  def apply(
    addressControl: js.UndefOr[Boolean] = js.undefined,
    addressControlOptions: StreetViewAddressControlOptions = null,
    clickToGo: js.UndefOr[Boolean] = js.undefined,
    disableDefaultUI: js.UndefOr[Boolean] = js.undefined,
    disableDoubleClickZoom: js.UndefOr[Boolean] = js.undefined,
    enableCloseButton: js.UndefOr[Boolean] = js.undefined,
    fullscreenControl: js.UndefOr[Boolean] = js.undefined,
    fullscreenControlOptions: FullscreenControlOptions = null,
    imageDateControl: js.UndefOr[Boolean] = js.undefined,
    linksControl: js.UndefOr[Boolean] = js.undefined,
    mode: html4 | html5 | webgl = null,
    motionTracking: js.UndefOr[Boolean] = js.undefined,
    motionTrackingControl: js.UndefOr[Boolean] = js.undefined,
    motionTrackingControlOptions: MotionTrackingControlOptions = null,
    panControl: js.UndefOr[Boolean] = js.undefined,
    panControlOptions: PanControlOptions = null,
    pano: String = null,
    panoProvider: /* input */ String => StreetViewPanoramaData = null,
    position: LatLng | LatLngLiteral = null,
    pov: StreetViewPov = null,
    scrollwheel: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    zoom: Int | Double = null,
    zoomControl: js.UndefOr[Boolean] = js.undefined,
    zoomControlOptions: ZoomControlOptions = null
  ): StreetViewPanoramaOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addressControl)) __obj.updateDynamic("addressControl")(addressControl)
    if (addressControlOptions != null) __obj.updateDynamic("addressControlOptions")(addressControlOptions)
    if (!js.isUndefined(clickToGo)) __obj.updateDynamic("clickToGo")(clickToGo)
    if (!js.isUndefined(disableDefaultUI)) __obj.updateDynamic("disableDefaultUI")(disableDefaultUI)
    if (!js.isUndefined(disableDoubleClickZoom)) __obj.updateDynamic("disableDoubleClickZoom")(disableDoubleClickZoom)
    if (!js.isUndefined(enableCloseButton)) __obj.updateDynamic("enableCloseButton")(enableCloseButton)
    if (!js.isUndefined(fullscreenControl)) __obj.updateDynamic("fullscreenControl")(fullscreenControl)
    if (fullscreenControlOptions != null) __obj.updateDynamic("fullscreenControlOptions")(fullscreenControlOptions)
    if (!js.isUndefined(imageDateControl)) __obj.updateDynamic("imageDateControl")(imageDateControl)
    if (!js.isUndefined(linksControl)) __obj.updateDynamic("linksControl")(linksControl)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(motionTracking)) __obj.updateDynamic("motionTracking")(motionTracking)
    if (!js.isUndefined(motionTrackingControl)) __obj.updateDynamic("motionTrackingControl")(motionTrackingControl)
    if (motionTrackingControlOptions != null) __obj.updateDynamic("motionTrackingControlOptions")(motionTrackingControlOptions)
    if (!js.isUndefined(panControl)) __obj.updateDynamic("panControl")(panControl)
    if (panControlOptions != null) __obj.updateDynamic("panControlOptions")(panControlOptions)
    if (pano != null) __obj.updateDynamic("pano")(pano)
    if (panoProvider != null) __obj.updateDynamic("panoProvider")(js.Any.fromFunction1(panoProvider))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (pov != null) __obj.updateDynamic("pov")(pov)
    if (!js.isUndefined(scrollwheel)) __obj.updateDynamic("scrollwheel")(scrollwheel)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomControl)) __obj.updateDynamic("zoomControl")(zoomControl)
    if (zoomControlOptions != null) __obj.updateDynamic("zoomControlOptions")(zoomControlOptions)
    __obj.asInstanceOf[StreetViewPanoramaOptions]
  }
}

