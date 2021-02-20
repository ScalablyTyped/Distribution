package typings.jsdocToMarkdown

import typings.jsdocToMarkdown.mod.MemberIndexFormat
import typings.jsdocToMarkdown.mod.RenderListFormat
import typings.jsdocToMarkdown.mod.StyleListFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsdocToMarkdownStrings {
  
  @js.native
  sealed trait dl extends StyleListFormat
  @scala.inline
  def dl: dl = "dl".asInstanceOf[dl]
  
  @js.native
  sealed trait grouped
    extends MemberIndexFormat
       with StyleListFormat
  @scala.inline
  def grouped: grouped = "grouped".asInstanceOf[grouped]
  
  @js.native
  sealed trait list
    extends MemberIndexFormat
       with RenderListFormat
  @scala.inline
  def list: list = "list".asInstanceOf[list]
  
  @js.native
  sealed trait none extends StyleListFormat
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait table
    extends RenderListFormat
       with StyleListFormat
  @scala.inline
  def table: table = "table".asInstanceOf[table]
}
