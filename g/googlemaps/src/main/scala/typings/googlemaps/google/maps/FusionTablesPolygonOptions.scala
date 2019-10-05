package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FusionTablesPolygonOptions extends js.Object {
  var fillColor: js.UndefOr[String] = js.undefined
  var fillOpacity: js.UndefOr[Double] = js.undefined
  var strokeColor: js.UndefOr[String] = js.undefined
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  var strokeWeight: js.UndefOr[Double] = js.undefined
}

object FusionTablesPolygonOptions {
  @scala.inline
  def apply(
    fillColor: String = null,
    fillOpacity: Int | Double = null,
    strokeColor: String = null,
    strokeOpacity: Int | Double = null,
    strokeWeight: Int | Double = null
  ): FusionTablesPolygonOptions = {
    val __obj = js.Dynamic.literal()
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWeight != null) __obj.updateDynamic("strokeWeight")(strokeWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusionTablesPolygonOptions]
  }
}

