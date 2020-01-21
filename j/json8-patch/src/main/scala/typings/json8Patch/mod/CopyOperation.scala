package typings.json8Patch.mod

import typings.json8Patch.json8PatchStrings.copy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyOperation
  extends BaseOperation
     with JsonPatchOperation {
  var from: js.Any
  var op: copy
}

object CopyOperation {
  @scala.inline
  def apply(from: js.Any, op: copy, path: String): CopyOperation = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CopyOperation]
  }
}

