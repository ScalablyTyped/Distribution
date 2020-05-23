package typings.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveNonSerializable extends js.Object {
  var removeNonSerializable: js.UndefOr[Boolean] = js.undefined
}

object RemoveNonSerializable {
  @scala.inline
  def apply(removeNonSerializable: js.UndefOr[Boolean] = js.undefined): RemoveNonSerializable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(removeNonSerializable)) __obj.updateDynamic("removeNonSerializable")(removeNonSerializable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveNonSerializable]
  }
}

