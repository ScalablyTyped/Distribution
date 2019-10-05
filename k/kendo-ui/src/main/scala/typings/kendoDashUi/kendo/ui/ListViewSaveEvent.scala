package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQuery
import typings.kendoDashUi.kendo.data.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListViewSaveEvent extends ListViewEvent {
  var item: js.UndefOr[JQuery] = js.undefined
  var model: js.UndefOr[Model] = js.undefined
}

object ListViewSaveEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: ListView,
    item: JQuery = null,
    model: Model = null
  ): ListViewSaveEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (item != null) __obj.updateDynamic("item")(item)
    if (model != null) __obj.updateDynamic("model")(model)
    __obj.asInstanceOf[ListViewSaveEvent]
  }
}

