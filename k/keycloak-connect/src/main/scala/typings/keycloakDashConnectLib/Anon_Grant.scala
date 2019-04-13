package typings
package keycloakDashConnectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Grant extends js.Object {
  var grant: js.UndefOr[keycloakDashConnectLib.keycloakDashConnectMod.Grant] = js.undefined
}

object Anon_Grant {
  @scala.inline
  def apply(grant: keycloakDashConnectLib.keycloakDashConnectMod.Grant = null): Anon_Grant = {
    val __obj = js.Dynamic.literal()
    if (grant != null) __obj.updateDynamic("grant")(grant)
    __obj.asInstanceOf[Anon_Grant]
  }
}

