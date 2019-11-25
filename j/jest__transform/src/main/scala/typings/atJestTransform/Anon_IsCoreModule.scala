package typings.atJestTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsCoreModule extends js.Object {
  var isCoreModule: js.UndefOr[Boolean] = js.undefined
  var isInternalModule: js.UndefOr[Boolean] = js.undefined
}

object Anon_IsCoreModule {
  @scala.inline
  def apply(
    isCoreModule: js.UndefOr[Boolean] = js.undefined,
    isInternalModule: js.UndefOr[Boolean] = js.undefined
  ): Anon_IsCoreModule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isCoreModule)) __obj.updateDynamic("isCoreModule")(isCoreModule.asInstanceOf[js.Any])
    if (!js.isUndefined(isInternalModule)) __obj.updateDynamic("isInternalModule")(isInternalModule.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IsCoreModule]
  }
}

