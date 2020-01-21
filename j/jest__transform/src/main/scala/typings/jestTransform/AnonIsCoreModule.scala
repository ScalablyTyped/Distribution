package typings.jestTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsCoreModule extends js.Object {
  var isCoreModule: js.UndefOr[Boolean] = js.undefined
  var isInternalModule: js.UndefOr[Boolean] = js.undefined
}

object AnonIsCoreModule {
  @scala.inline
  def apply(
    isCoreModule: js.UndefOr[Boolean] = js.undefined,
    isInternalModule: js.UndefOr[Boolean] = js.undefined
  ): AnonIsCoreModule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isCoreModule)) __obj.updateDynamic("isCoreModule")(isCoreModule.asInstanceOf[js.Any])
    if (!js.isUndefined(isInternalModule)) __obj.updateDynamic("isInternalModule")(isInternalModule.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsCoreModule]
  }
}

