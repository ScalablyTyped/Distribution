package typings.leafletDashDraw.leafletMod.Draw

import typings.leaflet.leafletMod.Handler
import typings.leafletDashDraw.leafletMod.DrawMap
import typings.leafletDashDraw.leafletMod.DrawOptions.EditHandlerOptions
import typings.leafletDashDraw.leafletMod.DrawOptions.MarkerOptions
import typings.leafletDashDraw.leafletMod.DrawOptions.PolygonOptions
import typings.leafletDashDraw.leafletMod.DrawOptions.PolylineOptions
import typings.leafletDashDraw.leafletMod.DrawOptions.RectangleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Draw.Feature")
@js.native
class Feature () extends Handler {
  def initialize(map: DrawMap, options: EditHandlerOptions): Unit = js.native
  def initialize(map: DrawMap, options: MarkerOptions): Unit = js.native
  def initialize(map: DrawMap, options: PolygonOptions): Unit = js.native
  def initialize(map: DrawMap, options: PolylineOptions): Unit = js.native
  def initialize(map: DrawMap, options: RectangleOptions): Unit = js.native
  def setOptions(options: EditHandlerOptions): Unit = js.native
  def setOptions(options: MarkerOptions): Unit = js.native
  def setOptions(options: PolygonOptions): Unit = js.native
  def setOptions(options: PolylineOptions): Unit = js.native
  def setOptions(options: RectangleOptions): Unit = js.native
}

