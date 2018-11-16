package typings
package markdownDashPdfLib.markdownDashPdfMod.MarkdownPDFNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToOptionsBuilder extends js.Object {
  @JSName("to")
  var to_Original: ToBuilder with ToFunction = js.native
  /**
           * Create a writeable stream to path and pipe output from markdown-pdf to it.
           * path can be a single path, or array of output paths if you specified an array of inputs.
           * The callback function cb will be invoked when data has finished being written.
           */
  def to(path: java.lang.String): scala.Unit = js.native
  /**
           * Create a writeable stream to path and pipe output from markdown-pdf to it.
           * path can be a single path, or array of output paths if you specified an array of inputs.
           * The callback function cb will be invoked when data has finished being written.
           */
  def to(path: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

