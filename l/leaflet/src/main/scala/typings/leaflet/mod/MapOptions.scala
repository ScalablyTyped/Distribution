package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapOptions extends js.Object {
  
  // Control options
  var attributionControl: js.UndefOr[Boolean] = js.native
  
  var bounceAtZoomLimits: js.UndefOr[Boolean] = js.native
  
  var boxZoom: js.UndefOr[Boolean] = js.native
  
  var center: js.UndefOr[LatLngExpression] = js.native
  
  // Interaction options
  var closePopupOnClick: js.UndefOr[Boolean] = js.native
  
  // Map state options
  var crs: js.UndefOr[CRS] = js.native
  
  var doubleClickZoom: js.UndefOr[Zoom] = js.native
  
  var dragging: js.UndefOr[Boolean] = js.native
  
  var easeLinearity: js.UndefOr[Double] = js.native
  
  // Animation options
  var fadeAnimation: js.UndefOr[Boolean] = js.native
  
  // Panning inertia options
  var inertia: js.UndefOr[Boolean] = js.native
  
  var inertiaDeceleration: js.UndefOr[Double] = js.native
  
  var inertiaMaxSpeed: js.UndefOr[Double] = js.native
  
  // Keyboard navigation options
  var keyboard: js.UndefOr[Boolean] = js.native
  
  var keyboardPanDelta: js.UndefOr[Double] = js.native
  
  var layers: js.UndefOr[js.Array[Layer]] = js.native
  
  var markerZoomAnimation: js.UndefOr[Boolean] = js.native
  
  var maxBounds: js.UndefOr[LatLngBoundsExpression] = js.native
  
  var maxBoundsViscosity: js.UndefOr[Double] = js.native
  
  var maxZoom: js.UndefOr[Double] = js.native
  
  var minZoom: js.UndefOr[Double] = js.native
  
  var preferCanvas: js.UndefOr[Boolean] = js.native
  
  var renderer: js.UndefOr[Renderer] = js.native
  
  // Mousewheel options
  var scrollWheelZoom: js.UndefOr[Zoom] = js.native
  
  // Touch interaction options
  var tap: js.UndefOr[Boolean] = js.native
  
  var tapTolerance: js.UndefOr[Double] = js.native
  
  var touchZoom: js.UndefOr[Zoom] = js.native
  
  var trackResize: js.UndefOr[Boolean] = js.native
  
  var transform3DLimit: js.UndefOr[Double] = js.native
  
  var wheelDebounceTime: js.UndefOr[Double] = js.native
  
  var wheelPxPerZoomLevel: js.UndefOr[Double] = js.native
  
  var worldCopyJump: js.UndefOr[Boolean] = js.native
  
  var zoom: js.UndefOr[Double] = js.native
  
  var zoomAnimation: js.UndefOr[Boolean] = js.native
  
  var zoomAnimationThreshold: js.UndefOr[Double] = js.native
  
  var zoomControl: js.UndefOr[Boolean] = js.native
  
  var zoomDelta: js.UndefOr[Double] = js.native
  
  var zoomSnap: js.UndefOr[Double] = js.native
}
object MapOptions {
  
