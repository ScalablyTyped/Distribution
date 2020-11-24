package typings.immer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object immerStrings {
  
  @scala.inline
  def Draft: Draft = "Draft".asInstanceOf[Draft]
  
  @scala.inline
  def DraftTuple: DraftTuple = "DraftTuple".asInstanceOf[DraftTuple]
  
  @scala.inline
  def add: add = "add".asInstanceOf[add]
  
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  
  @scala.inline
  def replace: replace = "replace".asInstanceOf[replace]
  
  @js.native
  sealed trait Draft extends js.Object
  
  @js.native
  sealed trait DraftTuple extends js.Object
  
  @js.native
  sealed trait add extends js.Object
  
  @js.native
  sealed trait remove extends js.Object
  
  @js.native
  sealed trait replace extends js.Object
}
