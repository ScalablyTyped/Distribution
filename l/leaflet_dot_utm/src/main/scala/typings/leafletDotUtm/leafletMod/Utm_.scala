package typings.leafletDotUtm.leafletMod

import typings.leafletDotUtm.leafletMod.Utm.ToStringOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Utm")
@js.native
class Utm_ protected () extends js.Object {
  var band: String = js.native
  var southHemi: Boolean = js.native
  var x: Double = js.native
  var y: Double = js.native
  var zone: Double = js.native
  def equals(other: Utm): Boolean = js.native
  def latLng(): LatLng = js.native
  def latLng(noException: Boolean): LatLng = js.native
  def normalize(): LatLng = js.native
  def toString(options: ToStringOptions): String = js.native
}

