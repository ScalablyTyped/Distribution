package typings.imagemagickNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQuantizeColorsOptions extends js.Object {
  var colors: Double
  var debug: js.UndefOr[Boolean] = js.undefined
  var ignoreWarnings: js.UndefOr[Boolean] = js.undefined
  var srcData: Buffer
}

object IQuantizeColorsOptions {
  @scala.inline
  def apply(
    colors: Double,
    srcData: Buffer,
    debug: js.UndefOr[Boolean] = js.undefined,
    ignoreWarnings: js.UndefOr[Boolean] = js.undefined
  ): IQuantizeColorsOptions = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], srcData = srcData.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreWarnings)) __obj.updateDynamic("ignoreWarnings")(ignoreWarnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQuantizeColorsOptions]
  }
}

