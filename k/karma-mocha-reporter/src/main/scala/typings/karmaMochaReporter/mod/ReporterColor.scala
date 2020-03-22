package typings.karmaMochaReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.karmaMochaReporter.karmaMochaReporterStrings.success
  - typings.karmaMochaReporter.karmaMochaReporterStrings.info
  - typings.karmaMochaReporter.karmaMochaReporterStrings.warning
  - typings.karmaMochaReporter.karmaMochaReporterStrings.error
*/
trait ReporterColor extends js.Object

object ReporterColor {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.karmaMochaReporter.karmaMochaReporterStrings.error = this.cast("error")
  @scala.inline
  def info: typings.karmaMochaReporter.karmaMochaReporterStrings.info = this.cast("info")
  @scala.inline
  def success: typings.karmaMochaReporter.karmaMochaReporterStrings.success = this.cast("success")
  @scala.inline
  def warning: typings.karmaMochaReporter.karmaMochaReporterStrings.warning = this.cast("warning")
}

