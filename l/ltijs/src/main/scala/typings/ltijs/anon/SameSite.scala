package typings.ltijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SameSite extends js.Object {
  var sameSite: js.UndefOr[String] = js.undefined
  var secure: js.UndefOr[Boolean] = js.undefined
}

object SameSite {
  @scala.inline
  def apply(sameSite: String = null, secure: js.UndefOr[Boolean] = js.undefined): SameSite = {
    val __obj = js.Dynamic.literal()
    if (sameSite != null) __obj.updateDynamic("sameSite")(sameSite.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SameSite]
  }
}

