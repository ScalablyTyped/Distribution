package typings.jpm.anon

import typings.jpm.jpmStrings.end
import typings.jpm.jpmStrings.ready
import typings.jpm.jpmStrings.start
import typings.jpm.panelMod.PanelPosition
import typings.std.Error
import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentScriptFile extends js.Object {
  var allow: js.UndefOr[ScriptBoolean] = js.undefined
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

object ContentScriptFile {
  @scala.inline
  def apply(
    allow: ScriptBoolean = null,
    contentScript: String | js.Array[String] = null,
    contentScriptFile: String | js.Array[String] = null,
    contentScriptOptions: js.Any = null,
    contentScriptWhen: start | ready | end = null,
    contentStyle: String | js.Array[String] = null,
    contentStyleFile: String | js.Array[String] = null,
    contentURL: String | URL = null,
    contextMenu: js.UndefOr[Boolean] = js.undefined,
    focus: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    onError: /* error */ Error => _ = null,
    onHide: () => _ = null,
    onMessage: /* message */ String => _ = null,
    onShow: () => _ = null,
    position: PanelPosition = null,
    width: js.UndefOr[Double] = js.undefined
  ): ContentScriptFile = {
    val __obj = js.Dynamic.literal()
    if (allow != null) __obj.updateDynamic("allow")(allow.asInstanceOf[js.Any])
    if (contentScript != null) __obj.updateDynamic("contentScript")(contentScript.asInstanceOf[js.Any])
    if (contentScriptFile != null) __obj.updateDynamic("contentScriptFile")(contentScriptFile.asInstanceOf[js.Any])
    if (contentScriptOptions != null) __obj.updateDynamic("contentScriptOptions")(contentScriptOptions.asInstanceOf[js.Any])
    if (contentScriptWhen != null) __obj.updateDynamic("contentScriptWhen")(contentScriptWhen.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (contentStyleFile != null) __obj.updateDynamic("contentStyleFile")(contentStyleFile.asInstanceOf[js.Any])
    if (contentURL != null) __obj.updateDynamic("contentURL")(contentURL.asInstanceOf[js.Any])
    if (!js.isUndefined(contextMenu)) __obj.updateDynamic("contextMenu")(contextMenu.get.asInstanceOf[js.Any])
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction0(onHide))
    if (onMessage != null) __obj.updateDynamic("onMessage")(js.Any.fromFunction1(onMessage))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentScriptFile]
  }
}

