package typings.leafletGeosearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenStreetMapProviderOptionsPolygonOutput extends js.Object {
  var polygon_geojson: js.UndefOr[Double] = js.undefined
  var polygon_kml: js.UndefOr[Double] = js.undefined
  var polygon_svg: js.UndefOr[Double] = js.undefined
  var polygon_text: js.UndefOr[Double] = js.undefined
  var polygon_threshold: js.UndefOr[String] = js.undefined
}

object OpenStreetMapProviderOptionsPolygonOutput {
  @scala.inline
  def apply(
    polygon_geojson: js.UndefOr[Double] = js.undefined,
    polygon_kml: js.UndefOr[Double] = js.undefined,
    polygon_svg: js.UndefOr[Double] = js.undefined,
    polygon_text: js.UndefOr[Double] = js.undefined,
    polygon_threshold: String = null
  ): OpenStreetMapProviderOptionsPolygonOutput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(polygon_geojson)) __obj.updateDynamic("polygon_geojson")(polygon_geojson.get.asInstanceOf[js.Any])
    if (!js.isUndefined(polygon_kml)) __obj.updateDynamic("polygon_kml")(polygon_kml.get.asInstanceOf[js.Any])
    if (!js.isUndefined(polygon_svg)) __obj.updateDynamic("polygon_svg")(polygon_svg.get.asInstanceOf[js.Any])
    if (!js.isUndefined(polygon_text)) __obj.updateDynamic("polygon_text")(polygon_text.get.asInstanceOf[js.Any])
    if (polygon_threshold != null) __obj.updateDynamic("polygon_threshold")(polygon_threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenStreetMapProviderOptionsPolygonOutput]
  }
}

