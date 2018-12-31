package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentScriptContentScriptFileContentScriptWhen extends js.Object {
  var attachTo: js.UndefOr[
    jpmLib.pageDashModMod.attachmentMode | js.Array[jpmLib.pageDashModMod.attachmentMode]
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

