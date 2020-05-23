package typings.ionicCore.inputInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputChangeEventDetail extends js.Object {
  var value: js.UndefOr[String | Null] = js.undefined
}

object InputChangeEventDetail {
  @scala.inline
  def apply(value: js.UndefOr[Null | String] = js.undefined): InputChangeEventDetail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputChangeEventDetail]
  }
}

