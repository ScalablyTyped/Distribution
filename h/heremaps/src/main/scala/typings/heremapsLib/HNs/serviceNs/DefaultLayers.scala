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

