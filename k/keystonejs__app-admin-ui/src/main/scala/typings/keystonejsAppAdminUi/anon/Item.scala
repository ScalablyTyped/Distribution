package typings.keystonejsAppAdminUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item[UserType /* <: js.Object */, ListNames /* <: String */] extends js.Object {
  var item: UserType
  var list: ListNames
}

object Item {
  @scala.inline
  def apply[/* <: js.Object */ UserType, /* <: java.lang.String */ ListNames](item: UserType, list: ListNames): Item[UserType, ListNames] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item[UserType, ListNames]]
  }
}

