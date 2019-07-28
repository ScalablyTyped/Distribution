package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.kendoNs.dataNs.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterMenuOptions extends js.Object {
  var dataSource: js.UndefOr[js.Any | DataSource] = js.undefined
  var extra: js.UndefOr[Boolean] = js.undefined
  var field: js.UndefOr[String] = js.undefined
  var messages: js.UndefOr[FilterMenuMessages] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var operators: js.UndefOr[FilterMenuOperators] = js.undefined
}

object FilterMenuOptions {
  @scala.inline
  def apply(
    dataSource: js.Any | DataSource = null,
    extra: js.UndefOr[Boolean] = js.undefined,
    field: String = null,
    messages: FilterMenuMessages = null,
    name: String = null,
    operators: FilterMenuOperators = null
  ): FilterMenuOptions = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(extra)) __obj.updateDynamic("extra")(extra)
    if (field != null) __obj.updateDynamic("field")(field)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (name != null) __obj.updateDynamic("name")(name)
    if (operators != null) __obj.updateDynamic("operators")(operators)
    __obj.asInstanceOf[FilterMenuOptions]
  }
}

