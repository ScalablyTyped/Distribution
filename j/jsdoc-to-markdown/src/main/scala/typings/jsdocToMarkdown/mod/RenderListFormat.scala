package typings.jsdocToMarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsdocToMarkdown.jsdocToMarkdownStrings.list
  - typings.jsdocToMarkdown.jsdocToMarkdownStrings.table
*/
trait RenderListFormat extends js.Object

object RenderListFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def list: typings.jsdocToMarkdown.jsdocToMarkdownStrings.list = this.cast("list")
  @scala.inline
  def table: typings.jsdocToMarkdown.jsdocToMarkdownStrings.table = this.cast("table")
}

