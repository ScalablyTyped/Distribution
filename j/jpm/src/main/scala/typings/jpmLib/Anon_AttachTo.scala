package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttachTo extends js.Object {
  var attachTo: js.UndefOr[
    jpmLib.sdkPageDashModMod.attachmentMode | js.Array[jpmLib.sdkPageDashModMod.attachmentMode]
  ] = js.undefined
  var contentScript: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var contentScriptFile: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var contentScriptOptions: js.UndefOr[js.Any] = js.undefined
  var contentScriptWhen: js.UndefOr[
    jpmLib.jpmLibStrings.start | jpmLib.jpmLibStrings.ready | jpmLib.jpmLibStrings.end
  ] = js.undefined
  var contentStyle: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var contentStyleFile: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var exclude: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var include: java.lang.String | js.Array[java.lang.String] | stdLib.RegExp | js.Array[stdLib.RegExp]
  var onAttach: js.UndefOr[js.Function1[/* worker */ jpmLib.FFAddonSDKNs.ContentWorker, _]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ stdLib.Error, _]] = js.undefined
}

object Anon_AttachTo {
  @scala.inline
  def apply(
    include: java.lang.String | js.Array[java.lang.String] | stdLib.RegExp | js.Array[stdLib.RegExp],
    attachTo: jpmLib.sdkPageDashModMod.attachmentMode | js.Array[jpmLib.sdkPageDashModMod.attachmentMode] = null,
    contentScript: java.lang.String | js.Array[java.lang.String] = null,
    contentScriptFile: java.lang.String | js.Array[java.lang.String] = null,
    contentScriptOptions: js.Any = null,
    contentScriptWhen: jpmLib.jpmLibStrings.start | jpmLib.jpmLibStrings.ready | jpmLib.jpmLibStrings.end = null,
    contentStyle: java.lang.String | js.Array[java.lang.String] = null,
    contentStyleFile: java.lang.String | js.Array[java.lang.String] = null,
    exclude: java.lang.String | js.Array[java.lang.String] = null,
    onAttach: js.Function1[/* worker */ jpmLib.FFAddonSDKNs.ContentWorker, _] = null,
    onError: js.Function1[/* error */ stdLib.Error, _] = null
  ): Anon_AttachTo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (attachTo != null) __obj.updateDynamic("attachTo")(attachTo.asInstanceOf[js.Any])
    if (contentScript != null) __obj.updateDynamic("contentScript")(contentScript.asInstanceOf[js.Any])
    if (contentScriptFile != null) __obj.updateDynamic("contentScriptFile")(contentScriptFile.asInstanceOf[js.Any])
    if (contentScriptOptions != null) __obj.updateDynamic("contentScriptOptions")(contentScriptOptions)
    if (contentScriptWhen != null) __obj.updateDynamic("contentScriptWhen")(contentScriptWhen.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (contentStyleFile != null) __obj.updateDynamic("contentStyleFile")(contentStyleFile.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (onAttach != null) __obj.updateDynamic("onAttach")(onAttach)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    __obj.asInstanceOf[Anon_AttachTo]
  }
}

