package typings.json8DashPatch.json8DashPatchMod

import typings.json8DashPatch.json8DashPatchStrings.add
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddOperation
  extends BaseOperation
     with JsonPatchOperation {
  var op: add
  var value: js.Any
}

object AddOperation {
  @scala.inline
  def apply(op: add, path: String, value: js.Any): AddOperation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddOperation]
  }
}

