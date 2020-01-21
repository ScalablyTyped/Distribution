package typings.mapboxMapboxSdk.directionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionsRequest extends js.Object {
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
    * Exclude certain road types from routing. Valid values depend on the profile in use.
    * The default is to not exclude anything from the profile selected.
    */
  var exclude: js.UndefOr[js.Array[DirectionsProfile]] = js.undefined
  /**
    * Format of the returned geometry. Allowed values are:  geojson (as LineString ),
    * polyline with precision 5,  polyline6 (a polyline with precision 6). The default value is  polyline .
    */
  var geometries: js.UndefOr[DirectionsGeometry] = js.undefined
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
    * Routing profile; either  mapbox/driving-traffic ,  mapbox/driving ,  mapbox/walking , or  mapbox/cycling
    */
  var profile: DirectionsProfile
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
  var waypoints: js.Array[DirectionsRequestWaypoint]
}

object DirectionsRequest {
  @scala.inline
  def apply(
    profile: DirectionsProfile,
    waypoints: js.Array[DirectionsRequestWaypoint],
    alternatives: js.UndefOr[Boolean] = js.undefined,
    annotations: js.Array[DirectionsAnnotation] = null,
    bannerInstructions: js.UndefOr[Boolean] = js.undefined,
    continueStraight: js.UndefOr[Boolean] = js.undefined,
    exclude: js.Array[DirectionsProfile] = null,
    geometries: DirectionsGeometry = null,
    language: String = null,
    overview: DirectionsOverview = null,
    roundaboutExits: js.UndefOr[Boolean] = js.undefined,
    steps: js.UndefOr[Boolean] = js.undefined,
    voiceInstructions: js.UndefOr[Boolean] = js.undefined,
    voiceUnits: DirectionsUnits = null
  ): DirectionsRequest = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
    if (!js.isUndefined(alternatives)) __obj.updateDynamic("alternatives")(alternatives.asInstanceOf[js.Any])
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (!js.isUndefined(bannerInstructions)) __obj.updateDynamic("bannerInstructions")(bannerInstructions.asInstanceOf[js.Any])
    if (!js.isUndefined(continueStraight)) __obj.updateDynamic("continueStraight")(continueStraight.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (geometries != null) __obj.updateDynamic("geometries")(geometries.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (overview != null) __obj.updateDynamic("overview")(overview.asInstanceOf[js.Any])
    if (!js.isUndefined(roundaboutExits)) __obj.updateDynamic("roundaboutExits")(roundaboutExits.asInstanceOf[js.Any])
    if (!js.isUndefined(steps)) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    if (!js.isUndefined(voiceInstructions)) __obj.updateDynamic("voiceInstructions")(voiceInstructions.asInstanceOf[js.Any])
    if (voiceUnits != null) __obj.updateDynamic("voiceUnits")(voiceUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsRequest]
  }
}

