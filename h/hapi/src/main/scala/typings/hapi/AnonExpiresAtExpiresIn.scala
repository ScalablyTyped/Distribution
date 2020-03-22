package typings.hapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpiresAtExpiresIn extends js.Object {
  var expiresAt: js.UndefOr[scala.Nothing] = js.undefined
  var expiresIn: js.UndefOr[scala.Nothing] = js.undefined
}

object AnonExpiresAtExpiresIn {
  @scala.inline
  def apply(
    expiresAt: js.UndefOr[scala.Nothing] = js.undefined,
    expiresIn: js.UndefOr[scala.Nothing] = js.undefined
  ): AnonExpiresAtExpiresIn = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expiresAt)) __obj.updateDynamic("expiresAt")(expiresAt.asInstanceOf[js.Any])
    if (!js.isUndefined(expiresIn)) __obj.updateDynamic("expiresIn")(expiresIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpiresAtExpiresIn]
  }
}

