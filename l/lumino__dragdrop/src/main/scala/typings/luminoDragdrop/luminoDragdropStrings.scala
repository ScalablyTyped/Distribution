package typings.luminoDragdrop

import typings.luminoDragdrop.mod.Drag.DropAction
import typings.luminoDragdrop.mod.Drag.SupportedActions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object luminoDragdropStrings {
  
  @js.native
  sealed trait all
    extends StObject
       with SupportedActions
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait copy
    extends StObject
       with DropAction
       with SupportedActions
  inline def copy: copy = "copy".asInstanceOf[copy]
  
  @js.native
  sealed trait `copy-link`
    extends StObject
       with SupportedActions
  inline def `copy-link`: `copy-link` = "copy-link".asInstanceOf[`copy-link`]
  
  @js.native
  sealed trait `copy-move`
    extends StObject
       with SupportedActions
  inline def `copy-move`: `copy-move` = "copy-move".asInstanceOf[`copy-move`]
  
  @js.native
  sealed trait link
    extends StObject
       with DropAction
       with SupportedActions
  inline def link: link = "link".asInstanceOf[link]
  
  @js.native
  sealed trait `link-move`
    extends StObject
       with SupportedActions
  inline def `link-move`: `link-move` = "link-move".asInstanceOf[`link-move`]
  
  @js.native
  sealed trait `lm-dragenter` extends StObject
  inline def `lm-dragenter`: `lm-dragenter` = "lm-dragenter".asInstanceOf[`lm-dragenter`]
  
  @js.native
  sealed trait `lm-dragexit` extends StObject
  inline def `lm-dragexit`: `lm-dragexit` = "lm-dragexit".asInstanceOf[`lm-dragexit`]
  
  @js.native
  sealed trait `lm-dragleave` extends StObject
  inline def `lm-dragleave`: `lm-dragleave` = "lm-dragleave".asInstanceOf[`lm-dragleave`]
  
  @js.native
  sealed trait `lm-dragover` extends StObject
  inline def `lm-dragover`: `lm-dragover` = "lm-dragover".asInstanceOf[`lm-dragover`]
  
  @js.native
  sealed trait `lm-drop` extends StObject
  inline def `lm-drop`: `lm-drop` = "lm-drop".asInstanceOf[`lm-drop`]
  
  @js.native
  sealed trait move
    extends StObject
       with DropAction
       with SupportedActions
  inline def move: move = "move".asInstanceOf[move]
  
  @js.native
  sealed trait none
    extends StObject
       with DropAction
       with SupportedActions
  inline def none: none = "none".asInstanceOf[none]
}
