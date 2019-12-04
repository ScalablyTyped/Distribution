package typings.graphqlDashTools

import typings.graphqlDashTools.graphqlDashToolsStrings.OWN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var error: js.Any
  var kind: OWN
}

object Anon_Error {
  @scala.inline
  def apply(error: js.Any, kind: OWN): Anon_Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Error]
  }
}

