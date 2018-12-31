package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSONSourceOptions extends js.Object {
  var attribution: js.UndefOr[java.lang.String] = js.undefined
  var buffer: js.UndefOr[scala.Double] = js.undefined
  var cluster: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  var clusterMaxZoom: js.UndefOr[scala.Double] = js.undefined
  var clusterRadius: js.UndefOr[scala.Double] = js.undefined
  var data: js.UndefOr[
    (geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.Geometry, geojsonLib.geojsonMod.GeoJsonProperties]) | (geojsonLib.geojsonMod.FeatureCollection[geojsonLib.geojsonMod.Geometry, geojsonLib.geojsonMod.GeoJsonProperties]) | java.lang.String
  ] = js.undefined
  var generateId: js.UndefOr[scala.Boolean] = js.undefined
  var lineMetrics: js.UndefOr[scala.Boolean] = js.undefined
  var maxzoom: js.UndefOr[scala.Double] = js.undefined
  var tolerance: js.UndefOr[scala.Double] = js.undefined
}

