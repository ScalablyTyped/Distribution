package typings.hapiHapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Apply extends js.Object {
  @JSName("apply")
  var apply: js.UndefOr[Boolean] = js.native
  var extend: js.UndefOr[Boolean] = js.native
}

object Apply {
  @scala.inline
  def apply(): Apply = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Apply]
  }
  @scala.inline
  implicit class ApplyOps[Self <: Apply] (val x: Self) extends AnyVal {
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
    def setApply(value: Boolean): Self = this.set("apply", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApply: Self = this.set("apply", js.undefined)
    @scala.inline
    def setExtend(value: Boolean): Self = this.set("extend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtend: Self = this.set("extend", js.undefined)
  }
  
}

