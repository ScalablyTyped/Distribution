package typings.keystonejsAppAdminUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Authentication[UserType /* <: js.Object */, ListNames /* <: String */] extends js.Object {
  var authentication: Item[UserType, ListNames]
}

object Authentication {
  @scala.inline
  def apply[/* <: js.Object */ UserType, /* <: java.lang.String */ ListNames](authentication: Item[UserType, ListNames]): Authentication[UserType, ListNames] = {
    val __obj = js.Dynamic.literal(authentication = authentication.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authentication[UserType, ListNames]]
  }
}

