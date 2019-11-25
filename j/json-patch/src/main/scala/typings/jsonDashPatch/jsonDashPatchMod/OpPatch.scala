package typings.jsonDashPatch.jsonDashPatchMod

import typings.jsonDashPatch.jsonDashPatchStrings.add
import typings.jsonDashPatch.jsonDashPatchStrings.copy
import typings.jsonDashPatch.jsonDashPatchStrings.move
import typings.jsonDashPatch.jsonDashPatchStrings.remove
import typings.jsonDashPatch.jsonDashPatchStrings.replace
import typings.jsonDashPatch.jsonDashPatchStrings.test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsonDashPatch.jsonDashPatchMod.AddPatch
  - typings.jsonDashPatch.jsonDashPatchMod.RemovePatch
  - typings.jsonDashPatch.jsonDashPatchMod.ReplacePatch
  - typings.jsonDashPatch.jsonDashPatchMod.MovePatch
  - typings.jsonDashPatch.jsonDashPatchMod.CopyPatch
  - typings.jsonDashPatch.jsonDashPatchMod.TestPatch
*/
trait OpPatch extends js.Object

object OpPatch {
  @scala.inline
  def TestPatch(op: test, path: String, value: js.Any): OpPatch = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpPatch]
  }
  @scala.inline
  def ReplacePatch(op: replace, path: String, value: js.Any): OpPatch = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpPatch]
  }
  @scala.inline
  def RemovePatch(op: remove, path: String): OpPatch = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpPatch]
  }
  @scala.inline
  def CopyPatch(from: String, op: copy, path: String): OpPatch = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpPatch]
  }
  @scala.inline
  def MovePatch(from: String, op: move, path: String): OpPatch = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpPatch]
  }
  @scala.inline
  def AddPatch(op: add, path: String, value: js.Any): OpPatch = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpPatch]
  }
}

