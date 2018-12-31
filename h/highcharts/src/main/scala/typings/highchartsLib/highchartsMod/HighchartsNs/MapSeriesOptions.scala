package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapSeriesOptions extends js.Object {
  var data: js.UndefOr[
    js.Array[scala.Double] | (js.Array[js.Tuple2[scala.Double, scala.Double]]) | (js.Array[js.Tuple2[java.lang.String, scala.Double]]) | js.Array[DataPoint]
  ] = js.undefined
  var dataLabels: js.UndefOr[MapSeriesOptionsDataLabels] = js.undefined
  var joinBy: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var mapData: js.UndefOr[geojsonLib.geojsonMod.GeoJsonObject] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var states: js.UndefOr[MapSeriesOptionsStates] = js.undefined
  var tooltip: js.UndefOr[MapSeriesOptionsTooltip] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

