package typings
package leafletDotPmLib.leafletMod.PMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarOptions extends js.Object {
  var deleteLayer: js.UndefOr[scala.Boolean] = js.undefined
   // topleft | topright | bottomleft | bottomright
  var drawMarker: js.UndefOr[scala.Boolean] = js.undefined
  var drawPolygon: js.UndefOr[scala.Boolean] = js.undefined
  var drawPolyline: js.UndefOr[scala.Boolean] = js.undefined
  var editPolygon: js.UndefOr[scala.Boolean] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
}

object ToolbarOptions {
  @scala.inline
  def apply(
    deleteLayer: js.UndefOr[scala.Boolean] = js.undefined,
    drawMarker: js.UndefOr[scala.Boolean] = js.undefined,
    drawPolygon: js.UndefOr[scala.Boolean] = js.undefined,
    drawPolyline: js.UndefOr[scala.Boolean] = js.undefined,
    editPolygon: js.UndefOr[scala.Boolean] = js.undefined,
    position: java.lang.String = null
  ): ToolbarOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deleteLayer)) __obj.updateDynamic("deleteLayer")(deleteLayer)
    if (!js.isUndefined(drawMarker)) __obj.updateDynamic("drawMarker")(drawMarker)
    if (!js.isUndefined(drawPolygon)) __obj.updateDynamic("drawPolygon")(drawPolygon)
    if (!js.isUndefined(drawPolyline)) __obj.updateDynamic("drawPolyline")(drawPolyline)
    if (!js.isUndefined(editPolygon)) __obj.updateDynamic("editPolygon")(editPolygon)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[ToolbarOptions]
  }
}

