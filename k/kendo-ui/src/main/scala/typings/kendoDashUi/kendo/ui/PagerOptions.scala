package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagerOptions extends js.Object {
  var autoBind: js.UndefOr[Boolean] = js.undefined
  var buttonCount: js.UndefOr[Double] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ PagerChangeEvent, Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any | DataSource] = js.undefined
  var info: js.UndefOr[Boolean] = js.undefined
  var input: js.UndefOr[Boolean] = js.undefined
  var linkTemplate: js.UndefOr[String] = js.undefined
  var messages: js.UndefOr[PagerMessages] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var numeric: js.UndefOr[Boolean] = js.undefined
  var pageSizes: js.UndefOr[Boolean | js.Any] = js.undefined
  var previousNext: js.UndefOr[Boolean] = js.undefined
  var refresh: js.UndefOr[Boolean] = js.undefined
  var selectTemplate: js.UndefOr[String] = js.undefined
}

object PagerOptions {
  @scala.inline
  def apply(
    autoBind: js.UndefOr[Boolean] = js.undefined,
    buttonCount: Int | Double = null,
    change: /* e */ PagerChangeEvent => Unit = null,
    dataSource: js.Any | DataSource = null,
    info: js.UndefOr[Boolean] = js.undefined,
    input: js.UndefOr[Boolean] = js.undefined,
    linkTemplate: String = null,
    messages: PagerMessages = null,
    name: String = null,
    numeric: js.UndefOr[Boolean] = js.undefined,
    pageSizes: Boolean | js.Any = null,
    previousNext: js.UndefOr[Boolean] = js.undefined,
    refresh: js.UndefOr[Boolean] = js.undefined,
    selectTemplate: String = null
  ): PagerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind.asInstanceOf[js.Any])
    if (buttonCount != null) __obj.updateDynamic("buttonCount")(buttonCount.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(info)) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (!js.isUndefined(input)) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (linkTemplate != null) __obj.updateDynamic("linkTemplate")(linkTemplate.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(numeric)) __obj.updateDynamic("numeric")(numeric.asInstanceOf[js.Any])
    if (pageSizes != null) __obj.updateDynamic("pageSizes")(pageSizes.asInstanceOf[js.Any])
    if (!js.isUndefined(previousNext)) __obj.updateDynamic("previousNext")(previousNext.asInstanceOf[js.Any])
    if (!js.isUndefined(refresh)) __obj.updateDynamic("refresh")(refresh.asInstanceOf[js.Any])
    if (selectTemplate != null) __obj.updateDynamic("selectTemplate")(selectTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagerOptions]
  }
}

