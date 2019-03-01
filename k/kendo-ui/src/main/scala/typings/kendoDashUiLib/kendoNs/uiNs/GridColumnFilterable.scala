package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridColumnFilterable extends js.Object {
  var cell: js.UndefOr[GridColumnFilterableCell] = js.undefined
  var checkAll: js.UndefOr[scala.Boolean] = js.undefined
  var dataSource: js.UndefOr[js.Any | kendoDashUiLib.kendoNs.dataNs.DataSource] = js.undefined
  var extra: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreCase: js.UndefOr[scala.Boolean] = js.undefined
  var itemTemplate: js.UndefOr[js.Function] = js.undefined
  var multi: js.UndefOr[scala.Boolean] = js.undefined
  var operators: js.UndefOr[js.Any] = js.undefined
  var search: js.UndefOr[scala.Boolean] = js.undefined
  var ui: js.UndefOr[java.lang.String | js.Function] = js.undefined
}

object GridColumnFilterable {
  @scala.inline
  def apply(
    cell: GridColumnFilterableCell = null,
    checkAll: js.UndefOr[scala.Boolean] = js.undefined,
    dataSource: js.Any | kendoDashUiLib.kendoNs.dataNs.DataSource = null,
    extra: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreCase: js.UndefOr[scala.Boolean] = js.undefined,
    itemTemplate: js.Function = null,
    multi: js.UndefOr[scala.Boolean] = js.undefined,
    operators: js.Any = null,
    search: js.UndefOr[scala.Boolean] = js.undefined,
    ui: java.lang.String | js.Function = null
  ): GridColumnFilterable = {
    val __obj = js.Dynamic.literal()
    if (cell != null) __obj.updateDynamic("cell")(cell)
    if (!js.isUndefined(checkAll)) __obj.updateDynamic("checkAll")(checkAll)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(extra)) __obj.updateDynamic("extra")(extra)
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase)
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(itemTemplate)
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi)
    if (operators != null) __obj.updateDynamic("operators")(operators)
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search)
    if (ui != null) __obj.updateDynamic("ui")(ui.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridColumnFilterable]
  }
}

