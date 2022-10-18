package typings.leafletLocatecontrol

import typings.leaflet.mod.Layer
import typings.leaflet.mod.Map_
import typings.leaflet.mod.MarkerOptions
import typings.leaflet.mod.PathOptions
import typings.leafletLocatecontrol.leafletMod.Control_.Locate
import typings.leafletLocatecontrol.leafletMod.Control_.LocateOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object leafletMod {
  
  object Control_ {
    
    @JSImport("leaflet", "Control.Locate")
    @js.native
    open class Locate ()
      extends typings.leaflet.mod.Control_ {
      def this(locateOptions: LocateOptions) = this()
      
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
      
      var clickBehavior: js.UndefOr[Any] = js.undefined
      
      var compassClass: js.UndefOr[Any] = js.undefined
      
      var compassStyle: js.UndefOr[PathOptions] = js.undefined
      
      var createButtonCallback: js.UndefOr[Any] = js.undefined
      
      var drawCircle: js.UndefOr[Boolean] = js.undefined
      
      var drawMarker: js.UndefOr[Boolean] = js.undefined
      
      var flyTo: js.UndefOr[Boolean] = js.undefined
      
      var followCircleStyle: js.UndefOr[PathOptions] = js.undefined
      
      var followMarkerStyle: js.UndefOr[PathOptions] = js.undefined
      
      var icon: js.UndefOr[String] = js.undefined
      
      var iconElementTag: js.UndefOr[String] = js.undefined
      
      var iconLoading: js.UndefOr[String] = js.undefined
      
      var initialZoomLevel: js.UndefOr[Double | Boolean] = js.undefined
      
      var keepCurrentZoomLevel: js.UndefOr[Boolean] = js.undefined
      
      var layer: js.UndefOr[Layer] = js.undefined
      
      var locateOptions: js.UndefOr[typings.leaflet.mod.LocateOptions] = js.undefined
      
      var markerClass: js.UndefOr[Any] = js.undefined
      
      var markerStyle: js.UndefOr[PathOptions | MarkerOptions] = js.undefined
      
      var metric: js.UndefOr[Boolean] = js.undefined
      
      var onLocationError: js.UndefOr[Any] = js.undefined
      
      var onLocationOutsideMapBounds: js.UndefOr[Any] = js.undefined
      
      var position: js.UndefOr[String] = js.undefined
      
      var returnToPrevBounds: js.UndefOr[Boolean] = js.undefined
      
      var setView: js.UndefOr[Boolean | String] = js.undefined
      
      var showCompass: js.UndefOr[Boolean] = js.undefined
      
      var showPopup: js.UndefOr[Boolean] = js.undefined
      
      var strings: js.UndefOr[Any] = js.undefined
      
      var textElementTag: js.UndefOr[String] = js.undefined
    }
    object LocateOptions {
      
      inline def apply(): LocateOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LocateOptions]
      }
      
      extension [Self <: LocateOptions](x: Self) {
        
        inline def setCacheLocation(value: Boolean): Self = StObject.set(x, "cacheLocation", value.asInstanceOf[js.Any])
        
        inline def setCacheLocationUndefined: Self = StObject.set(x, "cacheLocation", js.undefined)
        
        inline def setCirclePadding(value: js.Array[Double]): Self = StObject.set(x, "circlePadding", value.asInstanceOf[js.Any])
        
        inline def setCirclePaddingUndefined: Self = StObject.set(x, "circlePadding", js.undefined)
        
        inline def setCirclePaddingVarargs(value: Double*): Self = StObject.set(x, "circlePadding", js.Array(value*))
        
        inline def setCircleStyle(value: PathOptions): Self = StObject.set(x, "circleStyle", value.asInstanceOf[js.Any])
        
        inline def setCircleStyleUndefined: Self = StObject.set(x, "circleStyle", js.undefined)
        
        inline def setClickBehavior(value: Any): Self = StObject.set(x, "clickBehavior", value.asInstanceOf[js.Any])
        
        inline def setClickBehaviorUndefined: Self = StObject.set(x, "clickBehavior", js.undefined)
        
        inline def setCompassClass(value: Any): Self = StObject.set(x, "compassClass", value.asInstanceOf[js.Any])
        
        inline def setCompassClassUndefined: Self = StObject.set(x, "compassClass", js.undefined)
        
        inline def setCompassStyle(value: PathOptions): Self = StObject.set(x, "compassStyle", value.asInstanceOf[js.Any])
        
        inline def setCompassStyleUndefined: Self = StObject.set(x, "compassStyle", js.undefined)
        
        inline def setCreateButtonCallback(value: Any): Self = StObject.set(x, "createButtonCallback", value.asInstanceOf[js.Any])
        
        inline def setCreateButtonCallbackUndefined: Self = StObject.set(x, "createButtonCallback", js.undefined)
        
        inline def setDrawCircle(value: Boolean): Self = StObject.set(x, "drawCircle", value.asInstanceOf[js.Any])
        
        inline def setDrawCircleUndefined: Self = StObject.set(x, "drawCircle", js.undefined)
        
        inline def setDrawMarker(value: Boolean): Self = StObject.set(x, "drawMarker", value.asInstanceOf[js.Any])
        
        inline def setDrawMarkerUndefined: Self = StObject.set(x, "drawMarker", js.undefined)
        
        inline def setFlyTo(value: Boolean): Self = StObject.set(x, "flyTo", value.asInstanceOf[js.Any])
        
        inline def setFlyToUndefined: Self = StObject.set(x, "flyTo", js.undefined)
        
        inline def setFollowCircleStyle(value: PathOptions): Self = StObject.set(x, "followCircleStyle", value.asInstanceOf[js.Any])
        
        inline def setFollowCircleStyleUndefined: Self = StObject.set(x, "followCircleStyle", js.undefined)
        
        inline def setFollowMarkerStyle(value: PathOptions): Self = StObject.set(x, "followMarkerStyle", value.asInstanceOf[js.Any])
        
        inline def setFollowMarkerStyleUndefined: Self = StObject.set(x, "followMarkerStyle", js.undefined)
        
        inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setIconElementTag(value: String): Self = StObject.set(x, "iconElementTag", value.asInstanceOf[js.Any])
        
        inline def setIconElementTagUndefined: Self = StObject.set(x, "iconElementTag", js.undefined)
        
        inline def setIconLoading(value: String): Self = StObject.set(x, "iconLoading", value.asInstanceOf[js.Any])
        
        inline def setIconLoadingUndefined: Self = StObject.set(x, "iconLoading", js.undefined)
        
        inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        inline def setInitialZoomLevel(value: Double | Boolean): Self = StObject.set(x, "initialZoomLevel", value.asInstanceOf[js.Any])
        
        inline def setInitialZoomLevelUndefined: Self = StObject.set(x, "initialZoomLevel", js.undefined)
        
        inline def setKeepCurrentZoomLevel(value: Boolean): Self = StObject.set(x, "keepCurrentZoomLevel", value.asInstanceOf[js.Any])
        
        inline def setKeepCurrentZoomLevelUndefined: Self = StObject.set(x, "keepCurrentZoomLevel", js.undefined)
        
        inline def setLayer(value: Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
        
        inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
        
        inline def setLocateOptions(value: typings.leaflet.mod.LocateOptions): Self = StObject.set(x, "locateOptions", value.asInstanceOf[js.Any])
        
        inline def setLocateOptionsUndefined: Self = StObject.set(x, "locateOptions", js.undefined)
        
        inline def setMarkerClass(value: Any): Self = StObject.set(x, "markerClass", value.asInstanceOf[js.Any])
        
        inline def setMarkerClassUndefined: Self = StObject.set(x, "markerClass", js.undefined)
        
        inline def setMarkerStyle(value: PathOptions | MarkerOptions): Self = StObject.set(x, "markerStyle", value.asInstanceOf[js.Any])
        
        inline def setMarkerStyleUndefined: Self = StObject.set(x, "markerStyle", js.undefined)
        
        inline def setMetric(value: Boolean): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
        
        inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
        
        inline def setOnLocationError(value: Any): Self = StObject.set(x, "onLocationError", value.asInstanceOf[js.Any])
        
        inline def setOnLocationErrorUndefined: Self = StObject.set(x, "onLocationError", js.undefined)
        
        inline def setOnLocationOutsideMapBounds(value: Any): Self = StObject.set(x, "onLocationOutsideMapBounds", value.asInstanceOf[js.Any])
        
        inline def setOnLocationOutsideMapBoundsUndefined: Self = StObject.set(x, "onLocationOutsideMapBounds", js.undefined)
        
        inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        inline def setReturnToPrevBounds(value: Boolean): Self = StObject.set(x, "returnToPrevBounds", value.asInstanceOf[js.Any])
        
        inline def setReturnToPrevBoundsUndefined: Self = StObject.set(x, "returnToPrevBounds", js.undefined)
        
        inline def setSetView(value: Boolean | String): Self = StObject.set(x, "setView", value.asInstanceOf[js.Any])
        
        inline def setSetViewUndefined: Self = StObject.set(x, "setView", js.undefined)
        
        inline def setShowCompass(value: Boolean): Self = StObject.set(x, "showCompass", value.asInstanceOf[js.Any])
        
        inline def setShowCompassUndefined: Self = StObject.set(x, "showCompass", js.undefined)
        
        inline def setShowPopup(value: Boolean): Self = StObject.set(x, "showPopup", value.asInstanceOf[js.Any])
        
        inline def setShowPopupUndefined: Self = StObject.set(x, "showPopup", js.undefined)
        
        inline def setStrings(value: Any): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
        
        inline def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
        
        inline def setTextElementTag(value: String): Self = StObject.set(x, "textElementTag", value.asInstanceOf[js.Any])
        
        inline def setTextElementTagUndefined: Self = StObject.set(x, "textElementTag", js.undefined)
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
    inline def locate(): Locate = ^.asInstanceOf[js.Dynamic].applyDynamic("locate")().asInstanceOf[Locate]
    inline def locate(options: LocateOptions): Locate = ^.asInstanceOf[js.Dynamic].applyDynamic("locate")(options.asInstanceOf[js.Any]).asInstanceOf[Locate]
  }
}
