package typings.karmaMochaReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.karmaMochaReporter.karmaMochaReporterStrings.full
  - typings.karmaMochaReporter.karmaMochaReporterStrings.autowatch
  - typings.karmaMochaReporter.karmaMochaReporterStrings.minimal
  - typings.karmaMochaReporter.karmaMochaReporterStrings.noFailures
*/
trait OutputOptions extends js.Object

object OutputOptions {
  @scala.inline
  def autowatch: typings.karmaMochaReporter.karmaMochaReporterStrings.autowatch = this.cast("autowatch")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def full: typings.karmaMochaReporter.karmaMochaReporterStrings.full = this.cast("full")
  @scala.inline
  def minimal: typings.karmaMochaReporter.karmaMochaReporterStrings.minimal = this.cast("minimal")
  @scala.inline
  def noFailures: typings.karmaMochaReporter.karmaMochaReporterStrings.noFailures = this.cast("noFailures")
}

