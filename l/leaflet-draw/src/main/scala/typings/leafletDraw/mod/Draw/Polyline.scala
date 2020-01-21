package typings.leafletDraw.mod.Draw

import typings.leaflet.mod.LatLng_
import typings.leafletDraw.mod.DrawMap
import typings.leafletDraw.mod.DrawOptions.PolylineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Draw.Polyline")
@js.native
class Polyline protected () extends Feature {
  def this(map: DrawMap) = this()
  def this(map: DrawMap, options: PolylineOptions) = this()
  def addVertex(latlng: LatLng_): Unit = js.native
  def completeShape(): Unit = js.native
  def deleteLastVertex(): Unit = js.native
}

