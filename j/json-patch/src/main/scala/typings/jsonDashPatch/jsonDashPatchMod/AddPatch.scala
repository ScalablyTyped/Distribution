package typings.jsonDashPatch.jsonDashPatchMod

import typings.jsonDashPatch.jsonDashPatchStrings.add
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
    val __obj = js.Dynamic.literal(op = op, path = path, value = value)
  
    __obj.asInstanceOf[AddPatch]
  }
}

