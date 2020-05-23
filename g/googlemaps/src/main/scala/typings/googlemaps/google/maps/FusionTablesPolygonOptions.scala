package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO find source documentation
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
    fillOpacity: js.UndefOr[Double] = js.undefined,
    strokeColor: String = null,
    strokeOpacity: js.UndefOr[Double] = js.undefined,
    strokeWeight: js.UndefOr[Double] = js.undefined
  ): FusionTablesPolygonOptions = {
    val __obj = js.Dynamic.literal()
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (!js.isUndefined(fillOpacity)) __obj.updateDynamic("fillOpacity")(fillOpacity.get.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeOpacity)) __obj.updateDynamic("strokeOpacity")(strokeOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeWeight)) __obj.updateDynamic("strokeWeight")(strokeWeight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusionTablesPolygonOptions]
  }
}

