package typings
package kendoDashUiLib.kendoNs.datavizNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerTooltip extends js.Object {
  var animation: js.UndefOr[MarkerTooltipAnimation] = js.undefined
  var autoHide: js.UndefOr[scala.Boolean] = js.undefined
  var callout: js.UndefOr[scala.Boolean] = js.undefined
  var content: js.UndefOr[java.lang.String | js.Function | MarkerTooltipContent] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var iframe: js.UndefOr[scala.Boolean] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var showAfter: js.UndefOr[scala.Double] = js.undefined
  var showOn: js.UndefOr[java.lang.String] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object MarkerTooltip {
  @scala.inline
  def apply(
    animation: MarkerTooltipAnimation = null,
    autoHide: js.UndefOr[scala.Boolean] = js.undefined,
    callout: js.UndefOr[scala.Boolean] = js.undefined,
    content: java.lang.String | js.Function | MarkerTooltipContent = null,
    height: scala.Int | scala.Double = null,
    iframe: js.UndefOr[scala.Boolean] = js.undefined,
    position: java.lang.String = null,
    showAfter: scala.Int | scala.Double = null,
    showOn: java.lang.String = null,
    template: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): MarkerTooltip = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide)
    if (!js.isUndefined(callout)) __obj.updateDynamic("callout")(callout)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(iframe)) __obj.updateDynamic("iframe")(iframe)
    if (position != null) __obj.updateDynamic("position")(position)
    if (showAfter != null) __obj.updateDynamic("showAfter")(showAfter.asInstanceOf[js.Any])
    if (showOn != null) __obj.updateDynamic("showOn")(showOn)
    if (template != null) __obj.updateDynamic("template")(template)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerTooltip]
  }
}

