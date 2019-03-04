package typings
package imagemagickDashNativeLib.imagemagickDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQuantizeColorsOptions extends js.Object {
  var colors: scala.Double
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreWarnings: js.UndefOr[scala.Boolean] = js.undefined
  var srcData: nodeLib.Buffer
}

object IQuantizeColorsOptions {
  @scala.inline
  def apply(
    colors: scala.Double,
    srcData: nodeLib.Buffer,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreWarnings: js.UndefOr[scala.Boolean] = js.undefined
  ): IQuantizeColorsOptions = {
    val __obj = js.Dynamic.literal(colors = colors, srcData = srcData)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(ignoreWarnings)) __obj.updateDynamic("ignoreWarnings")(ignoreWarnings)
    __obj.asInstanceOf[IQuantizeColorsOptions]
  }
}

