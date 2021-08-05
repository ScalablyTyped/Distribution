package typings.mapboxMapboxSdk

import typings.geojson.mod.GeoJSON
import typings.mapboxGl.mod.LngLatBoundsLike
import typings.mapboxGl.mod.LngLatLike
import typings.mapboxMapboxSdk.anon.Bearing
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.auto
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.large
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.small
import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import typings.mapboxMapboxSdk.mod.SdkConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object staticMod {
  
  @JSImport("@mapbox/mapbox-sdk/services/static", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(config: SdkConfig): StaticMapService = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[StaticMapService]
  inline def default(config: typings.mapboxMapboxSdk.mod.default): StaticMapService = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[StaticMapService]
  
  trait CustomMarker extends StObject {
    
    var coordinates: LngLatLike
    
    var url: String
  }
  object CustomMarker {
    
    inline def apply(coordinates: LngLatLike, url: String): CustomMarker = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomMarker]
    }
    
    extension [Self <: CustomMarker](x: Self) {
      
      inline def setCoordinates(value: LngLatLike): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomMarkerOverlay extends StObject {
    
    var marker: CustomMarker
  }
  object CustomMarkerOverlay {
    
    inline def apply(marker: CustomMarker): CustomMarkerOverlay = {
      val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomMarkerOverlay]
    }
    
    extension [Self <: CustomMarkerOverlay](x: Self) {
      
      inline def setMarker(value: CustomMarker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    }
  }
  
  trait GeoJsonOverlay extends StObject {
    
    var geoJson: GeoJSON
  }
  object GeoJsonOverlay {
    
    inline def apply(geoJson: GeoJSON): GeoJsonOverlay = {
      val __obj = js.Dynamic.literal(geoJson = geoJson.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeoJsonOverlay]
    }
    
    extension [Self <: GeoJsonOverlay](x: Self) {
      
      inline def setGeoJson(value: GeoJSON): Self = StObject.set(x, "geoJson", value.asInstanceOf[js.Any])
    }
  }
  
  trait Path extends StObject {
    
    /**
      * An array of coordinates describing the path.
      */
    var coordinates: js.Array[LngLatBoundsLike]
    
    /**
      * Must be paired with strokeColor.
      */
    var fillColor: js.UndefOr[String] = js.undefined
    
    /**
      * Must be paired with strokeColor.
      */
    var fillOpacity: js.UndefOr[Double] = js.undefined
    
    var strokeColor: js.UndefOr[String] = js.undefined
    
    /**
      * Must be paired with strokeColor.
      */
    var strokeOpacity: js.UndefOr[Double] = js.undefined
    
    var strokeWidth: js.UndefOr[Double] = js.undefined
  }
  object Path {
    
    inline def apply(coordinates: js.Array[LngLatBoundsLike]): Path = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    extension [Self <: Path](x: Self) {
      
      inline def setCoordinates(value: js.Array[LngLatBoundsLike]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setCoordinatesVarargs(value: LngLatBoundsLike*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
      
      inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    }
  }
  
  trait PathOverlay extends StObject {
    
    var path: Path
  }
  object PathOverlay {
    
    inline def apply(path: Path): PathOverlay = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathOverlay]
    }
    
    extension [Self <: PathOverlay](x: Self) {
      
      inline def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait SimpleMarker extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var coordinates: LngLatLike
    
    var label: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[large | small] = js.undefined
  }
  object SimpleMarker {
    
    inline def apply(coordinates: LngLatLike): SimpleMarker = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleMarker]
    }
    
    extension [Self <: SimpleMarker](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCoordinates(value: LngLatLike): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setSize(value: large | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait SimpleMarkerOverlay extends StObject {
    
    var marker: SimpleMarker
  }
  object SimpleMarkerOverlay {
    
    inline def apply(marker: SimpleMarker): SimpleMarkerOverlay = {
      val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleMarkerOverlay]
    }
    
    extension [Self <: SimpleMarkerOverlay](x: Self) {
      
      inline def setMarker(value: SimpleMarker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    }
  }
  
  trait StaticMapRequest extends StObject {
    
    var attribution: js.UndefOr[Boolean] = js.undefined
    
    var height: Double
    
    var highRes: js.UndefOr[Boolean] = js.undefined
    
    var insertOverlayBeforeLayer: js.UndefOr[String] = js.undefined
    
    var logo: js.UndefOr[Boolean] = js.undefined
    
    var overlays: js.UndefOr[
        js.Array[CustomMarkerOverlay | SimpleMarkerOverlay | PathOverlay | GeoJsonOverlay]
      ] = js.undefined
    
    var ownerId: String
    
    var position: Bearing | auto
    
    var styleId: String
    
    var width: Double
  }
  object StaticMapRequest {
    
    inline def apply(height: Double, ownerId: String, position: Bearing | auto, styleId: String, width: Double): StaticMapRequest = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], styleId = styleId.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticMapRequest]
    }
    
    extension [Self <: StaticMapRequest](x: Self) {
      
      inline def setAttribution(value: Boolean): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
      
      inline def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHighRes(value: Boolean): Self = StObject.set(x, "highRes", value.asInstanceOf[js.Any])
      
      inline def setHighResUndefined: Self = StObject.set(x, "highRes", js.undefined)
      
      inline def setInsertOverlayBeforeLayer(value: String): Self = StObject.set(x, "insertOverlayBeforeLayer", value.asInstanceOf[js.Any])
      
      inline def setInsertOverlayBeforeLayerUndefined: Self = StObject.set(x, "insertOverlayBeforeLayer", js.undefined)
      
      inline def setLogo(value: Boolean): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
      
      inline def setOverlays(value: js.Array[CustomMarkerOverlay | SimpleMarkerOverlay | PathOverlay | GeoJsonOverlay]): Self = StObject.set(x, "overlays", value.asInstanceOf[js.Any])
      
      inline def setOverlaysUndefined: Self = StObject.set(x, "overlays", js.undefined)
      
      inline def setOverlaysVarargs(value: (CustomMarkerOverlay | SimpleMarkerOverlay | PathOverlay | GeoJsonOverlay)*): Self = StObject.set(x, "overlays", js.Array(value :_*))
      
      inline def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Bearing | auto): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setStyleId(value: String): Self = StObject.set(x, "styleId", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait StaticMapService extends StObject {
    
    /**
      * Get a static map image..
      * @param request
      */
    def getStaticImage(request: StaticMapRequest): MapiRequest
  }
  object StaticMapService {
    
    inline def apply(getStaticImage: StaticMapRequest => MapiRequest): StaticMapService = {
      val __obj = js.Dynamic.literal(getStaticImage = js.Any.fromFunction1(getStaticImage))
      __obj.asInstanceOf[StaticMapService]
    }
    
    extension [Self <: StaticMapService](x: Self) {
      
      inline def setGetStaticImage(value: StaticMapRequest => MapiRequest): Self = StObject.set(x, "getStaticImage", js.Any.fromFunction1(value))
    }
  }
}
