package typings
package leafletDashRastercoordsLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.RasterCoords")
@js.native
class RasterCoords protected () extends js.Object {
  def this(map: leafletLib.leafletMod.Map, imgsize: js.Array[scala.Double]) = this()
  def this(map: leafletLib.leafletMod.Map, imgsize: js.Array[scala.Double], tilesize: scala.Double) = this()
  def project(coords: leafletLib.leafletMod.LatLngExpression): leafletLib.leafletMod.Point = js.native
  def setMaxBounds(): scala.Unit = js.native
  def unproject(coords: leafletLib.leafletMod.PointExpression): leafletLib.leafletMod.LatLng = js.native
  def zoomLevel(): scala.Double = js.native
}

