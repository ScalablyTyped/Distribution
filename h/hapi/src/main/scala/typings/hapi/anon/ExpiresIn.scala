package typings.hapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpiresIn extends js.Object {
  var expiresAt: js.UndefOr[String] = js.undefined
  var expiresIn: js.UndefOr[scala.Nothing] = js.undefined
}

object ExpiresIn {
  @scala.inline
  def apply(expiresAt: String = null): ExpiresIn = {
    val __obj = js.Dynamic.literal()
    if (expiresAt != null) __obj.updateDynamic("expiresAt")(expiresAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpiresIn]
  }
}

