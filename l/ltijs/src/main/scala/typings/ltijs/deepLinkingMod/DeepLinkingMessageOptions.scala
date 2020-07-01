package typings.ltijs.deepLinkingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeepLinkingMessageOptions extends js.Object {
  var errlog: js.UndefOr[String] = js.undefined
  var errmessage: js.UndefOr[String] = js.undefined
  var log: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
}

object DeepLinkingMessageOptions {
  @scala.inline
  def apply(errlog: String = null, errmessage: String = null, log: String = null, message: String = null): DeepLinkingMessageOptions = {
    val __obj = js.Dynamic.literal()
    if (errlog != null) __obj.updateDynamic("errlog")(errlog.asInstanceOf[js.Any])
    if (errmessage != null) __obj.updateDynamic("errmessage")(errmessage.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepLinkingMessageOptions]
  }
}

