package typings.leafletPolylinedecorator.mod.Symbol

import typings.leaflet.mod.PathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrowHeadOptions extends js.Object {
  var headAngle: js.UndefOr[Double] = js.undefined
  var pathOptions: js.UndefOr[PathOptions] = js.undefined
  var pixelSize: js.UndefOr[Double] = js.undefined
  var polygon: js.UndefOr[Boolean] = js.undefined
}

object ArrowHeadOptions {
  @scala.inline
  def apply(
    headAngle: js.UndefOr[Double] = js.undefined,
    pathOptions: PathOptions = null,
    pixelSize: js.UndefOr[Double] = js.undefined,
    polygon: js.UndefOr[Boolean] = js.undefined
  ): ArrowHeadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(headAngle)) __obj.updateDynamic("headAngle")(headAngle.get.asInstanceOf[js.Any])
    if (pathOptions != null) __obj.updateDynamic("pathOptions")(pathOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(pixelSize)) __obj.updateDynamic("pixelSize")(pixelSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(polygon)) __obj.updateDynamic("polygon")(polygon.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowHeadOptions]
  }
}

