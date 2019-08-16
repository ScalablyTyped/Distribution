package typings.leafletDashDraw.leafletMod.EditNs

import typings.leaflet.leafletMod.Handler
import typings.leaflet.leafletMod.LatLngExpression
import typings.leafletDashDraw.leafletMod.EditOptionsNs.EditPolyVerticesEditOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.Edit.PolyVerticesEdit")
@js.native
class PolyVerticesEdit protected () extends Handler {
  def this(poly: Polyline, latlngs: js.Array[LatLngExpression]) = this()
  def this(poly: Polyline, latlngs: js.Array[LatLngExpression], options: EditPolyVerticesEditOptions) = this()
  def updateMarkers(): Unit = js.native
}

