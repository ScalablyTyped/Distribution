package typings.mapboxMapboxSdk

import typings.mapboxMapboxSdk.libClassesMapiClientMod.SdkConfig
import typings.mapboxMapboxSdk.libClassesMapiRequestMod.MapboxProfile
import typings.mapboxMapboxSdk.libClassesMapiRequestMod.MapiRequest
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.`false`
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.any
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.first
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.full
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.geojson
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.last
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.polyline
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.polyline6
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.simplified
import typings.mapboxMapboxSdk.servicesDirectionsMod.Waypoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesOptimizationMod {
  
  @JSImport("@mapbox/mapbox-sdk/services/optimization", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(config: SdkConfig): OptimizationService = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[OptimizationService]
  inline def default(config: typings.mapboxMapboxSdk.libClassesMapiClientMod.default): OptimizationService = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[OptimizationService]
  
  trait Distribution extends StObject {
    
    /**
      * Array index of the item containing coordinates for the drop-off location in the waypoints array
      */
    var dropoff: Double
    
    /**
      * Array index of the item containing coordinates for the pick-up location in the waypoints array
      */
    var pickup: Double
  }
  object Distribution {
    
    inline def apply(dropoff: Double, pickup: Double): Distribution = {
      val __obj = js.Dynamic.literal(dropoff = dropoff.asInstanceOf[js.Any], pickup = pickup.asInstanceOf[js.Any])
      __obj.asInstanceOf[Distribution]
    }
    
    extension [Self <: Distribution](x: Self) {
      
      inline def setDropoff(value: Double): Self = StObject.set(x, "dropoff", value.asInstanceOf[js.Any])
      
      inline def setPickup(value: Double): Self = StObject.set(x, "pickup", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.duration
    - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.speed
    - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.distance
  */
  trait OptimizationAnnotation extends StObject
  object OptimizationAnnotation {
    
    inline def distance: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.distance = "distance".asInstanceOf[typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.distance]
    
    inline def duration: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.duration = "duration".asInstanceOf[typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.duration]
    
    inline def speed: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.speed = "speed".asInstanceOf[typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.speed]
  }
  
  trait OptimizationRequest extends StObject {
    
    /**
      * Return additional metadata along the route. You can include several annotations as a comma-separated list. Possible values are:
      */
    var annotations: js.UndefOr[js.Array[OptimizationAnnotation]] = js.undefined
    
    /**
      * Specify the destination coordinate of the returned route. Accepts  any (default) or  last .
      */
    var destination: js.UndefOr[any | last] = js.undefined
    
    /**
      * Specify pick-up and drop-off locations for a trip by providing a ; delimited list of number pairs that correspond with the coordinates list.
      * The first number of a pair indicates the index to the coordinate of the pick-up location in the coordinates list,
      * and the second number indicates the index to the coordinate of the drop-off location in the coordinates list.
      * Each pair must contain exactly 2 numbers, which cannot be the same.
      * The returned solution will visit pick-up locations before visiting drop-off locations. The first location can only be a pick-up location, not a drop-off location.
      */
    var distributions: js.UndefOr[js.Array[Distribution]] = js.undefined
    
    /**
      * The format of the returned geometry. Allowed values are:  geojson (as LineString ),  polyline (default, a polyline with precision 5),  polyline6 (a polyline with precision 6).
      */
    var geometries: js.UndefOr[geojson | polyline | polyline6] = js.undefined
    
    /**
      * The language of returned turn-by-turn text instructions. See supported languages . The default is  en (English).
      */
    var language: js.UndefOr[String] = js.undefined
    
    /**
      * The type of the returned overview geometry.
      * Can be 'full' (the most detailed geometry available), 'simplified' (default, a simplified version of the full geometry), or 'false' (no overview geometry).
      */
    var overview: js.UndefOr[full | simplified | `false`] = js.undefined
    
    /**
      * A Mapbox Directions routing profile ID.
      */
    var profile: MapboxProfile
    
    /**
      * Indicates whether the returned route is roundtrip, meaning the route returns to the first location ( true , default) or not ( false ).
      * If roundtrip=false , the  source and  destination parameters are required but not all combinations will be possible.
      * See the Fixing Start and End Points section below for additional notes.
      */
    var roundtrip: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The coordinate at which to start the returned route. Accepts  any (default) or  first .
      */
    var source: js.UndefOr[any | first] = js.undefined
    
    /**
      * Whether to return steps and turn-by-turn instructions ( true ) or not ( false , default).
      */
    var steps: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A semicolon-separated list of {longitude},{latitude} coordinates. There must be between 2 and 12 coordinates. The first coordinate is the start and end point of the trip.
      */
    var waypoints: js.Array[Waypoint]
  }
  object OptimizationRequest {
    
    inline def apply(profile: MapboxProfile, waypoints: js.Array[Waypoint]): OptimizationRequest = {
      val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptimizationRequest]
    }
    
    extension [Self <: OptimizationRequest](x: Self) {
      
      inline def setAnnotations(value: js.Array[OptimizationAnnotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
      
      inline def setAnnotationsVarargs(value: OptimizationAnnotation*): Self = StObject.set(x, "annotations", js.Array(value*))
      
      inline def setDestination(value: any | last): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
      
      inline def setDistributions(value: js.Array[Distribution]): Self = StObject.set(x, "distributions", value.asInstanceOf[js.Any])
      
      inline def setDistributionsUndefined: Self = StObject.set(x, "distributions", js.undefined)
      
      inline def setDistributionsVarargs(value: Distribution*): Self = StObject.set(x, "distributions", js.Array(value*))
      
      inline def setGeometries(value: geojson | polyline | polyline6): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
      
      inline def setGeometriesUndefined: Self = StObject.set(x, "geometries", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setOverview(value: full | simplified | `false`): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
      
      inline def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
      
      inline def setProfile(value: MapboxProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setRoundtrip(value: Boolean): Self = StObject.set(x, "roundtrip", value.asInstanceOf[js.Any])
      
      inline def setRoundtripUndefined: Self = StObject.set(x, "roundtrip", js.undefined)
      
      inline def setSource(value: any | first): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setSteps(value: Boolean): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      inline def setWaypoints(value: js.Array[Waypoint]): Self = StObject.set(x, "waypoints", value.asInstanceOf[js.Any])
      
      inline def setWaypointsVarargs(value: Waypoint*): Self = StObject.set(x, "waypoints", js.Array(value*))
    }
  }
  
  // SdkConfig | MapiClient
  trait OptimizationService extends StObject {
    
    def getOptimization(config: OptimizationRequest): MapiRequest[Any]
  }
  object OptimizationService {
    
    inline def apply(getOptimization: OptimizationRequest => MapiRequest[Any]): OptimizationService = {
      val __obj = js.Dynamic.literal(getOptimization = js.Any.fromFunction1(getOptimization))
      __obj.asInstanceOf[OptimizationService]
    }
    
    extension [Self <: OptimizationService](x: Self) {
      
      inline def setGetOptimization(value: OptimizationRequest => MapiRequest[Any]): Self = StObject.set(x, "getOptimization", js.Any.fromFunction1(value))
    }
  }
}
