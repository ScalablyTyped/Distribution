package typings.jsonPatch.mod

import typings.jsonPatch.jsonPatchStrings.add
import typings.jsonPatch.jsonPatchStrings.copy
import typings.jsonPatch.jsonPatchStrings.move
import typings.jsonPatch.jsonPatchStrings.remove
import typings.jsonPatch.jsonPatchStrings.replace
import typings.jsonPatch.jsonPatchStrings.test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsonPatch.mod.AddPatch
  - typings.jsonPatch.mod.RemovePatch
  - typings.jsonPatch.mod.ReplacePatch
  - typings.jsonPatch.mod.MovePatch
  - typings.jsonPatch.mod.CopyPatch
  - typings.jsonPatch.mod.TestPatch
*/
trait OpPatch extends js.Object

object OpPatch {
  @scala.inline
  def RemovePatch(op: remove, path: String): OpPatch = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpPatch]
  }
  @scala.inline
  def ReplacePatch(op: replace, path: String, value: js.Any): OpPatch = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpPatch]
  }
  @scala.inline
  def AddPatch(op: add, path: String, value: js.Any): OpPatch = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpPatch]
  }
  @scala.inline
  def MovePatch(from: String, op: move, path: String): OpPatch = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpPatch]
  }
  @scala.inline
  def TestPatch(op: test, path: String, value: js.Any): OpPatch = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpPatch]
  }
  @scala.inline
  def CopyPatch(from: String, op: copy, path: String): OpPatch = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpPatch]
  }
}

