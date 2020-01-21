package typings.mapboxMapboxSdk.directionsMod

import typings.geojson.mod.LineString
import typings.geojson.mod.MultiLineString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Step extends js.Object {
  var bannerInstructions: js.Array[BannerInstruction]
  /**
    * String with the destinations of the way along which the travel proceeds. Optionally included, if data is available.
    */
  var destinations: js.UndefOr[String] = js.undefined
  /**
    * Number indicating the distance traveled in meters from the maneuver to the next RouteStep.
    */
  var distance: Double
  /**
    * The legal driving side at the location for this step. Either left or right.
    */
  var driving_side: DirectionsSide
  /**
    * Number indicating the estimated time traveled time in seconds from the maneuver to the next RouteStep.
    */
  var duration: Double
  /**
    * String with the exit numbers or names of the way. Optionally included, if data is available.
    */
  var exits: js.UndefOr[String] = js.undefined
  /**
    * Depending on the geometries parameter this is a GeoJSON LineString or a
    * Polyline string representing the full route geometry from this RouteStep to the next RouteStep
    */
  var geometry: LineString | MultiLineString
  /**
    * Array of objects representing all intersections along the step.
    */
  var intersections: js.Array[Intersection]
  /**
    * One StepManeuver object
    */
  var maneuver: Maneuver
  /**
    * String indicating the mode of transportation. Possible values:
    */
  var mode: DirectionsMode
  /**
    * String with the name of the way along which the travel proceeds
    */
  var name: String
  /**
    * A string containing an IPA phonetic transcription indicating how to pronounce the name in the name property.
    * This property is omitted if pronunciation data is unavailable for the step.
    */
  var pronunciation: js.UndefOr[String] = js.undefined
  /**
    * Any road designations associated with the road or path leading from this step’s maneuver to the next step’s maneuver.
    * Optionally included, if data is available. If multiple road designations are associated with the road, they are separated by semicolons.
    * A road designation typically consists of an alphabetic network code (identifying the road type or numbering system), a space or hyphen,
    * and a route number. You should not assume that the network code is globally unique: for example, a network code of “NH” may appear on a
    * “National Highway” or “New Hampshire”. Moreover, a route number may not even uniquely identify a road within a given network.
    */
  var ref: js.UndefOr[String] = js.undefined
  var voiceInstructions: js.Array[VoiceInstruction]
  var weight: Double
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
    weight: Double,
    destinations: String = null,
    exits: String = null,
    pronunciation: String = null,
    ref: String = null
  ): Step = {
    val __obj = js.Dynamic.literal(bannerInstructions = bannerInstructions.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], driving_side = driving_side.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], intersections = intersections.asInstanceOf[js.Any], maneuver = maneuver.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], voiceInstructions = voiceInstructions.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    if (destinations != null) __obj.updateDynamic("destinations")(destinations.asInstanceOf[js.Any])
    if (exits != null) __obj.updateDynamic("exits")(exits.asInstanceOf[js.Any])
    if (pronunciation != null) __obj.updateDynamic("pronunciation")(pronunciation.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Step]
  }
}

