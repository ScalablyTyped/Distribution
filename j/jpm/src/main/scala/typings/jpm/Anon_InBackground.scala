package typings.jpm

import typings.jpm.FFAddonSDKNs.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InBackground extends js.Object {
  var inBackground: js.UndefOr[Boolean] = js.undefined
  var inNewWindow: js.UndefOr[Boolean] = js.undefined
  var isPinned: js.UndefOr[Boolean] = js.undefined
  var onActivate: js.UndefOr[js.Function1[/* tab */ Tab, _]] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* tab */ Tab, _]] = js.undefined
  var onDeactivate: js.UndefOr[js.Function1[/* tab */ Tab, _]] = js.undefined
  var onLoad: js.UndefOr[js.Function1[/* tab */ Tab, _]] = js.undefined
  var onOpen: js.UndefOr[js.Function1[/* tab */ Tab, _]] = js.undefined
  var onPageShow: js.UndefOr[js.Function1[/* tab */ Tab, _]] = js.undefined
  var onReady: js.UndefOr[js.Function1[/* tab */ Tab, _]] = js.undefined
  var url: String
}

object Anon_InBackground {
  @scala.inline
  def apply(
    url: String,
    inBackground: js.UndefOr[Boolean] = js.undefined,
    inNewWindow: js.UndefOr[Boolean] = js.undefined,
    isPinned: js.UndefOr[Boolean] = js.undefined,
    onActivate: /* tab */ Tab => _ = null,
    onClose: /* tab */ Tab => _ = null,
    onDeactivate: /* tab */ Tab => _ = null,
    onLoad: /* tab */ Tab => _ = null,
    onOpen: /* tab */ Tab => _ = null,
    onPageShow: /* tab */ Tab => _ = null,
    onReady: /* tab */ Tab => _ = null
  ): Anon_InBackground = {
    val __obj = js.Dynamic.literal(url = url)
    if (!js.isUndefined(inBackground)) __obj.updateDynamic("inBackground")(inBackground)
    if (!js.isUndefined(inNewWindow)) __obj.updateDynamic("inNewWindow")(inNewWindow)
    if (!js.isUndefined(isPinned)) __obj.updateDynamic("isPinned")(isPinned)
    if (onActivate != null) __obj.updateDynamic("onActivate")(js.Any.fromFunction1(onActivate))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onDeactivate != null) __obj.updateDynamic("onDeactivate")(js.Any.fromFunction1(onDeactivate))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1(onOpen))
    if (onPageShow != null) __obj.updateDynamic("onPageShow")(js.Any.fromFunction1(onPageShow))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction1(onReady))
    __obj.asInstanceOf[Anon_InBackground]
  }
}

