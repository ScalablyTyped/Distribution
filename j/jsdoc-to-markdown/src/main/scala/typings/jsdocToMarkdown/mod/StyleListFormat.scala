package typings.jsdocToMarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsdocToMarkdown.jsdocToMarkdownStrings.none
  - typings.jsdocToMarkdown.jsdocToMarkdownStrings.grouped
  - typings.jsdocToMarkdown.jsdocToMarkdownStrings.table
  - typings.jsdocToMarkdown.jsdocToMarkdownStrings.dl
*/
trait StyleListFormat extends js.Object

object StyleListFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dl: typings.jsdocToMarkdown.jsdocToMarkdownStrings.dl = this.cast("dl")
  @scala.inline
  def grouped: typings.jsdocToMarkdown.jsdocToMarkdownStrings.grouped = this.cast("grouped")
  @scala.inline
  def none: typings.jsdocToMarkdown.jsdocToMarkdownStrings.none = this.cast("none")
  @scala.inline
  def table: typings.jsdocToMarkdown.jsdocToMarkdownStrings.table = this.cast("table")
}

