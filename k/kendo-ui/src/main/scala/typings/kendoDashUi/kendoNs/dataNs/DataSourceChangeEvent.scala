package typings.kendoDashUi.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceChangeEvent extends DataSourceEvent {
  var action: js.UndefOr[String] = js.undefined
  var field: js.UndefOr[String] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var items: js.UndefOr[js.Array[DataSourceItemOrGroup]] = js.undefined
  var node: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[Model] = js.undefined
}

object DataSourceChangeEvent {
  @scala.inline
  def apply(
    action: String = null,
    field: String = null,
    index: Int | Double = null,
    items: js.Array[DataSourceItemOrGroup] = null,
    node: js.Any = null,
    sender: DataSource = null,
    value: Model = null
  ): DataSourceChangeEvent = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (field != null) __obj.updateDynamic("field")(field)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items)
    if (node != null) __obj.updateDynamic("node")(node)
    if (sender != null) __obj.updateDynamic("sender")(sender)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DataSourceChangeEvent]
  }
}

