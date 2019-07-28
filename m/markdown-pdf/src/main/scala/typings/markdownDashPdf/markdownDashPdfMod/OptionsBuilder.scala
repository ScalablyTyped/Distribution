package typings.markdownDashPdf.markdownDashPdfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsBuilder extends js.Object {
  /** Concatenates stream and pipe them to markdown pdf. */
  var concat: ConcatOptionsBuilder = js.native
  /** Create a readable stream and pipe it to markdown pdf. */
  @JSName("from")
  var from_Original: FromOptionsBuilder with FromFunction = js.native
  /** Create a readable stream and pipe it to markdown pdf. */
  /** Create a readable stream from path and pipe to markdown-pdf. path can be a single path or array of paths. */
  def from(path: String): ToOptionsBuilder = js.native
  /** Create a readable stream from path and pipe to markdown-pdf. path can be a single path or array of paths. */
  def from(path: js.Array[String]): ToOptionsBuilder = js.native
}

