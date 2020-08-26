package typings.lasso.anon

import typings.lasso.lassoMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lasso extends js.Object {
  var lasso: js.UndefOr[default] = js.native
  var sendOptions: js.UndefOr[js.Any] = js.native
}

object Lasso {
  @scala.inline
  def apply(): Lasso = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lasso]
  }
  @scala.inline
  implicit class LassoOps[Self <: Lasso] (val x: Self) extends AnyVal {
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
    def setLasso(value: default): Self = this.set("lasso", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLasso: Self = this.set("lasso", js.undefined)
    @scala.inline
    def setSendOptions(value: js.Any): Self = this.set("sendOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendOptions: Self = this.set("sendOptions", js.undefined)
  }
  
}

