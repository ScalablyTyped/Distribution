package typings.json8Patch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplyResultWithRevert extends ApplyResult {
  var revert: JsonPatch = js.native
}

object ApplyResultWithRevert {
  @scala.inline
  def apply(doc: js.Any, revert: JsonPatch): ApplyResultWithRevert = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], revert = revert.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyResultWithRevert]
  }
  @scala.inline
  implicit class ApplyResultWithRevertOps[Self <: ApplyResultWithRevert] (val x: Self) extends AnyVal {
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
    def setRevertVarargs(value: JsonPatchOperation*): Self = this.set("revert", js.Array(value :_*))
    @scala.inline
    def setRevert(value: JsonPatch): Self = this.set("revert", value.asInstanceOf[js.Any])
  }
  
}

