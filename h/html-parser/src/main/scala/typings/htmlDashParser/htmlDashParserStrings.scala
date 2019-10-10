package typings.htmlDashParser

import typings.htmlDashParser.htmlDashParserMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object htmlDashParserStrings {
  @js.native
  sealed trait `/>` extends Token
  
  @js.native
  sealed trait `>` extends Token
  
  @js.native
  sealed trait `?>` extends Token
  
  @scala.inline
  def `/>`: `/>` = "/>".asInstanceOf[`/>`]
  @scala.inline
  def `>`: `>` = ">".asInstanceOf[`>`]
  @scala.inline
  def `?>`: `?>` = "?>".asInstanceOf[`?>`]
}

