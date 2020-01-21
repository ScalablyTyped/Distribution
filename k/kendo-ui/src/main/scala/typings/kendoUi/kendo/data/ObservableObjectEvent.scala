package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObservableObjectEvent extends js.Object {
  var field: js.UndefOr[String] = js.undefined
  var sender: js.UndefOr[ObservableObject] = js.undefined
}

object ObservableObjectEvent {
  @scala.inline
  def apply(field: String = null, sender: ObservableObject = null): ObservableObjectEvent = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (sender != null) __obj.updateDynamic("sender")(sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObservableObjectEvent]
  }
}

