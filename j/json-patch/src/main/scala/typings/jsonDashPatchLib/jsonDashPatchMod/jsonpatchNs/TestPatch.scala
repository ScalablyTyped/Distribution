package typings
package jsonDashPatchLib.jsonDashPatchMod.jsonpatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestPatch
  extends Patch
     with OpPatch {
  var op: jsonDashPatchLib.jsonDashPatchLibStrings.test
  var value: js.Any
}

object TestPatch {
  @scala.inline
  def apply(op: jsonDashPatchLib.jsonDashPatchLibStrings.test, path: java.lang.String, value: js.Any): TestPatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("op")(op)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TestPatch]
  }
}

