package typings.leafletDashPolylinedecorator.leafletMod.Symbol

import typings.leaflet.leafletMod.PathOptions
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
    headAngle: Int | Double = null,
    pathOptions: PathOptions = null,
    pixelSize: Int | Double = null,
    polygon: js.UndefOr[Boolean] = js.undefined
  ): ArrowHeadOptions = {
    val __obj = js.Dynamic.literal()
    if (headAngle != null) __obj.updateDynamic("headAngle")(headAngle.asInstanceOf[js.Any])
    if (pathOptions != null) __obj.updateDynamic("pathOptions")(pathOptions)
    if (pixelSize != null) __obj.updateDynamic("pixelSize")(pixelSize.asInstanceOf[js.Any])
    if (!js.isUndefined(polygon)) __obj.updateDynamic("polygon")(polygon)
    __obj.asInstanceOf[ArrowHeadOptions]
  }
}

