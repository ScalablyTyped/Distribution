package typings.log4js.mod

import typings.log4js.anon.Worker
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggingEvent extends js.Object {
  var categoryName: String = js.native
  var cluster: js.UndefOr[Worker] = js.native
  var context: js.Any = js.native
    // level of message
  var data: js.Array[_] = js.native
    // name of category
  var level: Level = js.native
  var pid: Double = js.native
    // objects to log
  var startTime: Date = js.native
}

object LoggingEvent {
  @scala.inline
  def apply(
    categoryName: String,
    context: js.Any,
    data: js.Array[_],
    level: Level,
    pid: Double,
    startTime: Date
  ): LoggingEvent = {
    val __obj = js.Dynamic.literal(categoryName = categoryName.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingEvent]
  }
  @scala.inline
  implicit class LoggingEventOps[Self <: LoggingEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCategoryName(value: String): Self = this.set("categoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevel(value: Level): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setPid(value: Double): Self = this.set("pid", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: Date): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setCluster(value: Worker): Self = this.set("cluster", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCluster: Self = this.set("cluster", js.undefined)
  }
  
}

