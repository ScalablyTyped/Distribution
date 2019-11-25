package typings.jsnlog.jsnlogMod.JL

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSNLogOptions extends js.Object {
  var clientIP: js.UndefOr[String] = js.undefined
  var defaultAjaxUrl: js.UndefOr[String] = js.undefined
  var defaultBeforeSend: js.UndefOr[js.Function1[/* xhr */ XMLHttpRequest, Unit]] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var maxMessages: js.UndefOr[Double] = js.undefined
  var requestId: js.UndefOr[String] = js.undefined
  var serialize: js.UndefOr[js.Function1[/* object */ js.Any, String]] = js.undefined
}

object JSNLogOptions {
  @scala.inline
  def apply(
    clientIP: String = null,
    defaultAjaxUrl: String = null,
    defaultBeforeSend: /* xhr */ XMLHttpRequest => Unit = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    maxMessages: Int | Double = null,
    requestId: String = null,
    serialize: /* object */ js.Any => String = null
  ): JSNLogOptions = {
    val __obj = js.Dynamic.literal()
    if (clientIP != null) __obj.updateDynamic("clientIP")(clientIP.asInstanceOf[js.Any])
    if (defaultAjaxUrl != null) __obj.updateDynamic("defaultAjaxUrl")(defaultAjaxUrl.asInstanceOf[js.Any])
    if (defaultBeforeSend != null) __obj.updateDynamic("defaultBeforeSend")(js.Any.fromFunction1(defaultBeforeSend))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (maxMessages != null) __obj.updateDynamic("maxMessages")(maxMessages.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    if (serialize != null) __obj.updateDynamic("serialize")(js.Any.fromFunction1(serialize))
    __obj.asInstanceOf[JSNLogOptions]
  }
}

