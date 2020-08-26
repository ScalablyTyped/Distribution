package typings.json8Patch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplyResult extends js.Object {
  var doc: js.Any = js.native
}

object ApplyResult {
  @scala.inline
  def apply(doc: js.Any): ApplyResult = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyResult]
  }
  @scala.inline
  implicit class ApplyResultOps[Self <: ApplyResult] (val x: Self) extends AnyVal {
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
    def setDoc(value: js.Any): Self = this.set("doc", value.asInstanceOf[js.Any])
  }
  
}

