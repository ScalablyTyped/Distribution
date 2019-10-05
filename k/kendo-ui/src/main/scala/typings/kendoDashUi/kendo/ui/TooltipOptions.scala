package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipOptions extends js.Object {
  var animation: js.UndefOr[Boolean | TooltipAnimation] = js.undefined
  var autoHide: js.UndefOr[Boolean] = js.undefined
  var callout: js.UndefOr[Boolean] = js.undefined
  var content: js.UndefOr[String | js.Function | TooltipContent] = js.undefined
  var contentLoad: js.UndefOr[js.Function1[/* e */ TooltipEvent, Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* e */ TooltipErrorEvent, Unit]] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hide: js.UndefOr[js.Function1[/* e */ TooltipEvent, Unit]] = js.undefined
  var iframe: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var requestStart: js.UndefOr[js.Function1[/* e */ TooltipRequestStartEvent, Unit]] = js.undefined
  var show: js.UndefOr[js.Function1[/* e */ TooltipEvent, Unit]] = js.undefined
  var showAfter: js.UndefOr[Double] = js.undefined
  var showOn: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object TooltipOptions {
  @scala.inline
  def apply(
    animation: Boolean | TooltipAnimation = null,
    autoHide: js.UndefOr[Boolean] = js.undefined,
    callout: js.UndefOr[Boolean] = js.undefined,
    content: String | js.Function | TooltipContent = null,
    contentLoad: /* e */ TooltipEvent => Unit = null,
    error: /* e */ TooltipErrorEvent => Unit = null,
    filter: String = null,
    height: Int | Double = null,
    hide: /* e */ TooltipEvent => Unit = null,
    iframe: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    position: String = null,
    requestStart: /* e */ TooltipRequestStartEvent => Unit = null,
    show: /* e */ TooltipEvent => Unit = null,
    showAfter: Int | Double = null,
    showOn: String = null,
    width: Int | Double = null
  ): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide)
    if (!js.isUndefined(callout)) __obj.updateDynamic("callout")(callout)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentLoad != null) __obj.updateDynamic("contentLoad")(js.Any.fromFunction1(contentLoad))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction1(hide))
    if (!js.isUndefined(iframe)) __obj.updateDynamic("iframe")(iframe)
    if (name != null) __obj.updateDynamic("name")(name)
    if (position != null) __obj.updateDynamic("position")(position)
    if (requestStart != null) __obj.updateDynamic("requestStart")(js.Any.fromFunction1(requestStart))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction1(show))
    if (showAfter != null) __obj.updateDynamic("showAfter")(showAfter.asInstanceOf[js.Any])
    if (showOn != null) __obj.updateDynamic("showOn")(showOn)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipOptions]
  }
}

