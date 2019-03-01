package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectMenuEvents extends js.Object {
  var change: js.UndefOr[SelectMenuEvent] = js.undefined
  var close: js.UndefOr[SelectMenuEvent] = js.undefined
  var create: js.UndefOr[SelectMenuEvent] = js.undefined
  var focus: js.UndefOr[SelectMenuEvent] = js.undefined
  var open: js.UndefOr[SelectMenuEvent] = js.undefined
  var select: js.UndefOr[SelectMenuEvent] = js.undefined
}

object SelectMenuEvents {
  @scala.inline
  def apply(
    change: SelectMenuEvent = null,
    close: SelectMenuEvent = null,
    create: SelectMenuEvent = null,
    focus: SelectMenuEvent = null,
    open: SelectMenuEvent = null,
    select: SelectMenuEvent = null
  ): SelectMenuEvents = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(change)
    if (close != null) __obj.updateDynamic("close")(close)
    if (create != null) __obj.updateDynamic("create")(create)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (open != null) __obj.updateDynamic("open")(open)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[SelectMenuEvents]
  }
}

