package typings
package kendoDashUiLib.kendoNs.datavizNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipOptions extends js.Object {
  var autoHide: js.UndefOr[scala.Boolean] = js.undefined
  var content: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var hideDelay: js.UndefOr[scala.Double] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var shared: js.UndefOr[scala.Boolean] = js.undefined
  var showAfter: js.UndefOr[scala.Double] = js.undefined
  var showOn: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object TooltipOptions {
  @scala.inline
  def apply(
    autoHide: js.UndefOr[scala.Boolean] = js.undefined,
    content: java.lang.String | js.Function = null,
    height: scala.Double | java.lang.String = null,
    hideDelay: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null,
    position: java.lang.String = null,
    shared: js.UndefOr[scala.Boolean] = js.undefined,
    showAfter: scala.Int | scala.Double = null,
    showOn: java.lang.String = null,
    width: scala.Double | java.lang.String = null
  ): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hideDelay != null) __obj.updateDynamic("hideDelay")(hideDelay.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(shared)) __obj.updateDynamic("shared")(shared)
    if (showAfter != null) __obj.updateDynamic("showAfter")(showAfter.asInstanceOf[js.Any])
    if (showOn != null) __obj.updateDynamic("showOn")(showOn)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipOptions]
  }
}

