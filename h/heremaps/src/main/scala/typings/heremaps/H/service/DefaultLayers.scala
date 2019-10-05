package typings.heremaps.H.service

import typings.heremaps.H.map.layer.MarkerTileLayer
import typings.heremaps.H.map.layer.TileLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This property specifies collection of pre-configured HERE layers
  */
trait DefaultLayers extends js.Object {
  var incidents: MarkerTileLayer
  var normal: MapType
  var satellite: MapType
  var terrain: MapType
  var venues: TileLayer
}

object DefaultLayers {
  @scala.inline
  def apply(
    incidents: MarkerTileLayer,
    normal: MapType,
    satellite: MapType,
    terrain: MapType,
    venues: TileLayer
  ): DefaultLayers = {
    val __obj = js.Dynamic.literal(incidents = incidents, normal = normal, satellite = satellite, terrain = terrain, venues = venues)
  
    __obj.asInstanceOf[DefaultLayers]
  }
}

