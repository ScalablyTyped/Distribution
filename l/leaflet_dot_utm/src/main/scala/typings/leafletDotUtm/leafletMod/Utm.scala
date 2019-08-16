package typings.leafletDotUtm.leafletMod

import typings.leafletDotUtm.leafletMod.UtmNs.ToStringOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.Utm")
@js.native
class Utm protected () extends js.Object {
  var band: String = js.native
  var southHemi: Boolean = js.native
  var x: Double = js.native
  var y: Double = js.native
  var zone: Double = js.native
  def equals(other: Utm): Boolean = js.native
  def latLng(): typings.leaflet.leafletMod.LatLng = js.native
  def latLng(noException: Boolean): typings.leaflet.leafletMod.LatLng = js.native
  def normalize(): typings.leaflet.leafletMod.LatLng = js.native
  def toString(options: ToStringOptions): String = js.native
}

