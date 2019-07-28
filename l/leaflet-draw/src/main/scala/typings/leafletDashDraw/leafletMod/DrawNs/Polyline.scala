package typings.leafletDashDraw.leafletMod.DrawNs

import typings.leaflet.leafletMod.LatLng
import typings.leaflet.leafletMod.Map
import typings.leafletDashDraw.leafletMod.DrawOptionsNs.PolylineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.Draw.Polyline")
@js.native
class Polyline protected () extends Feature {
  def this(map: Map) = this()
  def this(map: Map, options: PolylineOptions) = this()
  def addVertex(latlng: LatLng): Unit = js.native
  def completeShape(): Unit = js.native
  def deleteLastVertex(): Unit = js.native
}

