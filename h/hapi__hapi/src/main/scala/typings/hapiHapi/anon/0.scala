package typings.hapiHapi.anon

import typings.hapiHapi.hapiHapiBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `0` extends js.Object {
  @JSName("apply")
  var apply: js.UndefOr[Boolean] = js.native
  var extend: `true` = js.native
}

object `0` {
  @scala.inline
  def apply(extend: `true`): `0` = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  @scala.inline
  implicit class `0Ops`[Self <: `0`] (val x: Self) extends AnyVal {
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
    def setExtend(value: `true`): Self = this.set("extend", value.asInstanceOf[js.Any])
    @scala.inline
    def setApply(value: Boolean): Self = this.set("apply", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApply: Self = this.set("apply", js.undefined)
  }
  
}

