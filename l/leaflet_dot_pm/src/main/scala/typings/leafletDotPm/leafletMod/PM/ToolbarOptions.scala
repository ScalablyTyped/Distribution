package typings.leafletDotPm.leafletMod.PM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarOptions extends js.Object {
  var deleteLayer: js.UndefOr[Boolean] = js.undefined
   // topleft | topright | bottomleft | bottomright
  var drawMarker: js.UndefOr[Boolean] = js.undefined
  var drawPolygon: js.UndefOr[Boolean] = js.undefined
  var drawPolyline: js.UndefOr[Boolean] = js.undefined
  var editPolygon: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[String] = js.undefined
}

object ToolbarOptions {
  @scala.inline
  def apply(
    deleteLayer: js.UndefOr[Boolean] = js.undefined,
    drawMarker: js.UndefOr[Boolean] = js.undefined,
    drawPolygon: js.UndefOr[Boolean] = js.undefined,
    drawPolyline: js.UndefOr[Boolean] = js.undefined,
    editPolygon: js.UndefOr[Boolean] = js.undefined,
    position: String = null
  ): ToolbarOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deleteLayer)) __obj.updateDynamic("deleteLayer")(deleteLayer.asInstanceOf[js.Any])
    if (!js.isUndefined(drawMarker)) __obj.updateDynamic("drawMarker")(drawMarker.asInstanceOf[js.Any])
    if (!js.isUndefined(drawPolygon)) __obj.updateDynamic("drawPolygon")(drawPolygon.asInstanceOf[js.Any])
    if (!js.isUndefined(drawPolyline)) __obj.updateDynamic("drawPolyline")(drawPolyline.asInstanceOf[js.Any])
    if (!js.isUndefined(editPolygon)) __obj.updateDynamic("editPolygon")(editPolygon.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarOptions]
  }
}

