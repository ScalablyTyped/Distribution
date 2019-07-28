package typings.log4js.log4jsMod

import typings.log4js.log4jsStrings.logLevelFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogLevelFilterAppender extends Appender {
  // the name of an appender, defined in the same configuration, that you want to filter
  var appender: String
  // the minimum level of event to allow through the filter
  var level: String
  // (defaults to FATAL) - the maximum level of event to allow through the filter
  var maxLevel: js.UndefOr[String] = js.undefined
  var `type`: logLevelFilter
}

object LogLevelFilterAppender {
  @scala.inline
  def apply(appender: String, level: String, `type`: logLevelFilter, maxLevel: String = null): LogLevelFilterAppender = {
    val __obj = js.Dynamic.literal(appender = appender, level = level)
    __obj.updateDynamic("type")(`type`)
    if (maxLevel != null) __obj.updateDynamic("maxLevel")(maxLevel)
    __obj.asInstanceOf[LogLevelFilterAppender]
  }
}

