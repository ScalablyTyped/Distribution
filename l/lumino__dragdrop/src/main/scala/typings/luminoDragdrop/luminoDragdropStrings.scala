package typings.luminoDragdrop

import typings.luminoDragdrop.mod.DropAction
import typings.luminoDragdrop.mod.SupportedActions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object luminoDragdropStrings {
  @js.native
  sealed trait all extends SupportedActions
  
  @js.native
  sealed trait copy
    extends DropAction
       with SupportedActions
  
  @js.native
  sealed trait `copy-link` extends SupportedActions
  
  @js.native
  sealed trait `copy-move` extends SupportedActions
  
  @js.native
  sealed trait link
    extends DropAction
       with SupportedActions
  
  @js.native
  sealed trait `link-move` extends SupportedActions
  
  @js.native
  sealed trait move
    extends DropAction
       with SupportedActions
  
  @js.native
  sealed trait none
    extends DropAction
       with SupportedActions
  
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def copy: copy = "copy".asInstanceOf[copy]
  @scala.inline
  def `copy-link`: `copy-link` = "copy-link".asInstanceOf[`copy-link`]
  @scala.inline
  def `copy-move`: `copy-move` = "copy-move".asInstanceOf[`copy-move`]
  @scala.inline
  def link: link = "link".asInstanceOf[link]
  @scala.inline
  def `link-move`: `link-move` = "link-move".asInstanceOf[`link-move`]
  @scala.inline
  def move: move = "move".asInstanceOf[move]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
}

