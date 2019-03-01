package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListPageable extends js.Object {
  var alwaysVisible: js.UndefOr[scala.Boolean] = js.undefined
  var buttonCount: js.UndefOr[scala.Double] = js.undefined
  var info: js.UndefOr[scala.Boolean] = js.undefined
  var input: js.UndefOr[scala.Boolean] = js.undefined
  var messages: js.UndefOr[TreeListPageableMessages] = js.undefined
  var numeric: js.UndefOr[scala.Boolean] = js.undefined
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  var pageSizes: js.UndefOr[scala.Boolean | js.Any] = js.undefined
  var previousNext: js.UndefOr[scala.Boolean] = js.undefined
  var refresh: js.UndefOr[scala.Boolean] = js.undefined
}

object TreeListPageable {
  @scala.inline
  def apply(
    alwaysVisible: js.UndefOr[scala.Boolean] = js.undefined,
    buttonCount: scala.Int | scala.Double = null,
    info: js.UndefOr[scala.Boolean] = js.undefined,
    input: js.UndefOr[scala.Boolean] = js.undefined,
    messages: TreeListPageableMessages = null,
    numeric: js.UndefOr[scala.Boolean] = js.undefined,
    pageSize: scala.Int | scala.Double = null,
    pageSizes: scala.Boolean | js.Any = null,
    previousNext: js.UndefOr[scala.Boolean] = js.undefined,
    refresh: js.UndefOr[scala.Boolean] = js.undefined
  ): TreeListPageable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysVisible)) __obj.updateDynamic("alwaysVisible")(alwaysVisible)
    if (buttonCount != null) __obj.updateDynamic("buttonCount")(buttonCount.asInstanceOf[js.Any])
    if (!js.isUndefined(info)) __obj.updateDynamic("info")(info)
    if (!js.isUndefined(input)) __obj.updateDynamic("input")(input)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (!js.isUndefined(numeric)) __obj.updateDynamic("numeric")(numeric)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageSizes != null) __obj.updateDynamic("pageSizes")(pageSizes.asInstanceOf[js.Any])
    if (!js.isUndefined(previousNext)) __obj.updateDynamic("previousNext")(previousNext)
    if (!js.isUndefined(refresh)) __obj.updateDynamic("refresh")(refresh)
    __obj.asInstanceOf[TreeListPageable]
  }
}

