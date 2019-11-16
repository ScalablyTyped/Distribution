package typings.atKeystonejsAppDashAdminDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Authentication[UserType /* <: js.Object */, ListNames /* <: String */] extends js.Object {
  var authentication: Anon_Item[UserType, ListNames]
}

object Anon_Authentication {
  @scala.inline
  def apply[UserType /* <: js.Object */, ListNames /* <: String */](authentication: Anon_Item[UserType, ListNames]): Anon_Authentication[UserType, ListNames] = {
    val __obj = js.Dynamic.literal(authentication = authentication)
  
    __obj.asInstanceOf[Anon_Authentication[UserType, ListNames]]
  }
}

