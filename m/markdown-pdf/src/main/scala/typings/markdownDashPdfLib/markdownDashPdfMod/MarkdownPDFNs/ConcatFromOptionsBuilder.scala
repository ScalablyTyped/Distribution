package typings
package markdownDashPdfLib.markdownDashPdfMod.MarkdownPDFNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcatFromOptionsBuilder extends js.Object {
  /** Create and concatenate readable streams from paths and pipe to markdown-pdf. */
  def paths(paths: js.Array[java.lang.String], opts: js.Any): ToOptionsBuilder
  /** Create and concatenate readable streams from strings and pipe to markdown-pdf. */
  def strings(markdownTexts: js.Array[java.lang.String], opts: js.Any): ToOptionsBuilder
}

object ConcatFromOptionsBuilder {
  @scala.inline
  def apply(
    paths: (js.Array[java.lang.String], js.Any) => ToOptionsBuilder,
    strings: (js.Array[java.lang.String], js.Any) => ToOptionsBuilder
  ): ConcatFromOptionsBuilder = {
    val __obj = js.Dynamic.literal(paths = js.Any.fromFunction2(paths), strings = js.Any.fromFunction2(strings))
  
    __obj.asInstanceOf[ConcatFromOptionsBuilder]
  }
}

