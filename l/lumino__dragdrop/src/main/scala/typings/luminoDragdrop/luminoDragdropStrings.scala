package typings.luminoDragdrop

import typings.luminoDragdrop.mod.DropAction
import typings.luminoDragdrop.mod.SupportedActions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object luminoDragdropStrings {
  
  @js.native
  sealed trait all extends SupportedActions
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait copy
    extends DropAction
       with SupportedActions
  @scala.inline
  def copy: copy = "copy".asInstanceOf[copy]
  
  @js.native
  sealed trait `copy-link` extends SupportedActions
  @scala.inline
  def `copy-link`: `copy-link` = "copy-link".asInstanceOf[`copy-link`]
  
  @js.native
  sealed trait `copy-move` extends SupportedActions
  @scala.inline
  def `copy-move`: `copy-move` = "copy-move".asInstanceOf[`copy-move`]
  
  @js.native
  sealed trait link
    extends DropAction
       with SupportedActions
  @scala.inline
  def link: link = "link".asInstanceOf[link]
  
  @js.native
  sealed trait `link-move` extends SupportedActions
  @scala.inline
  def `link-move`: `link-move` = "link-move".asInstanceOf[`link-move`]
  
  @js.native
  sealed trait move
    extends DropAction
       with SupportedActions
  @scala.inline
  def move: move = "move".asInstanceOf[move]
  
  @js.native
  sealed trait none
    extends DropAction
       with SupportedActions
  @scala.inline
  def none: none = "none".asInstanceOf[none]
}
