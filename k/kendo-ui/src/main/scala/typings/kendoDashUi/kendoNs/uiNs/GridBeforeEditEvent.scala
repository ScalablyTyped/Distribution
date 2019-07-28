package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.kendoNs.dataNs.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridBeforeEditEvent extends GridEvent {
  var model: js.UndefOr[Model] = js.undefined
}

object GridBeforeEditEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Grid, model: Model = null): GridBeforeEditEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (model != null) __obj.updateDynamic("model")(model)
    __obj.asInstanceOf[GridBeforeEditEvent]
  }
}

