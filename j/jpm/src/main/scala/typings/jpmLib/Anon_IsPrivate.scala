package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsPrivate extends js.Object {
  var isPrivate: js.UndefOr[scala.Boolean] = js.undefined
  var onActivate: js.UndefOr[js.Function1[/* window */ jpmLib.FFAddonSDKNs.BrowserWindow, _]] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* window */ jpmLib.FFAddonSDKNs.BrowserWindow, _]] = js.undefined
  var onDeactivate: js.UndefOr[js.Function1[/* window */ jpmLib.FFAddonSDKNs.BrowserWindow, _]] = js.undefined
  var onOpen: js.UndefOr[js.Function1[/* window */ jpmLib.FFAddonSDKNs.BrowserWindow, _]] = js.undefined
  var url: java.lang.String
}

object Anon_IsPrivate {
  @scala.inline
  def apply(
    url: java.lang.String,
    isPrivate: js.UndefOr[scala.Boolean] = js.undefined,
    onActivate: /* window */ jpmLib.FFAddonSDKNs.BrowserWindow => _ = null,
    onClose: /* window */ jpmLib.FFAddonSDKNs.BrowserWindow => _ = null,
    onDeactivate: /* window */ jpmLib.FFAddonSDKNs.BrowserWindow => _ = null,
    onOpen: /* window */ jpmLib.FFAddonSDKNs.BrowserWindow => _ = null
  ): Anon_IsPrivate = {
    val __obj = js.Dynamic.literal(url = url)
    if (!js.isUndefined(isPrivate)) __obj.updateDynamic("isPrivate")(isPrivate)
    if (onActivate != null) __obj.updateDynamic("onActivate")(js.Any.fromFunction1(onActivate))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onDeactivate != null) __obj.updateDynamic("onDeactivate")(js.Any.fromFunction1(onDeactivate))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1(onOpen))
    __obj.asInstanceOf[Anon_IsPrivate]
  }
}

