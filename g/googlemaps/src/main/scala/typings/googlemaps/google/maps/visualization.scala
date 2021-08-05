package typings.googlemaps.google.maps

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visualization {
  
  @js.native
  sealed trait MapsEngineStatus extends StObject
  // TODO find source documentation
  @JSGlobal("google.maps.visualization.MapsEngineStatus")
  @js.native
  object MapsEngineStatus extends StObject {
    
    @js.native
    sealed trait INVALID_LAYER
      extends StObject
         with MapsEngineStatus
    
    @js.native
    sealed trait OK
      extends StObject
         with MapsEngineStatus
    
    @js.native
    sealed trait UNKNOWN_ERROR
      extends StObject
         with MapsEngineStatus
  }
  
  @js.native
  trait HeatmapLayer
    extends StObject
       with MVCObject {
    
    def getData(): MVCArray[LatLng | WeightedLocation] = js.native
    
    def getMap(): Map[Element] = js.native
    
    def setData(data: js.Array[LatLng | WeightedLocation]): Unit = js.native
    def setData(data: MVCArray[LatLng | WeightedLocation]): Unit = js.native
    
    def setMap(): Unit = js.native
    def setMap(map: Map[Element]): Unit = js.native
    
    def setOptions(options: HeatmapLayerOptions): Unit = js.native
  }
  
  trait HeatmapLayerOptions extends StObject {
    
    var data: js.Any
    
    var dissipating: js.UndefOr[Boolean] = js.undefined
    
    var gradient: js.UndefOr[js.Array[String]] = js.undefined
    
    var map: js.UndefOr[Map[Element]] = js.undefined
    
    var maxIntensity: js.UndefOr[Double] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var radius: js.UndefOr[Double] = js.undefined
  }
  object HeatmapLayerOptions {
    
    inline def apply(data: js.Any): HeatmapLayerOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeatmapLayerOptions]
    }
    
    extension [Self <: HeatmapLayerOptions](x: Self) {
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDissipating(value: Boolean): Self = StObject.set(x, "dissipating", value.asInstanceOf[js.Any])
      
      inline def setDissipatingUndefined: Self = StObject.set(x, "dissipating", js.undefined)
      
      inline def setGradient(value: js.Array[String]): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
      
      inline def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
      
      inline def setGradientVarargs(value: String*): Self = StObject.set(x, "gradient", js.Array(value :_*))
      
      inline def setMap(value: Map[Element]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setMaxIntensity(value: Double): Self = StObject.set(x, "maxIntensity", value.asInstanceOf[js.Any])
      
      inline def setMaxIntensityUndefined: Self = StObject.set(x, "maxIntensity", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
  
  // TODO find source documentation
  @js.native
  trait MapsEngineLayer
    extends StObject
       with MVCObject {
    
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
  trait MapsEngineLayerOptions extends StObject {
    
    var accessToken: js.UndefOr[String] = js.undefined
    
    var clickable: js.UndefOr[Boolean] = js.undefined
    
    var fitBounds: js.UndefOr[Boolean] = js.undefined
    
    var layerId: js.UndefOr[String] = js.undefined
    
    var layerKey: js.UndefOr[String] = js.undefined
    
    var map: js.UndefOr[Map[Element]] = js.undefined
    
    var mapId: js.UndefOr[String] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var suppressInfoWindows: js.UndefOr[Boolean] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object MapsEngineLayerOptions {
    
    inline def apply(): MapsEngineLayerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapsEngineLayerOptions]
    }
    
    extension [Self <: MapsEngineLayerOptions](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
      
      inline def setFitBounds(value: Boolean): Self = StObject.set(x, "fitBounds", value.asInstanceOf[js.Any])
      
      inline def setFitBoundsUndefined: Self = StObject.set(x, "fitBounds", js.undefined)
      
      inline def setLayerId(value: String): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
      
      inline def setLayerIdUndefined: Self = StObject.set(x, "layerId", js.undefined)
      
      inline def setLayerKey(value: String): Self = StObject.set(x, "layerKey", value.asInstanceOf[js.Any])
      
      inline def setLayerKeyUndefined: Self = StObject.set(x, "layerKey", js.undefined)
      
      inline def setMap(value: Map[Element]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapId(value: String): Self = StObject.set(x, "mapId", value.asInstanceOf[js.Any])
      
      inline def setMapIdUndefined: Self = StObject.set(x, "mapId", js.undefined)
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSuppressInfoWindows(value: Boolean): Self = StObject.set(x, "suppressInfoWindows", value.asInstanceOf[js.Any])
      
      inline def setSuppressInfoWindowsUndefined: Self = StObject.set(x, "suppressInfoWindows", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  // TODO find source documentation
  trait MapsEngineLayerProperties extends StObject {
    
    var name: String
  }
  object MapsEngineLayerProperties {
    
    inline def apply(name: String): MapsEngineLayerProperties = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapsEngineLayerProperties]
    }
    
    extension [Self <: MapsEngineLayerProperties](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  // TODO find source documentation
  trait MapsEngineMouseEvent extends StObject {
    
    var featureId: js.UndefOr[String] = js.undefined
    
    var infoWindowHtml: js.UndefOr[String] = js.undefined
    
    var latLng: js.UndefOr[LatLng] = js.undefined
    
    var pixelOffset: js.UndefOr[Size] = js.undefined
  }
  object MapsEngineMouseEvent {
    
    inline def apply(): MapsEngineMouseEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapsEngineMouseEvent]
    }
    
    extension [Self <: MapsEngineMouseEvent](x: Self) {
      
      inline def setFeatureId(value: String): Self = StObject.set(x, "featureId", value.asInstanceOf[js.Any])
      
      inline def setFeatureIdUndefined: Self = StObject.set(x, "featureId", js.undefined)
      
      inline def setInfoWindowHtml(value: String): Self = StObject.set(x, "infoWindowHtml", value.asInstanceOf[js.Any])
      
      inline def setInfoWindowHtmlUndefined: Self = StObject.set(x, "infoWindowHtml", js.undefined)
      
      inline def setLatLng(value: LatLng): Self = StObject.set(x, "latLng", value.asInstanceOf[js.Any])
      
      inline def setLatLngUndefined: Self = StObject.set(x, "latLng", js.undefined)
      
      inline def setPixelOffset(value: Size): Self = StObject.set(x, "pixelOffset", value.asInstanceOf[js.Any])
      
      inline def setPixelOffsetUndefined: Self = StObject.set(x, "pixelOffset", js.undefined)
    }
  }
  
  // TODO find source documentation
  trait MapsEventListener extends StObject
  
  // TODO find source documentation
  trait MouseEvent extends StObject {
    
    def stop(): Unit
  }
  object MouseEvent {
    
    inline def apply(stop: () => Unit): typings.googlemaps.google.maps.visualization.MouseEvent = {
      val __obj = js.Dynamic.literal(stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[typings.googlemaps.google.maps.visualization.MouseEvent]
    }
    
    extension [Self <: typings.googlemaps.google.maps.visualization.MouseEvent](x: Self) {
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  trait WeightedLocation extends StObject {
    
    var location: LatLng
    
    var weight: Double
  }
  object WeightedLocation {
    
    inline def apply(location: LatLng, weight: Double): WeightedLocation = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[WeightedLocation]
    }
    
    extension [Self <: WeightedLocation](x: Self) {
      
      inline def setLocation(value: LatLng): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    }
  }
}
