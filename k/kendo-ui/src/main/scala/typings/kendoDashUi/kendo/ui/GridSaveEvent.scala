package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQuery
import typings.kendoDashUi.kendo.data.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridSaveEvent extends GridEvent {
  var container: js.UndefOr[JQuery] = js.undefined
  var model: js.UndefOr[Model] = js.undefined
  var values: js.UndefOr[js.Any] = js.undefined
}

object GridSaveEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Grid,
    container: JQuery = null,
    model: Model = null,
    values: js.Any = null
  ): GridSaveEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (container != null) __obj.updateDynamic("container")(container)
    if (model != null) __obj.updateDynamic("model")(model)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[GridSaveEvent]
  }
}

