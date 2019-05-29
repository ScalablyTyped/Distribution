package typings
package highchartsLib.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapSeriesOptions extends js.Object {
  var data: js.UndefOr[
    js.Array[
      DataPoint | scala.Double | (js.Tuple2[scala.Double | java.lang.String, scala.Double])
    ]
  ] = js.undefined
  var dataLabels: js.UndefOr[MapSeriesOptionsDataLabels] = js.undefined
  var joinBy: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var mapData: js.UndefOr[geojsonLib.geojsonMod.GeoJsonObject] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var states: js.UndefOr[MapSeriesOptionsStates] = js.undefined
  var tooltip: js.UndefOr[MapSeriesOptionsTooltip] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object MapSeriesOptions {
  @scala.inline
  def apply(
    data: js.Array[
      DataPoint | scala.Double | (js.Tuple2[scala.Double | java.lang.String, scala.Double])
    ] = null,
    dataLabels: MapSeriesOptionsDataLabels = null,
    joinBy: js.Array[java.lang.String] = null,
    mapData: geojsonLib.geojsonMod.GeoJsonObject = null,
    name: java.lang.String = null,
    states: MapSeriesOptionsStates = null,
    tooltip: MapSeriesOptionsTooltip = null,
    `type`: java.lang.String = null
  ): MapSeriesOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels)
    if (joinBy != null) __obj.updateDynamic("joinBy")(joinBy)
    if (mapData != null) __obj.updateDynamic("mapData")(mapData)
    if (name != null) __obj.updateDynamic("name")(name)
    if (states != null) __obj.updateDynamic("states")(states)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MapSeriesOptions]
  }
}

