package typings.kendoUi.kendo.dataviz.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipOptions extends js.Object {
  var autoHide: js.UndefOr[Boolean] = js.undefined
  var content: js.UndefOr[String | js.Function] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var hideDelay: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var shared: js.UndefOr[Boolean] = js.undefined
  var showAfter: js.UndefOr[Double] = js.undefined
  var showOn: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object TooltipOptions {
  @scala.inline
  def apply(
    autoHide: js.UndefOr[Boolean] = js.undefined,
    content: String | js.Function = null,
    height: Double | String = null,
    hideDelay: js.UndefOr[Double] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined,
    position: String = null,
    shared: js.UndefOr[Boolean] = js.undefined,
    showAfter: js.UndefOr[Double] = js.undefined,
    showOn: String = null,
    width: Double | String = null
  ): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide.get.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hideDelay)) __obj.updateDynamic("hideDelay")(hideDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(shared)) __obj.updateDynamic("shared")(shared.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showAfter)) __obj.updateDynamic("showAfter")(showAfter.get.asInstanceOf[js.Any])
    if (showOn != null) __obj.updateDynamic("showOn")(showOn.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipOptions]
  }
}

