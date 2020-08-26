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

@js.native
trait OptimizationRequest extends js.Object {
  /**
    * Return additional metadata along the route. You can include several annotations as a comma-separated list. Possible values are:
    */
  var annotations: js.UndefOr[duration | speed | distance] = js.native
  /**
    * Specify the destination coordinate of the returned route. Accepts  any (default) or  last .
    */
  var destination: js.UndefOr[any | last] = js.native
  /**
    * Specify pick-up and drop-off locations for a trip by providing a ; delimited list of number pairs that correspond with the coordinates list.
    * The first number of a pair indicates the index to the coordinate of the pick-up location in the coordinates list,
    * and the second number indicates the index to the coordinate of the drop-off location in the coordinates list.
    * Each pair must contain exactly 2 numbers, which cannot be the same.
    * The returned solution will visit pick-up locations before visiting drop-off locations. The first location can only be a pick-up location, not a drop-off location.
    */
  var distributions: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The format of the returned geometry. Allowed values are:  geojson (as LineString ),  polyline (default, a polyline with precision 5),  polyline6 (a polyline with precision 6).
    */
  var geometries: js.UndefOr[geojson | polyline | polyline6] = js.native
  /**
    * The language of returned turn-by-turn text instructions. See supported languages . The default is  en (English).
    */
  var language: js.UndefOr[String] = js.native
  /**
    * The type of the returned overview geometry.
    * Can be 'full' (the most detailed geometry available), 'simplified' (default, a simplified version of the full geometry), or 'false' (no overview geometry).
    */
  var overview: js.UndefOr[full | simplified | `false`] = js.native
  /**
    * A Mapbox Directions routing profile ID.
    */
  var profile: MapboxProfile = js.native
  /**
    * Indicates whether the returned route is roundtrip, meaning the route returns to the first location ( true , default) or not ( false ).
    * If roundtrip=false , the  source and  destination parameters are required but not all combinations will be possible.
    * See the Fixing Start and End Points section below for additional notes.
    */
  var roundtrip: js.UndefOr[Boolean] = js.native
  /**
    * The coordinate at which to start the returned route. Accepts  any (default) or  first .
    */
  var source: js.UndefOr[any | first] = js.native
  /**
    * Whether to return steps and turn-by-turn instructions ( true ) or not ( false , default).
    */
  var steps: js.UndefOr[Boolean] = js.native
  /**
    * A semicolon-separated list of {longitude},{latitude} coordinates. There must be between 2 and 12 coordinates. The first coordinate is the start and end point of the trip.
    */
  var waypoints: js.Array[OptimizationWaypoint] = js.native
}

object OptimizationRequest {
  @scala.inline
  def apply(profile: MapboxProfile, waypoints: js.Array[OptimizationWaypoint]): OptimizationRequest = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimizationRequest]
  }
  @scala.inline
  implicit class OptimizationRequestOps[Self <: OptimizationRequest] (val x: Self) extends AnyVal {
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
    def setProfile(value: MapboxProfile): Self = this.set("profile", value.asInstanceOf[js.Any])
    @scala.inline
    def setWaypointsVarargs(value: OptimizationWaypoint*): Self = this.set("waypoints", js.Array(value :_*))
    @scala.inline
    def setWaypoints(value: js.Array[OptimizationWaypoint]): Self = this.set("waypoints", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnnotations(value: duration | speed | distance): Self = this.set("annotations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnotations: Self = this.set("annotations", js.undefined)
    @scala.inline
    def setDestination(value: any | last): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    @scala.inline
    def setDistributionsVarargs(value: Double*): Self = this.set("distributions", js.Array(value :_*))
    @scala.inline
    def setDistributions(value: js.Array[Double]): Self = this.set("distributions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistributions: Self = this.set("distributions", js.undefined)
    @scala.inline
    def setGeometries(value: geojson | polyline | polyline6): Self = this.set("geometries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeometries: Self = this.set("geometries", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setOverview(value: full | simplified | `false`): Self = this.set("overview", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverview: Self = this.set("overview", js.undefined)
    @scala.inline
    def setRoundtrip(value: Boolean): Self = this.set("roundtrip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoundtrip: Self = this.set("roundtrip", js.undefined)
    @scala.inline
    def setSource(value: any | first): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setSteps(value: Boolean): Self = this.set("steps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
  }
  
}

