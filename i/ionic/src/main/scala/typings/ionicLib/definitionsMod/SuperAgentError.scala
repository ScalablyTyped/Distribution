package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuperAgentError
  extends nodeLib.Error {
  var response: superagentLib.superagentMod.requestNs.Response
}

object SuperAgentError {
  @scala.inline
  def apply(response: superagentLib.superagentMod.requestNs.Response, stack: java.lang.String = null): SuperAgentError = {
    val __obj = js.Dynamic.literal(response = response)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[SuperAgentError]
  }
}

