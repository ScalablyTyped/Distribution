package typings.jupyterlabApplication

import typings.jupyterlabApplication.shellMod.ILabShell.Area
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jupyterlabApplicationStrings {
  
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @scala.inline
  def header: header = "header".asInstanceOf[header]
  
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @scala.inline
  def main: main = "main".asInstanceOf[main]
  
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait bottom extends Area
  
  @js.native
  sealed trait header extends Area
  
  @js.native
  sealed trait left extends Area
  
  @js.native
  sealed trait main extends Area
  
  @js.native
  sealed trait right extends Area
  
  @js.native
  sealed trait top extends Area
}
