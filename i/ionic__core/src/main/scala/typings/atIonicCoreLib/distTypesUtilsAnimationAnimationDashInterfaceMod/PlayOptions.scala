package typings
package atIonicCoreLib.distTypesUtilsAnimationAnimationDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayOptions extends js.Object {
  var duration: js.UndefOr[scala.Double] = js.undefined
  var promise: js.UndefOr[scala.Boolean] = js.undefined
}

object PlayOptions {
  @scala.inline
  def apply(duration: scala.Int | scala.Double = null, promise: js.UndefOr[scala.Boolean] = js.undefined): PlayOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(promise)) __obj.updateDynamic("promise")(promise)
    __obj.asInstanceOf[PlayOptions]
  }
}

