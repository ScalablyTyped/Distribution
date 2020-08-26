package typings.gun.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrString extends js.Object {
  var err: String = js.native
}

object ErrString {
  @scala.inline
  def apply(err: String): ErrString = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrString]
  }
  @scala.inline
  implicit class ErrStringOps[Self <: ErrString] (val x: Self) extends AnyVal {
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
    def setErr(value: String): Self = this.set("err", value.asInstanceOf[js.Any])
  }
  
}

