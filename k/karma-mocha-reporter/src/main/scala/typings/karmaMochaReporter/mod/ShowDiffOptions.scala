package typings.karmaMochaReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.karmaMochaReporter.karmaMochaReporterBooleans.`true`
  - typings.karmaMochaReporter.karmaMochaReporterStrings.unified
  - typings.karmaMochaReporter.karmaMochaReporterStrings.`inline`
*/
trait ShowDiffOptions extends js.Object

object ShowDiffOptions {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `inline`: typings.karmaMochaReporter.karmaMochaReporterStrings.`inline` = this.cast("inline")
  @scala.inline
  def `true`: typings.karmaMochaReporter.karmaMochaReporterBooleans.`true` = this.cast(true)
  @scala.inline
  def unified: typings.karmaMochaReporter.karmaMochaReporterStrings.unified = this.cast("unified")
}

