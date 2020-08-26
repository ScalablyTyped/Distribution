package typings.gun.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ok extends js.Object {
  var err: js.UndefOr[scala.Nothing] = js.native
  var ok: String = js.native
}

object Ok {
  @scala.inline
  def apply(ok: String): Ok = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ok]
  }
  @scala.inline
  implicit class OkOps[Self <: Ok] (val x: Self) extends AnyVal {
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
    def setOk(value: String): Self = this.set("ok", value.asInstanceOf[js.Any])
  }
  
}

