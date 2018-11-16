package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_ContentScriptOnShow extends js.Object {
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
  var position: js.UndefOr[jpmLib.panelMod.PanelPosition] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

