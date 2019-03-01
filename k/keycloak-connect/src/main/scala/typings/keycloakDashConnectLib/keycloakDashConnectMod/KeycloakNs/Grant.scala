package typings
package keycloakDashConnectLib.keycloakDashConnectMod.KeycloakNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Grant extends js.Object {
  var __raw: java.lang.String
  var access_token: Token
  var expires_in: scala.Double
  var id_token: Token
  var refresh_token: Token
  var token_type: java.lang.String
  def isExpired(): scala.Boolean
  def store(request: expressLib.expressMod.eNs.Request, response: expressLib.expressMod.eNs.Response): scala.Unit
  def update(grant: Grant): scala.Unit
}

object Grant {
  @scala.inline
  def apply(
    __raw: java.lang.String,
    access_token: Token,
    expires_in: scala.Double,
    id_token: Token,
    isExpired: js.Function0[scala.Boolean],
    refresh_token: Token,
    store: js.Function2[expressLib.expressMod.eNs.Request, expressLib.expressMod.eNs.Response, scala.Unit],
    toString: js.Function0[java.lang.String],
    token_type: java.lang.String,
    update: js.Function1[Grant, scala.Unit]
  ): Grant = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("__raw")(__raw)
    __obj.updateDynamic("access_token")(access_token)
    __obj.updateDynamic("expires_in")(expires_in)
    __obj.updateDynamic("id_token")(id_token)
    __obj.updateDynamic("isExpired")(isExpired)
    __obj.updateDynamic("refresh_token")(refresh_token)
    __obj.updateDynamic("store")(store)
    __obj.updateDynamic("toString")(toString)
    __obj.updateDynamic("token_type")(token_type)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[Grant]
  }
}

