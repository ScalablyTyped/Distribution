package typings.graphqlPlaygroundHtml.renderPlaygroundPageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.graphqlPlaygroundHtml.graphqlPlaygroundHtmlStrings.dark
  - typings.graphqlPlaygroundHtml.graphqlPlaygroundHtmlStrings.light
*/
trait Theme extends js.Object

object Theme {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dark: typings.graphqlPlaygroundHtml.graphqlPlaygroundHtmlStrings.dark = this.cast("dark")
  @scala.inline
  def light: typings.graphqlPlaygroundHtml.graphqlPlaygroundHtmlStrings.light = this.cast("light")
}

