package typings.mapboxMapboxSdk.directionsMod

import typings.geojson.mod.LineString
import typings.geojson.mod.MultiLineString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Step extends js.Object {
  var bannerInstructions: js.Array[BannerInstruction] = js.native
  /**
    * String with the destinations of the way along which the travel proceeds. Optionally included, if data is available.
    */
  var destinations: js.UndefOr[String] = js.native
  /**
    * Number indicating the distance traveled in meters from the maneuver to the next RouteStep.
    */
  var distance: Double = js.native
  /**
    * The legal driving side at the location for this step. Either left or right.
    */
  var driving_side: DirectionsSide = js.native
  /**
    * Number indicating the estimated time traveled time in seconds from the maneuver to the next RouteStep.
    */
  var duration: Double = js.native
  /**
    * String with the exit numbers or names of the way. Optionally included, if data is available.
    */
  var exits: js.UndefOr[String] = js.native
  /**
    * Depending on the geometries parameter this is a GeoJSON LineString or a
    * Polyline string representing the full route geometry from this RouteStep to the next RouteStep
    */
  var geometry: LineString | MultiLineString = js.native
  /**
    * Array of objects representing all intersections along the step.
    */
  var intersections: js.Array[Intersection] = js.native
  /**
    * One StepManeuver object
    */
  var maneuver: Maneuver = js.native
  /**
    * String indicating the mode of transportation. Possible values:
    */
  var mode: DirectionsMode = js.native
  /**
    * String with the name of the way along which the travel proceeds
    */
  var name: String = js.native
  /**
    * A string containing an IPA phonetic transcription indicating how to pronounce the name in the name property.
    * This property is omitted if pronunciation data is unavailable for the step.
    */
  var pronunciation: js.UndefOr[String] = js.native
  /**
    * Any road designations associated with the road or path leading from this step’s maneuver to the next step’s maneuver.
    * Optionally included, if data is available. If multiple road designations are associated with the road, they are separated by semicolons.
    * A road designation typically consists of an alphabetic network code (identifying the road type or numbering system), a space or hyphen,
    * and a route number. You should not assume that the network code is globally unique: for example, a network code of “NH” may appear on a
    * “National Highway” or “New Hampshire”. Moreover, a route number may not even uniquely identify a road within a given network.
    */
  var ref: js.UndefOr[String] = js.native
  var voiceInstructions: js.Array[VoiceInstruction] = js.native
  var weight: Double = js.native
}

object Step {
  @scala.inline
  def apply(
    bannerInstructions: js.Array[BannerInstruction],
    distance: Double,
    driving_side: DirectionsSide,
    duration: Double,
    geometry: LineString | MultiLineString,
    intersections: js.Array[Intersection],
    maneuver: Maneuver,
    mode: DirectionsMode,
    name: String,
    voiceInstructions: js.Array[VoiceInstruction],
    weight: Double
  ): Step = {
    val __obj = js.Dynamic.literal(bannerInstructions = bannerInstructions.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], driving_side = driving_side.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], intersections = intersections.asInstanceOf[js.Any], maneuver = maneuver.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], voiceInstructions = voiceInstructions.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Step]
  }
  @scala.inline
  implicit class StepOps[Self <: Step] (val x: Self) extends AnyVal {
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
    def setBannerInstructionsVarargs(value: BannerInstruction*): Self = this.set("bannerInstructions", js.Array(value :_*))
    @scala.inline
    def setBannerInstructions(value: js.Array[BannerInstruction]): Self = this.set("bannerInstructions", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def setDriving_side(value: DirectionsSide): Self = this.set("driving_side", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeometry(value: LineString | MultiLineString): Self = this.set("geometry", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntersectionsVarargs(value: Intersection*): Self = this.set("intersections", js.Array(value :_*))
    @scala.inline
    def setIntersections(value: js.Array[Intersection]): Self = this.set("intersections", value.asInstanceOf[js.Any])
    @scala.inline
    def setManeuver(value: Maneuver): Self = this.set("maneuver", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: DirectionsMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setVoiceInstructionsVarargs(value: VoiceInstruction*): Self = this.set("voiceInstructions", js.Array(value :_*))
    @scala.inline
    def setVoiceInstructions(value: js.Array[VoiceInstruction]): Self = this.set("voiceInstructions", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestinations(value: String): Self = this.set("destinations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinations: Self = this.set("destinations", js.undefined)
    @scala.inline
    def setExits(value: String): Self = this.set("exits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExits: Self = this.set("exits", js.undefined)
    @scala.inline
    def setPronunciation(value: String): Self = this.set("pronunciation", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePronunciation: Self = this.set("pronunciation", js.undefined)
    @scala.inline
    def setRef(value: String): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
  }
  
}

