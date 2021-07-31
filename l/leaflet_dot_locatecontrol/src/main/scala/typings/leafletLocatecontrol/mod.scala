package typings.leafletLocatecontrol

import typings.leaflet.mod.ControlOptions
import typings.leaflet.mod.Layer
import typings.leaflet.mod.Map_
import typings.leaflet.mod.MarkerOptions
import typings.leaflet.mod.PathOptions
import typings.leafletLocatecontrol.mod.Control_.Locate
import typings.leafletLocatecontrol.mod.Control_.LocateOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object Control_ {
    
    @JSImport("leaflet", "Control.Locate")
    @js.native
    class Locate ()
      extends typings.leaflet.mod.Control_ {
      def this(options: ControlOptions) = this()
      
      @JSName("onAdd")
      def onAdd_MLocate(map: Map_): HTMLElement = js.native
      
      def setView(): Unit = js.native
      
      def start(): Unit = js.native
      
      def stop(): Unit = js.native
    }
    
    trait LocateOptions extends StObject {
      
      var cacheLocation: js.UndefOr[Boolean] = js.undefined
      
      var circlePadding: js.UndefOr[js.Array[Double]] = js.undefined
      
      var circleStyle: js.UndefOr[PathOptions] = js.undefined
      
      var clickBehavior: js.UndefOr[js.Any] = js.undefined
      
      var drawCircle: js.UndefOr[Boolean] = js.undefined
      
      var drawMarker: js.UndefOr[Boolean] = js.undefined
      
      var flyTo: js.UndefOr[Boolean] = js.undefined
      
      var followCircleStyle: js.UndefOr[PathOptions] = js.undefined
      
      var followMarkerStyle: js.UndefOr[PathOptions] = js.undefined
      
      var icon: js.UndefOr[String] = js.undefined
      
      var iconElementTag: js.UndefOr[String] = js.undefined
      
      var iconLoading: js.UndefOr[String] = js.undefined
      
      var keepCurrentZoomLevel: js.UndefOr[Boolean] = js.undefined
      
      var layer: js.UndefOr[Layer] = js.undefined
      
      var locateOptions: js.UndefOr[typings.leaflet.mod.LocateOptions] = js.undefined
      
      var markerClass: js.UndefOr[js.Any] = js.undefined
      
      var markerStyle: js.UndefOr[PathOptions | MarkerOptions] = js.undefined
      
      var onLocationError: js.UndefOr[js.Any] = js.undefined
      
      var onLocationOutsideMapBounds: js.UndefOr[js.Any] = js.undefined
      
      var position: js.UndefOr[String] = js.undefined
      
      var returnToPrevBounds: js.UndefOr[Boolean] = js.undefined
      
      var setView: js.UndefOr[Boolean | String] = js.undefined
      
      var showPopup: js.UndefOr[Boolean] = js.undefined
      
      var strings: js.UndefOr[js.Any] = js.undefined
    }
    object LocateOptions {
      
      @scala.inline
      def apply(): LocateOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LocateOptions]
      }
      
      @scala.inline
      implicit class LocateOptionsMutableBuilder[Self <: LocateOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCacheLocation(value: Boolean): Self = StObject.set(x, "cacheLocation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCacheLocationUndefined: Self = StObject.set(x, "cacheLocation", js.undefined)
        
        @scala.inline
        def setCirclePadding(value: js.Array[Double]): Self = StObject.set(x, "circlePadding", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCirclePaddingUndefined: Self = StObject.set(x, "circlePadding", js.undefined)
        
        @scala.inline
        def setCirclePaddingVarargs(value: Double*): Self = StObject.set(x, "circlePadding", js.Array(value :_*))
        
        @scala.inline
        def setCircleStyle(value: PathOptions): Self = StObject.set(x, "circleStyle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCircleStyleUndefined: Self = StObject.set(x, "circleStyle", js.undefined)
        
        @scala.inline
        def setClickBehavior(value: js.Any): Self = StObject.set(x, "clickBehavior", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClickBehaviorUndefined: Self = StObject.set(x, "clickBehavior", js.undefined)
        
        @scala.inline
        def setDrawCircle(value: Boolean): Self = StObject.set(x, "drawCircle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDrawCircleUndefined: Self = StObject.set(x, "drawCircle", js.undefined)
        
        @scala.inline
        def setDrawMarker(value: Boolean): Self = StObject.set(x, "drawMarker", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDrawMarkerUndefined: Self = StObject.set(x, "drawMarker", js.undefined)
        
        @scala.inline
        def setFlyTo(value: Boolean): Self = StObject.set(x, "flyTo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFlyToUndefined: Self = StObject.set(x, "flyTo", js.undefined)
        
        @scala.inline
        def setFollowCircleStyle(value: PathOptions): Self = StObject.set(x, "followCircleStyle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFollowCircleStyleUndefined: Self = StObject.set(x, "followCircleStyle", js.undefined)
        
        @scala.inline
        def setFollowMarkerStyle(value: PathOptions): Self = StObject.set(x, "followMarkerStyle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFollowMarkerStyleUndefined: Self = StObject.set(x, "followMarkerStyle", js.undefined)
        
        @scala.inline
        def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconElementTag(value: String): Self = StObject.set(x, "iconElementTag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconElementTagUndefined: Self = StObject.set(x, "iconElementTag", js.undefined)
        
        @scala.inline
        def setIconLoading(value: String): Self = StObject.set(x, "iconLoading", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconLoadingUndefined: Self = StObject.set(x, "iconLoading", js.undefined)
        
        @scala.inline
        def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        @scala.inline
        def setKeepCurrentZoomLevel(value: Boolean): Self = StObject.set(x, "keepCurrentZoomLevel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeepCurrentZoomLevelUndefined: Self = StObject.set(x, "keepCurrentZoomLevel", js.undefined)
        
        @scala.inline
        def setLayer(value: Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
        
        @scala.inline
        def setLocateOptions(value: typings.leaflet.mod.LocateOptions): Self = StObject.set(x, "locateOptions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocateOptionsUndefined: Self = StObject.set(x, "locateOptions", js.undefined)
        
        @scala.inline
        def setMarkerClass(value: js.Any): Self = StObject.set(x, "markerClass", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarkerClassUndefined: Self = StObject.set(x, "markerClass", js.undefined)
        
        @scala.inline
        def setMarkerStyle(value: PathOptions | MarkerOptions): Self = StObject.set(x, "markerStyle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarkerStyleUndefined: Self = StObject.set(x, "markerStyle", js.undefined)
        
        @scala.inline
        def setOnLocationError(value: js.Any): Self = StObject.set(x, "onLocationError", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnLocationErrorUndefined: Self = StObject.set(x, "onLocationError", js.undefined)
        
        @scala.inline
        def setOnLocationOutsideMapBounds(value: js.Any): Self = StObject.set(x, "onLocationOutsideMapBounds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnLocationOutsideMapBoundsUndefined: Self = StObject.set(x, "onLocationOutsideMapBounds", js.undefined)
        
        @scala.inline
        def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        @scala.inline
        def setReturnToPrevBounds(value: Boolean): Self = StObject.set(x, "returnToPrevBounds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReturnToPrevBoundsUndefined: Self = StObject.set(x, "returnToPrevBounds", js.undefined)
        
        @scala.inline
        def setSetView(value: Boolean | String): Self = StObject.set(x, "setView", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSetViewUndefined: Self = StObject.set(x, "setView", js.undefined)
        
        @scala.inline
        def setShowPopup(value: Boolean): Self = StObject.set(x, "showPopup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShowPopupUndefined: Self = StObject.set(x, "showPopup", js.undefined)
        
        @scala.inline
        def setStrings(value: js.Any): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
      }
    }
  }
  
  object control {
    
    @JSImport("leaflet", "control")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a Leaflet.Locate control
      */
    @scala.inline
    def locate(): Locate = ^.asInstanceOf[js.Dynamic].applyDynamic("locate")().asInstanceOf[Locate]
    @scala.inline
    def locate(options: LocateOptions): Locate = ^.asInstanceOf[js.Dynamic].applyDynamic("locate")(options.asInstanceOf[js.Any]).asInstanceOf[Locate]
  }
}
