package typings
package atHapiHapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExpiresAt extends js.Object {
  var expiresAt: js.UndefOr[scala.Nothing] = js.undefined
  var expiresIn: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ExpiresAt {
  @scala.inline
  def apply(expiresAt: js.UndefOr[scala.Nothing] = js.undefined, expiresIn: scala.Int | scala.Double = null): Anon_ExpiresAt = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expiresAt)) __obj.updateDynamic("expiresAt")(expiresAt)
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExpiresAt]
  }
}

