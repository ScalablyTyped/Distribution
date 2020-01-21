package typings.leafletHeat.mod

import typings.leaflet.mod.LatLng_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "heatLayer")
@js.native
object heatLayer extends js.Object {
  def apply(latlngs: js.Array[LatLng_ | HeatLatLngTuple], options: HeatMapOptions): HeatLayer_ = js.native
}

