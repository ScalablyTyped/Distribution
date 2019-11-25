package typings.markdownDashPdf.markdownDashPdfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.markdownDashPdf.markdownDashPdfStrings.portait
  - typings.markdownDashPdf.markdownDashPdfStrings.landscape
*/
trait PaperOrientation extends js.Object

object PaperOrientation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def landscape: typings.markdownDashPdf.markdownDashPdfStrings.landscape = this.cast("landscape")
  @scala.inline
  def portait: typings.markdownDashPdf.markdownDashPdfStrings.portait = this.cast("portait")
}

