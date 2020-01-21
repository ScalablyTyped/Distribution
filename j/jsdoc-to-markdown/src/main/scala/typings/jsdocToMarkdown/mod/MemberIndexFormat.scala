package typings.jsdocToMarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsdocToMarkdown.jsdocToMarkdownStrings.grouped
  - typings.jsdocToMarkdown.jsdocToMarkdownStrings.list
*/
trait MemberIndexFormat extends js.Object

object MemberIndexFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def grouped: typings.jsdocToMarkdown.jsdocToMarkdownStrings.grouped = this.cast("grouped")
  @scala.inline
  def list: typings.jsdocToMarkdown.jsdocToMarkdownStrings.list = this.cast("list")
}

