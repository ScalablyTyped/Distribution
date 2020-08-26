package typings.gun.anon

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Err extends js.Object {
  var err: Error = js.native
  var ok: js.Any = js.native
}

object Err {
  @scala.inline
  def apply(err: Error, ok: js.Any): Err = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[Err]
  }
  @scala.inline
  implicit class ErrOps[Self <: Err] (val x: Self) extends AnyVal {
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
    def setErr(value: Error): Self = this.set("err", value.asInstanceOf[js.Any])
    @scala.inline
    def setOk(value: js.Any): Self = this.set("ok", value.asInstanceOf[js.Any])
  }
  
}

