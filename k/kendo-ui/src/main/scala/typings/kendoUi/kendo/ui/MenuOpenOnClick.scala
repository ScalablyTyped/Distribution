package typings.kendoUi.kendo.ui

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
    if (!js.isUndefined(rootMenuItems)) __obj.updateDynamic("rootMenuItems")(rootMenuItems.asInstanceOf[js.Any])
    if (!js.isUndefined(subMenuItems)) __obj.updateDynamic("subMenuItems")(subMenuItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuOpenOnClick]
  }
}

