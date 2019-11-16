package typings.atKeystonejsAppDashAdminDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Item[UserType /* <: js.Object */, ListNames /* <: String */] extends js.Object {
  var item: UserType
  var list: ListNames
}

object Anon_Item {
  @scala.inline
  def apply[UserType /* <: js.Object */, ListNames /* <: String */](item: UserType, list: ListNames): Anon_Item[UserType, ListNames] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Item[UserType, ListNames]]
  }
}

