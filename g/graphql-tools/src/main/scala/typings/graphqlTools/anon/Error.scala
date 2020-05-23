package typings.graphqlTools.anon

import typings.graphqlTools.graphqlToolsStrings.OWN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var error: js.Any
  var kind: OWN
}

object Error {
  @scala.inline
  def apply(error: js.Any, kind: OWN): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

