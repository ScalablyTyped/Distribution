package typings.got.mod

import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentOptions extends js.Object {
  var http: Agent = js.native
  var https: typings.node.httpsMod.Agent = js.native
}

object AgentOptions {
  @scala.inline
  def apply(http: Agent, https: typings.node.httpsMod.Agent): AgentOptions = {
    val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any], https = https.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentOptions]
  }
  @scala.inline
  implicit class AgentOptionsOps[Self <: AgentOptions] (val x: Self) extends AnyVal {
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
    def setHttp(value: Agent): Self = this.set("http", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttps(value: typings.node.httpsMod.Agent): Self = this.set("https", value.asInstanceOf[js.Any])
  }
  
}

