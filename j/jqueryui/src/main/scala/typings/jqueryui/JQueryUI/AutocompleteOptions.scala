package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
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
    change: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Unit = null,
    classes: AutocompleteClasses = null,
    close: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Unit = null,
    create: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Unit = null,
    delay: js.UndefOr[Double] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focus: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Unit = null,
    minLength: js.UndefOr[Double] = js.undefined,
    open: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Unit = null,
    position: js.Any = null,
    response: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Unit = null,
    search: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Unit = null,
    select: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Unit = null,
    source: js.Any = null
  ): AutocompleteOptions = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.get.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2(change))
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction2(close))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction2(focus))
    if (!js.isUndefined(minLength)) __obj.updateDynamic("minLength")(minLength.get.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction2(open))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(js.Any.fromFunction2(response))
    if (search != null) __obj.updateDynamic("search")(js.Any.fromFunction2(search))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction2(select))
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteOptions]
  }
}

