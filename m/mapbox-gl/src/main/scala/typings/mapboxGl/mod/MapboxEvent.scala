package typings.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "MapboxEvent")
@js.native
class MapboxEvent[TOrig] () extends js.Object {
  var originalEvent: TOrig = js.native
  var target: Map = js.native
  var `type`: String = js.native
}

