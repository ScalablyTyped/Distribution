package typings.jsnlog.jsnlogMod.JL

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSNLogAjaxAppenderOptions extends JSNLogAppenderOptions {
  var beforeSend: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* json */ js.Any, Unit]] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object JSNLogAjaxAppenderOptions {
  @scala.inline
  def apply(
    batchSize: Int | Double = null,
    batchTimeout: Int | Double = null,
    beforeSend: (/* xhr */ XMLHttpRequest, /* json */ js.Any) => Unit = null,
    bufferSize: Int | Double = null,
    disallow: String = null,
    ipRegex: String = null,
    level: Int | Double = null,
    maxBatchSize: Int | Double = null,
    sendTimeout: Int | Double = null,
    sendWithBufferLevel: Int | Double = null,
    storeInBufferLevel: Int | Double = null,
    url: String = null,
    userAgentRegex: String = null
  ): JSNLogAjaxAppenderOptions = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (batchTimeout != null) __obj.updateDynamic("batchTimeout")(batchTimeout.asInstanceOf[js.Any])
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(js.Any.fromFunction2(beforeSend))
    if (bufferSize != null) __obj.updateDynamic("bufferSize")(bufferSize.asInstanceOf[js.Any])
    if (disallow != null) __obj.updateDynamic("disallow")(disallow.asInstanceOf[js.Any])
    if (ipRegex != null) __obj.updateDynamic("ipRegex")(ipRegex.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (maxBatchSize != null) __obj.updateDynamic("maxBatchSize")(maxBatchSize.asInstanceOf[js.Any])
    if (sendTimeout != null) __obj.updateDynamic("sendTimeout")(sendTimeout.asInstanceOf[js.Any])
    if (sendWithBufferLevel != null) __obj.updateDynamic("sendWithBufferLevel")(sendWithBufferLevel.asInstanceOf[js.Any])
    if (storeInBufferLevel != null) __obj.updateDynamic("storeInBufferLevel")(storeInBufferLevel.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (userAgentRegex != null) __obj.updateDynamic("userAgentRegex")(userAgentRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSNLogAjaxAppenderOptions]
  }
}

