package typings.keystonejsAppAdminUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItem[UserType /* <: js.Object */, ListNames /* <: String */] extends js.Object {
  var item: UserType
  var list: ListNames
}

object AnonItem {
  @scala.inline
  def apply[UserType /* <: js.Object */, ListNames /* <: String */](item: UserType, list: ListNames): AnonItem[UserType, ListNames] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItem[UserType, ListNames]]
  }
}

