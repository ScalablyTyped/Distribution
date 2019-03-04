package typings
package imagemagickDashNativeLib.imagemagickDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIdentifyOptions extends js.Object {
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreWarnings: js.UndefOr[scala.Boolean] = js.undefined
  var srcData: nodeLib.Buffer
}

object IIdentifyOptions {
  @scala.inline
  def apply(
    srcData: nodeLib.Buffer,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreWarnings: js.UndefOr[scala.Boolean] = js.undefined
  ): IIdentifyOptions = {
    val __obj = js.Dynamic.literal(srcData = srcData)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(ignoreWarnings)) __obj.updateDynamic("ignoreWarnings")(ignoreWarnings)
    __obj.asInstanceOf[IIdentifyOptions]
  }
}

