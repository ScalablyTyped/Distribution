package typings.hapi

import typings.iron.mod.SealOptionsSub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIntegrity extends js.Object {
  var integrity: js.UndefOr[SealOptionsSub] = js.undefined
  var password: String
}

object AnonIntegrity {
  @scala.inline
  def apply(password: String, integrity: SealOptionsSub = null): AnonIntegrity = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIntegrity]
  }
}

