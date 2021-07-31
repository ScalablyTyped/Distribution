package typings.mapboxMapboxSdk

import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.`false`
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.any
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.distance
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.duration
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.first
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.full
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.geojson
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.last
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.polyline
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.polyline6
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.simplified
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.speed
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.unlimited
import typings.mapboxMapboxSdk.mapiRequestMod.DirectionsApproach
import typings.mapboxMapboxSdk.mapiRequestMod.MapboxProfile
import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import typings.mapboxMapboxSdk.mod.SdkConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optimizationMod {
  
  @JSImport("@mapbox/mapbox-sdk/services/optimization", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(config: SdkConfig): OptimizationService = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[OptimizationService]
  @scala.inline
  def default(config: typings.mapboxMapboxSdk.mod.default): OptimizationService = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[OptimizationService]
  
  trait OptimizationRequest extends StObject {
    
    /**
      * Return additional metadata along the route. You can include several annotations as a comma-separated list. Possible values are:
      */
    var annotations: js.UndefOr[duration | speed | distance] = js.undefined
    
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
    var distributions: js.UndefOr[js.Array[Double]] = js.undefined
    
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
    var waypoints: js.Array[OptimizationWaypoint]
  }
  object OptimizationRequest {
    
    @scala.inline
    def apply(profile: MapboxProfile, waypoints: js.Array[OptimizationWaypoint]): OptimizationRequest = {
      val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptimizationRequest]
    }
    
    @scala.inline
    implicit class OptimizationRequestMutableBuilder[Self <: OptimizationRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnotations(value: duration | speed | distance): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
      
      @scala.inline
      def setDestination(value: any | last): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
      
      @scala.inline
      def setDistributions(value: js.Array[Double]): Self = StObject.set(x, "distributions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistributionsUndefined: Self = StObject.set(x, "distributions", js.undefined)
      
      @scala.inline
      def setDistributionsVarargs(value: Double*): Self = StObject.set(x, "distributions", js.Array(value :_*))
      
      @scala.inline
      def setGeometries(value: geojson | polyline | polyline6): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeometriesUndefined: Self = StObject.set(x, "geometries", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setOverview(value: full | simplified | `false`): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
      
      @scala.inline
      def setProfile(value: MapboxProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundtrip(value: Boolean): Self = StObject.set(x, "roundtrip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundtripUndefined: Self = StObject.set(x, "roundtrip", js.undefined)
      
      @scala.inline
      def setSource(value: any | first): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setSteps(value: Boolean): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      @scala.inline
      def setWaypoints(value: js.Array[OptimizationWaypoint]): Self = StObject.set(x, "waypoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaypointsVarargs(value: OptimizationWaypoint*): Self = StObject.set(x, "waypoints", js.Array(value :_*))
    }
  }
  
  // SdkConfig | MapiClient
  trait OptimizationService extends StObject {
    
    def getContours(config: OptimizationRequest): MapiRequest
  }
  object OptimizationService {
    
    @scala.inline
    def apply(getContours: OptimizationRequest => MapiRequest): OptimizationService = {
      val __obj = js.Dynamic.literal(getContours = js.Any.fromFunction1(getContours))
      __obj.asInstanceOf[OptimizationService]
    }
    
    @scala.inline
    implicit class OptimizationServiceMutableBuilder[Self <: OptimizationService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetContours(value: OptimizationRequest => MapiRequest): Self = StObject.set(x, "getContours", js.Any.fromFunction1(value))
    }
  }
  
  trait OptimizationWaypoint extends StObject {
    
    /**
      * Used to indicate how requested routes consider from which side of the road to approach the waypoint.
      */
    var approach: js.UndefOr[DirectionsApproach] = js.undefined
    
    /**
      * Used to filter the road segment the waypoint will be placed on by direction and dictates the angle of approach.
      * This option should always be used in conjunction with a `radius`. The first value is an angle clockwise from true north between 0 and 360,
      * and the second is the range of degrees the angle can deviate by.
      */
    var bearing: js.UndefOr[js.Array[Double]] = js.undefined
    
    var coordinates: Double
    
    /**
      * Maximum distance in meters that the coordinate is allowed to move when snapped to a nearby road segment.
      */
    var radius: js.UndefOr[Double | unlimited] = js.undefined
  }
  object OptimizationWaypoint {
    
    @scala.inline
    def apply(coordinates: Double): OptimizationWaypoint = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptimizationWaypoint]
    }
    
    @scala.inline
    implicit class OptimizationWaypointMutableBuilder[Self <: OptimizationWaypoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApproach(value: DirectionsApproach): Self = StObject.set(x, "approach", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApproachUndefined: Self = StObject.set(x, "approach", js.undefined)
      
      @scala.inline
      def setBearing(value: js.Array[Double]): Self = StObject.set(x, "bearing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBearingUndefined: Self = StObject.set(x, "bearing", js.undefined)
      
      @scala.inline
      def setBearingVarargs(value: Double*): Self = StObject.set(x, "bearing", js.Array(value :_*))
      
      @scala.inline
      def setCoordinates(value: Double): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadius(value: Double | unlimited): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
}
