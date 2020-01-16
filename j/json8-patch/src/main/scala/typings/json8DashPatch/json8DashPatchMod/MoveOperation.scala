package typings.json8DashPatch.json8DashPatchMod

import typings.json8DashPatch.json8DashPatchStrings.move
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveOperation
  extends BaseOperation
     with JsonPatchOperation {
  var from: js.Any
  var op: move
}

object MoveOperation {
  @scala.inline
  def apply(from: js.Any, op: move, path: String): MoveOperation = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MoveOperation]
  }
}

