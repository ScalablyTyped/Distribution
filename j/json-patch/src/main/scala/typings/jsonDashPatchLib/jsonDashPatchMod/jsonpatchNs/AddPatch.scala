package typings
package jsonDashPatchLib.jsonDashPatchMod.jsonpatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddPatch
  extends Patch
     with OpPatch {
  var op: jsonDashPatchLib.jsonDashPatchLibStrings.add
  var value: js.Any
}

object AddPatch {
  @scala.inline
  def apply(op: jsonDashPatchLib.jsonDashPatchLibStrings.add, path: java.lang.String, value: js.Any): AddPatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("op")(op)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[AddPatch]
  }
}

