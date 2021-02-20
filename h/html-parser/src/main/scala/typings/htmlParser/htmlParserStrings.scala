package typings.htmlParser

import typings.htmlParser.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlParserStrings {
  
  @js.native
  sealed trait Greaterthansign extends Token
  @scala.inline
  def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  
  @js.native
  sealed trait QuestionmarkGreaterthansign extends Token
  @scala.inline
  def QuestionmarkGreaterthansign: QuestionmarkGreaterthansign = "?>".asInstanceOf[QuestionmarkGreaterthansign]
  
  @js.native
  sealed trait SlashGreaterthansign extends Token
  @scala.inline
  def SlashGreaterthansign: SlashGreaterthansign = "/>".asInstanceOf[SlashGreaterthansign]
}
