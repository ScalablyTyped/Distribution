package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// SelectMenu //////////////////////////////////////////////////
trait SelectMenuOptions extends SelectMenuEvents {
  var appendTo: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var icons: js.UndefOr[js.Any] = js.undefined
  var position: js.UndefOr[JQueryPositionOptions] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object SelectMenuOptions {
  @scala.inline
  def apply(
    appendTo: java.lang.String = null,
    change: SelectMenuEvent = null,
    close: SelectMenuEvent = null,
    create: SelectMenuEvent = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    focus: SelectMenuEvent = null,
    icons: js.Any = null,
    open: SelectMenuEvent = null,
    position: JQueryPositionOptions = null,
    select: SelectMenuEvent = null,
    width: scala.Int | scala.Double = null
  ): SelectMenuOptions = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo)
    if (change != null) __obj.updateDynamic("change")(change)
    if (close != null) __obj.updateDynamic("close")(close)
    if (create != null) __obj.updateDynamic("create")(create)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (open != null) __obj.updateDynamic("open")(open)
    if (position != null) __obj.updateDynamic("position")(position)
    if (select != null) __obj.updateDynamic("select")(select)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectMenuOptions]
  }
}

