package typings.googlemaps.google.maps

import typings.googlemaps.googlemapsStrings.html4
import typings.googlemaps.googlemapsStrings.html5
import typings.googlemaps.googlemapsStrings.webgl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreetViewPanoramaOptions extends StObject {
  
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
  
  var showRoadLabels: js.UndefOr[Boolean] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var zoom: js.UndefOr[Double] = js.undefined
  
  var zoomControl: js.UndefOr[Boolean] = js.undefined
  
  var zoomControlOptions: js.UndefOr[ZoomControlOptions] = js.undefined
}
object StreetViewPanoramaOptions {
  
  inline def apply(): StreetViewPanoramaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreetViewPanoramaOptions]
  }
  
  extension [Self <: StreetViewPanoramaOptions](x: Self) {
    
    inline def setAddressControl(value: Boolean): Self = StObject.set(x, "addressControl", value.asInstanceOf[js.Any])
    
    inline def setAddressControlOptions(value: StreetViewAddressControlOptions): Self = StObject.set(x, "addressControlOptions", value.asInstanceOf[js.Any])
    
    inline def setAddressControlOptionsUndefined: Self = StObject.set(x, "addressControlOptions", js.undefined)
    
    inline def setAddressControlUndefined: Self = StObject.set(x, "addressControl", js.undefined)
    
    inline def setClickToGo(value: Boolean): Self = StObject.set(x, "clickToGo", value.asInstanceOf[js.Any])
    
    inline def setClickToGoUndefined: Self = StObject.set(x, "clickToGo", js.undefined)
    
    inline def setDisableDefaultUI(value: Boolean): Self = StObject.set(x, "disableDefaultUI", value.asInstanceOf[js.Any])
    
    inline def setDisableDefaultUIUndefined: Self = StObject.set(x, "disableDefaultUI", js.undefined)
    
    inline def setDisableDoubleClickZoom(value: Boolean): Self = StObject.set(x, "disableDoubleClickZoom", value.asInstanceOf[js.Any])
    
    inline def setDisableDoubleClickZoomUndefined: Self = StObject.set(x, "disableDoubleClickZoom", js.undefined)
    
    inline def setEnableCloseButton(value: Boolean): Self = StObject.set(x, "enableCloseButton", value.asInstanceOf[js.Any])
    
    inline def setEnableCloseButtonUndefined: Self = StObject.set(x, "enableCloseButton", js.undefined)
    
    inline def setFullscreenControl(value: Boolean): Self = StObject.set(x, "fullscreenControl", value.asInstanceOf[js.Any])
    
    inline def setFullscreenControlOptions(value: FullscreenControlOptions): Self = StObject.set(x, "fullscreenControlOptions", value.asInstanceOf[js.Any])
    
    inline def setFullscreenControlOptionsUndefined: Self = StObject.set(x, "fullscreenControlOptions", js.undefined)
    
    inline def setFullscreenControlUndefined: Self = StObject.set(x, "fullscreenControl", js.undefined)
    
    inline def setImageDateControl(value: Boolean): Self = StObject.set(x, "imageDateControl", value.asInstanceOf[js.Any])
    
    inline def setImageDateControlUndefined: Self = StObject.set(x, "imageDateControl", js.undefined)
    
    inline def setLinksControl(value: Boolean): Self = StObject.set(x, "linksControl", value.asInstanceOf[js.Any])
    
    inline def setLinksControlUndefined: Self = StObject.set(x, "linksControl", js.undefined)
    
    inline def setMode(value: html4 | html5 | webgl): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setMotionTracking(value: Boolean): Self = StObject.set(x, "motionTracking", value.asInstanceOf[js.Any])
    
    inline def setMotionTrackingControl(value: Boolean): Self = StObject.set(x, "motionTrackingControl", value.asInstanceOf[js.Any])
    
    inline def setMotionTrackingControlOptions(value: MotionTrackingControlOptions): Self = StObject.set(x, "motionTrackingControlOptions", value.asInstanceOf[js.Any])
    
    inline def setMotionTrackingControlOptionsUndefined: Self = StObject.set(x, "motionTrackingControlOptions", js.undefined)
    
    inline def setMotionTrackingControlUndefined: Self = StObject.set(x, "motionTrackingControl", js.undefined)
    
    inline def setMotionTrackingUndefined: Self = StObject.set(x, "motionTracking", js.undefined)
    
    inline def setPanControl(value: Boolean): Self = StObject.set(x, "panControl", value.asInstanceOf[js.Any])
    
    inline def setPanControlOptions(value: PanControlOptions): Self = StObject.set(x, "panControlOptions", value.asInstanceOf[js.Any])
    
    inline def setPanControlOptionsUndefined: Self = StObject.set(x, "panControlOptions", js.undefined)
    
    inline def setPanControlUndefined: Self = StObject.set(x, "panControl", js.undefined)
    
    inline def setPano(value: String): Self = StObject.set(x, "pano", value.asInstanceOf[js.Any])
    
    inline def setPanoProvider(value: /* input */ String => StreetViewPanoramaData): Self = StObject.set(x, "panoProvider", js.Any.fromFunction1(value))
    
    inline def setPanoProviderUndefined: Self = StObject.set(x, "panoProvider", js.undefined)
    
    inline def setPanoUndefined: Self = StObject.set(x, "pano", js.undefined)
    
    inline def setPosition(value: LatLng | LatLngLiteral): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setPov(value: StreetViewPov): Self = StObject.set(x, "pov", value.asInstanceOf[js.Any])
    
    inline def setPovUndefined: Self = StObject.set(x, "pov", js.undefined)
    
    inline def setScrollwheel(value: Boolean): Self = StObject.set(x, "scrollwheel", value.asInstanceOf[js.Any])
    
    inline def setScrollwheelUndefined: Self = StObject.set(x, "scrollwheel", js.undefined)
    
    inline def setShowRoadLabels(value: Boolean): Self = StObject.set(x, "showRoadLabels", value.asInstanceOf[js.Any])
    
    inline def setShowRoadLabelsUndefined: Self = StObject.set(x, "showRoadLabels", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomControl(value: Boolean): Self = StObject.set(x, "zoomControl", value.asInstanceOf[js.Any])
    
    inline def setZoomControlOptions(value: ZoomControlOptions): Self = StObject.set(x, "zoomControlOptions", value.asInstanceOf[js.Any])
    
    inline def setZoomControlOptionsUndefined: Self = StObject.set(x, "zoomControlOptions", js.undefined)
    
    inline def setZoomControlUndefined: Self = StObject.set(x, "zoomControl", js.undefined)
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
