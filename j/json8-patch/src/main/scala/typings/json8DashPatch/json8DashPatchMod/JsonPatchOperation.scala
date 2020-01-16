package typings.json8DashPatch.json8DashPatchMod

import typings.json8DashPatch.json8DashPatchStrings.add
import typings.json8DashPatch.json8DashPatchStrings.copy
import typings.json8DashPatch.json8DashPatchStrings.move
import typings.json8DashPatch.json8DashPatchStrings.remove
import typings.json8DashPatch.json8DashPatchStrings.replace
import typings.json8DashPatch.json8DashPatchStrings.test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.json8DashPatch.json8DashPatchMod.AddOperation
  - typings.json8DashPatch.json8DashPatchMod.RemoveOperation
  - typings.json8DashPatch.json8DashPatchMod.ReplaceOperation
  - typings.json8DashPatch.json8DashPatchMod.MoveOperation
  - typings.json8DashPatch.json8DashPatchMod.CopyOperation
  - typings.json8DashPatch.json8DashPatchMod.TestOperation
*/
trait JsonPatchOperation extends js.Object

object JsonPatchOperation {
  @scala.inline
  def ReplaceOperation(op: replace, path: String, value: js.Any): JsonPatchOperation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JsonPatchOperation]
  }
  @scala.inline
  def AddOperation(op: add, path: String, value: js.Any): JsonPatchOperation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JsonPatchOperation]
  }
  @scala.inline
  def MoveOperation(from: js.Any, op: move, path: String): JsonPatchOperation = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JsonPatchOperation]
  }
  @scala.inline
  def RemoveOperation(op: remove, path: String): JsonPatchOperation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JsonPatchOperation]
  }
  @scala.inline
  def TestOperation(op: test, path: String, value: js.Any): JsonPatchOperation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JsonPatchOperation]
  }
  @scala.inline
  def CopyOperation(from: js.Any, op: copy, path: String): JsonPatchOperation = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JsonPatchOperation]
  }
}

