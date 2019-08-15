package typings.leafletDashPolylinedecorator.leafletMod

import typings.geojson.geojsonMod.LineString
import typings.geojson.geojsonMod.MultiLineString
import typings.leaflet.leafletMod.Polyline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet")
@js.native
object ^ extends js.Object {
  def isCoord(c: js.Any): Boolean = js.native
  def isCoordArray(c: js.Any): Boolean = js.native
  def polylineDecorator(
    paths: (Polyline[LineString | MultiLineString, _]) | (js.Array[Polyline[LineString | MultiLineString, _]])
  ): PolylineDecorator = js.native
  def polylineDecorator(
    paths: (Polyline[LineString | MultiLineString, _]) | (js.Array[Polyline[LineString | MultiLineString, _]]),
    options: PolylineDecoratorOptions
  ): PolylineDecorator = js.native
}

