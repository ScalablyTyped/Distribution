package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterOptions extends js.Object {
  var applyButton: js.UndefOr[Boolean] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ FilterChangeEvent, Unit]] = js.undefined
  var dataSource: js.UndefOr[DataSource] = js.undefined
  var expression: js.UndefOr[js.Any] = js.undefined
  var expressionPreview: js.UndefOr[Boolean] = js.undefined
  var fields: js.UndefOr[js.Array[FilterField]] = js.undefined
  var mainLogic: js.UndefOr[String] = js.undefined
  var messages: js.UndefOr[FilterMessages] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var operators: js.UndefOr[FilterOperators] = js.undefined
}

object FilterOptions {
  @scala.inline
  def apply(
    applyButton: js.UndefOr[Boolean] = js.undefined,
    change: /* e */ FilterChangeEvent => Unit = null,
    dataSource: DataSource = null,
    expression: js.Any = null,
    expressionPreview: js.UndefOr[Boolean] = js.undefined,
    fields: js.Array[FilterField] = null,
    mainLogic: String = null,
    messages: FilterMessages = null,
    name: String = null,
    operators: FilterOperators = null
  ): FilterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(applyButton)) __obj.updateDynamic("applyButton")(applyButton)
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    if (!js.isUndefined(expressionPreview)) __obj.updateDynamic("expressionPreview")(expressionPreview)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (mainLogic != null) __obj.updateDynamic("mainLogic")(mainLogic)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (name != null) __obj.updateDynamic("name")(name)
    if (operators != null) __obj.updateDynamic("operators")(operators)
    __obj.asInstanceOf[FilterOptions]
  }
}

