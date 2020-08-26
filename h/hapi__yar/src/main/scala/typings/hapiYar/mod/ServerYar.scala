package typings.hapiYar.mod

import typings.hapiCatbox.mod.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerYar extends js.Object {
  def revoke(id: Id): js.Promise[Unit] = js.native
}

object ServerYar {
  @scala.inline
  def apply(revoke: Id => js.Promise[Unit]): ServerYar = {
    val __obj = js.Dynamic.literal(revoke = js.Any.fromFunction1(revoke))
    __obj.asInstanceOf[ServerYar]
  }
  @scala.inline
  implicit class ServerYarOps[Self <: ServerYar] (val x: Self) extends AnyVal {
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
    def setRevoke(value: Id => js.Promise[Unit]): Self = this.set("revoke", js.Any.fromFunction1(value))
  }
  
}

