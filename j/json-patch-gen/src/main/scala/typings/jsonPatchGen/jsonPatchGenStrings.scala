package typings.jsonPatchGen

import typings.jsonPatchGen.mod.PatchOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonPatchGenStrings {
  
  @scala.inline
  def add: add = "add".asInstanceOf[add]
  
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  
  @scala.inline
  def replace: replace = "replace".asInstanceOf[replace]
  
  @js.native
  sealed trait add extends PatchOperation
  
  @js.native
  sealed trait remove extends PatchOperation
  
  @js.native
  sealed trait replace extends PatchOperation
}
