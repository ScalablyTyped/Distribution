package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagerOptions extends js.Object {
  var autoBind: js.UndefOr[scala.Boolean] = js.undefined
  var buttonCount: js.UndefOr[scala.Double] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ PagerChangeEvent, scala.Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any | kendoDashUiLib.kendoNs.dataNs.DataSource] = js.undefined
  var info: js.UndefOr[scala.Boolean] = js.undefined
  var input: js.UndefOr[scala.Boolean] = js.undefined
  var linkTemplate: js.UndefOr[java.lang.String] = js.undefined
  var messages: js.UndefOr[PagerMessages] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var numeric: js.UndefOr[scala.Boolean] = js.undefined
  var pageSizes: js.UndefOr[scala.Boolean | js.Any] = js.undefined
  var previousNext: js.UndefOr[scala.Boolean] = js.undefined
  var refresh: js.UndefOr[scala.Boolean] = js.undefined
  var selectTemplate: js.UndefOr[java.lang.String] = js.undefined
}

object PagerOptions {
  @scala.inline
  def apply(
    autoBind: js.UndefOr[scala.Boolean] = js.undefined,
    buttonCount: scala.Int | scala.Double = null,
    change: /* e */ PagerChangeEvent => scala.Unit = null,
    dataSource: js.Any | kendoDashUiLib.kendoNs.dataNs.DataSource = null,
    info: js.UndefOr[scala.Boolean] = js.undefined,
    input: js.UndefOr[scala.Boolean] = js.undefined,
    linkTemplate: java.lang.String = null,
    messages: PagerMessages = null,
    name: java.lang.String = null,
    numeric: js.UndefOr[scala.Boolean] = js.undefined,
    pageSizes: scala.Boolean | js.Any = null,
    previousNext: js.UndefOr[scala.Boolean] = js.undefined,
    refresh: js.UndefOr[scala.Boolean] = js.undefined,
    selectTemplate: java.lang.String = null
  ): PagerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind)
    if (buttonCount != null) __obj.updateDynamic("buttonCount")(buttonCount.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(info)) __obj.updateDynamic("info")(info)
    if (!js.isUndefined(input)) __obj.updateDynamic("input")(input)
    if (linkTemplate != null) __obj.updateDynamic("linkTemplate")(linkTemplate)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(numeric)) __obj.updateDynamic("numeric")(numeric)
    if (pageSizes != null) __obj.updateDynamic("pageSizes")(pageSizes.asInstanceOf[js.Any])
    if (!js.isUndefined(previousNext)) __obj.updateDynamic("previousNext")(previousNext)
    if (!js.isUndefined(refresh)) __obj.updateDynamic("refresh")(refresh)
    if (selectTemplate != null) __obj.updateDynamic("selectTemplate")(selectTemplate)
    __obj.asInstanceOf[PagerOptions]
  }
}