  @scala.inline
  def apply(): MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapOptions]
  }
  
  @scala.inline
  implicit class MapOptionsOps[Self <: MapOptions] (val x: Self) extends AnyVal {
    
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
    def setAttributionControl(value: Boolean): Self = this.set("attributionControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributionControl: Self = this.set("attributionControl", js.undefined)
    
    @scala.inline
    def setBounceAtZoomLimits(value: Boolean): Self = this.set("bounceAtZoomLimits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounceAtZoomLimits: Self = this.set("bounceAtZoomLimits", js.undefined)
    
    @scala.inline
    def setBoxZoom(value: Boolean): Self = this.set("boxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxZoom: Self = this.set("boxZoom", js.undefined)
    
    @scala.inline
    def setCenter(value: LatLngExpression): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setClosePopupOnClick(value: Boolean): Self = this.set("closePopupOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClosePopupOnClick: Self = this.set("closePopupOnClick", js.undefined)
    
    @scala.inline
    def setCrs(value: CRS): Self = this.set("crs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrs: Self = this.set("crs", js.undefined)
    
    @scala.inline
    def setDoubleClickZoom(value: Zoom): Self = this.set("doubleClickZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoubleClickZoom: Self = this.set("doubleClickZoom", js.undefined)
    
    @scala.inline
    def setDragging(value: Boolean): Self = this.set("dragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragging: Self = this.set("dragging", js.undefined)
    
    @scala.inline
    def setEaseLinearity(value: Double): Self = this.set("easeLinearity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEaseLinearity: Self = this.set("easeLinearity", js.undefined)
    
    @scala.inline
    def setFadeAnimation(value: Boolean): Self = this.set("fadeAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFadeAnimation: Self = this.set("fadeAnimation", js.undefined)
    
    @scala.inline
    def setInertia(value: Boolean): Self = this.set("inertia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInertia: Self = this.set("inertia", js.undefined)
    
    @scala.inline
    def setInertiaDeceleration(value: Double): Self = this.set("inertiaDeceleration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInertiaDeceleration: Self = this.set("inertiaDeceleration", js.undefined)
    
    @scala.inline
    def setInertiaMaxSpeed(value: Double): Self = this.set("inertiaMaxSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInertiaMaxSpeed: Self = this.set("inertiaMaxSpeed", js.undefined)
    
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    
    @scala.inline
    def setKeyboardPanDelta(value: Double): Self = this.set("keyboardPanDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardPanDelta: Self = this.set("keyboardPanDelta", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: Layer*): Self = this.set("layers", js.Array(value :_*))
    
    @scala.inline
    def setLayers(value: js.Array[Layer]): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    
    @scala.inline
    def setMarkerZoomAnimation(value: Boolean): Self = this.set("markerZoomAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerZoomAnimation: Self = this.set("markerZoomAnimation", js.undefined)
    
    @scala.inline
    def setMaxBoundsVarargs(value: LatLngTuple*): Self = this.set("maxBounds", js.Array(value :_*))
    
    @scala.inline
    def setMaxBounds(value: LatLngBoundsExpression): Self = this.set("maxBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxBounds: Self = this.set("maxBounds", js.undefined)
    
    @scala.inline
    def setMaxBoundsViscosity(value: Double): Self = this.set("maxBoundsViscosity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxBoundsViscosity: Self = this.set("maxBoundsViscosity", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinZoom: Self = this.set("minZoom", js.undefined)
    
    @scala.inline
    def setPreferCanvas(value: Boolean): Self = this.set("preferCanvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferCanvas: Self = this.set("preferCanvas", js.undefined)
    
    @scala.inline
    def setRenderer(value: Renderer): Self = this.set("renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    
    @scala.inline
    def setScrollWheelZoom(value: Zoom): Self = this.set("scrollWheelZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollWheelZoom: Self = this.set("scrollWheelZoom", js.undefined)
    
    @scala.inline
    def setTap(value: Boolean): Self = this.set("tap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTap: Self = this.set("tap", js.undefined)
    
    @scala.inline
    def setTapTolerance(value: Double): Self = this.set("tapTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTapTolerance: Self = this.set("tapTolerance", js.undefined)
    
    @scala.inline
    def setTouchZoom(value: Zoom): Self = this.set("touchZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchZoom: Self = this.set("touchZoom", js.undefined)
    
    @scala.inline
    def setTrackResize(value: Boolean): Self = this.set("trackResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackResize: Self = this.set("trackResize", js.undefined)
    
    @scala.inline
    def setTransform3DLimit(value: Double): Self = this.set("transform3DLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform3DLimit: Self = this.set("transform3DLimit", js.undefined)
    
    @scala.inline
    def setWheelDebounceTime(value: Double): Self = this.set("wheelDebounceTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWheelDebounceTime: Self = this.set("wheelDebounceTime", js.undefined)
    
    @scala.inline
    def setWheelPxPerZoomLevel(value: Double): Self = this.set("wheelPxPerZoomLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWheelPxPerZoomLevel: Self = this.set("wheelPxPerZoomLevel", js.undefined)
    
    @scala.inline
    def setWorldCopyJump(value: Boolean): Self = this.set("worldCopyJump", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorldCopyJump: Self = this.set("worldCopyJump", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
    
    @scala.inline
    def setZoomAnimation(value: Boolean): Self = this.set("zoomAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomAnimation: Self = this.set("zoomAnimation", js.undefined)
    
    @scala.inline
    def setZoomAnimationThreshold(value: Double): Self = this.set("zoomAnimationThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomAnimationThreshold: Self = this.set("zoomAnimationThreshold", js.undefined)
    
    @scala.inline
    def setZoomControl(value: Boolean): Self = this.set("zoomControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomControl: Self = this.set("zoomControl", js.undefined)
    
    @scala.inline
    def setZoomDelta(value: Double): Self = this.set("zoomDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomDelta: Self = this.set("zoomDelta", js.undefined)
    
    @scala.inline
    def setZoomSnap(value: Double): Self = this.set("zoomSnap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomSnap: Self = this.set("zoomSnap", js.undefined)
  }
}
