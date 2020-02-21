package typings.istanbulLibReport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.istanbulLibReport.istanbulLibReportStrings.flat
  - typings.istanbulLibReport.istanbulLibReportStrings.nested
  - typings.istanbulLibReport.istanbulLibReportStrings.pkg
  - typings.istanbulLibReport.istanbulLibReportStrings.defaultSummarizer
*/
trait Summarizers extends js.Object

object Summarizers {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def defaultSummarizer: typings.istanbulLibReport.istanbulLibReportStrings.defaultSummarizer = this.cast("defaultSummarizer")
  @scala.inline
  def flat: typings.istanbulLibReport.istanbulLibReportStrings.flat = this.cast("flat")
  @scala.inline
  def nested: typings.istanbulLibReport.istanbulLibReportStrings.nested = this.cast("nested")
  @scala.inline
  def pkg: typings.istanbulLibReport.istanbulLibReportStrings.pkg = this.cast("pkg")
}

