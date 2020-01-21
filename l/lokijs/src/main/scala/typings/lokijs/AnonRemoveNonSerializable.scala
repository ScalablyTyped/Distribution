package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRemoveNonSerializable extends js.Object {
  var removeNonSerializable: js.UndefOr[Boolean] = js.undefined
}

object AnonRemoveNonSerializable {
  @scala.inline
  def apply(removeNonSerializable: js.UndefOr[Boolean] = js.undefined): AnonRemoveNonSerializable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(removeNonSerializable)) __obj.updateDynamic("removeNonSerializable")(removeNonSerializable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRemoveNonSerializable]
  }
}

