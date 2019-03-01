package typings
package atLinguiReactLib.withI18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait withI18nOptions extends js.Object {
  var update: js.UndefOr[scala.Boolean] = js.undefined
  var withHash: js.UndefOr[scala.Boolean] = js.undefined
  var withRef: js.UndefOr[scala.Boolean] = js.undefined
}

object withI18nOptions {
  @scala.inline
  def apply(
    update: js.UndefOr[scala.Boolean] = js.undefined,
    withHash: js.UndefOr[scala.Boolean] = js.undefined,
    withRef: js.UndefOr[scala.Boolean] = js.undefined
  ): withI18nOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update)
    if (!js.isUndefined(withHash)) __obj.updateDynamic("withHash")(withHash)
    if (!js.isUndefined(withRef)) __obj.updateDynamic("withRef")(withRef)
    __obj.asInstanceOf[withI18nOptions]
  }
}

