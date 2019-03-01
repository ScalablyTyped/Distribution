package typings
package jsdocDashToDashMarkdownLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jsdocDashToDashMarkdownLibStrings {
  @js.native
  sealed trait dl
    extends jsdocDashToDashMarkdownLib.jsdocDashToDashMarkdownMod.StyleListFormat
  
  @js.native
  sealed trait grouped
    extends jsdocDashToDashMarkdownLib.jsdocDashToDashMarkdownMod.MemberIndexFormat
       with jsdocDashToDashMarkdownLib.jsdocDashToDashMarkdownMod.StyleListFormat
  
  @js.native
  sealed trait list
    extends jsdocDashToDashMarkdownLib.jsdocDashToDashMarkdownMod.MemberIndexFormat
       with jsdocDashToDashMarkdownLib.jsdocDashToDashMarkdownMod.RenderListFormat
  
  @js.native
  sealed trait none
    extends jsdocDashToDashMarkdownLib.jsdocDashToDashMarkdownMod.StyleListFormat
  
  @js.native
  sealed trait table
    extends jsdocDashToDashMarkdownLib.jsdocDashToDashMarkdownMod.RenderListFormat
       with jsdocDashToDashMarkdownLib.jsdocDashToDashMarkdownMod.StyleListFormat
  
  @scala.inline
  def dl: dl = "dl".asInstanceOf[dl]
  @scala.inline
  def grouped: grouped = "grouped".asInstanceOf[grouped]
  @scala.inline
  def list: list = "list".asInstanceOf[list]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def table: table = "table".asInstanceOf[table]
}

