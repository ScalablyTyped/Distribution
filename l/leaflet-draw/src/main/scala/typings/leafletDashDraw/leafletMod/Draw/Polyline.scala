package typings.leafletDashDraw.leafletMod.Draw

import typings.leaflet.leafletMod.LatLng
import typings.leafletDashDraw.leafletMod.DrawMap
import typings.leafletDashDraw.leafletMod.DrawOptions.PolylineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Draw.Polyline")
@js.native
class Polyline protected () extends Feature {
  def this(map: DrawMap) = this()
  def this(map: DrawMap, options: PolylineOptions) = this()
  def addVertex(latlng: LatLng): Unit = js.native
  def completeShape(): Unit = js.native
  def deleteLastVertex(): Unit = js.native
}

