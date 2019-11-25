package typings.jqueryDotNoty

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotyCallbackOptions extends js.Object {
  var afterClose: js.UndefOr[js.Function] = js.undefined
  var afterShow: js.UndefOr[js.Function] = js.undefined
  var onClose: js.UndefOr[js.Function] = js.undefined
  var onCloseClick: js.UndefOr[js.Function] = js.undefined
  var onShow: js.UndefOr[js.Function] = js.undefined
}

object NotyCallbackOptions {
  @scala.inline
  def apply(
    afterClose: js.Function = null,
    afterShow: js.Function = null,
    onClose: js.Function = null,
    onCloseClick: js.Function = null,
    onShow: js.Function = null
  ): NotyCallbackOptions = {
    val __obj = js.Dynamic.literal()
    if (afterClose != null) __obj.updateDynamic("afterClose")(afterClose.asInstanceOf[js.Any])
    if (afterShow != null) __obj.updateDynamic("afterShow")(afterShow.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(onClose.asInstanceOf[js.Any])
    if (onCloseClick != null) __obj.updateDynamic("onCloseClick")(onCloseClick.asInstanceOf[js.Any])
    if (onShow != null) __obj.updateDynamic("onShow")(onShow.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotyCallbackOptions]
  }
}

