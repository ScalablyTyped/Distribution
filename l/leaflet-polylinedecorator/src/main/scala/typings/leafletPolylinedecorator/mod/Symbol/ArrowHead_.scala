package typings.leafletPolylinedecorator.mod.Symbol

import typings.geojson.mod.LineString
import typings.geojson.mod.MultiLineString
import typings.leaflet.mod.LatLng_
import typings.leaflet.mod.Map_
import typings.leaflet.mod.Point_
import typings.leaflet.mod.Polygon_
import typings.leaflet.mod.Polyline_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Symbol.ArrowHead")
@js.native
class ArrowHead_ () extends js.Object {
  def this(options: ArrowHeadOptions) = this()
  def buildSymbol(dirPoint: Point_, latLngs: js.Array[LatLng_], map: Map_, index: Double, total: Double): Polygon_[_] | (Polyline_[LineString | MultiLineString, _]) = js.native
  def initialize(): Unit = js.native
  def initialize(options: ArrowHeadOptions): Unit = js.native
}

