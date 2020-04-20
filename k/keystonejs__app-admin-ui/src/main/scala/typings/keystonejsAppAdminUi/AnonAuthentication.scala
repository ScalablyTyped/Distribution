package typings.keystonejsAppAdminUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthentication[UserType /* <: js.Object */, ListNames /* <: String */] extends js.Object {
  var authentication: AnonItem[UserType, ListNames]
}

object AnonAuthentication {
  @scala.inline
  def apply[UserType /* <: js.Object */, ListNames /* <: String */](authentication: AnonItem[UserType, ListNames]): AnonAuthentication[UserType, ListNames] = {
    val __obj = js.Dynamic.literal(authentication = authentication.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthentication[UserType, ListNames]]
  }
}

