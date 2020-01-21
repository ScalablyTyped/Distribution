package typings.keycloakJs.keycloakAuthzMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeycloakAuthorizationPromise extends js.Object {
  def `then`(
    onGrant: js.Function1[/* rpt */ String, Unit],
    onDeny: js.Function0[Unit],
    onError: js.Function0[Unit]
  ): Unit
}

object KeycloakAuthorizationPromise {
  @scala.inline
  def apply(`then`: (js.Function1[/* rpt */ String, Unit], js.Function0[Unit], js.Function0[Unit]) => Unit): KeycloakAuthorizationPromise = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("then")(js.Any.fromFunction3(`then`))
    __obj.asInstanceOf[KeycloakAuthorizationPromise]
  }
}

