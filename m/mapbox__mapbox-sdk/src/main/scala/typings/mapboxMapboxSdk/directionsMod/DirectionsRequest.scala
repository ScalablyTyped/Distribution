package typings.mapboxMapboxSdk.directionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionsRequest extends js.Object {
  
  /**
    * Whether to try to return alternative routes. An alternative is classified as a route that is significantly
    * different than the fastest route, but also still reasonably fast. Such a route does not exist in all circumstances.
    * Currently up to two alternatives can be returned. Can be  true or  false (default).
    */
  var alternatives: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not to return additional metadata along the route. Possible values are:  duration ,  distance ,  speed , and congestion .
    * Several annotations can be used by including them as a comma-separated list. See the RouteLeg object for more details on
    * what is included with annotations.
    */
  var annotations: js.UndefOr[js.Array[DirectionsAnnotation]] = js.native
  
  /**
    * Whether or not to return banner objects associated with the  routeSteps .
    * Should be used in conjunction with  steps . Can be  true or  false . The default is  false .
    */
  var bannerInstructions: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the allowed direction of travel when departing intermediate waypoints. If  true , the route will continue in the same
    * direction of travel. If  false , the route may continue in the opposite direction of travel. Defaults to  true for mapbox/driving and
    * false for  mapbox/walking and  mapbox/cycling .
    */
  var continueStraight: js.UndefOr[Boolean] = js.native
  
  /**
    * Exclude certain road types from routing. Valid values depend on the profile in use.
    * The default is to not exclude anything from the profile selected.
    */
  var exclude: js.UndefOr[js.Array[DirectionsProfile]] = js.native
  
  /**
    * Format of the returned geometry. Allowed values are:  geojson (as LineString ),
    * polyline with precision 5,  polyline6 (a polyline with precision 6). The default value is  polyline .
    */
  var geometries: js.UndefOr[DirectionsGeometry] = js.native
  
  /**
    * Language of returned turn-by-turn text instructions. See supported languages . The default is  en for English.
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * Type of returned overview geometry. Can be  full (the most detailed geometry available),
    * simplified (a simplified version of the full geometry), or  false (no overview geometry). The default is  simplified .
    */
  var overview: js.UndefOr[DirectionsOverview] = js.native
  
  /**
    * Routing profile; either  mapbox/driving-traffic ,  mapbox/driving ,  mapbox/walking , or  mapbox/cycling
    */
  var profile: DirectionsProfile = js.native
  
  /**
    * Emit instructions at roundabout exits. Can be  true or  false . The default is  false .
    */
  var roundaboutExits: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to return steps and turn-by-turn instructions. Can be  true or  false . The default is  false .
    */
  var steps: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not to return SSML marked-up text for voice guidance along the route. Should be used in conjunction with steps .
    * Can be  true or  false . The default is  false .
    */
  var voiceInstructions: js.UndefOr[Boolean] = js.native
  
  /**
    * Which type of units to return in the text for voice instructions. Can be  imperial or  metric . Default is  imperial .
    */
  var voiceUnits: js.UndefOr[DirectionsUnits] = js.native
  
  var waypoints: js.Array[DirectionsRequestWaypoint] = js.native
}
object DirectionsRequest {
  
  @scala.inline
  def apply(profile: DirectionsProfile, waypoints: js.Array[DirectionsRequestWaypoint]): DirectionsRequest = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsRequest]
  }
  
  @scala.inline
  implicit class DirectionsRequestOps[Self <: DirectionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProfile(value: DirectionsProfile): Self = this.set("profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaypointsVarargs(value: DirectionsRequestWaypoint*): Self = this.set("waypoints", js.Array(value :_*))
    
    @scala.inline
    def setWaypoints(value: js.Array[DirectionsRequestWaypoint]): Self = this.set("waypoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternatives(value: Boolean): Self = this.set("alternatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternatives: Self = this.set("alternatives", js.undefined)
    
    @scala.inline
    def setAnnotationsVarargs(value: DirectionsAnnotation*): Self = this.set("annotations", js.Array(value :_*))
    
    @scala.inline
    def setAnnotations(value: js.Array[DirectionsAnnotation]): Self = this.set("annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotations: Self = this.set("annotations", js.undefined)
    
    @scala.inline
    def setBannerInstructions(value: Boolean): Self = this.set("bannerInstructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBannerInstructions: Self = this.set("bannerInstructions", js.undefined)
    
    @scala.inline
    def setContinueStraight(value: Boolean): Self = this.set("continueStraight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinueStraight: Self = this.set("continueStraight", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: DirectionsProfile*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: js.Array[DirectionsProfile]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setGeometries(value: DirectionsGeometry): Self = this.set("geometries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeometries: Self = this.set("geometries", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setOverview(value: DirectionsOverview): Self = this.set("overview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverview: Self = this.set("overview", js.undefined)
    
    @scala.inline
    def setRoundaboutExits(value: Boolean): Self = this.set("roundaboutExits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoundaboutExits: Self = this.set("roundaboutExits", js.undefined)
    
    @scala.inline
    def setSteps(value: Boolean): Self = this.set("steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
    
    @scala.inline
    def setVoiceInstructions(value: Boolean): Self = this.set("voiceInstructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoiceInstructions: Self = this.set("voiceInstructions", js.undefined)
    
    @scala.inline
    def setVoiceUnits(value: DirectionsUnits): Self = this.set("voiceUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoiceUnits: Self = this.set("voiceUnits", js.undefined)
  }
}
