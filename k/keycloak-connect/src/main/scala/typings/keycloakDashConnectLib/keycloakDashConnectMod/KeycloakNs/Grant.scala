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
    isExpired: () => scala.Boolean,
    refresh_token: Token,
    store: (expressLib.expressMod.eNs.Request, expressLib.expressMod.eNs.Response) => scala.Unit,
    toString: () => java.lang.String,
    token_type: java.lang.String,
    update: Grant => scala.Unit
  ): Grant = {
    val __obj = js.Dynamic.literal(__raw = __raw, access_token = access_token, expires_in = expires_in, id_token = id_token, isExpired = js.Any.fromFunction0(isExpired), refresh_token = refresh_token, store = js.Any.fromFunction2(store), toString = js.Any.fromFunction0(toString), token_type = token_type, update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[Grant]
  }
}

