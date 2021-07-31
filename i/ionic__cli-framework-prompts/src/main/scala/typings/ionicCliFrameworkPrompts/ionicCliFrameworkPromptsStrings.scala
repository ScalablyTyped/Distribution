package typings.ionicCliFrameworkPrompts

import typings.ionicCliFrameworkPrompts.mod.PromptTypeOther
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionicCliFrameworkPromptsStrings {
  
  @js.native
  sealed trait checkbox extends StObject
  @scala.inline
  def checkbox: checkbox = "checkbox".asInstanceOf[checkbox]
  
  @js.native
  sealed trait confirm extends StObject
  @scala.inline
  def confirm: confirm = "confirm".asInstanceOf[confirm]
  
  @js.native
  sealed trait input
    extends StObject
       with PromptTypeOther
  @scala.inline
  def input: input = "input".asInstanceOf[input]
  
  @js.native
  sealed trait list
    extends StObject
       with PromptTypeOther
  @scala.inline
  def list: list = "list".asInstanceOf[list]
  
  @js.native
  sealed trait password
    extends StObject
       with PromptTypeOther
  @scala.inline
  def password: password = "password".asInstanceOf[password]
}
