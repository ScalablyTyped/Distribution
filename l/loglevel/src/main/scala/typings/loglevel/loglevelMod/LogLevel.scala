package typings.loglevel.loglevelMod

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
trait LogLevel extends js.Object {
  var DEBUG: `1`
  var ERROR: `4`
  var INFO: `2`
  var SILENT: `5`
  var TRACE: `0`
  var WARN: `3`
}

object LogLevel {
  @scala.inline
  def apply(DEBUG: `1`, ERROR: `4`, INFO: `2`, SILENT: `5`, TRACE: `0`, WARN: `3`): LogLevel = {
    val __obj = js.Dynamic.literal(DEBUG = DEBUG.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], SILENT = SILENT.asInstanceOf[js.Any], TRACE = TRACE.asInstanceOf[js.Any], WARN = WARN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LogLevel]
  }
}

