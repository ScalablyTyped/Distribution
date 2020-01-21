package typings.jsonPatch.mod

import typings.jsonPatch.jsonPatchStrings.add
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddPatch
  extends Patch
     with OpPatch {
  var op: add
  var value: js.Any
}

object AddPatch {
  @scala.inline
  def apply(op: add, path: String, value: js.Any): AddPatch = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddPatch]
  }
}

