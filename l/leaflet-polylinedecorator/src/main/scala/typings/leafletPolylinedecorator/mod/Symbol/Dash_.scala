package typings.leafletPolylinedecorator.mod.Symbol

import typings.geojson.mod.LineString
import typings.geojson.mod.MultiLineString
import typings.leaflet.mod.LatLng_
import typings.leaflet.mod.Map_
import typings.leaflet.mod.Point_
import typings.leaflet.mod.Polyline_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Symbol.Dash")
@js.native
class Dash_ () extends js.Object {
  def this(options: DashOptions) = this()
  
  def buildSymbol(dirPoint: Point_, latLngs: js.Array[LatLng_], map: Map_, index: Double, total: Double): Polyline_[LineString | MultiLineString, _] = js.native
  
  def initialize(): Unit = js.native
  def initialize(options: DashOptions): Unit = js.native
}
