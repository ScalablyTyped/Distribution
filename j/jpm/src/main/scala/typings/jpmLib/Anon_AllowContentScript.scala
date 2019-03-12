package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowContentScript extends js.Object {
  var allow: js.UndefOr[Anon_ScriptBoolean] = js.undefined
  var contentScript: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var contentScriptFile: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var contentScriptOptions: js.UndefOr[js.Any] = js.undefined
  var contentScriptWhen: js.UndefOr[
    jpmLib.jpmLibStrings.start | jpmLib.jpmLibStrings.ready | jpmLib.jpmLibStrings.end
  ] = js.undefined
  var contentStyle: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var contentStyleFile: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var contentURL: js.UndefOr[java.lang.String | stdLib.URL] = js.undefined
  var contextMenu: js.UndefOr[scala.Boolean] = js.undefined
  var focus: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ stdLib.Error, _]] = js.undefined
  var onHide: js.UndefOr[js.Function0[_]] = js.undefined
  var onMessage: js.UndefOr[js.Function1[/* message */ java.lang.String, _]] = js.undefined
  var onShow: js.UndefOr[js.Function0[_]] = js.undefined
  var position: js.UndefOr[jpmLib.sdkPanelMod.PanelPosition] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AllowContentScript {
  @scala.inline
  def apply(
    allow: Anon_ScriptBoolean = null,
    contentScript: java.lang.String | js.Array[java.lang.String] = null,
    contentScriptFile: java.lang.String | js.Array[java.lang.String] = null,
    contentScriptOptions: js.Any = null,
    contentScriptWhen: jpmLib.jpmLibStrings.start | jpmLib.jpmLibStrings.ready | jpmLib.jpmLibStrings.end = null,
    contentStyle: java.lang.String | js.Array[java.lang.String] = null,
    contentStyleFile: java.lang.String | js.Array[java.lang.String] = null,
    contentURL: java.lang.String | stdLib.URL = null,
    contextMenu: js.UndefOr[scala.Boolean] = js.undefined,
    focus: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    onError: /* error */ stdLib.Error => _ = null,
    onHide: () => _ = null,
    onMessage: /* message */ java.lang.String => _ = null,
    onShow: () => _ = null,
    position: jpmLib.sdkPanelMod.PanelPosition = null,
    width: scala.Int | scala.Double = null
  ): Anon_AllowContentScript = {
    val __obj = js.Dynamic.literal()
    if (allow != null) __obj.updateDynamic("allow")(allow)
    if (contentScript != null) __obj.updateDynamic("contentScript")(contentScript.asInstanceOf[js.Any])
    if (contentScriptFile != null) __obj.updateDynamic("contentScriptFile")(contentScriptFile.asInstanceOf[js.Any])
    if (contentScriptOptions != null) __obj.updateDynamic("contentScriptOptions")(contentScriptOptions)
    if (contentScriptWhen != null) __obj.updateDynamic("contentScriptWhen")(contentScriptWhen.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (contentStyleFile != null) __obj.updateDynamic("contentStyleFile")(contentStyleFile.asInstanceOf[js.Any])
    if (contentURL != null) __obj.updateDynamic("contentURL")(contentURL.asInstanceOf[js.Any])
    if (!js.isUndefined(contextMenu)) __obj.updateDynamic("contextMenu")(contextMenu)
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction0(onHide))
    if (onMessage != null) __obj.updateDynamic("onMessage")(js.Any.fromFunction1(onMessage))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (position != null) __obj.updateDynamic("position")(position)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllowContentScript]
  }
}

