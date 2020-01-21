package typings.keycloakConnect

import typings.keycloakConnect.mod.Grant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGrant extends js.Object {
  var grant: js.UndefOr[Grant] = js.undefined
}

object AnonGrant {
  @scala.inline
  def apply(grant: Grant = null): AnonGrant = {
    val __obj = js.Dynamic.literal()
    if (grant != null) __obj.updateDynamic("grant")(grant.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGrant]
  }
}

