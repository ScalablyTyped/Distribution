package typings
package jqueryDotNotyLib

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
    if (afterClose != null) __obj.updateDynamic("afterClose")(afterClose)
    if (afterShow != null) __obj.updateDynamic("afterShow")(afterShow)
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onCloseClick != null) __obj.updateDynamic("onCloseClick")(onCloseClick)
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
    __obj.asInstanceOf[NotyCallbackOptions]
  }
}

