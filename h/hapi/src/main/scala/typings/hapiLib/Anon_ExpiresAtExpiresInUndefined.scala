package typings
package hapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExpiresAtExpiresInUndefined extends js.Object {
  var expiresAt: js.UndefOr[scala.Nothing] = js.undefined
  var expiresIn: js.UndefOr[scala.Nothing] = js.undefined
}

object Anon_ExpiresAtExpiresInUndefined {
  @scala.inline
  def apply(
    expiresAt: js.UndefOr[scala.Nothing] = js.undefined,
    expiresIn: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_ExpiresAtExpiresInUndefined = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expiresAt)) __obj.updateDynamic("expiresAt")(expiresAt)
    if (!js.isUndefined(expiresIn)) __obj.updateDynamic("expiresIn")(expiresIn)
    __obj.asInstanceOf[Anon_ExpiresAtExpiresInUndefined]
  }
}

