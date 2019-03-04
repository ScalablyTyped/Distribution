package typings
package loglevelLib.loglevelMod.logNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Log levels
  */
trait LogLevel extends js.Object {
  var DEBUG: loglevelLib.loglevelLibNumbers.`1`
  var ERROR: loglevelLib.loglevelLibNumbers.`4`
  var INFO: loglevelLib.loglevelLibNumbers.`2`
  var SILENT: loglevelLib.loglevelLibNumbers.`5`
  var TRACE: loglevelLib.loglevelLibNumbers.`0`
  var WARN: loglevelLib.loglevelLibNumbers.`3`
}

object LogLevel {
  @scala.inline
  def apply(
    DEBUG: loglevelLib.loglevelLibNumbers.`1`,
    ERROR: loglevelLib.loglevelLibNumbers.`4`,
    INFO: loglevelLib.loglevelLibNumbers.`2`,
    SILENT: loglevelLib.loglevelLibNumbers.`5`,
    TRACE: loglevelLib.loglevelLibNumbers.`0`,
    WARN: loglevelLib.loglevelLibNumbers.`3`
  ): LogLevel = {
    val __obj = js.Dynamic.literal(DEBUG = DEBUG, ERROR = ERROR, INFO = INFO, SILENT = SILENT, TRACE = TRACE, WARN = WARN)
  
    __obj.asInstanceOf[LogLevel]
  }
}

