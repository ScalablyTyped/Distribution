package typings.leafletDashGeosearch.leafletDashGeosearchMod

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
    polygon_geojson: Int | Double = null,
    polygon_kml: Int | Double = null,
    polygon_svg: Int | Double = null,
    polygon_text: Int | Double = null,
    polygon_threshold: String = null
  ): OpenStreetMapProviderOptionsPolygonOutput = {
    val __obj = js.Dynamic.literal()
    if (polygon_geojson != null) __obj.updateDynamic("polygon_geojson")(polygon_geojson.asInstanceOf[js.Any])
    if (polygon_kml != null) __obj.updateDynamic("polygon_kml")(polygon_kml.asInstanceOf[js.Any])
    if (polygon_svg != null) __obj.updateDynamic("polygon_svg")(polygon_svg.asInstanceOf[js.Any])
    if (polygon_text != null) __obj.updateDynamic("polygon_text")(polygon_text.asInstanceOf[js.Any])
    if (polygon_threshold != null) __obj.updateDynamic("polygon_threshold")(polygon_threshold)
    __obj.asInstanceOf[OpenStreetMapProviderOptionsPolygonOutput]
  }
}

