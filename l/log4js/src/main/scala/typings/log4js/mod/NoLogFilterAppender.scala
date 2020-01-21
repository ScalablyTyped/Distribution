package typings.log4js.mod

import typings.log4js.log4jsStrings.noLogFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoLogFilterAppender extends Appender {
  // the name of an appender, defined in the same configuration, that you want to filter.
  var appender: String
  // the regular expression (or the regular expressions if you provide an array of values)
  // will be used for evaluating the events to pass to the appender.
  // The events, which will match the regular expression, will be excluded and so not logged.
  var exclude: String | js.Array[String]
  var `type`: noLogFilter
}

object NoLogFilterAppender {
  @scala.inline
  def apply(appender: String, exclude: String | js.Array[String], `type`: noLogFilter): NoLogFilterAppender = {
    val __obj = js.Dynamic.literal(appender = appender.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoLogFilterAppender]
  }
}

