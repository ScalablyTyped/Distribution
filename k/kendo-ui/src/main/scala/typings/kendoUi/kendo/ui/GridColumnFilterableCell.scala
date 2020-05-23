package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridColumnFilterableCell extends js.Object {
  var dataSource: js.UndefOr[js.Any | DataSource] = js.undefined
  var dataTextField: js.UndefOr[String] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var inputWidth: js.UndefOr[Double] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var operator: js.UndefOr[String] = js.undefined
  var showOperators: js.UndefOr[Boolean] = js.undefined
  var suggestionOperator: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[js.Function] = js.undefined
}

object GridColumnFilterableCell {
  @scala.inline
  def apply(
    dataSource: js.Any | DataSource = null,
    dataTextField: String = null,
    delay: js.UndefOr[Double] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    inputWidth: js.UndefOr[Double] = js.undefined,
    minLength: js.UndefOr[Double] = js.undefined,
    operator: String = null,
    showOperators: js.UndefOr[Boolean] = js.undefined,
    suggestionOperator: String = null,
    template: js.Function = null
  ): GridColumnFilterableCell = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataTextField != null) __obj.updateDynamic("dataTextField")(dataTextField.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inputWidth)) __obj.updateDynamic("inputWidth")(inputWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minLength)) __obj.updateDynamic("minLength")(minLength.get.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (!js.isUndefined(showOperators)) __obj.updateDynamic("showOperators")(showOperators.get.asInstanceOf[js.Any])
    if (suggestionOperator != null) __obj.updateDynamic("suggestionOperator")(suggestionOperator.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridColumnFilterableCell]
  }
}

