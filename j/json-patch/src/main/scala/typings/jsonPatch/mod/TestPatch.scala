package typings.jsonPatch.mod

import typings.jsonPatch.jsonPatchStrings.test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestPatch
  extends Patch
     with OpPatch {
  var op: test
  var value: js.Any
}

object TestPatch {
  @scala.inline
  def apply(op: test, path: String, value: js.Any): TestPatch = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestPatch]
  }
}

