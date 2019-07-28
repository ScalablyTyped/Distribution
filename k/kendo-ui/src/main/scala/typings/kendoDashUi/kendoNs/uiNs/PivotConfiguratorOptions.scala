package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.kendoNs.dataNs.PivotDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotConfiguratorOptions extends js.Object {
  var dataSource: js.UndefOr[js.Any | PivotDataSource] = js.undefined
  var filterable: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var messages: js.UndefOr[PivotConfiguratorMessages] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var sortable: js.UndefOr[Boolean | PivotConfiguratorSortable] = js.undefined
}

object PivotConfiguratorOptions {
  @scala.inline
  def apply(
    dataSource: js.Any | PivotDataSource = null,
    filterable: js.UndefOr[Boolean] = js.undefined,
    height: Double | String = null,
    messages: PivotConfiguratorMessages = null,
    name: String = null,
    sortable: Boolean | PivotConfiguratorSortable = null
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

