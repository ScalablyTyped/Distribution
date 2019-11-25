package typings.jsonDashPatchDashGen.jsonDashPatchDashGenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonPatch extends js.Object {
  var op: PatchOperation
  var path: String
  var value: js.Any
}

object JsonPatch {
  @scala.inline
  def apply(op: PatchOperation, path: String, value: js.Any): JsonPatch = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JsonPatch]
  }
}

