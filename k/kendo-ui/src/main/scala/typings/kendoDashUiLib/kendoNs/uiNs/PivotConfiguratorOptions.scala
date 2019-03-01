package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotConfiguratorOptions extends js.Object {
  var dataSource: js.UndefOr[js.Any | kendoDashUiLib.kendoNs.dataNs.PivotDataSource] = js.undefined
  var filterable: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var messages: js.UndefOr[PivotConfiguratorMessages] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var sortable: js.UndefOr[scala.Boolean | PivotConfiguratorSortable] = js.undefined
}

object PivotConfiguratorOptions {
  @scala.inline
  def apply(
    dataSource: js.Any | kendoDashUiLib.kendoNs.dataNs.PivotDataSource = null,
    filterable: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Double | java.lang.String = null,
    messages: PivotConfiguratorMessages = null,
    name: java.lang.String = null,
    sortable: scala.Boolean | PivotConfiguratorSortable = null
  ): PivotConfiguratorOptions = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(filterable)) __obj.updateDynamic("filterable")(filterable)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (name != null) __obj.updateDynamic("name")(name)
    if (sortable != null) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotConfiguratorOptions]
  }
}

