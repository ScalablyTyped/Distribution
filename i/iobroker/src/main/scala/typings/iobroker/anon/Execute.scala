package typings.iobroker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Execute extends js.Object {
  var execute: Boolean = js.native
  var http: Boolean = js.native
  var sendto: Boolean = js.native
}

object Execute {
  @scala.inline
  def apply(execute: Boolean, http: Boolean, sendto: Boolean): Execute = {
    val __obj = js.Dynamic.literal(execute = execute.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], sendto = sendto.asInstanceOf[js.Any])
    __obj.asInstanceOf[Execute]
  }
  @scala.inline
  implicit class ExecuteOps[Self <: Execute] (val x: Self) extends AnyVal {
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
    def setExecute(value: Boolean): Self = this.set("execute", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttp(value: Boolean): Self = this.set("http", value.asInstanceOf[js.Any])
    @scala.inline
    def setSendto(value: Boolean): Self = this.set("sendto", value.asInstanceOf[js.Any])
  }
  
}

