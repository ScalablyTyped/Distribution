package typings.atLinguiReact.withI18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait withI18nOptions extends js.Object {
  var update: js.UndefOr[Boolean] = js.undefined
  var withHash: js.UndefOr[Boolean] = js.undefined
  var withRef: js.UndefOr[Boolean] = js.undefined
}

object withI18nOptions {
  @scala.inline
  def apply(
    update: js.UndefOr[Boolean] = js.undefined,
    withHash: js.UndefOr[Boolean] = js.undefined,
    withRef: js.UndefOr[Boolean] = js.undefined
  ): withI18nOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    if (!js.isUndefined(withHash)) __obj.updateDynamic("withHash")(withHash.asInstanceOf[js.Any])
    if (!js.isUndefined(withRef)) __obj.updateDynamic("withRef")(withRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[withI18nOptions]
  }
}

