package typings
package gotLib.gotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentOptions extends js.Object {
  var http: nodeLib.httpMod.Agent
  var https: nodeLib.httpsMod.Agent
}

object AgentOptions {
  @scala.inline
  def apply(http: nodeLib.httpMod.Agent, https: nodeLib.httpsMod.Agent): AgentOptions = {
    val __obj = js.Dynamic.literal(http = http, https = https)
  
    __obj.asInstanceOf[AgentOptions]
  }
}

