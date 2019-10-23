package typings.jqueryui.JQueryUI

import typings.jquery.JQuery.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// SelectMenu //////////////////////////////////////////////////
trait SelectMenuOptions extends SelectMenuEvents {
  var appendTo: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var icons: js.UndefOr[js.Any] = js.undefined
  var position: js.UndefOr[JQueryPositionOptions] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object SelectMenuOptions {
  @scala.inline
  def apply(
    appendTo: String = null,
    change: (/* event */ Event, /* ui */ SelectMenuUIParams) => Unit = null,
    close: (/* event */ Event, /* ui */ SelectMenuUIParams) => Unit = null,
    create: (/* event */ Event, /* ui */ SelectMenuUIParams) => Unit = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focus: (/* event */ Event, /* ui */ SelectMenuUIParams) => Unit = null,
    icons: js.Any = null,
    open: (/* event */ Event, /* ui */ SelectMenuUIParams) => Unit = null,
    position: JQueryPositionOptions = null,
    select: (/* event */ Event, /* ui */ SelectMenuUIParams) => Unit = null,
    width: Int | Double = null
  ): SelectMenuOptions = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo)
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2(change))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction2(close))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction2(focus))
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction2(open))
    if (position != null) __obj.updateDynamic("position")(position)
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction2(select))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectMenuOptions]
  }
}

