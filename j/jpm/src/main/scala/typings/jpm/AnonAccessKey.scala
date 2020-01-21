package typings.jpm

import typings.jpm.contextMenuMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccessKey extends js.Object {
  var accessKey: js.UndefOr[String] = js.undefined
  var contentScript: js.UndefOr[String] = js.undefined
  var contentScriptFile: js.UndefOr[String] = js.undefined
  var context: js.UndefOr[Context | js.Array[Context]] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var image: js.UndefOr[String] = js.undefined
  var label: String
  var onMessage: js.UndefOr[js.Function1[/* message */ js.UndefOr[js.Any], _]] = js.undefined
}

object AnonAccessKey {
  @scala.inline
  def apply(
    label: String,
    accessKey: String = null,
    contentScript: String = null,
    contentScriptFile: String = null,
    context: Context | js.Array[Context] = null,
    data: js.Any = null,
    image: String = null,
    onMessage: /* message */ js.UndefOr[js.Any] => _ = null
  ): AnonAccessKey = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (contentScript != null) __obj.updateDynamic("contentScript")(contentScript.asInstanceOf[js.Any])
    if (contentScriptFile != null) __obj.updateDynamic("contentScriptFile")(contentScriptFile.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (onMessage != null) __obj.updateDynamic("onMessage")(js.Any.fromFunction1(onMessage))
    __obj.asInstanceOf[AnonAccessKey]
  }
}

