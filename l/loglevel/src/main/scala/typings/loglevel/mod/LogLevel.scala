package typings.loglevel.mod

import typings.loglevel.loglevelNumbers.`0`
import typings.loglevel.loglevelNumbers.`1`
import typings.loglevel.loglevelNumbers.`2`
import typings.loglevel.loglevelNumbers.`3`
import typings.loglevel.loglevelNumbers.`4`
import typings.loglevel.loglevelNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Log levels
  */
@js.native
trait LogLevel extends js.Object {
  var DEBUG: `1` = js.native
  var ERROR: `4` = js.native
  var INFO: `2` = js.native
  var SILENT: `5` = js.native
  var TRACE: `0` = js.native
  var WARN: `3` = js.native
}

object LogLevel {
  @scala.inline
  def apply(DEBUG: `1`, ERROR: `4`, INFO: `2`, SILENT: `5`, TRACE: `0`, WARN: `3`): LogLevel = {
    val __obj = js.Dynamic.literal(DEBUG = DEBUG.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], SILENT = SILENT.asInstanceOf[js.Any], TRACE = TRACE.asInstanceOf[js.Any], WARN = WARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogLevel]
  }
  @scala.inline
  implicit class LogLevelOps[Self <: LogLevel] (val x: Self) extends AnyVal {
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
    def setDEBUG(value: `1`): Self = this.set("DEBUG", value.asInstanceOf[js.Any])
    @scala.inline
    def setERROR(value: `4`): Self = this.set("ERROR", value.asInstanceOf[js.Any])
    @scala.inline
    def setINFO(value: `2`): Self = this.set("INFO", value.asInstanceOf[js.Any])
    @scala.inline
    def setSILENT(value: `5`): Self = this.set("SILENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setTRACE(value: `0`): Self = this.set("TRACE", value.asInstanceOf[js.Any])
    @scala.inline
    def setWARN(value: `3`): Self = this.set("WARN", value.asInstanceOf[js.Any])
  }
  
}

