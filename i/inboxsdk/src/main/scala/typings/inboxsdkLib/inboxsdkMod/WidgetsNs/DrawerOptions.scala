package typings
package inboxsdkLib.inboxsdkMod.WidgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerOptions extends js.Object {
  var chrome: js.UndefOr[scala.Boolean] = js.undefined
  var closeWithCompose: js.UndefOr[scala.Boolean] = js.undefined
  var composeView: js.UndefOr[inboxsdkLib.inboxsdkMod.ComposeNs.ComposeView] = js.undefined
  var el: stdLib.HTMLElement
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object DrawerOptions {
  @scala.inline
  def apply(
    el: stdLib.HTMLElement,
    chrome: js.UndefOr[scala.Boolean] = js.undefined,
    closeWithCompose: js.UndefOr[scala.Boolean] = js.undefined,
    composeView: inboxsdkLib.inboxsdkMod.ComposeNs.ComposeView = null,
    title: java.lang.String = null
  ): DrawerOptions = {
    val __obj = js.Dynamic.literal(el = el)
    if (!js.isUndefined(chrome)) __obj.updateDynamic("chrome")(chrome)
    if (!js.isUndefined(closeWithCompose)) __obj.updateDynamic("closeWithCompose")(closeWithCompose)
    if (composeView != null) __obj.updateDynamic("composeView")(composeView)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[DrawerOptions]
  }
}

