package typings
package jsonDashPatchDashGenLib.jsonDashPatchDashGenMod.diffNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonPatch extends js.Object {
  var op: PatchOperation
  var path: java.lang.String
  var value: js.Any
}

object JsonPatch {
  @scala.inline
  def apply(op: PatchOperation, path: java.lang.String, value: js.Any): JsonPatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("op")(op)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[JsonPatch]
  }
}

