package typings.atIonicCore.distTypesUtilsAnimationOldDashAnimationAnimationDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var promise: js.UndefOr[Boolean] = js.undefined
}

object PlayOptions {
  @scala.inline
  def apply(duration: Int | Double = null, promise: js.UndefOr[Boolean] = js.undefined): PlayOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(promise)) __obj.updateDynamic("promise")(promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayOptions]
  }
}

