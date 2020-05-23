package typings.log4js.mod

import typings.log4js.anon.Worker
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggingEvent extends js.Object {
  var categoryName: String
  var cluster: js.UndefOr[Worker] = js.undefined
  var context: js.Any
  	// level of message
  var data: js.Array[_]
  	// name of category
  var level: Level
  var pid: Double
  	// objects to log
  var startTime: Date
}

object LoggingEvent {
  @scala.inline
  def apply(
    categoryName: String,
    context: js.Any,
    data: js.Array[_],
    level: Level,
    pid: Double,
    startTime: Date,
    cluster: Worker = null
  ): LoggingEvent = {
    val __obj = js.Dynamic.literal(categoryName = categoryName.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    if (cluster != null) __obj.updateDynamic("cluster")(cluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingEvent]
  }
}

