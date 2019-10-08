package typings.immer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object immerStrings {
  @js.native
  sealed trait DraftTuple extends js.Object
  
  @js.native
  sealed trait add extends js.Object
  
  @js.native
  sealed trait remove extends js.Object
  
  @js.native
  sealed trait replace extends js.Object
  
  @scala.inline
  def DraftTuple: DraftTuple = "DraftTuple".asInstanceOf[DraftTuple]
  @scala.inline
  def add: add = "add".asInstanceOf[add]
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  @scala.inline
  def replace: replace = "replace".asInstanceOf[replace]
}

