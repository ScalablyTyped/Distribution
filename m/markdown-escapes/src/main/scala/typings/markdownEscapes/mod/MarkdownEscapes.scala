package typings.markdownEscapes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkdownEscapes extends js.Object {
  /**
    * List of escapable characters in CommonMark (which includes all gfms).
    */
  val commonmark: js.Array[String] = js.native
  /**
    * List of default escapable characters.
    */
  val default: js.Array[String] = js.native
  /**
    * List of escapable characters in GFM (which includes all defaults).
    */
  val gfm: js.Array[String] = js.native
  /**
    * Get escapes.
    * Supports `options.commonmark` and `options.gfm`,
    * which when true returns the extra escape characters supported by those flavors.
    */
  def apply(): js.Array[String] = js.native
  def apply(options: Options): js.Array[String] = js.native
}

