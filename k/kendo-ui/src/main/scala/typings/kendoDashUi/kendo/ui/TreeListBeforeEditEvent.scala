package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.kendo.data.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListBeforeEditEvent extends TreeListEvent {
  var model: js.UndefOr[Model] = js.undefined
}

object TreeListBeforeEditEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: TreeList,
    model: Model = null
  ): TreeListBeforeEditEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (model != null) __obj.updateDynamic("model")(model)
    __obj.asInstanceOf[TreeListBeforeEditEvent]
  }
}

