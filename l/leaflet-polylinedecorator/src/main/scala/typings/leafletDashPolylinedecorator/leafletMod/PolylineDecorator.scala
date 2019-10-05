package typings.leafletDashPolylinedecorator.leafletMod

import typings.geojson.geojsonMod.LineString
import typings.geojson.geojsonMod.MultiLineString
import typings.leaflet.leafletMod.FeatureGroup
import typings.leaflet.leafletMod.LatLngExpression
import typings.leaflet.leafletMod.Polygon
import typings.leaflet.leafletMod.Polyline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "PolylineDecorator")
@js.native
class PolylineDecorator protected ()
  extends FeatureGroup[js.Any] {
  def this(paths: js.Array[
        js.Array[LatLngExpression] | LatLngExpression | Polygon[_] | (Polyline[LineString | MultiLineString, _])
      ]) = this()
  def this(paths: Polygon[_]) = this()
  def this(paths: Polyline[LineString | MultiLineString, _]) = this()
  def this(
    paths: js.Array[
        js.Array[LatLngExpression] | LatLngExpression | Polygon[_] | (Polyline[LineString | MultiLineString, _])
      ],
    options: PolylineDecoratorOptions
  ) = this()
  def this(paths: Polygon[_], options: PolylineDecoratorOptions) = this()
  def this(paths: Polyline[LineString | MultiLineString, _], options: PolylineDecoratorOptions) = this()
  def initialize(
    paths: js.Array[
      js.Array[LatLngExpression] | LatLngExpression | Polygon[_] | (Polyline[LineString | MultiLineString, _])
    ]
  ): Unit = js.native
  def initialize(
    paths: js.Array[
      js.Array[LatLngExpression] | LatLngExpression | Polygon[_] | (Polyline[LineString | MultiLineString, _])
    ],
    options: PolylineDecoratorOptions
  ): Unit = js.native
  def initialize(paths: Polygon[_]): Unit = js.native
  def initialize(paths: Polygon[_], options: PolylineDecoratorOptions): Unit = js.native
  def initialize(paths: Polyline[LineString | MultiLineString, _]): Unit = js.native
  def initialize(paths: Polyline[LineString | MultiLineString, _], options: PolylineDecoratorOptions): Unit = js.native
  def redraw(): Unit = js.native
  def setPaths(
    paths: js.Array[
      js.Array[LatLngExpression] | LatLngExpression | Polygon[_] | (Polyline[LineString | MultiLineString, _])
    ]
  ): Unit = js.native
  def setPaths(paths: Polygon[_]): Unit = js.native
  def setPaths(paths: Polyline[LineString | MultiLineString, _]): Unit = js.native
  def setPatterns(patterns: js.Array[Pattern]): Unit = js.native
}

@JSImport("leaflet", "polylineDecorator")
@js.native
object polylineDecorator extends js.Object {
  def apply(
    paths: (Polyline[LineString | MultiLineString, _]) | (js.Array[Polyline[LineString | MultiLineString, _]])
  ): PolylineDecorator = js.native
  def apply(
    paths: (Polyline[LineString | MultiLineString, _]) | (js.Array[Polyline[LineString | MultiLineString, _]]),
    options: PolylineDecoratorOptions
  ): PolylineDecorator = js.native
}

