package typings.json8Patch.mod

import typings.json8Patch.json8PatchStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceOperation
  extends BaseOperation
     with JsonPatchOperation {
  var op: replace
  var value: js.Any
}

object ReplaceOperation {
  @scala.inline
  def apply(op: replace, path: String, value: js.Any): ReplaceOperation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceOperation]
  }
}

