package typings.markdownDashPdf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object markdownDashPdfMod {
  type FromFunction = /** Create a readable stream from path and pipe to markdown-pdf. path can be a single path or array of paths. */
  js.Function1[/* path */ String | js.Array[String], ToOptionsBuilder]
  type ToFunction = /**
    * Create a writeable stream to path and pipe output from markdown-pdf to it.
    * path can be a single path, or array of output paths if you specified an array of inputs.
    * The callback function cb will be invoked when data has finished being written.
    */
  js.Function2[/* path */ String, /* callback */ js.UndefOr[js.Function0[Unit]], Unit]
}
