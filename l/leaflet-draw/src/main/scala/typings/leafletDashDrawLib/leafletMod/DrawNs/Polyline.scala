package typings
package leafletDashDrawLib.leafletMod.DrawNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.Draw.Polyline")
@js.native
class Polyline protected () extends Feature {
  def this(map: leafletLib.leafletMod.Map) = this()
  def this(map: leafletLib.leafletMod.Map, options: leafletDashDrawLib.leafletMod.DrawOptionsNs.PolylineOptions) = this()
  def addVertex(latlng: leafletLib.leafletMod.LatLng): scala.Unit = js.native
  def completeShape(): scala.Unit = js.native
  def deleteLastVertex(): scala.Unit = js.native
}

