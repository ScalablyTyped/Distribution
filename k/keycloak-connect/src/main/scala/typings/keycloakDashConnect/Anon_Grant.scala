package typings.keycloakDashConnect

import typings.keycloakDashConnect.keycloakDashConnectMod.Grant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Grant extends js.Object {
  var grant: js.UndefOr[Grant] = js.undefined
}

object Anon_Grant {
  @scala.inline
  def apply(grant: Grant = null): Anon_Grant = {
    val __obj = js.Dynamic.literal()
    if (grant != null) __obj.updateDynamic("grant")(grant.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Grant]
  }
}

