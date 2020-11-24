package typings.jsdocToMarkdown

import typings.jsdocToMarkdown.mod.MemberIndexFormat
import typings.jsdocToMarkdown.mod.RenderListFormat
import typings.jsdocToMarkdown.mod.StyleListFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsdocToMarkdownStrings {
  
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
  
  @js.native
  sealed trait dl extends StyleListFormat
  
  @js.native
  sealed trait grouped
    extends MemberIndexFormat
       with StyleListFormat
  
  @js.native
  sealed trait list
    extends MemberIndexFormat
       with RenderListFormat
  
  @js.native
  sealed trait none extends StyleListFormat
  
  @js.native
  sealed trait table
    extends RenderListFormat
       with StyleListFormat
}
