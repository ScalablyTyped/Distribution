package typings.jsonDashPatchDashGen

import typings.jsonDashPatchDashGen.jsonDashPatchDashGenMod.PatchOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jsonDashPatchDashGenStrings {
  @js.native
  sealed trait add extends PatchOperation
  
  @js.native
  sealed trait remove extends PatchOperation
  
  @js.native
  sealed trait replace extends PatchOperation
  
  @scala.inline
  def add: add = "add".asInstanceOf[add]
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  @scala.inline
  def replace: replace = "replace".asInstanceOf[replace]
}

