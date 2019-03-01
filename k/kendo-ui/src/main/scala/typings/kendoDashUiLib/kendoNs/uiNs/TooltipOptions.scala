package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipOptions extends js.Object {
  var animation: js.UndefOr[scala.Boolean | TooltipAnimation] = js.undefined
  var autoHide: js.UndefOr[scala.Boolean] = js.undefined
  var callout: js.UndefOr[scala.Boolean] = js.undefined
  var content: js.UndefOr[java.lang.String | js.Function | TooltipContent] = js.undefined
  var contentLoad: js.UndefOr[js.Function1[/* e */ TooltipEvent, scala.Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* e */ TooltipErrorEvent, scala.Unit]] = js.undefined
  var filter: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var hide: js.UndefOr[js.Function1[/* e */ TooltipEvent, scala.Unit]] = js.undefined
  var iframe: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var requestStart: js.UndefOr[js.Function1[/* e */ TooltipRequestStartEvent, scala.Unit]] = js.undefined
  var show: js.UndefOr[js.Function1[/* e */ TooltipEvent, scala.Unit]] = js.undefined
  var showAfter: js.UndefOr[scala.Double] = js.undefined
  var showOn: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object TooltipOptions {
  @scala.inline
  def apply(
    animation: scala.Boolean | TooltipAnimation = null,
    autoHide: js.UndefOr[scala.Boolean] = js.undefined,
    callout: js.UndefOr[scala.Boolean] = js.undefined,
    content: java.lang.String | js.Function | TooltipContent = null,
    contentLoad: js.Function1[/* e */ TooltipEvent, scala.Unit] = null,
    error: js.Function1[/* e */ TooltipErrorEvent, scala.Unit] = null,
    filter: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    hide: js.Function1[/* e */ TooltipEvent, scala.Unit] = null,
    iframe: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    position: java.lang.String = null,
    requestStart: js.Function1[/* e */ TooltipRequestStartEvent, scala.Unit] = null,
    show: js.Function1[/* e */ TooltipEvent, scala.Unit] = null,
    showAfter: scala.Int | scala.Double = null,
    showOn: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide)
    if (!js.isUndefined(callout)) __obj.updateDynamic("callout")(callout)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentLoad != null) __obj.updateDynamic("contentLoad")(contentLoad)
    if (error != null) __obj.updateDynamic("error")(error)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(hide)
    if (!js.isUndefined(iframe)) __obj.updateDynamic("iframe")(iframe)
    if (name != null) __obj.updateDynamic("name")(name)
    if (position != null) __obj.updateDynamic("position")(position)
    if (requestStart != null) __obj.updateDynamic("requestStart")(requestStart)
    if (show != null) __obj.updateDynamic("show")(show)
    if (showAfter != null) __obj.updateDynamic("showAfter")(showAfter.asInstanceOf[js.Any])
    if (showOn != null) __obj.updateDynamic("showOn")(showOn)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipOptions]
  }
}

