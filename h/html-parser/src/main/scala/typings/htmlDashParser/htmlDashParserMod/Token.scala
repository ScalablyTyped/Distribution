package typings.htmlDashParser.htmlDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.htmlDashParser.htmlDashParserStrings.Greaterthansign
  - typings.htmlDashParser.htmlDashParserStrings.SlashGreaterthansign
  - typings.htmlDashParser.htmlDashParserStrings.QuestionmarkGreaterthansign
*/
trait Token extends js.Object

object Token {
  @scala.inline
  def Greaterthansign: typings.htmlDashParser.htmlDashParserStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def QuestionmarkGreaterthansign: typings.htmlDashParser.htmlDashParserStrings.QuestionmarkGreaterthansign = this.cast("?>")
  @scala.inline
  def SlashGreaterthansign: typings.htmlDashParser.htmlDashParserStrings.SlashGreaterthansign = this.cast("/>")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

