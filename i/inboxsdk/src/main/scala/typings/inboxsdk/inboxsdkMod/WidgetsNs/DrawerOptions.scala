package typings.inboxsdk.inboxsdkMod.WidgetsNs

import typings.inboxsdk.inboxsdkMod.ComposeNs.ComposeView
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerOptions extends js.Object {
  var chrome: js.UndefOr[Boolean] = js.undefined
  var closeWithCompose: js.UndefOr[Boolean] = js.undefined
  var composeView: js.UndefOr[ComposeView] = js.undefined
  var el: HTMLElement
  var title: js.UndefOr[String] = js.undefined
}

object DrawerOptions {
  @scala.inline
  def apply(
    el: HTMLElement,
    chrome: js.UndefOr[Boolean] = js.undefined,
    closeWithCompose: js.UndefOr[Boolean] = js.undefined,
    composeView: ComposeView = null,
    title: String = null
  ): DrawerOptions = {
    val __obj = js.Dynamic.literal(el = el)
    if (!js.isUndefined(chrome)) __obj.updateDynamic("chrome")(chrome)
    if (!js.isUndefined(closeWithCompose)) __obj.updateDynamic("closeWithCompose")(closeWithCompose)
    if (composeView != null) __obj.updateDynamic("composeView")(composeView)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[DrawerOptions]
  }
}

