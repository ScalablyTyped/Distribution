package typings.htmlDashValidator.htmlDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicOptions extends js.Object {
  var ignore: js.UndefOr[String | js.Array[String]] = js.undefined
  var isFragment: js.UndefOr[Boolean] = js.undefined
  var isLocal: js.UndefOr[Boolean] = js.undefined
  var validator: js.UndefOr[js.Object] = js.undefined
}

object BasicOptions {
  @scala.inline
  def apply(
    ignore: String | js.Array[String] = null,
    isFragment: js.UndefOr[Boolean] = js.undefined,
    isLocal: js.UndefOr[Boolean] = js.undefined,
    validator: js.Object = null
  ): BasicOptions = {
    val __obj = js.Dynamic.literal()
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(isFragment)) __obj.updateDynamic("isFragment")(isFragment)
    if (!js.isUndefined(isLocal)) __obj.updateDynamic("isLocal")(isLocal)
    if (validator != null) __obj.updateDynamic("validator")(validator)
    __obj.asInstanceOf[BasicOptions]
  }
}

