package typings.markdownPdf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FromOptionsBuilder extends js.Object {
  /** Create a readable stream from path and pipe to markdown-pdf. path can be a single path or array of paths. */
  def path(path: String, opts: js.Any): ToOptionsBuilder = js.native
  def path(path: js.Array[String], opts: js.Any): ToOptionsBuilder = js.native
  /** Create a readable stream from string and pipe to markdown-pdf. string can be a single string or array of strings. */
  def string(markdown: String): ToOptionsBuilder = js.native
  def string(markdown: js.Array[String]): ToOptionsBuilder = js.native
}

