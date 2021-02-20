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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object staticMod {
  
  @JSImport("@mapbox/mapbox-sdk/services/static", JSImport.Default)
  @js.native
  def default(config: SdkConfig): StaticMapService = js.native
  @JSImport("@mapbox/mapbox-sdk/services/static", JSImport.Default)
  @js.native
  def default(config: typings.mapboxMapboxSdk.mod.default): StaticMapService = js.native
  
  @js.native
  trait CustomMarker extends StObject {
    
    var coordinates: LngLatLike = js.native
    
    var url: String = js.native
  }
  object CustomMarker {
    
    @scala.inline
    def apply(coordinates: LngLatLike, url: String): CustomMarker = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomMarker]
    }
    
    @scala.inline
    implicit class CustomMarkerMutableBuilder[Self <: CustomMarker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoordinates(value: LngLatLike): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CustomMarkerOverlay extends StObject {
    
    var marker: CustomMarker = js.native
  }
  object CustomMarkerOverlay {
    
    @scala.inline
    def apply(marker: CustomMarker): CustomMarkerOverlay = {
      val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomMarkerOverlay]
    }
    
    @scala.inline
    implicit class CustomMarkerOverlayMutableBuilder[Self <: CustomMarkerOverlay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMarker(value: CustomMarker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GeoJsonOverlay extends StObject {
    
    var geoJson: GeoJSON = js.native
  }
  object GeoJsonOverlay {
    
    @scala.inline
    def apply(geoJson: GeoJSON): GeoJsonOverlay = {
      val __obj = js.Dynamic.literal(geoJson = geoJson.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeoJsonOverlay]
    }
    
    @scala.inline
    implicit class GeoJsonOverlayMutableBuilder[Self <: GeoJsonOverlay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGeoJson(value: GeoJSON): Self = StObject.set(x, "geoJson", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Path extends StObject {
    
    /**
      * An array of coordinates describing the path.
      */
    var coordinates: js.Array[LngLatBoundsLike] = js.native
    
    /**
      * Must be paired with strokeColor.
      */
    var fillColor: js.UndefOr[String] = js.native
    
    /**
      * Must be paired with strokeColor.
      */
    var fillOpacity: js.UndefOr[Double] = js.native
    
    var strokeColor: js.UndefOr[String] = js.native
    
    /**
      * Must be paired with strokeColor.
      */
    var strokeOpacity: js.UndefOr[Double] = js.native
    
    var strokeWidth: js.UndefOr[Double] = js.native
  }
  object Path {
    
    @scala.inline
    def apply(coordinates: js.Array[LngLatBoundsLike]): Path = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    @scala.inline
    implicit class PathMutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoordinates(value: js.Array[LngLatBoundsLike]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordinatesVarargs(value: LngLatBoundsLike*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      @scala.inline
      def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      @scala.inline
      def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    }
  }
  
  @js.native
  trait PathOverlay extends StObject {
    
    var path: Path = js.native
  }
  object PathOverlay {
    
    @scala.inline
    def apply(path: Path): PathOverlay = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathOverlay]
    }
    
    @scala.inline
    implicit class PathOverlayMutableBuilder[Self <: PathOverlay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SimpleMarker extends StObject {
    
    var color: js.UndefOr[String] = js.native
    
    var coordinates: LngLatLike = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[large | small] = js.native
  }
  object SimpleMarker {
    
    @scala.inline
    def apply(coordinates: LngLatLike): SimpleMarker = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleMarker]
    }
    
    @scala.inline
    implicit class SimpleMarkerMutableBuilder[Self <: SimpleMarker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCoordinates(value: LngLatLike): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setSize(value: large | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait SimpleMarkerOverlay extends StObject {
    
    var marker: SimpleMarker = js.native
  }
  object SimpleMarkerOverlay {
    
    @scala.inline
    def apply(marker: SimpleMarker): SimpleMarkerOverlay = {
      val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleMarkerOverlay]
    }
    
    @scala.inline
    implicit class SimpleMarkerOverlayMutableBuilder[Self <: SimpleMarkerOverlay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMarker(value: SimpleMarker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StaticMapRequest extends StObject {
    
    var attribution: js.UndefOr[Boolean] = js.native
    
    var height: Double = js.native
    
    var highRes: js.UndefOr[Boolean] = js.native
    
    var insertOverlayBeforeLayer: js.UndefOr[String] = js.native
    
    var logo: js.UndefOr[Boolean] = js.native
    
    var overlays: js.UndefOr[
        js.Array[CustomMarkerOverlay | SimpleMarkerOverlay | PathOverlay | GeoJsonOverlay]
      ] = js.native
    
    var ownerId: String = js.native
    
    var position: Bearing | auto = js.native
    
    var styleId: String = js.native
    
    var width: Double = js.native
  }
  object StaticMapRequest {
    
    @scala.inline
    def apply(height: Double, ownerId: String, position: Bearing | auto, styleId: String, width: Double): StaticMapRequest = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], styleId = styleId.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticMapRequest]
    }
    
    @scala.inline
    implicit class StaticMapRequestMutableBuilder[Self <: StaticMapRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttribution(value: Boolean): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighRes(value: Boolean): Self = StObject.set(x, "highRes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighResUndefined: Self = StObject.set(x, "highRes", js.undefined)
      
      @scala.inline
      def setInsertOverlayBeforeLayer(value: String): Self = StObject.set(x, "insertOverlayBeforeLayer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertOverlayBeforeLayerUndefined: Self = StObject.set(x, "insertOverlayBeforeLayer", js.undefined)
      
      @scala.inline
      def setLogo(value: Boolean): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
      
      @scala.inline
      def setOverlays(value: js.Array[CustomMarkerOverlay | SimpleMarkerOverlay | PathOverlay | GeoJsonOverlay]): Self = StObject.set(x, "overlays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlaysUndefined: Self = StObject.set(x, "overlays", js.undefined)
      
      @scala.inline
      def setOverlaysVarargs(value: (CustomMarkerOverlay | SimpleMarkerOverlay | PathOverlay | GeoJsonOverlay)*): Self = StObject.set(x, "overlays", js.Array(value :_*))
      
      @scala.inline
      def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: Bearing | auto): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleId(value: String): Self = StObject.set(x, "styleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StaticMapService extends StObject {
    
    /**
      * Get a static map image..
      * @param request
      */
    def getStaticImage(request: StaticMapRequest): MapiRequest = js.native
  }
  object StaticMapService {
    
    @scala.inline
    def apply(getStaticImage: StaticMapRequest => MapiRequest): StaticMapService = {
      val __obj = js.Dynamic.literal(getStaticImage = js.Any.fromFunction1(getStaticImage))
      __obj.asInstanceOf[StaticMapService]
    }
    
    @scala.inline
    implicit class StaticMapServiceMutableBuilder[Self <: StaticMapService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetStaticImage(value: StaticMapRequest => MapiRequest): Self = StObject.set(x, "getStaticImage", js.Any.fromFunction1(value))
    }
  }
}
