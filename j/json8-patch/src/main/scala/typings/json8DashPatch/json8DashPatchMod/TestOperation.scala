package typings.json8DashPatch.json8DashPatchMod

import typings.json8DashPatch.json8DashPatchStrings.test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOperation
  extends BaseOperation
     with JsonPatchOperation {
  var op: test
  var value: js.Any
}

object TestOperation {
  @scala.inline
  def apply(op: test, path: String, value: js.Any): TestOperation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestOperation]
  }
}

