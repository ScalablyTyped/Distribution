package typings.markdownPdf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.markdownPdf.markdownPdfStrings.portait
  - typings.markdownPdf.markdownPdfStrings.landscape
*/
trait PaperOrientation extends js.Object

object PaperOrientation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def landscape: typings.markdownPdf.markdownPdfStrings.landscape = this.cast("landscape")
  @scala.inline
  def portait: typings.markdownPdf.markdownPdfStrings.portait = this.cast("portait")
}

