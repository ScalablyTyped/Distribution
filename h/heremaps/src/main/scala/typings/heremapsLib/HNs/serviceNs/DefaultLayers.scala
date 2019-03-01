package typings
package heremapsLib.HNs.serviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This property specifies collection of pre-configured HERE layers
  */
trait DefaultLayers extends js.Object {
  var incidents: heremapsLib.HNs.mapNs.layerNs.MarkerTileLayer
  var normal: MapType
  var satellite: MapType
  var terrain: MapType
  var venues: heremapsLib.HNs.mapNs.layerNs.TileLayer
}

object DefaultLayers {
  @scala.inline
  def apply(
    incidents: heremapsLib.HNs.mapNs.layerNs.MarkerTileLayer,
    normal: MapType,
    satellite: MapType,
    terrain: MapType,
    venues: heremapsLib.HNs.mapNs.layerNs.TileLayer
  ): DefaultLayers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("incidents")(incidents)
    __obj.updateDynamic("normal")(normal)
    __obj.updateDynamic("satellite")(satellite)
    __obj.updateDynamic("terrain")(terrain)
    __obj.updateDynamic("venues")(venues)
    __obj.asInstanceOf[DefaultLayers]
  }
}

