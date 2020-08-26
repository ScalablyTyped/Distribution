package typings.jsonPatch.mod

import typings.jsonPatch.jsonPatchStrings.remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemovePatch
  extends Patch
     with OpPatch {
  var op: remove = js.native
}

object RemovePatch {
  @scala.inline
  def apply(op: remove, path: String): RemovePatch = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovePatch]
  }
  @scala.inline
  implicit class RemovePatchOps[Self <: RemovePatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOp(value: remove): Self = this.set("op", value.asInstanceOf[js.Any])
  }
  
}

