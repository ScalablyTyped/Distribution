package typings.jpm

import typings.jpm.FFAddonSDK.BrowserWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsPrivate extends js.Object {
  var isPrivate: js.UndefOr[Boolean] = js.undefined
  var onActivate: js.UndefOr[js.Function1[/* window */ BrowserWindow, _]] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* window */ BrowserWindow, _]] = js.undefined
  var onDeactivate: js.UndefOr[js.Function1[/* window */ BrowserWindow, _]] = js.undefined
  var onOpen: js.UndefOr[js.Function1[/* window */ BrowserWindow, _]] = js.undefined
  var url: String
}

object AnonIsPrivate {
  @scala.inline
  def apply(
    url: String,
    isPrivate: js.UndefOr[Boolean] = js.undefined,
    onActivate: /* window */ BrowserWindow => _ = null,
    onClose: /* window */ BrowserWindow => _ = null,
    onDeactivate: /* window */ BrowserWindow => _ = null,
    onOpen: /* window */ BrowserWindow => _ = null
  ): AnonIsPrivate = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(isPrivate)) __obj.updateDynamic("isPrivate")(isPrivate.asInstanceOf[js.Any])
    if (onActivate != null) __obj.updateDynamic("onActivate")(js.Any.fromFunction1(onActivate))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onDeactivate != null) __obj.updateDynamic("onDeactivate")(js.Any.fromFunction1(onDeactivate))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1(onOpen))
    __obj.asInstanceOf[AnonIsPrivate]
  }
}

