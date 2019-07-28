package typings.jqueryui.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuEvents extends js.Object {
  var blur: js.UndefOr[MenuEvent] = js.undefined
  var create: js.UndefOr[MenuEvent] = js.undefined
  var focus: js.UndefOr[MenuEvent] = js.undefined
  var select: js.UndefOr[MenuEvent] = js.undefined
}

object MenuEvents {
  @scala.inline
  def apply(
    blur: MenuEvent = null,
    create: MenuEvent = null,
    focus: MenuEvent = null,
    select: MenuEvent = null
  ): MenuEvents = {
    val __obj = js.Dynamic.literal()
    if (blur != null) __obj.updateDynamic("blur")(blur)
    if (create != null) __obj.updateDynamic("create")(create)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[MenuEvents]
  }
}

