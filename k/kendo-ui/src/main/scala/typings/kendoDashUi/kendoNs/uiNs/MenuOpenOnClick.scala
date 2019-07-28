package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuOpenOnClick extends js.Object {
  var rootMenuItems: js.UndefOr[Boolean] = js.undefined
  var subMenuItems: js.UndefOr[Boolean] = js.undefined
}

object MenuOpenOnClick {
  @scala.inline
  def apply(
    rootMenuItems: js.UndefOr[Boolean] = js.undefined,
    subMenuItems: js.UndefOr[Boolean] = js.undefined
  ): MenuOpenOnClick = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rootMenuItems)) __obj.updateDynamic("rootMenuItems")(rootMenuItems)
    if (!js.isUndefined(subMenuItems)) __obj.updateDynamic("subMenuItems")(subMenuItems)
    __obj.asInstanceOf[MenuOpenOnClick]
  }
}

