package typings.graphqlDashPlaygroundDashHtml

import typings.graphqlDashPlaygroundDashHtml.distRenderDashPlaygroundDashPageMod.CursorShape
import typings.graphqlDashPlaygroundDashHtml.distRenderDashPlaygroundDashPageMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object graphqlDashPlaygroundDashHtmlStrings {
  @js.native
  sealed trait block extends CursorShape
  
  @js.native
  sealed trait dark extends Theme
  
  @js.native
  sealed trait light extends Theme
  
  @js.native
  sealed trait line extends CursorShape
  
  @js.native
  sealed trait underline extends CursorShape
  
  @scala.inline
  def block: block = "block".asInstanceOf[block]
  @scala.inline
  def dark: dark = "dark".asInstanceOf[dark]
  @scala.inline
  def light: light = "light".asInstanceOf[light]
  @scala.inline
  def line: line = "line".asInstanceOf[line]
  @scala.inline
  def underline: underline = "underline".asInstanceOf[underline]
}

