package typings.googlemaps.google.maps

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visualization {
  
  @js.native
  sealed trait MapsEngineStatus extends StObject
  // TODO find source documentation
  @JSGlobal("google.maps.visualization.MapsEngineStatus")
  @js.native
  object MapsEngineStatus extends StObject {
    
    @js.native
    sealed trait INVALID_LAYER extends MapsEngineStatus
    
    @js.native
    sealed trait OK extends MapsEngineStatus
    
    @js.native
    sealed trait UNKNOWN_ERROR extends MapsEngineStatus
  }
  
  @js.native
  trait HeatmapLayer extends MVCObject {
    
    def getData(): MVCArray[LatLng | WeightedLocation] = js.native
    
    def getMap(): Map[Element] = js.native
    
    def setData(data: js.Array[LatLng | WeightedLocation]): Unit = js.native
    def setData(data: MVCArray[LatLng | WeightedLocation]): Unit = js.native
    
    def setMap(): Unit = js.native
    def setMap(map: Map[Element]): Unit = js.native
    
    def setOptions(options: HeatmapLayerOptions): Unit = js.native
  }
  
  @js.native
  trait HeatmapLayerOptions extends StObject {
    
    var data: js.Any = js.native
    
    var dissipating: js.UndefOr[Boolean] = js.native
    
    var gradient: js.UndefOr[js.Array[String]] = js.native
    
    var map: js.UndefOr[Map[Element]] = js.native
    
    var maxIntensity: js.UndefOr[Double] = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var radius: js.UndefOr[Double] = js.native
  }
  object HeatmapLayerOptions {
    
    @scala.inline
    def apply(data: js.Any): HeatmapLayerOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeatmapLayerOptions]
    }
    
    @scala.inline
    implicit class HeatmapLayerOptionsMutableBuilder[Self <: HeatmapLayerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDissipating(value: Boolean): Self = StObject.set(x, "dissipating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDissipatingUndefined: Self = StObject.set(x, "dissipating", js.undefined)
      
      @scala.inline
      def setGradient(value: js.Array[String]): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
      
      @scala.inline
      def setGradientVarargs(value: String*): Self = StObject.set(x, "gradient", js.Array(value :_*))
      
      @scala.inline
      def setMap(value: Map[Element]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setMaxIntensity(value: Double): Self = StObject.set(x, "maxIntensity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxIntensityUndefined: Self = StObject.set(x, "maxIntensity", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
  
  // TODO find source documentation
  @js.native
  trait MapsEngineLayer extends MVCObject {
    
    def getLayerId(): String = js.native
    
    def getLayerKey(): String = js.native
    
    def getMap(): Map[Element] = js.native
    
    def getMapId(): String = js.native
    
    def getOpacity(): Double = js.native
    
    def getProperties(): MapsEngineLayerProperties = js.native
    
    def getStatus(): MapsEngineStatus = js.native
    
    def getZIndex(): Double = js.native
    
    def setLayerId(layerId: String): Unit = js.native
    
    def setLayerKey(layerKey: String): Unit = js.native
    
    def setMap(): Unit = js.native
    def setMap(map: Map[Element]): Unit = js.native
    
    def setMapId(mapId: String): Unit = js.native
    
    def setOpacity(opacity: Double): Unit = js.native
    
    def setOptions(options: MapsEngineLayerOptions): Unit = js.native
    
    def setZIndex(zIndex: Double): Unit = js.native
  }
  
  // TODO find source documentation
  @js.native
  trait MapsEngineLayerOptions extends StObject {
    
    var accessToken: js.UndefOr[String] = js.native
    
    var clickable: js.UndefOr[Boolean] = js.native
    
    var fitBounds: js.UndefOr[Boolean] = js.native
    
    var layerId: js.UndefOr[String] = js.native
    
    var layerKey: js.UndefOr[String] = js.native
    
    var map: js.UndefOr[Map[Element]] = js.native
    
    var mapId: js.UndefOr[String] = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var suppressInfoWindows: js.UndefOr[Boolean] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object MapsEngineLayerOptions {
    
    @scala.inline
    def apply(): MapsEngineLayerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapsEngineLayerOptions]
    }
    
    @scala.inline
    implicit class MapsEngineLayerOptionsMutableBuilder[Self <: MapsEngineLayerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      @scala.inline
      def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
      
      @scala.inline
      def setFitBounds(value: Boolean): Self = StObject.set(x, "fitBounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFitBoundsUndefined: Self = StObject.set(x, "fitBounds", js.undefined)
      
      @scala.inline
      def setLayerId(value: String): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayerIdUndefined: Self = StObject.set(x, "layerId", js.undefined)
      
      @scala.inline
      def setLayerKey(value: String): Self = StObject.set(x, "layerKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayerKeyUndefined: Self = StObject.set(x, "layerKey", js.undefined)
      
      @scala.inline
      def setMap(value: Map[Element]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapId(value: String): Self = StObject.set(x, "mapId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapIdUndefined: Self = StObject.set(x, "mapId", js.undefined)
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSuppressInfoWindows(value: Boolean): Self = StObject.set(x, "suppressInfoWindows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressInfoWindowsUndefined: Self = StObject.set(x, "suppressInfoWindows", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  // TODO find source documentation
  @js.native
  trait MapsEngineLayerProperties extends StObject {
    
    var name: String = js.native
  }
  object MapsEngineLayerProperties {
    
    @scala.inline
    def apply(name: String): MapsEngineLayerProperties = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapsEngineLayerProperties]
    }
    
    @scala.inline
    implicit class MapsEngineLayerPropertiesMutableBuilder[Self <: MapsEngineLayerProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  // TODO find source documentation
  @js.native
  trait MapsEngineMouseEvent extends StObject {
    
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
    implicit class MapsEngineMouseEventMutableBuilder[Self <: MapsEngineMouseEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFeatureId(value: String): Self = StObject.set(x, "featureId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeatureIdUndefined: Self = StObject.set(x, "featureId", js.undefined)
      
      @scala.inline
      def setInfoWindowHtml(value: String): Self = StObject.set(x, "infoWindowHtml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoWindowHtmlUndefined: Self = StObject.set(x, "infoWindowHtml", js.undefined)
      
      @scala.inline
      def setLatLng(value: LatLng): Self = StObject.set(x, "latLng", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatLngUndefined: Self = StObject.set(x, "latLng", js.undefined)
      
      @scala.inline
      def setPixelOffset(value: Size): Self = StObject.set(x, "pixelOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelOffsetUndefined: Self = StObject.set(x, "pixelOffset", js.undefined)
    }
  }
  
  // TODO find source documentation
  @js.native
  trait MapsEventListener extends StObject
  
  // TODO find source documentation
  @js.native
  trait MouseEvent extends StObject {
    
    def stop(): Unit = js.native
  }
  object MouseEvent {
    
    @scala.inline
    def apply(stop: () => Unit): typings.googlemaps.google.maps.visualization.MouseEvent = {
      val __obj = js.Dynamic.literal(stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[typings.googlemaps.google.maps.visualization.MouseEvent]
    }
    
    @scala.inline
    implicit class MouseEventMutableBuilder[Self <: typings.googlemaps.google.maps.visualization.MouseEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait WeightedLocation extends StObject {
    
    var location: LatLng = js.native
    
    var weight: Double = js.native
  }
  object WeightedLocation {
    
    @scala.inline
    def apply(location: LatLng, weight: Double): WeightedLocation = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[WeightedLocation]
    }
    
    @scala.inline
    implicit class WeightedLocationMutableBuilder[Self <: WeightedLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocation(value: LatLng): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    }
  }
}
