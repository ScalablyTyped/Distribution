package typings
package log4jsLib.log4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogLevelFilterAppender extends js.Object {
  // the name of an appender, defined in the same configuration, that you want to filter
  var appender: java.lang.String
  // the minimum level of event to allow through the filter
  var level: java.lang.String
  // (defaults to FATAL) - the maximum level of event to allow through the filter
  var maxLevel: js.UndefOr[java.lang.String] = js.undefined
  var `type`: log4jsLib.log4jsLibStrings.logLevelFilter
}

