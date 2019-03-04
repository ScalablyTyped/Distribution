package typings
package log4jsLib.log4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoLogFilterAppender extends Appender {
  // the name of an appender, defined in the same configuration, that you want to filter.
  var appender: java.lang.String
  // the regular expression (or the regular expressions if you provide an array of values)
  // will be used for evaluating the events to pass to the appender. 
  // The events, which will match the regular expression, will be excluded and so not logged. 
  var exclude: java.lang.String | js.Array[java.lang.String]
  var `type`: log4jsLib.log4jsLibStrings.noLogFilter
}

object NoLogFilterAppender {
  @scala.inline
  def apply(
    appender: java.lang.String,
    exclude: java.lang.String | js.Array[java.lang.String],
    `type`: log4jsLib.log4jsLibStrings.noLogFilter
  ): NoLogFilterAppender = {
    val __obj = js.Dynamic.literal(appender = appender, exclude = exclude.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NoLogFilterAppender]
  }
}

