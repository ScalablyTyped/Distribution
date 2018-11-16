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

