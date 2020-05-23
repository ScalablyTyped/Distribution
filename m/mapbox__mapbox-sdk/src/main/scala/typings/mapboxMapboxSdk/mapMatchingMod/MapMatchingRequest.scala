package typings.mapboxMapboxSdk.mapMatchingMod

import typings.mapboxMapboxSdk.directionsMod.DirectionsAnnotation
import typings.mapboxMapboxSdk.directionsMod.DirectionsGeometry
import typings.mapboxMapboxSdk.directionsMod.DirectionsOverview
import typings.mapboxMapboxSdk.directionsMod.DirectionsProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapMatchingRequest extends js.Object {
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
  var profile: js.UndefOr[DirectionsProfile] = js.undefined
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
  @scala.inline
  def apply(
    points: js.Array[MapMatchingPoint],
    annotations: DirectionsAnnotation = null,
    geometries: DirectionsGeometry = null,
    language: String = null,
    overview: DirectionsOverview = null,
    profile: DirectionsProfile = null,
    steps: js.UndefOr[Boolean] = js.undefined,
    tidy: js.UndefOr[Boolean] = js.undefined
  ): MapMatchingRequest = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (geometries != null) __obj.updateDynamic("geometries")(geometries.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (overview != null) __obj.updateDynamic("overview")(overview.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (!js.isUndefined(steps)) __obj.updateDynamic("steps")(steps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tidy)) __obj.updateDynamic("tidy")(tidy.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapMatchingRequest]
  }
}

