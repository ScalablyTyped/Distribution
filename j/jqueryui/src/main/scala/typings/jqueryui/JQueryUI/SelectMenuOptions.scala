package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// SelectMenu //////////////////////////////////////////////////
trait SelectMenuOptions extends SelectMenuEvents {
  var appendTo: js.UndefOr[String] = js.undefined
  var classes: js.UndefOr[SelectMenuClasses] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var icons: js.UndefOr[js.Any] = js.undefined
  var position: js.UndefOr[JQueryPositionOptions] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object SelectMenuOptions {
  @scala.inline
  def apply(
    appendTo: String = null,
    change: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Unit = null,
    classes: SelectMenuClasses = null,
    close: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Unit = null,
    create: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Unit = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focus: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Unit = null,
    icons: js.Any = null,
    open: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Unit = null,
    position: JQueryPositionOptions = null,
    select: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Unit = null,
    width: js.UndefOr[Double] = js.undefined
  ): SelectMenuOptions = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2(change))
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction2(close))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction2(focus))
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction2(open))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction2(select))
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectMenuOptions]
  }
}

