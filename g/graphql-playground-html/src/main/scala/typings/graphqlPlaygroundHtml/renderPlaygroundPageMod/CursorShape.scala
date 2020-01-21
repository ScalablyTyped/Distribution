package typings.graphqlPlaygroundHtml.renderPlaygroundPageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.graphqlPlaygroundHtml.graphqlPlaygroundHtmlStrings.line
  - typings.graphqlPlaygroundHtml.graphqlPlaygroundHtmlStrings.block
  - typings.graphqlPlaygroundHtml.graphqlPlaygroundHtmlStrings.underline
*/
trait CursorShape extends js.Object

object CursorShape {
  @scala.inline
  def block: typings.graphqlPlaygroundHtml.graphqlPlaygroundHtmlStrings.block = this.cast("block")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def line: typings.graphqlPlaygroundHtml.graphqlPlaygroundHtmlStrings.line = this.cast("line")
  @scala.inline
  def underline: typings.graphqlPlaygroundHtml.graphqlPlaygroundHtmlStrings.underline = this.cast("underline")
}

