package typings
package jsonDashPatchLib.jsonDashPatchMod.jsonpatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemovePatch
  extends Patch
     with OpPatch {
  var op: jsonDashPatchLib.jsonDashPatchLibStrings.remove
}

object RemovePatch {
  @scala.inline
  def apply(op: jsonDashPatchLib.jsonDashPatchLibStrings.remove, path: java.lang.String): RemovePatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("op")(op)
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[RemovePatch]
  }
}

