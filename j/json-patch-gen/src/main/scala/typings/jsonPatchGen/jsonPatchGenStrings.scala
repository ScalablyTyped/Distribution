package typings.jsonPatchGen

import typings.jsonPatchGen.mod.PatchOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonPatchGenStrings {
  
  @js.native
  sealed trait add extends PatchOperation
  @scala.inline
  def add: add = "add".asInstanceOf[add]
  
  @js.native
  sealed trait remove extends PatchOperation
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait replace extends PatchOperation
  @scala.inline
  def replace: replace = "replace".asInstanceOf[replace]
}
