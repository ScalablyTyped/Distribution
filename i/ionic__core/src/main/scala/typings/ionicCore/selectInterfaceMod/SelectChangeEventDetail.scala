package typings.ionicCore.selectInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectChangeEventDetail extends js.Object {
  var value: js.UndefOr[js.Any | js.Array[_] | Null] = js.undefined
}

object SelectChangeEventDetail {
  @scala.inline
  def apply(value: js.UndefOr[Null | js.Any | js.Array[_]] = js.undefined): SelectChangeEventDetail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectChangeEventDetail]
  }
}

