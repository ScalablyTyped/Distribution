package typings.hummusRecipe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptOptions extends js.Object {
  var ownerPassword: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var userProtectionFlag: js.UndefOr[Double] = js.undefined
}

object EncryptOptions {
  @scala.inline
  def apply(
    ownerPassword: String = null,
    password: String = null,
    userProtectionFlag: js.UndefOr[Double] = js.undefined
  ): EncryptOptions = {
    val __obj = js.Dynamic.literal()
    if (ownerPassword != null) __obj.updateDynamic("ownerPassword")(ownerPassword.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(userProtectionFlag)) __obj.updateDynamic("userProtectionFlag")(userProtectionFlag.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptOptions]
  }
}

