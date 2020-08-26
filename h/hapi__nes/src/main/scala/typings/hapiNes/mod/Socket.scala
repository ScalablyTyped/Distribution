package typings.hapiNes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Socket extends js.Object {
  var app: js.Object = js.native
  var auth: SocketAuthObject = js.native
  var id: String = js.native
  def disconnect(): js.Promise[_] = js.native
  def publish(path: String, message: js.Any): js.Promise[_] = js.native
  def revoke(path: String, message: js.Any): js.Promise[_] = js.native
  def send(message: js.Any): js.Promise[_] = js.native
}

object Socket {
  @scala.inline
  def apply(
    app: js.Object,
    auth: SocketAuthObject,
    disconnect: () => js.Promise[_],
    id: String,
    publish: (String, js.Any) => js.Promise[_],
    revoke: (String, js.Any) => js.Promise[_],
    send: js.Any => js.Promise[_]
  ): Socket = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], auth = auth.asInstanceOf[js.Any], disconnect = js.Any.fromFunction0(disconnect), id = id.asInstanceOf[js.Any], publish = js.Any.fromFunction2(publish), revoke = js.Any.fromFunction2(revoke), send = js.Any.fromFunction1(send))
    __obj.asInstanceOf[Socket]
  }
  @scala.inline
  implicit class SocketOps[Self <: Socket] (val x: Self) extends AnyVal {
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
    def setApp(value: js.Object): Self = this.set("app", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuth(value: SocketAuthObject): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisconnect(value: () => js.Promise[_]): Self = this.set("disconnect", js.Any.fromFunction0(value))
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublish(value: (String, js.Any) => js.Promise[_]): Self = this.set("publish", js.Any.fromFunction2(value))
    @scala.inline
    def setRevoke(value: (String, js.Any) => js.Promise[_]): Self = this.set("revoke", js.Any.fromFunction2(value))
    @scala.inline
    def setSend(value: js.Any => js.Promise[_]): Self = this.set("send", js.Any.fromFunction1(value))
  }
  
}

