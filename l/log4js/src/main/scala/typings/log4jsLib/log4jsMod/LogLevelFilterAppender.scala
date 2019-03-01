package typings
package log4jsLib.log4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogLevelFilterAppender extends Appender {
  // the name of an appender, defined in the same configuration, that you want to filter
  var appender: java.lang.String
  // the minimum level of event to allow through the filter
  var level: java.lang.String
  // (defaults to FATAL) - the maximum level of event to allow through the filter
  var maxLevel: js.UndefOr[java.lang.String] = js.undefined
  var `type`: log4jsLib.log4jsLibStrings.logLevelFilter
}

object LogLevelFilterAppender {
  @scala.inline
  def apply(
    appender: java.lang.String,
    level: java.lang.String,
    `type`: log4jsLib.log4jsLibStrings.logLevelFilter,
    maxLevel: java.lang.String = null
  ): LogLevelFilterAppender = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("appender")(appender)
    __obj.updateDynamic("level")(level)
    if (maxLevel != null) __obj.updateDynamic("maxLevel")(maxLevel)
    __obj.asInstanceOf[LogLevelFilterAppender]
  }
}

