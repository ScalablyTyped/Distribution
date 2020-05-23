package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObservableArrayEvent extends js.Object {
  var action: js.UndefOr[String] = js.undefined
  var field: js.UndefOr[String] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var items: js.UndefOr[js.Array[Model]] = js.undefined
}

object ObservableArrayEvent {
  @scala.inline
  def apply(
    action: String = null,
    field: String = null,
    index: js.UndefOr[Double] = js.undefined,
    items: js.Array[Model] = null
  ): ObservableArrayEvent = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObservableArrayEvent]
  }
}

