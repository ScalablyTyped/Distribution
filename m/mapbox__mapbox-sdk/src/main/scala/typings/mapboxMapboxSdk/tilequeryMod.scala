package typings.mapboxMapboxSdk

import typings.mapboxGl.mod.LngLatLike
import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import typings.mapboxMapboxSdk.mod.SdkConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tilequeryMod {
  
  @JSImport("@mapbox/mapbox-sdk/services/tilequery", JSImport.Default)
  @js.native
  def default(config: SdkConfig): TileQueryService = js.native
  @JSImport("@mapbox/mapbox-sdk/services/tilequery", JSImport.Default)
  @js.native
  def default(config: typings.mapboxMapboxSdk.mod.default): TileQueryService = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.polygon
    - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.linestring
    - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.point
  */
  trait GeometryType extends StObject
  object GeometryType {
    
    @scala.inline
    def linestring: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.linestring = "linestring".asInstanceOf[typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.linestring]
    
    @scala.inline
    def point: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.point = "point".asInstanceOf[typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.point]
    
    @scala.inline
    def polygon: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.polygon = "polygon".asInstanceOf[typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.polygon]
  }
  
  @js.native
  trait TileQueryRequest extends StObject {
    
    /**
      * The longitude and latitude to be queried.
      */
    var coordinates: LngLatLike = js.native
    
    /**
      * Whether or not to deduplicate results. (optional, default true)
      */
    var dedupe: Boolean = js.native
    
    /**
      * Queries for a specific geometry type.
      */
    var geometry: GeometryType = js.native
    
    var layers: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * The number of features to return, between 1 and 50. (optional, default 5)
      */
    var limit: Double = js.native
    
    /**
      * The maps being queried. If you need to composite multiple layers, provide multiple map IDs.
      */
    var mapIds: js.Array[String] = js.native
    
    /**
      * The approximate distance in meters to query for features. (optional, default 0)
      */
    var radius: Double = js.native
  }
  object TileQueryRequest {
    
    @scala.inline
    def apply(
      coordinates: LngLatLike,
      dedupe: Boolean,
      geometry: GeometryType,
      limit: Double,
      mapIds: js.Array[String],
      radius: Double
    ): TileQueryRequest = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], dedupe = dedupe.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], mapIds = mapIds.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
      __obj.asInstanceOf[TileQueryRequest]
    }
    
    @scala.inline
    implicit class TileQueryRequestMutableBuilder[Self <: TileQueryRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoordinates(value: LngLatLike): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDedupe(value: Boolean): Self = StObject.set(x, "dedupe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeometry(value: GeometryType): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayers(value: js.Array[String]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      @scala.inline
      def setLayersVarargs(value: String*): Self = StObject.set(x, "layers", js.Array(value :_*))
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapIds(value: js.Array[String]): Self = StObject.set(x, "mapIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapIdsVarargs(value: String*): Self = StObject.set(x, "mapIds", js.Array(value :_*))
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TileQueryService extends StObject {
    
    /**
      * Get a static map image..
      * @param request
      */
    def listFeatures(request: TileQueryRequest): MapiRequest = js.native
  }
  object TileQueryService {
    
    @scala.inline
    def apply(listFeatures: TileQueryRequest => MapiRequest): TileQueryService = {
      val __obj = js.Dynamic.literal(listFeatures = js.Any.fromFunction1(listFeatures))
      __obj.asInstanceOf[TileQueryService]
    }
    
    @scala.inline
    implicit class TileQueryServiceMutableBuilder[Self <: TileQueryService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setListFeatures(value: TileQueryRequest => MapiRequest): Self = StObject.set(x, "listFeatures", js.Any.fromFunction1(value))
    }
  }
}
