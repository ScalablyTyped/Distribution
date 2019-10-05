package typings.jsnlog.jsnlogMod.JL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Base for all appender options types
trait JSNLogAppenderOptions extends JSNLogFilterOptions {
  var batchSize: js.UndefOr[Double] = js.undefined
  var batchTimeout: js.UndefOr[Double] = js.undefined
  var bufferSize: js.UndefOr[Double] = js.undefined
  var maxBatchSize: js.UndefOr[Double] = js.undefined
  var sendTimeout: js.UndefOr[Double] = js.undefined
  var sendWithBufferLevel: js.UndefOr[Double] = js.undefined
  var storeInBufferLevel: js.UndefOr[Double] = js.undefined
}

object JSNLogAppenderOptions {
  @scala.inline
  def apply(
    batchSize: Int | Double = null,
    batchTimeout: Int | Double = null,
    bufferSize: Int | Double = null,
    disallow: String = null,
    ipRegex: String = null,
    level: Int | Double = null,
    maxBatchSize: Int | Double = null,
    sendTimeout: Int | Double = null,
    sendWithBufferLevel: Int | Double = null,
    storeInBufferLevel: Int | Double = null,
    userAgentRegex: String = null
  ): JSNLogAppenderOptions = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (batchTimeout != null) __obj.updateDynamic("batchTimeout")(batchTimeout.asInstanceOf[js.Any])
    if (bufferSize != null) __obj.updateDynamic("bufferSize")(bufferSize.asInstanceOf[js.Any])
    if (disallow != null) __obj.updateDynamic("disallow")(disallow)
    if (ipRegex != null) __obj.updateDynamic("ipRegex")(ipRegex)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (maxBatchSize != null) __obj.updateDynamic("maxBatchSize")(maxBatchSize.asInstanceOf[js.Any])
    if (sendTimeout != null) __obj.updateDynamic("sendTimeout")(sendTimeout.asInstanceOf[js.Any])
    if (sendWithBufferLevel != null) __obj.updateDynamic("sendWithBufferLevel")(sendWithBufferLevel.asInstanceOf[js.Any])
    if (storeInBufferLevel != null) __obj.updateDynamic("storeInBufferLevel")(storeInBufferLevel.asInstanceOf[js.Any])
    if (userAgentRegex != null) __obj.updateDynamic("userAgentRegex")(userAgentRegex)
    __obj.asInstanceOf[JSNLogAppenderOptions]
  }
}

