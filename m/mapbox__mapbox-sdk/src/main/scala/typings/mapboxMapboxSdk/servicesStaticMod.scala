package typings.mapboxMapboxSdk

import typings.geojson.mod.GeoJSON
import typings.mapboxGl.mod.AnyLayer
import typings.mapboxGl.mod.LngLatBoundsLike
import typings.mapboxGl.mod.LngLatLike
import typings.mapboxMapboxSdk.anon.Bearing
import typings.mapboxMapboxSdk.libClassesMapiClientMod.SdkConfig
import typings.mapboxMapboxSdk.libClassesMapiRequestMod.MapiRequest
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.auto
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.large
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesStaticMod {
  
  @JSImport("@mapbox/mapbox-sdk/services/static", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(config: SdkConfig): StaticMapService = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[StaticMapService]
  inline def default(config: typings.mapboxMapboxSdk.libClassesMapiClientMod.default): StaticMapService = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[StaticMapService]
  
  trait CustomMarker extends StObject {
    
    var coordinates: LngLatLike
    
    var url: String
  }
  object CustomMarker {
    
    inline def apply(coordinates: LngLatLike, url: String): CustomMarker = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomMarker]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomMarker] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomMarkerOverlay] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GeoJsonOverlay] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
      
      inline def setCoordinates(value: js.Array[LngLatBoundsLike]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setCoordinatesVarargs(value: LngLatBoundsLike*): Self = StObject.set(x, "coordinates", js.Array(value*))
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PathOverlay] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimpleMarker] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimpleMarkerOverlay] (val x: Self) extends AnyVal {
      
      inline def setMarker(value: SimpleMarker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    }
  }
  
  trait StaticMapRequest extends StObject {
    
    var addlayer: js.UndefOr[AnyLayer] = js.undefined
    
    var attribution: js.UndefOr[Boolean] = js.undefined
    
    var before_layer: js.UndefOr[String] = js.undefined
    
    var height: Double
    
    var highRes: js.UndefOr[Boolean] = js.undefined
    
    var layer_id: js.UndefOr[String] = js.undefined
    
    var logo: js.UndefOr[Boolean] = js.undefined
    
    var overlays: js.UndefOr[
        js.Array[CustomMarkerOverlay | SimpleMarkerOverlay | PathOverlay | GeoJsonOverlay]
      ] = js.undefined
    
    var ownerId: String
    
    var padding: js.UndefOr[String] = js.undefined
    
    var position: Bearing | auto
    
    var setfilter: js.UndefOr[js.Array[Any]] = js.undefined
    
    var styleId: String
    
    var width: Double
  }
  object StaticMapRequest {
    
    inline def apply(height: Double, ownerId: String, position: Bearing | auto, styleId: String, width: Double): StaticMapRequest = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], styleId = styleId.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticMapRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StaticMapRequest] (val x: Self) extends AnyVal {
      
      inline def setAddlayer(value: AnyLayer): Self = StObject.set(x, "addlayer", value.asInstanceOf[js.Any])
      
      inline def setAddlayerUndefined: Self = StObject.set(x, "addlayer", js.undefined)
      
      inline def setAttribution(value: Boolean): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
      
      inline def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
      
      inline def setBefore_layer(value: String): Self = StObject.set(x, "before_layer", value.asInstanceOf[js.Any])
      
      inline def setBefore_layerUndefined: Self = StObject.set(x, "before_layer", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHighRes(value: Boolean): Self = StObject.set(x, "highRes", value.asInstanceOf[js.Any])
      
      inline def setHighResUndefined: Self = StObject.set(x, "highRes", js.undefined)
      
      inline def setLayer_id(value: String): Self = StObject.set(x, "layer_id", value.asInstanceOf[js.Any])
      
      inline def setLayer_idUndefined: Self = StObject.set(x, "layer_id", js.undefined)
      
      inline def setLogo(value: Boolean): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
      
      inline def setOverlays(value: js.Array[CustomMarkerOverlay | SimpleMarkerOverlay | PathOverlay | GeoJsonOverlay]): Self = StObject.set(x, "overlays", value.asInstanceOf[js.Any])
      
      inline def setOverlaysUndefined: Self = StObject.set(x, "overlays", js.undefined)
      
      inline def setOverlaysVarargs(value: (CustomMarkerOverlay | SimpleMarkerOverlay | PathOverlay | GeoJsonOverlay)*): Self = StObject.set(x, "overlays", js.Array(value*))
      
      inline def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      inline def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPosition(value: Bearing | auto): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setSetfilter(value: js.Array[Any]): Self = StObject.set(x, "setfilter", value.asInstanceOf[js.Any])
      
      inline def setSetfilterUndefined: Self = StObject.set(x, "setfilter", js.undefined)
      
      inline def setSetfilterVarargs(value: Any*): Self = StObject.set(x, "setfilter", js.Array(value*))
      
      inline def setStyleId(value: String): Self = StObject.set(x, "styleId", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait StaticMapService extends StObject {
    
    /**
      * Get a static map image..
      * @param request
      */
    def getStaticImage(request: StaticMapRequest): MapiRequest[Any]
  }
  object StaticMapService {
    
    inline def apply(getStaticImage: StaticMapRequest => MapiRequest[Any]): StaticMapService = {
      val __obj = js.Dynamic.literal(getStaticImage = js.Any.fromFunction1(getStaticImage))
      __obj.asInstanceOf[StaticMapService]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StaticMapService] (val x: Self) extends AnyVal {
      
      inline def setGetStaticImage(value: StaticMapRequest => MapiRequest[Any]): Self = StObject.set(x, "getStaticImage", js.Any.fromFunction1(value))
    }
  }
}
