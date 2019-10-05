package typings.mapboxDashGlDashLeaflet.leafletMod

import typings.leaflet.leafletMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "MapboxGL")
@js.native
class MapboxGL protected () extends Layer {
  def this(options: MapboxGLOptions) = this()
}

@JSImport("leaflet", "mapboxGL")
@js.native
object mapboxGL extends js.Object {
  def apply(options: MapboxGLOptions): MapboxGL = js.native
}

