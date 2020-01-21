package typings.markdownPdf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.markdownPdf.markdownPdfStrings.A3
  - typings.markdownPdf.markdownPdfStrings.A4
  - typings.markdownPdf.markdownPdfStrings.A5
  - typings.markdownPdf.markdownPdfStrings.Legal
  - typings.markdownPdf.markdownPdfStrings.Letter
  - typings.markdownPdf.markdownPdfStrings.Tabloid
*/
trait PaperFormat extends js.Object

object PaperFormat {
  @scala.inline
  def A3: typings.markdownPdf.markdownPdfStrings.A3 = this.cast("A3")
  @scala.inline
  def A4: typings.markdownPdf.markdownPdfStrings.A4 = this.cast("A4")
  @scala.inline
  def A5: typings.markdownPdf.markdownPdfStrings.A5 = this.cast("A5")
  @scala.inline
  def Legal: typings.markdownPdf.markdownPdfStrings.Legal = this.cast("Legal")
  @scala.inline
  def Letter: typings.markdownPdf.markdownPdfStrings.Letter = this.cast("Letter")
  @scala.inline
  def Tabloid: typings.markdownPdf.markdownPdfStrings.Tabloid = this.cast("Tabloid")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

