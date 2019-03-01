package typings
package imagemagickDashNativeLib.imagemagickDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompositeOptions extends js.Object {
  var compositeData: nodeLib.Buffer
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var gravity: js.UndefOr[java.lang.String] = js.undefined
  var ignoreWarnings: js.UndefOr[scala.Boolean] = js.undefined
  var srcData: nodeLib.Buffer
}

object ICompositeOptions {
  @scala.inline
  def apply(
    compositeData: nodeLib.Buffer,
    srcData: nodeLib.Buffer,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    gravity: java.lang.String = null,
    ignoreWarnings: js.UndefOr[scala.Boolean] = js.undefined
  ): ICompositeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compositeData")(compositeData)
    __obj.updateDynamic("srcData")(srcData)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (gravity != null) __obj.updateDynamic("gravity")(gravity)
    if (!js.isUndefined(ignoreWarnings)) __obj.updateDynamic("ignoreWarnings")(ignoreWarnings)
    __obj.asInstanceOf[ICompositeOptions]
  }
}

