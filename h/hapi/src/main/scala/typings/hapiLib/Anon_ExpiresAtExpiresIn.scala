package typings
package hapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExpiresAtExpiresIn extends js.Object {
  var expiresAt: js.UndefOr[java.lang.String] = js.undefined
  var expiresIn: js.UndefOr[scala.Nothing] = js.undefined
}

object Anon_ExpiresAtExpiresIn {
  @scala.inline
  def apply(expiresAt: java.lang.String = null, expiresIn: js.UndefOr[scala.Nothing] = js.undefined): Anon_ExpiresAtExpiresIn = {
    val __obj = js.Dynamic.literal()
    if (expiresAt != null) __obj.updateDynamic("expiresAt")(expiresAt)
    if (!js.isUndefined(expiresIn)) __obj.updateDynamic("expiresIn")(expiresIn)
    __obj.asInstanceOf[Anon_ExpiresAtExpiresIn]
  }
}

