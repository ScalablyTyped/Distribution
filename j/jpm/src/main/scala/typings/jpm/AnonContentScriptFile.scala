package typings.jpm

import typings.jpm.jpmStrings.end
import typings.jpm.jpmStrings.ready
import typings.jpm.jpmStrings.start
import typings.jpm.panelMod.PanelPosition
import typings.std.Error
import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentScriptFile extends js.Object {
  var allow: js.UndefOr[AnonScriptBoolean] = js.undefined
  var contentScript: js.UndefOr[String | js.Array[String]] = js.undefined
  var contentScriptFile: js.UndefOr[String | js.Array[String]] = js.undefined
  var contentScriptOptions: js.UndefOr[js.Any] = js.undefined
  var contentScriptWhen: js.UndefOr[start | ready | end] = js.undefined
  var contentStyle: js.UndefOr[String | js.Array[String]] = js.undefined
  var contentStyleFile: js.UndefOr[String | js.Array[String]] = js.undefined
  var contentURL: js.UndefOr[String | URL] = js.undefined
  var contextMenu: js.UndefOr[Boolean] = js.undefined
  var focus: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ Error, _]] = js.undefined
  var onHide: js.UndefOr[js.Function0[_]] = js.undefined
  var onMessage: js.UndefOr[js.Function1[/* message */ String, _]] = js.undefined
  var onShow: js.UndefOr[js.Function0[_]] = js.undefined
  var position: js.UndefOr[PanelPosition] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonContentScriptFile {
  @scala.inline
  def apply(
    allow: AnonScriptBoolean = null,
    contentScript: String | js.Array[String] = null,
    contentScriptFile: String | js.Array[String] = null,
    contentScriptOptions: js.Any = null,
    contentScriptWhen: start | ready | end = null,
    contentStyle: String | js.Array[String] = null,
    contentStyleFile: String | js.Array[String] = null,
    contentURL: String | URL = null,
    contextMenu: js.UndefOr[Boolean] = js.undefined,
    focus: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    onError: /* error */ Error => _ = null,
    onHide: () => _ = null,
    onMessage: /* message */ String => _ = null,
    onShow: () => _ = null,
    position: PanelPosition = null,
    width: Int | Double = null
  ): AnonContentScriptFile = {
    val __obj = js.Dynamic.literal()
    if (allow != null) __obj.updateDynamic("allow")(allow.asInstanceOf[js.Any])
    if (contentScript != null) __obj.updateDynamic("contentScript")(contentScript.asInstanceOf[js.Any])
    if (contentScriptFile != null) __obj.updateDynamic("contentScriptFile")(contentScriptFile.asInstanceOf[js.Any])
    if (contentScriptOptions != null) __obj.updateDynamic("contentScriptOptions")(contentScriptOptions.asInstanceOf[js.Any])
    if (contentScriptWhen != null) __obj.updateDynamic("contentScriptWhen")(contentScriptWhen.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (contentStyleFile != null) __obj.updateDynamic("contentStyleFile")(contentStyleFile.asInstanceOf[js.Any])
    if (contentURL != null) __obj.updateDynamic("contentURL")(contentURL.asInstanceOf[js.Any])
    if (!js.isUndefined(contextMenu)) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction0(onHide))
    if (onMessage != null) __obj.updateDynamic("onMessage")(js.Any.fromFunction1(onMessage))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContentScriptFile]
  }
}

