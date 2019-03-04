package typings
package log4jsLib.log4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggingEvent extends js.Object {
  var categoryName: java.lang.String
  var cluster: js.UndefOr[log4jsLib.Anon_Worker] = js.undefined
  var context: js.Any
  	// level of message
  var data: js.Array[_]
  	// name of category
  var level: Level
  var pid: scala.Double
  	// objects to log
  var startTime: stdLib.Date
}

object LoggingEvent {
  @scala.inline
  def apply(
    categoryName: java.lang.String,
    context: js.Any,
    data: js.Array[_],
    level: Level,
    pid: scala.Double,
    startTime: stdLib.Date,
    cluster: log4jsLib.Anon_Worker = null
  ): LoggingEvent = {
    val __obj = js.Dynamic.literal(categoryName = categoryName, context = context, data = data, level = level, pid = pid, startTime = startTime)
    if (cluster != null) __obj.updateDynamic("cluster")(cluster)
    __obj.asInstanceOf[LoggingEvent]
  }
}

