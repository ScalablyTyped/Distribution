package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentScriptContentScriptFile extends js.Object {
  var contentScript: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var contentScriptFile: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var contentScriptOptions: js.UndefOr[js.Object] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ stdLib.Error, _]] = js.undefined
  var onMessage: js.UndefOr[js.Function1[/* message */ java.lang.String, _]] = js.undefined
}

object Anon_ContentScriptContentScriptFile {
  @scala.inline
  def apply(
    contentScript: java.lang.String | js.Array[java.lang.String] = null,
    contentScriptFile: java.lang.String | js.Array[java.lang.String] = null,
    contentScriptOptions: js.Object = null,
    onError: /* error */ stdLib.Error => _ = null,
    onMessage: /* message */ java.lang.String => _ = null
  ): Anon_ContentScriptContentScriptFile = {
    val __obj = js.Dynamic.literal()
    if (contentScript != null) __obj.updateDynamic("contentScript")(contentScript.asInstanceOf[js.Any])
    if (contentScriptFile != null) __obj.updateDynamic("contentScriptFile")(contentScriptFile.asInstanceOf[js.Any])
    if (contentScriptOptions != null) __obj.updateDynamic("contentScriptOptions")(contentScriptOptions)
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onMessage != null) __obj.updateDynamic("onMessage")(js.Any.fromFunction1(onMessage))
    __obj.asInstanceOf[Anon_ContentScriptContentScriptFile]
  }
}

