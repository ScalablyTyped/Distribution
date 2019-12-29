package typings.htmlDashParser

import typings.htmlDashParser.htmlDashParserMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object htmlDashParserStrings {
  @js.native
  sealed trait Greaterthansign extends Token
  
  @js.native
  sealed trait QuestionmarkGreaterthansign extends Token
  
  @js.native
  sealed trait SlashGreaterthansign extends Token
  
  @scala.inline
  def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  @scala.inline
  def QuestionmarkGreaterthansign: QuestionmarkGreaterthansign = "?>".asInstanceOf[QuestionmarkGreaterthansign]
  @scala.inline
  def SlashGreaterthansign: SlashGreaterthansign = "/>".asInstanceOf[SlashGreaterthansign]
}

