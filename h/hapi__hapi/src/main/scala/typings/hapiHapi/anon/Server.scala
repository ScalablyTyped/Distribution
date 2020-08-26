package typings.hapiHapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends js.Object {
  /**
    * Response timeout in milliseconds. Sets the maximum time allowed for the server to respond to an incoming request before giving up and responding with a Service Unavailable (503) error
    * response.
    */
  var server: js.UndefOr[Boolean | Double] = js.native
  /**
    * @default none (use node default of 2 minutes).
    * By default, node sockets automatically timeout after 2 minutes. Use this option to override this behavior. Set to false to disable socket timeouts.
    */
  var socket: js.UndefOr[Boolean | Double] = js.native
}

object Server {
  @scala.inline
  def apply(): Server = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Server]
  }
  @scala.inline
  implicit class ServerOps[Self <: Server] (val x: Self) extends AnyVal {
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
    def setServer(value: Boolean | Double): Self = this.set("server", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
    @scala.inline
    def setSocket(value: Boolean | Double): Self = this.set("socket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocket: Self = this.set("socket", js.undefined)
  }
  
}

