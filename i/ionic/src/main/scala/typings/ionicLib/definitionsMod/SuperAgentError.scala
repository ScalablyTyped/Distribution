package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuperAgentError
  extends stdLib.Error {
  var response: superagentLib.superagentMod.requestNs.Response
}

object SuperAgentError {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: java.lang.String,
    response: superagentLib.superagentMod.requestNs.Response,
    stack: java.lang.String = null
  ): SuperAgentError = {
    val __obj = js.Dynamic.literal(message = message, name = name, response = response)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[SuperAgentError]
  }
}

