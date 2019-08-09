package typings.leafletDashGeosearch.leafletDashGeosearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * OpenStreetMap
  */
trait OpenStreetMapProviderResultRaw extends js.Object {
  var boundingbox: js.Tuple4[String, String, String, String]
  var `class`: String
  var display_name: String
  var icon: String
  var importance: Double
  var lat: String
  var licence: String
  var lon: String
  var osm_id: Double
  var osm_type: String
  var place_id: Double
  var `type`: String
}

object OpenStreetMapProviderResultRaw {
  @scala.inline
  def apply(
    boundingbox: js.Tuple4[String, String, String, String],
    `class`: String,
    display_name: String,
    icon: String,
    importance: Double,
    lat: String,
    licence: String,
    lon: String,
    osm_id: Double,
    osm_type: String,
    place_id: Double,
    `type`: String
  ): OpenStreetMapProviderResultRaw = {
    val __obj = js.Dynamic.literal(boundingbox = boundingbox, display_name = display_name, icon = icon, importance = importance, lat = lat, licence = licence, lon = lon, osm_id = osm_id, osm_type = osm_type, place_id = place_id)
    __obj.updateDynamic("class")(`class`)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OpenStreetMapProviderResultRaw]
  }
}

