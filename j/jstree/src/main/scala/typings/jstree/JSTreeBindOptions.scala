package typings.jstree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSTreeBindOptions extends js.Object {
  var args: js.UndefOr[js.Any] = js.native
  var inst: js.UndefOr[js.Any] = js.native
  var rlbk: js.UndefOr[js.Any] = js.native
  var rslt: js.UndefOr[js.Any] = js.native
}

object JSTreeBindOptions {
  @scala.inline
  def apply(): JSTreeBindOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSTreeBindOptions]
  }
  @scala.inline
  implicit class JSTreeBindOptionsOps[Self <: JSTreeBindOptions] (val x: Self) extends AnyVal {
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
    def setArgs(value: js.Any): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setInst(value: js.Any): Self = this.set("inst", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInst: Self = this.set("inst", js.undefined)
    @scala.inline
    def setRlbk(value: js.Any): Self = this.set("rlbk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRlbk: Self = this.set("rlbk", js.undefined)
    @scala.inline
    def setRslt(value: js.Any): Self = this.set("rslt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRslt: Self = this.set("rslt", js.undefined)
  }
  
}

