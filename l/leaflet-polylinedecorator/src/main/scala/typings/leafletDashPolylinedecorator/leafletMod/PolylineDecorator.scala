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

@JSGlobal("leaflet.PolylineDecorator")
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
}

