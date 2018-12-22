package typings
package leafletDashPolylinedecoratorLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.PolylineDecorator")
@js.native
class PolylineDecorator protected ()
  extends leafletLib.leafletMod.FeatureGroup[js.Any] {
  def this(paths: js.Array[
      js.Array[leafletLib.leafletMod.LatLngExpression] | leafletLib.leafletMod.LatLngExpression | leafletLib.leafletMod.Polygon[_] | (leafletLib.leafletMod.Polyline[geojsonLib.geojsonMod.LineString | geojsonLib.geojsonMod.MultiLineString, _])
    ]) = this()
  def this(paths: leafletLib.leafletMod.Polygon[_]) = this()
  def this(paths: leafletLib.leafletMod.Polyline[geojsonLib.geojsonMod.LineString | geojsonLib.geojsonMod.MultiLineString, _]) = this()
  def this(paths: js.Array[
      js.Array[leafletLib.leafletMod.LatLngExpression] | leafletLib.leafletMod.LatLngExpression | leafletLib.leafletMod.Polygon[_] | (leafletLib.leafletMod.Polyline[geojsonLib.geojsonMod.LineString | geojsonLib.geojsonMod.MultiLineString, _])
    ], options: PolylineDecoratorOptions) = this()
  def this(paths: leafletLib.leafletMod.Polygon[_], options: PolylineDecoratorOptions) = this()
  def this(paths: leafletLib.leafletMod.Polyline[geojsonLib.geojsonMod.LineString | geojsonLib.geojsonMod.MultiLineString, _], options: PolylineDecoratorOptions) = this()
}

