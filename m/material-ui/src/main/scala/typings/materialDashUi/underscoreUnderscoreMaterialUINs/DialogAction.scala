package typings.materialDashUi.underscoreUnderscoreMaterialUINs

import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogAction extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  var ref: js.UndefOr[String] = js.undefined
  var text: String
}

object DialogAction {
  @scala.inline
  def apply(
    text: String,
    id: String = null,
    onClick: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    ref: String = null
  ): DialogAction = {
    val __obj = js.Dynamic.literal(text = text)
    if (id != null) __obj.updateDynamic("id")(id)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[DialogAction]
  }
}

