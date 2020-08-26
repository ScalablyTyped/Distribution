package typings.lodash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// mixin
@js.native
trait MixinOptions extends js.Object {
  var chain: js.UndefOr[Boolean] = js.native
}

object MixinOptions {
  @scala.inline
  def apply(): MixinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MixinOptions]
  }
  @scala.inline
  implicit class MixinOptionsOps[Self <: MixinOptions] (val x: Self) extends AnyVal {
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
    def setChain(value: Boolean): Self = this.set("chain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChain: Self = this.set("chain", js.undefined)
  }
  
}

