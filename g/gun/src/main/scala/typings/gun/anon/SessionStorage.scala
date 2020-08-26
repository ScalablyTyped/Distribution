package typings.gun.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionStorage extends js.Object {
  var sessionStorage: Boolean = js.native
}

object SessionStorage {
  @scala.inline
  def apply(sessionStorage: Boolean): SessionStorage = {
    val __obj = js.Dynamic.literal(sessionStorage = sessionStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionStorage]
  }
  @scala.inline
  implicit class SessionStorageOps[Self <: SessionStorage] (val x: Self) extends AnyVal {
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
    def setSessionStorage(value: Boolean): Self = this.set("sessionStorage", value.asInstanceOf[js.Any])
  }
  
}

