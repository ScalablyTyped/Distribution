package typings.graylog2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.graylog2.graylog2Strings.log
  - typings.graylog2.graylog2Strings.emergency
  - typings.graylog2.graylog2Strings.alert
  - typings.graylog2.graylog2Strings.critical
  - typings.graylog2.graylog2Strings.error
  - typings.graylog2.graylog2Strings.warning
  - typings.graylog2.graylog2Strings.warn
  - typings.graylog2.graylog2Strings.notice
  - typings.graylog2.graylog2Strings.info
  - typings.graylog2.graylog2Strings.debug
*/
trait GraylogLogMethod extends js.Object

object GraylogLogMethod {
  @scala.inline
  def alert: typings.graylog2.graylog2Strings.alert = this.cast("alert")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def critical: typings.graylog2.graylog2Strings.critical = this.cast("critical")
  @scala.inline
  def debug: typings.graylog2.graylog2Strings.debug = this.cast("debug")
  @scala.inline
  def emergency: typings.graylog2.graylog2Strings.emergency = this.cast("emergency")
  @scala.inline
  def error: typings.graylog2.graylog2Strings.error = this.cast("error")
  @scala.inline
  def info: typings.graylog2.graylog2Strings.info = this.cast("info")
  @scala.inline
  def log: typings.graylog2.graylog2Strings.log = this.cast("log")
  @scala.inline
  def notice: typings.graylog2.graylog2Strings.notice = this.cast("notice")
  @scala.inline
  def warn: typings.graylog2.graylog2Strings.warn = this.cast("warn")
  @scala.inline
  def warning: typings.graylog2.graylog2Strings.warning = this.cast("warning")
}

