package typings
package hummusDashRecipeLib.hummusDashRecipeMod.RecipeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptOptions extends js.Object {
  var ownerPassword: js.UndefOr[java.lang.String] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var userProtectionFlag: js.UndefOr[scala.Double] = js.undefined
}

object EncryptOptions {
  @scala.inline
  def apply(
    ownerPassword: java.lang.String = null,
    password: java.lang.String = null,
    userProtectionFlag: scala.Int | scala.Double = null
  ): EncryptOptions = {
    val __obj = js.Dynamic.literal()
    if (ownerPassword != null) __obj.updateDynamic("ownerPassword")(ownerPassword)
    if (password != null) __obj.updateDynamic("password")(password)
    if (userProtectionFlag != null) __obj.updateDynamic("userProtectionFlag")(userProtectionFlag.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptOptions]
  }
}

