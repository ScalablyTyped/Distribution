package typings.htmlParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.htmlParser.htmlParserStrings.Greaterthansign
  - typings.htmlParser.htmlParserStrings.SlashGreaterthansign
  - typings.htmlParser.htmlParserStrings.QuestionmarkGreaterthansign
*/
trait Token extends js.Object

object Token {
  @scala.inline
  def Greaterthansign: typings.htmlParser.htmlParserStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def QuestionmarkGreaterthansign: typings.htmlParser.htmlParserStrings.QuestionmarkGreaterthansign = this.cast("?>")
  @scala.inline
  def SlashGreaterthansign: typings.htmlParser.htmlParserStrings.SlashGreaterthansign = this.cast("/>")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

