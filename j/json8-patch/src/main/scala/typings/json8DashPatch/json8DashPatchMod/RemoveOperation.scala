package typings.json8DashPatch.json8DashPatchMod

import typings.json8DashPatch.json8DashPatchStrings.remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveOperation
  extends BaseOperation
     with JsonPatchOperation {
  var op: remove
}

object RemoveOperation {
  @scala.inline
  def apply(op: remove, path: String): RemoveOperation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemoveOperation]
  }
}

