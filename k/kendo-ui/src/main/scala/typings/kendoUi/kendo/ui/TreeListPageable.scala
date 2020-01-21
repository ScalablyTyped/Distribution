package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListPageable extends js.Object {
  var alwaysVisible: js.UndefOr[Boolean] = js.undefined
  var buttonCount: js.UndefOr[Double] = js.undefined
  var info: js.UndefOr[Boolean] = js.undefined
  var input: js.UndefOr[Boolean] = js.undefined
  var messages: js.UndefOr[TreeListPageableMessages] = js.undefined
  var numeric: js.UndefOr[Boolean] = js.undefined
  var pageSize: js.UndefOr[Double] = js.undefined
  var pageSizes: js.UndefOr[Boolean | js.Any] = js.undefined
  var previousNext: js.UndefOr[Boolean] = js.undefined
  var refresh: js.UndefOr[Boolean] = js.undefined
}

object TreeListPageable {
  @scala.inline
  def apply(
    alwaysVisible: js.UndefOr[Boolean] = js.undefined,
    buttonCount: Int | Double = null,
    info: js.UndefOr[Boolean] = js.undefined,
    input: js.UndefOr[Boolean] = js.undefined,
    messages: TreeListPageableMessages = null,
    numeric: js.UndefOr[Boolean] = js.undefined,
    pageSize: Int | Double = null,
    pageSizes: Boolean | js.Any = null,
    previousNext: js.UndefOr[Boolean] = js.undefined,
    refresh: js.UndefOr[Boolean] = js.undefined
  ): TreeListPageable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysVisible)) __obj.updateDynamic("alwaysVisible")(alwaysVisible.asInstanceOf[js.Any])
    if (buttonCount != null) __obj.updateDynamic("buttonCount")(buttonCount.asInstanceOf[js.Any])
    if (!js.isUndefined(info)) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (!js.isUndefined(input)) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (!js.isUndefined(numeric)) __obj.updateDynamic("numeric")(numeric.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageSizes != null) __obj.updateDynamic("pageSizes")(pageSizes.asInstanceOf[js.Any])
    if (!js.isUndefined(previousNext)) __obj.updateDynamic("previousNext")(previousNext.asInstanceOf[js.Any])
    if (!js.isUndefined(refresh)) __obj.updateDynamic("refresh")(refresh.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeListPageable]
  }
}

