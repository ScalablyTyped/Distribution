package typings.mapboxMapboxSdk.directionsMod

import typings.geojson.mod.LineString
import typings.geojson.mod.MultiLineString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends js.Object {
  /**
    * Float indicating the distance traveled in meters.
    */
  var distance: Double
  /**
    * Float indicating the estimated travel time in seconds.
    */
  var duration: Double
  /**
    * Depending on the geometries parameter this is a GeoJSON LineString or a Polyline string.
    * Depending on the overview parameter this is the complete route geometry (full), a simplified geometry
    * to the zoom level at which the route can be displayed in full (simplified), or is not included (false)
    */
  var geometry: LineString | MultiLineString
  /**
    * Array of RouteLeg objects.
    */
  var legs: js.Array[Leg]
  /**
    * String of the locale used for voice instructions. Defaults to en, and can be any accepted instruction language.
    */
  var voiceLocale: js.UndefOr[String] = js.undefined
  /**
    * Float indicating the weight in units described by weight_name
    */
  var weight: Double
  /**
    * String indicating which weight was used. The default is routability which is duration-based,
    * with additional penalties for less desirable maneuvers.
    */
  var weight_name: String
}

object Route {
  @scala.inline
  def apply(
    distance: Double,
    duration: Double,
    geometry: LineString | MultiLineString,
    legs: js.Array[Leg],
    weight: Double,
    weight_name: String,
    voiceLocale: String = null
  ): Route = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], legs = legs.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any], weight_name = weight_name.asInstanceOf[js.Any])
    if (voiceLocale != null) __obj.updateDynamic("voiceLocale")(voiceLocale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
}

