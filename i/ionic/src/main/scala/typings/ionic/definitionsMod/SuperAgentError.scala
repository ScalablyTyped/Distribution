package typings.ionic.definitionsMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuperAgentError extends Error {
  var response: typings.superagent.superagentMod.Response
}

object SuperAgentError {
  @scala.inline
  def apply(
    message: String,
    name: String,
    response: typings.superagent.superagentMod.Response,
    stack: String = null
  ): SuperAgentError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuperAgentError]
  }
}

