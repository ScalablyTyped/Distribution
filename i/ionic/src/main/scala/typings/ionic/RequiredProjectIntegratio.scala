package typings.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<ionic.ionic/definitions.ProjectIntegration> */
trait RequiredProjectIntegratio extends js.Object {
  var enabled: Boolean
  var root: String
}

object RequiredProjectIntegratio {
  @scala.inline
  def apply(enabled: Boolean, root: String): RequiredProjectIntegratio = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RequiredProjectIntegratio]
  }
}

