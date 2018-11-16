package typings
package markdownDashPdfLib.markdownDashPdfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MarkdownPDFNs {
  type FromFunction = /** Create a readable stream from path and pipe to markdown-pdf. path can be a single path or array of paths. */
  js.Function1[/* path */ java.lang.String | js.Array[java.lang.String], ToOptionsBuilder]
  type PaperFormat = markdownDashPdfLib.markdownDashPdfLibStrings.A3 | markdownDashPdfLib.markdownDashPdfLibStrings.A4 | markdownDashPdfLib.markdownDashPdfLibStrings.A5 | markdownDashPdfLib.markdownDashPdfLibStrings.Legal | markdownDashPdfLib.markdownDashPdfLibStrings.Letter | markdownDashPdfLib.markdownDashPdfLibStrings.Tabloid
  type PaperOrientation = markdownDashPdfLib.markdownDashPdfLibStrings.portait | markdownDashPdfLib.markdownDashPdfLibStrings.landscape
  type ToFunction = /**
           * Create a writeable stream to path and pipe output from markdown-pdf to it.
           * path can be a single path, or array of output paths if you specified an array of inputs.
           * The callback function cb will be invoked when data has finished being written.
           */
  js.Function2[
    /* path */ java.lang.String, 
    /* callback */ js.UndefOr[js.Function0[scala.Unit]], 
    scala.Unit
  ]
}
