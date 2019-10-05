package typings.leafletDashPolylinedecorator.leafletMod.Symbol

import typings.geojson.geojsonMod.LineString
import typings.geojson.geojsonMod.MultiLineString
import typings.leaflet.leafletMod.LatLng
import typings.leaflet.leafletMod.Map
import typings.leaflet.leafletMod.Point
import typings.leaflet.leafletMod.Polyline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Symbol.Dash")
@js.native
class Dash () extends js.Object {
  def this(options: DashOptions) = this()
  def buildSymbol(dirPoint: Point, latLngs: js.Array[LatLng], map: Map, index: Double, total: Double): Polyline[LineString | MultiLineString, _] = js.native
  def initialize(): Unit = js.native
  def initialize(options: DashOptions): Unit = js.native
}

@JSImport("leaflet", "Symbol.dash")
@js.native
object dash extends js.Object {
  def apply(): Dash = js.native
  def apply(options: DashOptions): Dash = js.native
}

