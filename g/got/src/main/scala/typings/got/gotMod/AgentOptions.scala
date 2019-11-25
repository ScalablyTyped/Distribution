package typings.got.gotMod

import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentOptions extends js.Object {
  var http: Agent
  var https: typings.node.httpsMod.Agent
}

object AgentOptions {
  @scala.inline
  def apply(http: Agent, https: typings.node.httpsMod.Agent): AgentOptions = {
    val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any], https = https.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AgentOptions]
  }
}

