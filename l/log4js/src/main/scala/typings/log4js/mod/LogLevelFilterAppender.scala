package typings.log4js.mod

import typings.log4js.log4jsStrings.logLevelFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogLevelFilterAppender extends Appender {
  // the name of an appender, defined in the same configuration, that you want to filter
  var appender: String = js.native
  // the minimum level of event to allow through the filter
  var level: String = js.native
  // (defaults to FATAL) - the maximum level of event to allow through the filter
  var maxLevel: js.UndefOr[String] = js.native
  var `type`: logLevelFilter = js.native
}

object LogLevelFilterAppender {
  @scala.inline
  def apply(appender: String, level: String, `type`: logLevelFilter): LogLevelFilterAppender = {
    val __obj = js.Dynamic.literal(appender = appender.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogLevelFilterAppender]
  }
  @scala.inline
  implicit class LogLevelFilterAppenderOps[Self <: LogLevelFilterAppender] (val x: Self) extends AnyVal {
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
    def setAppender(value: String): Self = this.set("appender", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: logLevelFilter): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxLevel(value: String): Self = this.set("maxLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLevel: Self = this.set("maxLevel", js.undefined)
  }
  
}

