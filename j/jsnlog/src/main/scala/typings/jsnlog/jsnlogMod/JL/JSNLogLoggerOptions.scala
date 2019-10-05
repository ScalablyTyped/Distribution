package typings.jsnlog.jsnlogMod.JL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSNLogLoggerOptions extends JSNLogFilterOptions {
  var appenders: js.UndefOr[js.Array[JSNLogAppender]] = js.undefined
  var onceOnly: js.UndefOr[js.Array[String]] = js.undefined
}

object JSNLogLoggerOptions {
  @scala.inline
  def apply(
    appenders: js.Array[JSNLogAppender] = null,
    disallow: String = null,
    ipRegex: String = null,
    level: Int | Double = null,
    onceOnly: js.Array[String] = null,
    userAgentRegex: String = null
  ): JSNLogLoggerOptions = {
    val __obj = js.Dynamic.literal()
    if (appenders != null) __obj.updateDynamic("appenders")(appenders)
    if (disallow != null) __obj.updateDynamic("disallow")(disallow)
    if (ipRegex != null) __obj.updateDynamic("ipRegex")(ipRegex)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (onceOnly != null) __obj.updateDynamic("onceOnly")(onceOnly)
    if (userAgentRegex != null) __obj.updateDynamic("userAgentRegex")(userAgentRegex)
    __obj.asInstanceOf[JSNLogLoggerOptions]
  }
}

