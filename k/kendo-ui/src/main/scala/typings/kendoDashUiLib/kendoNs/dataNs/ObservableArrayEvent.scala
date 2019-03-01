package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObservableArrayEvent extends js.Object {
  var action: js.UndefOr[java.lang.String] = js.undefined
  var field: js.UndefOr[java.lang.String] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
  var items: js.UndefOr[js.Array[Model]] = js.undefined
}

object ObservableArrayEvent {
  @scala.inline
  def apply(
    action: java.lang.String = null,
    field: java.lang.String = null,
    index: scala.Int | scala.Double = null,
    items: js.Array[Model] = null
  ): ObservableArrayEvent = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (field != null) __obj.updateDynamic("field")(field)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[ObservableArrayEvent]
  }
}

