package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQueryEventObject
import typings.jqueryui.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Tooltip //////////////////////////////////////////////////
trait TooltipOptions extends TooltipEvents {
  var classes: js.UndefOr[StringDictionary[String]] = js.undefined
  var content: js.UndefOr[js.Any] = js.undefined
   // () or string
  var disabled: js.UndefOr[Boolean] = js.undefined
  var hide: js.UndefOr[js.Any] = js.undefined
   // boolean, number, string or object
  var items: js.UndefOr[String | JQuery] = js.undefined
  var position: js.UndefOr[js.Any] = js.undefined
   // TODO
  var show: js.UndefOr[js.Any] = js.undefined
   // boolean, number, string or object
  var tooltipClass: js.UndefOr[String] = js.undefined
   // deprecated in jQuery UI 1.12
  var track: js.UndefOr[Boolean] = js.undefined
}

object TooltipOptions {
  @scala.inline
  def apply(
    classes: StringDictionary[String] = null,
    close: (/* event */ JQueryEventObject, /* ui */ TooltipUIParams) => Unit = null,
    content: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    hide: js.Any = null,
    items: String | JQuery = null,
    open: (/* event */ JQueryEventObject, /* ui */ TooltipUIParams) => Unit = null,
    position: js.Any = null,
    show: js.Any = null,
    tooltipClass: String = null,
    track: js.UndefOr[Boolean] = js.undefined
  ): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction2(close))
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction2(open))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (tooltipClass != null) __obj.updateDynamic("tooltipClass")(tooltipClass.asInstanceOf[js.Any])
    if (!js.isUndefined(track)) __obj.updateDynamic("track")(track.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipOptions]
  }
}

