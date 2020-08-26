package typings.hapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  /**
    * decorations on the request object.
    */
  var request: js.Array[String] = js.native
  /**
    * decorations on the server object.
    */
  var server: js.Array[String] = js.native
  /**
    * decorations on the response toolkit.
    */
  var toolkit: js.Array[String] = js.native
}

object Request {
  @scala.inline
  def apply(request: js.Array[String], server: js.Array[String], toolkit: js.Array[String]): Request = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], toolkit = toolkit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
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
    def setRequestVarargs(value: String*): Self = this.set("request", js.Array(value :_*))
    @scala.inline
    def setRequest(value: js.Array[String]): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerVarargs(value: String*): Self = this.set("server", js.Array(value :_*))
    @scala.inline
    def setServer(value: js.Array[String]): Self = this.set("server", value.asInstanceOf[js.Any])
    @scala.inline
    def setToolkitVarargs(value: String*): Self = this.set("toolkit", js.Array(value :_*))
    @scala.inline
    def setToolkit(value: js.Array[String]): Self = this.set("toolkit", value.asInstanceOf[js.Any])
  }
  
}

