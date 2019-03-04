package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessKey extends js.Object {
  var accessKey: js.UndefOr[java.lang.String] = js.undefined
  var contentScript: js.UndefOr[java.lang.String] = js.undefined
  var contentScriptFile: js.UndefOr[java.lang.String] = js.undefined
  var context: js.UndefOr[
    jpmLib.sdkContextDashMenuMod.Context | js.Array[jpmLib.sdkContextDashMenuMod.Context]
  ] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var image: js.UndefOr[java.lang.String] = js.undefined
  var label: java.lang.String
  var onMessage: js.UndefOr[js.Function1[/* message */ js.UndefOr[js.Any], _]] = js.undefined
}

object Anon_AccessKey {
  @scala.inline
  def apply(
    label: java.lang.String,
    accessKey: java.lang.String = null,
    contentScript: java.lang.String = null,
    contentScriptFile: java.lang.String = null,
    context: jpmLib.sdkContextDashMenuMod.Context | js.Array[jpmLib.sdkContextDashMenuMod.Context] = null,
    data: js.Any = null,
    image: java.lang.String = null,
    onMessage: js.Function1[/* message */ js.UndefOr[js.Any], _] = null
  ): Anon_AccessKey = {
    val __obj = js.Dynamic.literal(label = label)
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey)
    if (contentScript != null) __obj.updateDynamic("contentScript")(contentScript)
    if (contentScriptFile != null) __obj.updateDynamic("contentScriptFile")(contentScriptFile)
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (image != null) __obj.updateDynamic("image")(image)
    if (onMessage != null) __obj.updateDynamic("onMessage")(onMessage)
    __obj.asInstanceOf[Anon_AccessKey]
  }
}

