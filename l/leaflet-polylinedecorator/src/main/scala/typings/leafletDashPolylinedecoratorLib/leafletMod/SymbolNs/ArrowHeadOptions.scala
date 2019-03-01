package typings
package leafletDashPolylinedecoratorLib.leafletMod.SymbolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrowHeadOptions extends js.Object {
  var headAngle: js.UndefOr[scala.Double] = js.undefined
  var pathOptions: js.UndefOr[leafletLib.leafletMod.PathOptions] = js.undefined
  var pixelSize: js.UndefOr[scala.Double] = js.undefined
  var polygon: js.UndefOr[scala.Boolean] = js.undefined
}

object ArrowHeadOptions {
  @scala.inline
  def apply(
    headAngle: scala.Int | scala.Double = null,
    pathOptions: leafletLib.leafletMod.PathOptions = null,
    pixelSize: scala.Int | scala.Double = null,
    polygon: js.UndefOr[scala.Boolean] = js.undefined
  ): ArrowHeadOptions = {
    val __obj = js.Dynamic.literal()
    if (headAngle != null) __obj.updateDynamic("headAngle")(headAngle.asInstanceOf[js.Any])
    if (pathOptions != null) __obj.updateDynamic("pathOptions")(pathOptions)
    if (pixelSize != null) __obj.updateDynamic("pixelSize")(pixelSize.asInstanceOf[js.Any])
    if (!js.isUndefined(polygon)) __obj.updateDynamic("polygon")(polygon)
    __obj.asInstanceOf[ArrowHeadOptions]
  }
}

