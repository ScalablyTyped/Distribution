package typings.loglevel.mod

import typings.loglevel.loglevelStrings.debug_
import typings.loglevel.loglevelStrings.error_
import typings.loglevel.loglevelStrings.info_
import typings.loglevel.loglevelStrings.silent_
import typings.loglevel.loglevelStrings.trace_
import typings.loglevel.loglevelStrings.warn_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Possible log level descriptors, may be string, lower or upper case, or number.
  */
/* Inlined loglevel.loglevel.LogLevelNumbers | 'trace' | 'debug' | 'info' | 'warn' | 'error' | 'silent' | keyof loglevel.loglevel.LogLevel */
/* Rewritten from type alias, can be one of: 
  - typings.loglevel.loglevelNumbers.`4`
  - typings.loglevel.loglevelNumbers.`3`
  - typings.loglevel.loglevelNumbers.`0`
  - typings.loglevel.loglevelNumbers.`5`
  - typings.loglevel.loglevelNumbers.`1`
  - typings.loglevel.loglevelNumbers.`2`
  - typings.loglevel.loglevelStrings.DEBUG
  - typings.loglevel.loglevelStrings.error_
  - typings.loglevel.loglevelStrings.INFO
  - typings.loglevel.loglevelStrings.TRACE
  - typings.loglevel.loglevelStrings.info_
  - typings.loglevel.loglevelStrings.warn_
  - typings.loglevel.loglevelStrings.trace_
  - typings.loglevel.loglevelStrings.debug_
  - typings.loglevel.loglevelStrings.ERROR
  - typings.loglevel.loglevelStrings.SILENT
  - typings.loglevel.loglevelStrings.WARN
  - typings.loglevel.loglevelStrings.silent_
*/
trait LogLevelDesc extends js.Object

object LogLevelDesc {
  @scala.inline
  def `0`: typings.loglevel.loglevelNumbers.`0` = this.cast(0)
  @scala.inline
  def `1`: typings.loglevel.loglevelNumbers.`1` = this.cast(1)
  @scala.inline
  def `2`: typings.loglevel.loglevelNumbers.`2` = this.cast(2)
  @scala.inline
  def `3`: typings.loglevel.loglevelNumbers.`3` = this.cast(3)
  @scala.inline
  def `4`: typings.loglevel.loglevelNumbers.`4` = this.cast(4)
  @scala.inline
  def `5`: typings.loglevel.loglevelNumbers.`5` = this.cast(5)
  @scala.inline
  def DEBUG: typings.loglevel.loglevelStrings.DEBUG = this.cast("DEBUG")
  @scala.inline
  def ERROR: typings.loglevel.loglevelStrings.ERROR = this.cast("ERROR")
  @scala.inline
  def INFO: typings.loglevel.loglevelStrings.INFO = this.cast("INFO")
  @scala.inline
  def SILENT: typings.loglevel.loglevelStrings.SILENT = this.cast("SILENT")
  @scala.inline
  def TRACE: typings.loglevel.loglevelStrings.TRACE = this.cast("TRACE")
  @scala.inline
  def WARN: typings.loglevel.loglevelStrings.WARN = this.cast("WARN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: debug_ = this.cast("debug")
  @scala.inline
  def error: error_ = this.cast("error")
  @scala.inline
  def info: info_ = this.cast("info")
  @scala.inline
  def silent: silent_ = this.cast("silent")
  @scala.inline
  def trace: trace_ = this.cast("trace")
  @scala.inline
  def warn: warn_ = this.cast("warn")
}

