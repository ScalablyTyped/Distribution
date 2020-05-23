package typings.mapboxMapboxSdk.optimizationMod

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
import typings.mapboxMapboxSdk.mapiRequestMod.MapboxProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptimizationRequest extends js.Object {
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
  def apply(
    profile: MapboxProfile,
    waypoints: js.Array[OptimizationWaypoint],
    annotations: duration | speed | distance = null,
    destination: any | last = null,
    distributions: js.Array[Double] = null,
    geometries: geojson | polyline | polyline6 = null,
    language: String = null,
    overview: full | simplified | `false` = null,
    roundtrip: js.UndefOr[Boolean] = js.undefined,
    source: any | first = null,
    steps: js.UndefOr[Boolean] = js.undefined
  ): OptimizationRequest = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (distributions != null) __obj.updateDynamic("distributions")(distributions.asInstanceOf[js.Any])
    if (geometries != null) __obj.updateDynamic("geometries")(geometries.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (overview != null) __obj.updateDynamic("overview")(overview.asInstanceOf[js.Any])
    if (!js.isUndefined(roundtrip)) __obj.updateDynamic("roundtrip")(roundtrip.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(steps)) __obj.updateDynamic("steps")(steps.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimizationRequest]
  }
}

