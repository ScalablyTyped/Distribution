package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridPageable extends js.Object {
  var alwaysVisible: js.UndefOr[Boolean] = js.undefined
  var buttonCount: js.UndefOr[Double] = js.undefined
  var info: js.UndefOr[Boolean] = js.undefined
  var input: js.UndefOr[Boolean] = js.undefined
  var messages: js.UndefOr[GridPageableMessages] = js.undefined
  var numeric: js.UndefOr[Boolean] = js.undefined
  var pageSize: js.UndefOr[Double] = js.undefined
  var pageSizes: js.UndefOr[Boolean | js.Any] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var previousNext: js.UndefOr[Boolean] = js.undefined
  var refresh: js.UndefOr[Boolean] = js.undefined
  var responsive: js.UndefOr[Boolean] = js.undefined
}

object GridPageable {
  @scala.inline
  def apply(
    alwaysVisible: js.UndefOr[Boolean] = js.undefined,
    buttonCount: js.UndefOr[Double] = js.undefined,
    info: js.UndefOr[Boolean] = js.undefined,
    input: js.UndefOr[Boolean] = js.undefined,
    messages: GridPageableMessages = null,
    numeric: js.UndefOr[Boolean] = js.undefined,
    pageSize: js.UndefOr[Double] = js.undefined,
    pageSizes: Boolean | js.Any = null,
    position: String = null,
    previousNext: js.UndefOr[Boolean] = js.undefined,
    refresh: js.UndefOr[Boolean] = js.undefined,
    responsive: js.UndefOr[Boolean] = js.undefined
  ): GridPageable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysVisible)) __obj.updateDynamic("alwaysVisible")(alwaysVisible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(buttonCount)) __obj.updateDynamic("buttonCount")(buttonCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(info)) __obj.updateDynamic("info")(info.get.asInstanceOf[js.Any])
    if (!js.isUndefined(input)) __obj.updateDynamic("input")(input.get.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (!js.isUndefined(numeric)) __obj.updateDynamic("numeric")(numeric.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (pageSizes != null) __obj.updateDynamic("pageSizes")(pageSizes.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(previousNext)) __obj.updateDynamic("previousNext")(previousNext.get.asInstanceOf[js.Any])
    if (!js.isUndefined(refresh)) __obj.updateDynamic("refresh")(refresh.get.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridPageable]
  }
}

