package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Allow extends js.Object {
  var allow: js.UndefOr[Anon_Script] = js.undefined
  var contentScript: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var contentScriptFile: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var contentScriptOptions: js.UndefOr[js.Any] = js.undefined
  var contentScriptWhen: js.UndefOr[
    jpmLib.jpmLibStrings.start | jpmLib.jpmLibStrings.ready | jpmLib.jpmLibStrings.end
  ] = js.undefined
  var contentURL: js.UndefOr[java.lang.String] = js.undefined
  var include: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | stdLib.RegExp | js.Array[stdLib.RegExp]
  ] = js.undefined
  var onMessage: js.UndefOr[js.Function1[/* message */ java.lang.String, _]] = js.undefined
}

object Anon_Allow {
  @scala.inline
  def apply(
    allow: Anon_Script = null,
    contentScript: java.lang.String | js.Array[java.lang.String] = null,
    contentScriptFile: java.lang.String | js.Array[java.lang.String] = null,
    contentScriptOptions: js.Any = null,
    contentScriptWhen: jpmLib.jpmLibStrings.start | jpmLib.jpmLibStrings.ready | jpmLib.jpmLibStrings.end = null,
    contentURL: java.lang.String = null,
    include: java.lang.String | js.Array[java.lang.String] | stdLib.RegExp | js.Array[stdLib.RegExp] = null,
    onMessage: js.Function1[/* message */ java.lang.String, _] = null
  ): Anon_Allow = {
    val __obj = js.Dynamic.literal()
    if (allow != null) __obj.updateDynamic("allow")(allow)
    if (contentScript != null) __obj.updateDynamic("contentScript")(contentScript.asInstanceOf[js.Any])
    if (contentScriptFile != null) __obj.updateDynamic("contentScriptFile")(contentScriptFile.asInstanceOf[js.Any])
    if (contentScriptOptions != null) __obj.updateDynamic("contentScriptOptions")(contentScriptOptions)
    if (contentScriptWhen != null) __obj.updateDynamic("contentScriptWhen")(contentScriptWhen.asInstanceOf[js.Any])
    if (contentURL != null) __obj.updateDynamic("contentURL")(contentURL)
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (onMessage != null) __obj.updateDynamic("onMessage")(onMessage)
    __obj.asInstanceOf[Anon_Allow]
  }
}

