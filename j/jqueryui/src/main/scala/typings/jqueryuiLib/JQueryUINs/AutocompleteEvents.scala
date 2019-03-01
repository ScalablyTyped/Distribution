package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteEvents extends js.Object {
  var change: js.UndefOr[AutocompleteEvent] = js.undefined
  var close: js.UndefOr[AutocompleteEvent] = js.undefined
  var create: js.UndefOr[AutocompleteEvent] = js.undefined
  var focus: js.UndefOr[AutocompleteEvent] = js.undefined
  var open: js.UndefOr[AutocompleteEvent] = js.undefined
  var response: js.UndefOr[AutocompleteEvent] = js.undefined
  var search: js.UndefOr[AutocompleteEvent] = js.undefined
  var select: js.UndefOr[AutocompleteEvent] = js.undefined
}

object AutocompleteEvents {
  @scala.inline
  def apply(
    change: AutocompleteEvent = null,
    close: AutocompleteEvent = null,
    create: AutocompleteEvent = null,
    focus: AutocompleteEvent = null,
    open: AutocompleteEvent = null,
    response: AutocompleteEvent = null,
    search: AutocompleteEvent = null,
    select: AutocompleteEvent = null
  ): AutocompleteEvents = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(change)
    if (close != null) __obj.updateDynamic("close")(close)
    if (create != null) __obj.updateDynamic("create")(create)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (open != null) __obj.updateDynamic("open")(open)
    if (response != null) __obj.updateDynamic("response")(response)
    if (search != null) __obj.updateDynamic("search")(search)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[AutocompleteEvents]
  }
}

