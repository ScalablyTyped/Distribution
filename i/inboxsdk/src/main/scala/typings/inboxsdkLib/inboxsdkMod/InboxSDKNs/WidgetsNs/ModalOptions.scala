package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.WidgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalOptions extends js.Object {
  var buttons: js.UndefOr[js.Array[ModalButtonDescriptor]] = js.undefined
  var chrome: js.UndefOr[scala.Boolean] = js.undefined
  var constrainTitleWidth: js.UndefOr[scala.Boolean] = js.undefined
  var el: stdLib.HTMLElement
  var showCloseButton: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object ModalOptions {
  @scala.inline
  def apply(
    el: stdLib.HTMLElement,
    buttons: js.Array[ModalButtonDescriptor] = null,
    chrome: js.UndefOr[scala.Boolean] = js.undefined,
    constrainTitleWidth: js.UndefOr[scala.Boolean] = js.undefined,
    showCloseButton: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null
  ): ModalOptions = {
    val __obj = js.Dynamic.literal(el = el)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (!js.isUndefined(chrome)) __obj.updateDynamic("chrome")(chrome)
    if (!js.isUndefined(constrainTitleWidth)) __obj.updateDynamic("constrainTitleWidth")(constrainTitleWidth)
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ModalOptions]
  }
}

