package typings.leafletDashDraw.leafletMod.DrawNs

import typings.leaflet.leafletMod.Handler
import typings.leaflet.leafletMod.Map
import typings.leafletDashDraw.leafletMod.DrawOptionsNs.DeleteHandlerOptions
import typings.leafletDashDraw.leafletMod.DrawOptionsNs.EditHandlerOptions
import typings.leafletDashDraw.leafletMod.DrawOptionsNs.MarkerOptions
import typings.leafletDashDraw.leafletMod.DrawOptionsNs.PolygonOptions
import typings.leafletDashDraw.leafletMod.DrawOptionsNs.PolylineOptions
import typings.leafletDashDraw.leafletMod.DrawOptionsNs.RectangleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.Draw.Feature")
@js.native
class Feature () extends Handler {
  def initialize(map: Map, options: DeleteHandlerOptions): Unit = js.native
  def initialize(map: Map, options: EditHandlerOptions): Unit = js.native
  def initialize(map: Map, options: MarkerOptions): Unit = js.native
  def initialize(map: Map, options: PolygonOptions): Unit = js.native
  def initialize(map: Map, options: PolylineOptions): Unit = js.native
  def initialize(map: Map, options: RectangleOptions): Unit = js.native
  def setOptions(options: DeleteHandlerOptions): Unit = js.native
  def setOptions(options: EditHandlerOptions): Unit = js.native
  def setOptions(options: MarkerOptions): Unit = js.native
  def setOptions(options: PolygonOptions): Unit = js.native
  def setOptions(options: PolylineOptions): Unit = js.native
  def setOptions(options: RectangleOptions): Unit = js.native
}

