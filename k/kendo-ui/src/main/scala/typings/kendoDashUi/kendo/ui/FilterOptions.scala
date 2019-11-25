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
    if (!js.isUndefined(applyButton)) __obj.updateDynamic("applyButton")(applyButton.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (!js.isUndefined(expressionPreview)) __obj.updateDynamic("expressionPreview")(expressionPreview.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (mainLogic != null) __obj.updateDynamic("mainLogic")(mainLogic.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (operators != null) __obj.updateDynamic("operators")(operators.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOptions]
  }
}

