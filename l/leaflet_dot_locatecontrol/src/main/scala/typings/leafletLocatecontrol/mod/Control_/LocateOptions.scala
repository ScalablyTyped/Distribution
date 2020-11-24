package typings.leafletLocatecontrol.mod.Control_

import typings.leaflet.mod.Layer
import typings.leaflet.mod.MarkerOptions
import typings.leaflet.mod.PathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocateOptions extends js.Object {
  
  var cacheLocation: js.UndefOr[Boolean] = js.native
  
  var circlePadding: js.UndefOr[js.Array[Double]] = js.native
  
  var circleStyle: js.UndefOr[PathOptions] = js.native
  
  var clickBehavior: js.UndefOr[js.Any] = js.native
  
  var drawCircle: js.UndefOr[Boolean] = js.native
  
  var drawMarker: js.UndefOr[Boolean] = js.native
  
  var flyTo: js.UndefOr[Boolean] = js.native
  
  var followCircleStyle: js.UndefOr[PathOptions] = js.native
  
  var followMarkerStyle: js.UndefOr[PathOptions] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var iconElementTag: js.UndefOr[String] = js.native
  
  var iconLoading: js.UndefOr[String] = js.native
  
  var keepCurrentZoomLevel: js.UndefOr[Boolean] = js.native
  
  var layer: js.UndefOr[Layer] = js.native
  
  var locateOptions: js.UndefOr[typings.leaflet.mod.LocateOptions] = js.native
  
  var markerClass: js.UndefOr[js.Any] = js.native
  
  var markerStyle: js.UndefOr[PathOptions | MarkerOptions] = js.native
  
  var onLocationError: js.UndefOr[js.Any] = js.native
  
  var onLocationOutsideMapBounds: js.UndefOr[js.Any] = js.native
  
  var position: js.UndefOr[String] = js.native
  
  var returnToPrevBounds: js.UndefOr[Boolean] = js.native
  
  var setView: js.UndefOr[Boolean | String] = js.native
  
  var showPopup: js.UndefOr[Boolean] = js.native
  
  var strings: js.UndefOr[js.Any] = js.native
}
object LocateOptions {
  
  @scala.inline
  def apply(): LocateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocateOptions]
  }
  
  @scala.inline
  implicit class LocateOptionsOps[Self <: LocateOptions] (val x: Self) extends AnyVal {
    
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
    def setCacheLocation(value: Boolean): Self = this.set("cacheLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheLocation: Self = this.set("cacheLocation", js.undefined)
    
    @scala.inline
    def setCirclePaddingVarargs(value: Double*): Self = this.set("circlePadding", js.Array(value :_*))
    
    @scala.inline
    def setCirclePadding(value: js.Array[Double]): Self = this.set("circlePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCirclePadding: Self = this.set("circlePadding", js.undefined)
    
    @scala.inline
    def setCircleStyle(value: PathOptions): Self = this.set("circleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCircleStyle: Self = this.set("circleStyle", js.undefined)
    
    @scala.inline
    def setClickBehavior(value: js.Any): Self = this.set("clickBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickBehavior: Self = this.set("clickBehavior", js.undefined)
    
    @scala.inline
    def setDrawCircle(value: Boolean): Self = this.set("drawCircle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawCircle: Self = this.set("drawCircle", js.undefined)
    
    @scala.inline
    def setDrawMarker(value: Boolean): Self = this.set("drawMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawMarker: Self = this.set("drawMarker", js.undefined)
    
    @scala.inline
    def setFlyTo(value: Boolean): Self = this.set("flyTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlyTo: Self = this.set("flyTo", js.undefined)
    
    @scala.inline
    def setFollowCircleStyle(value: PathOptions): Self = this.set("followCircleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowCircleStyle: Self = this.set("followCircleStyle", js.undefined)
    
    @scala.inline
    def setFollowMarkerStyle(value: PathOptions): Self = this.set("followMarkerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowMarkerStyle: Self = this.set("followMarkerStyle", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconElementTag(value: String): Self = this.set("iconElementTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconElementTag: Self = this.set("iconElementTag", js.undefined)
    
    @scala.inline
    def setIconLoading(value: String): Self = this.set("iconLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconLoading: Self = this.set("iconLoading", js.undefined)
    
    @scala.inline
    def setKeepCurrentZoomLevel(value: Boolean): Self = this.set("keepCurrentZoomLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepCurrentZoomLevel: Self = this.set("keepCurrentZoomLevel", js.undefined)
    
    @scala.inline
    def setLayer(value: Layer): Self = this.set("layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayer: Self = this.set("layer", js.undefined)
    
    @scala.inline
    def setLocateOptions(value: typings.leaflet.mod.LocateOptions): Self = this.set("locateOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocateOptions: Self = this.set("locateOptions", js.undefined)
    
    @scala.inline
    def setMarkerClass(value: js.Any): Self = this.set("markerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerClass: Self = this.set("markerClass", js.undefined)
    
    @scala.inline
    def setMarkerStyle(value: PathOptions | MarkerOptions): Self = this.set("markerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerStyle: Self = this.set("markerStyle", js.undefined)
    
    @scala.inline
    def setOnLocationError(value: js.Any): Self = this.set("onLocationError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLocationError: Self = this.set("onLocationError", js.undefined)
    
    @scala.inline
    def setOnLocationOutsideMapBounds(value: js.Any): Self = this.set("onLocationOutsideMapBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLocationOutsideMapBounds: Self = this.set("onLocationOutsideMapBounds", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setReturnToPrevBounds(value: Boolean): Self = this.set("returnToPrevBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnToPrevBounds: Self = this.set("returnToPrevBounds", js.undefined)
    
    @scala.inline
    def setSetView(value: Boolean | String): Self = this.set("setView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetView: Self = this.set("setView", js.undefined)
    
    @scala.inline
    def setShowPopup(value: Boolean): Self = this.set("showPopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPopup: Self = this.set("showPopup", js.undefined)
    
    @scala.inline
    def setStrings(value: js.Any): Self = this.set("strings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrings: Self = this.set("strings", js.undefined)
  }
}
