package typings.jqueryui.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Autocomplete //////////////////////////////////////////////////
trait AutocompleteOptions extends AutocompleteEvents {
  var appendTo: js.UndefOr[js.Any] = js.undefined
   //Selector;
  var autoFocus: js.UndefOr[Boolean] = js.undefined
   // [], string or ()
  var classes: js.UndefOr[AutocompleteClasses] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[js.Any] = js.undefined
   // object
  var source: js.UndefOr[js.Any] = js.undefined
}

object AutocompleteOptions {
  @scala.inline
  def apply(
    appendTo: js.Any = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    change: AutocompleteEvent = null,
    classes: AutocompleteClasses = null,
    close: AutocompleteEvent = null,
    create: AutocompleteEvent = null,
    delay: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focus: AutocompleteEvent = null,
    minLength: Int | Double = null,
    open: AutocompleteEvent = null,
    position: js.Any = null,
    response: AutocompleteEvent = null,
    search: AutocompleteEvent = null,
    select: AutocompleteEvent = null,
    source: js.Any = null
  ): AutocompleteOptions = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (change != null) __obj.updateDynamic("change")(change)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (close != null) __obj.updateDynamic("close")(close)
    if (create != null) __obj.updateDynamic("create")(create)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open)
    if (position != null) __obj.updateDynamic("position")(position)
    if (response != null) __obj.updateDynamic("response")(response)
    if (search != null) __obj.updateDynamic("search")(search)
    if (select != null) __obj.updateDynamic("select")(select)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[AutocompleteOptions]
  }
}

