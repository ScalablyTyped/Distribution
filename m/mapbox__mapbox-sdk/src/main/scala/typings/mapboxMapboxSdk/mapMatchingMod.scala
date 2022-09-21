package typings.mapboxMapboxSdk

import typings.mapboxMapboxSdk.directionsMod.DirectionsAnnotation
import typings.mapboxMapboxSdk.directionsMod.DirectionsGeometry
import typings.mapboxMapboxSdk.directionsMod.DirectionsOverview
import typings.mapboxMapboxSdk.directionsMod.Leg
import typings.mapboxMapboxSdk.mapiRequestMod.Coordinates
import typings.mapboxMapboxSdk.mapiRequestMod.DirectionsApproach
import typings.mapboxMapboxSdk.mapiRequestMod.MapboxProfile
import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import typings.mapboxMapboxSdk.mod.SdkConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapMatchingMod {
  
  @JSImport("@mapbox/mapbox-sdk/services/map-matching", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(config: SdkConfig): MapMatchingService = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[MapMatchingService]
  inline def default(config: typings.mapboxMapboxSdk.mod.default): MapMatchingService = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[MapMatchingService]
  
  trait MapMatchingPoint
    extends StObject
       with Point {
    
    /**
      * Whether this coordinate is waypoint or not. The first and last coordinates will always be waypoints.
      */
    var isWaypoint: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A number in meters indicating the assumed precision of the used tracking device.
      */
    var radius: js.UndefOr[Double] = js.undefined
    
    /**
      * Datetime corresponding to the coordinate.
      */
    var timestamp: js.UndefOr[String | Double | js.Date] = js.undefined
    
    /**
      * Custom name for the waypoint used for the arrival instruction in banners and voice instructions.
      * Will be ignored unless isWaypoint is true.
      */
    var waypointName: js.UndefOr[Boolean] = js.undefined
  }
  object MapMatchingPoint {
    
    inline def apply(coordinates: Coordinates): MapMatchingPoint = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapMatchingPoint]
    }
    
    extension [Self <: MapMatchingPoint](x: Self) {
      
      inline def setIsWaypoint(value: Boolean): Self = StObject.set(x, "isWaypoint", value.asInstanceOf[js.Any])
      
      inline def setIsWaypointUndefined: Self = StObject.set(x, "isWaypoint", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setTimestamp(value: String | Double | js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setWaypointName(value: Boolean): Self = StObject.set(x, "waypointName", value.asInstanceOf[js.Any])
      
      inline def setWaypointNameUndefined: Self = StObject.set(x, "waypointName", js.undefined)
    }
  }
  
  trait MapMatchingRequest extends StObject {
    
    /**
      * Specify additional metadata that should be returned.
      */
    var annotations: js.UndefOr[DirectionsAnnotation] = js.undefined
    
    /**
      * Format of the returned geometry. (optional, default "polyline")
      */
    var geometries: js.UndefOr[DirectionsGeometry] = js.undefined
    
    /**
      * Language of returned turn-by-turn text instructions. See supported languages. (optional, default "en")
      */
    var language: js.UndefOr[String] = js.undefined
    
    /**
      * Type of returned overview geometry. (optional, default "simplified"
      */
    var overview: js.UndefOr[DirectionsOverview] = js.undefined
    
    /**
      * An ordered array of MapMatchingPoints, between 2 and 100 (inclusive).
      */
    var points: js.Array[MapMatchingPoint]
    
    /**
      * A directions profile ID. (optional, default driving)
      */
    var profile: js.UndefOr[MapboxProfile] = js.undefined
    
    /**
      * Whether to return steps and turn-by-turn instructions. (optional, default false)
      */
    var steps: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not to transparently remove clusters and re-sample traces for improved map matching results. (optional, default false)
      */
    var tidy: js.UndefOr[Boolean] = js.undefined
  }
  object MapMatchingRequest {
    
    inline def apply(points: js.Array[MapMatchingPoint]): MapMatchingRequest = {
      val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapMatchingRequest]
    }
    
    extension [Self <: MapMatchingRequest](x: Self) {
      
      inline def setAnnotations(value: DirectionsAnnotation): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
      
      inline def setGeometries(value: DirectionsGeometry): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
      
      inline def setGeometriesUndefined: Self = StObject.set(x, "geometries", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setOverview(value: DirectionsOverview): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
      
      inline def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
      
      inline def setPoints(value: js.Array[MapMatchingPoint]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsVarargs(value: MapMatchingPoint*): Self = StObject.set(x, "points", js.Array(value*))
      
      inline def setProfile(value: MapboxProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      inline def setSteps(value: Boolean): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      inline def setTidy(value: Boolean): Self = StObject.set(x, "tidy", value.asInstanceOf[js.Any])
      
      inline def setTidyUndefined: Self = StObject.set(x, "tidy", js.undefined)
    }
  }
  
  trait MapMatchingResponse extends StObject {
    
    /**
      * A string depicting the state of the response; see below for options
      */
    var code: String
    
    /**
      * An array of Match objects.
      */
    var matchings: js.Array[Matching]
    
    /**
      * An array of Tracepoint objects representing the location an input point was matched with.
      * Array of Waypoint objects representing all input points of the trace in the order they were matched.
      * If a trace point is omitted by map matching because it is an outlier, the entry will be null.
      */
    var tracepoints: js.Array[Tracepoint]
  }
  object MapMatchingResponse {
    
    inline def apply(code: String, matchings: js.Array[Matching], tracepoints: js.Array[Tracepoint]): MapMatchingResponse = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], matchings = matchings.asInstanceOf[js.Any], tracepoints = tracepoints.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapMatchingResponse]
    }
    
    extension [Self <: MapMatchingResponse](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMatchings(value: js.Array[Matching]): Self = StObject.set(x, "matchings", value.asInstanceOf[js.Any])
      
      inline def setMatchingsVarargs(value: Matching*): Self = StObject.set(x, "matchings", js.Array(value*))
      
      inline def setTracepoints(value: js.Array[Tracepoint]): Self = StObject.set(x, "tracepoints", value.asInstanceOf[js.Any])
      
      inline def setTracepointsVarargs(value: Tracepoint*): Self = StObject.set(x, "tracepoints", js.Array(value*))
    }
  }
  
  trait MapMatchingService extends StObject {
    
    def getMatch(request: MapMatchingRequest): MapiRequest[MapMatchingResponse]
  }
  object MapMatchingService {
    
    inline def apply(getMatch: MapMatchingRequest => MapiRequest[MapMatchingResponse]): MapMatchingService = {
      val __obj = js.Dynamic.literal(getMatch = js.Any.fromFunction1(getMatch))
      __obj.asInstanceOf[MapMatchingService]
    }
    
    extension [Self <: MapMatchingService](x: Self) {
      
      inline def setGetMatch(value: MapMatchingRequest => MapiRequest[MapMatchingResponse]): Self = StObject.set(x, "getMatch", js.Any.fromFunction1(value))
    }
  }
  
  trait Matching extends StObject {
    
    /**
      * a number between 0 (low) and 1 (high) indicating level of confidence in the returned match
      */
    var confidence: Double
    
    var distance: Double
    
    var duration: Double
    
    var geometry: String
    
    var legs: js.Array[Leg]
    
    var weight: Double
    
    var weight_name: String
  }
  object Matching {
    
    inline def apply(
      confidence: Double,
      distance: Double,
      duration: Double,
      geometry: String,
      legs: js.Array[Leg],
      weight: Double,
      weight_name: String
    ): Matching = {
      val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], legs = legs.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any], weight_name = weight_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Matching]
    }
    
    extension [Self <: Matching](x: Self) {
      
      inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setGeometry(value: String): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setLegs(value: js.Array[Leg]): Self = StObject.set(x, "legs", value.asInstanceOf[js.Any])
      
      inline def setLegsVarargs(value: Leg*): Self = StObject.set(x, "legs", js.Array(value*))
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeight_name(value: String): Self = StObject.set(x, "weight_name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Point extends StObject {
    
    /**
      * Used to indicate how requested routes consider from which side of the road to approach a waypoint.
      */
    var approach: js.UndefOr[DirectionsApproach] = js.undefined
    
    var coordinates: Coordinates
  }
  object Point {
    
    inline def apply(coordinates: Coordinates): Point = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    extension [Self <: Point](x: Self) {
      
      inline def setApproach(value: DirectionsApproach): Self = StObject.set(x, "approach", value.asInstanceOf[js.Any])
      
      inline def setApproachUndefined: Self = StObject.set(x, "approach", js.undefined)
      
      inline def setCoordinates(value: Coordinates): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tracepoint extends StObject {
    
    /**
      * Number of probable alternative matchings for this trace point. A value of zero indicates that this point was matched unambiguously.
      * Split the trace at these points for incremental map matching.
      */
    var alternatives_count: Double
    
    var location: js.Array[Double]
    
    /**
      * Index to the match object in matchings the sub-trace was matched to.
      */
    var matchings_index: Double
    
    var name: String
    
    /**
      * Index of the waypoint inside the matched route.
      */
    var waypoint_index: Double
  }
  object Tracepoint {
    
    inline def apply(
      alternatives_count: Double,
      location: js.Array[Double],
      matchings_index: Double,
      name: String,
      waypoint_index: Double
    ): Tracepoint = {
      val __obj = js.Dynamic.literal(alternatives_count = alternatives_count.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], matchings_index = matchings_index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], waypoint_index = waypoint_index.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tracepoint]
    }
    
    extension [Self <: Tracepoint](x: Self) {
      
      inline def setAlternatives_count(value: Double): Self = StObject.set(x, "alternatives_count", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: js.Array[Double]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationVarargs(value: Double*): Self = StObject.set(x, "location", js.Array(value*))
      
      inline def setMatchings_index(value: Double): Self = StObject.set(x, "matchings_index", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setWaypoint_index(value: Double): Self = StObject.set(x, "waypoint_index", value.asInstanceOf[js.Any])
    }
  }
}
