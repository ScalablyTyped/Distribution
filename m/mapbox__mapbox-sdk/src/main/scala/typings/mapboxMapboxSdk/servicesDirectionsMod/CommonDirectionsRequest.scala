package typings.mapboxMapboxSdk.servicesDirectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonDirectionsRequest[T /* <: DirectionsGeometry */] extends StObject {
  
  /**
    * Whether to try to return alternative routes. An alternative is classified as a route that is significantly
    * different than the fastest route, but also still reasonably fast. Such a route does not exist in all circumstances.
    * Currently up to two alternatives can be returned. Can be  true or  false (default).
    */
  var alternatives: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether or not to return additional metadata along the route. Possible values are:  duration ,  distance ,  speed , and congestion .
    * Several annotations can be used by including them as a comma-separated list. See the RouteLeg object for more details on
    * what is included with annotations.
    */
  var annotations: js.UndefOr[js.Array[DirectionsAnnotation]] = js.undefined
  
  /**
    * Whether or not to return banner objects associated with the  routeSteps .
    * Should be used in conjunction with  steps . Can be  true or  false . The default is  false .
    */
  var bannerInstructions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the allowed direction of travel when departing intermediate waypoints. If  true , the route will continue in the same
    * direction of travel. If  false , the route may continue in the opposite direction of travel. Defaults to  true for mapbox/driving and
    * false for  mapbox/walking and  mapbox/cycling .
    */
  var continueStraight: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Format of the returned geometry. Allowed values are:  geojson (as LineString ),
    * polyline with precision 5,  polyline6 (a polyline with precision 6). The default value is  polyline .
    */
  var geometries: js.UndefOr[T] = js.undefined
  
  /**
    * Language of returned turn-by-turn text instructions. See supported languages . The default is  en for English.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * Type of returned overview geometry. Can be  full (the most detailed geometry available),
    * simplified (a simplified version of the full geometry), or  false (no overview geometry). The default is  simplified .
    */
  var overview: js.UndefOr[DirectionsOverview] = js.undefined
  
  /**
    * Emit instructions at roundabout exits. Can be  true or  false . The default is  false .
    */
  var roundaboutExits: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to return steps and turn-by-turn instructions. Can be  true or  false . The default is  false .
    */
  var steps: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether or not to return SSML marked-up text for voice guidance along the route. Should be used in conjunction with steps .
    * Can be  true or  false . The default is  false .
    */
  var voiceInstructions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Which type of units to return in the text for voice instructions. Can be  imperial or  metric . Default is  imperial .
    */
  var voiceUnits: js.UndefOr[DirectionsUnits] = js.undefined
  
  var waypoints: js.Array[DirectionsWaypoint]
}
object CommonDirectionsRequest {
  
  inline def apply[T /* <: DirectionsGeometry */](waypoints: js.Array[DirectionsWaypoint]): CommonDirectionsRequest[T] = {
    val __obj = js.Dynamic.literal(waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonDirectionsRequest[T]]
  }
  
  extension [Self <: CommonDirectionsRequest[?], T /* <: DirectionsGeometry */](x: Self & CommonDirectionsRequest[T]) {
    
    inline def setAlternatives(value: Boolean): Self = StObject.set(x, "alternatives", value.asInstanceOf[js.Any])
    
    inline def setAlternativesUndefined: Self = StObject.set(x, "alternatives", js.undefined)
    
    inline def setAnnotations(value: js.Array[DirectionsAnnotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(value: DirectionsAnnotation*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setBannerInstructions(value: Boolean): Self = StObject.set(x, "bannerInstructions", value.asInstanceOf[js.Any])
    
    inline def setBannerInstructionsUndefined: Self = StObject.set(x, "bannerInstructions", js.undefined)
    
    inline def setContinueStraight(value: Boolean): Self = StObject.set(x, "continueStraight", value.asInstanceOf[js.Any])
    
    inline def setContinueStraightUndefined: Self = StObject.set(x, "continueStraight", js.undefined)
    
    inline def setGeometries(value: T): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
    
    inline def setGeometriesUndefined: Self = StObject.set(x, "geometries", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setOverview(value: DirectionsOverview): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
    
    inline def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
    
    inline def setRoundaboutExits(value: Boolean): Self = StObject.set(x, "roundaboutExits", value.asInstanceOf[js.Any])
    
    inline def setRoundaboutExitsUndefined: Self = StObject.set(x, "roundaboutExits", js.undefined)
    
    inline def setSteps(value: Boolean): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    inline def setVoiceInstructions(value: Boolean): Self = StObject.set(x, "voiceInstructions", value.asInstanceOf[js.Any])
    
    inline def setVoiceInstructionsUndefined: Self = StObject.set(x, "voiceInstructions", js.undefined)
    
    inline def setVoiceUnits(value: DirectionsUnits): Self = StObject.set(x, "voiceUnits", value.asInstanceOf[js.Any])
    
    inline def setVoiceUnitsUndefined: Self = StObject.set(x, "voiceUnits", js.undefined)
    
    inline def setWaypoints(value: js.Array[DirectionsWaypoint]): Self = StObject.set(x, "waypoints", value.asInstanceOf[js.Any])
    
    inline def setWaypointsVarargs(value: DirectionsWaypoint*): Self = StObject.set(x, "waypoints", js.Array(value*))
  }
}
