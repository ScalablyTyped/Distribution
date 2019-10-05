package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQuery
import typings.kendoDashUi.kendo.data.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridRemoveEvent extends GridEvent {
  var model: js.UndefOr[Model] = js.undefined
  var row: js.UndefOr[JQuery] = js.undefined
}

object GridRemoveEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Grid,
    model: Model = null,
    row: JQuery = null
  ): GridRemoveEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (model != null) __obj.updateDynamic("model")(model)
    if (row != null) __obj.updateDynamic("row")(row)
    __obj.asInstanceOf[GridRemoveEvent]
  }
}

