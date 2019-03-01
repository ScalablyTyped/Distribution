package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Tooltip //////////////////////////////////////////////////
trait TooltipOptions extends TooltipEvents {
  var content: js.UndefOr[js.Any] = js.undefined
   // () or string
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var hide: js.UndefOr[js.Any] = js.undefined
   // boolean, number, string or object
  var items: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[js.Any] = js.undefined
   // TODO
  var show: js.UndefOr[js.Any] = js.undefined
   // boolean, number, string or object
  var tooltipClass: js.UndefOr[java.lang.String] = js.undefined
  var track: js.UndefOr[scala.Boolean] = js.undefined
}

object TooltipOptions {
  @scala.inline
  def apply(
    close: TooltipEvent = null,
    content: js.Any = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    hide: js.Any = null,
    items: java.lang.String = null,
    open: TooltipEvent = null,
    position: js.Any = null,
    show: js.Any = null,
    tooltipClass: java.lang.String = null,
    track: js.UndefOr[scala.Boolean] = js.undefined
  ): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close)
    if (content != null) __obj.updateDynamic("content")(content)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (hide != null) __obj.updateDynamic("hide")(hide)
    if (items != null) __obj.updateDynamic("items")(items)
    if (open != null) __obj.updateDynamic("open")(open)
    if (position != null) __obj.updateDynamic("position")(position)
    if (show != null) __obj.updateDynamic("show")(show)
    if (tooltipClass != null) __obj.updateDynamic("tooltipClass")(tooltipClass)
    if (!js.isUndefined(track)) __obj.updateDynamic("track")(track)
    __obj.asInstanceOf[TooltipOptions]
  }
}

