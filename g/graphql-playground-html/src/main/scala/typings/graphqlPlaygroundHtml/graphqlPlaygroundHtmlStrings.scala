package typings.graphqlPlaygroundHtml

import typings.graphqlPlaygroundHtml.renderPlaygroundPageMod.CursorShape
import typings.graphqlPlaygroundHtml.renderPlaygroundPageMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graphqlPlaygroundHtmlStrings {
  
  @js.native
  sealed trait block
    extends StObject
       with CursorShape
  @scala.inline
  def block: block = "block".asInstanceOf[block]
  
  @js.native
  sealed trait dark
    extends StObject
       with Theme
  @scala.inline
  def dark: dark = "dark".asInstanceOf[dark]
  
  @js.native
  sealed trait light
    extends StObject
       with Theme
  @scala.inline
  def light: light = "light".asInstanceOf[light]
  
  @js.native
  sealed trait line
    extends StObject
       with CursorShape
  @scala.inline
  def line: line = "line".asInstanceOf[line]
  
  @js.native
  sealed trait underline
    extends StObject
       with CursorShape
  @scala.inline
  def underline: underline = "underline".asInstanceOf[underline]
}
