package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLayerTooltip extends js.Object {
  var animation: js.UndefOr[MapLayerTooltipAnimation] = js.undefined
  var autoHide: js.UndefOr[Boolean] = js.undefined
  var callout: js.UndefOr[Boolean] = js.undefined
  var content: js.UndefOr[String | js.Function | MapLayerTooltipContent] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var iframe: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var showAfter: js.UndefOr[Double] = js.undefined
  var showOn: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object MapLayerTooltip {
  @scala.inline
  def apply(
    animation: MapLayerTooltipAnimation = null,
    autoHide: js.UndefOr[Boolean] = js.undefined,
    callout: js.UndefOr[Boolean] = js.undefined,
    content: String | js.Function | MapLayerTooltipContent = null,
    height: js.UndefOr[Double] = js.undefined,
    iframe: js.UndefOr[Boolean] = js.undefined,
    position: String = null,
    showAfter: js.UndefOr[Double] = js.undefined,
    showOn: String = null,
    template: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): MapLayerTooltip = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide.get.asInstanceOf[js.Any])
    if (!js.isUndefined(callout)) __obj.updateDynamic("callout")(callout.get.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iframe)) __obj.updateDynamic("iframe")(iframe.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(showAfter)) __obj.updateDynamic("showAfter")(showAfter.get.asInstanceOf[js.Any])
    if (showOn != null) __obj.updateDynamic("showOn")(showOn.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayerTooltip]
  }
}

