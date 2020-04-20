package typings.graphqlTools

import typings.graphqlTools.graphqlToolsStrings.OWN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  var error: js.Any
  var kind: OWN
}

object AnonError {
  @scala.inline
  def apply(error: js.Any, kind: OWN): AnonError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonError]
  }
}

