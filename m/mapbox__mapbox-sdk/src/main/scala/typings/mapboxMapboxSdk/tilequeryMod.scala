package typings.mapboxMapboxSdk

import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.point_
import typings.mapboxMapboxSdk.mapiRequestMod.Coordinates
import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import typings.mapboxMapboxSdk.mod.SdkConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tilequeryMod {
  
  @JSImport("@mapbox/mapbox-sdk/services/tilequery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(config: SdkConfig): TileQueryService = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[TileQueryService]
  inline def default(config: typings.mapboxMapboxSdk.mod.default): TileQueryService = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[TileQueryService]
  
  /* Rewritten from type alias, can be one of: 
    - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.polygon
    - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.linestring
    - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.point_
  */
  trait GeometryType extends StObject
  object GeometryType {
    
    inline def linestring: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.linestring = "linestring".asInstanceOf[typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.linestring]
    
    inline def point: point_ = "point".asInstanceOf[point_]
    
    inline def polygon: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.polygon = "polygon".asInstanceOf[typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.polygon]
  }
  
  trait TileQueryRequest extends StObject {
    
    /**
      * The longitude and latitude to be queried.
      */
    var coordinates: Coordinates
    
    /**
      * Whether or not to deduplicate results. (optional, default true)
      */
    var dedupe: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Queries for a specific geometry type.
      */
    var geometry: js.UndefOr[GeometryType] = js.undefined
    
    var layers: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The number of features to return, between 1 and 50. (optional, default 5)
      */
    var limit: js.UndefOr[Double] = js.undefined
    
    /**
      * The maps being queried. If you need to composite multiple layers, provide multiple map IDs.
      */
    var mapIds: js.Array[String]
    
    /**
      * The approximate distance in meters to query for features. (optional, default 0)
      */
    var radius: js.UndefOr[Double] = js.undefined
  }
  object TileQueryRequest {
    
    inline def apply(coordinates: Coordinates, mapIds: js.Array[String]): TileQueryRequest = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], mapIds = mapIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[TileQueryRequest]
    }
    
    extension [Self <: TileQueryRequest](x: Self) {
      
      inline def setCoordinates(value: Coordinates): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setDedupe(value: Boolean): Self = StObject.set(x, "dedupe", value.asInstanceOf[js.Any])
      
      inline def setDedupeUndefined: Self = StObject.set(x, "dedupe", js.undefined)
      
      inline def setGeometry(value: GeometryType): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
      
      inline def setLayers(value: js.Array[String]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: String*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setMapIds(value: js.Array[String]): Self = StObject.set(x, "mapIds", value.asInstanceOf[js.Any])
      
      inline def setMapIdsVarargs(value: String*): Self = StObject.set(x, "mapIds", js.Array(value*))
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
  
  trait TileQueryService extends StObject {
    
    /**
      * Get a static map image..
      * @param request
      */
    def listFeatures(request: TileQueryRequest): MapiRequest[Any]
  }
  object TileQueryService {
    
    inline def apply(listFeatures: TileQueryRequest => MapiRequest[Any]): TileQueryService = {
      val __obj = js.Dynamic.literal(listFeatures = js.Any.fromFunction1(listFeatures))
      __obj.asInstanceOf[TileQueryService]
    }
    
    extension [Self <: TileQueryService](x: Self) {
      
      inline def setListFeatures(value: TileQueryRequest => MapiRequest[Any]): Self = StObject.set(x, "listFeatures", js.Any.fromFunction1(value))
    }
  }
}
