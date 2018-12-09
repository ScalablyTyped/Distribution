package typings
package keycloakDashConnectLib.keycloakDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keycloak extends js.Object {
  def accessDenied(request: expressLib.expressMod.eNs.Request, response: expressLib.expressMod.eNs.Response): scala.Unit = js.native
  def accountUrl(): java.lang.String = js.native
  def authenticated(request: expressLib.expressMod.eNs.Request): scala.Unit = js.native
  def deauthenticated(request: expressLib.expressMod.eNs.Request): scala.Unit = js.native
  def getAccount(token: keycloakDashConnectLib.keycloakDashConnectMod.KeycloakNs.Token): js.Promise[_] = js.native
  def getGrant(request: expressLib.expressMod.eNs.Request, response: expressLib.expressMod.eNs.Response): js.Promise[keycloakDashConnectLib.keycloakDashConnectMod.KeycloakNs.Grant] = js.native
  def getGrantFromCode(
    code: java.lang.String,
    request: expressLib.expressMod.eNs.Request,
    response: expressLib.expressMod.eNs.Response
  ): js.Promise[keycloakDashConnectLib.keycloakDashConnectMod.KeycloakNs.Grant] = js.native
  def loginUrl(uuid: java.lang.String, redirectUrl: java.lang.String): java.lang.String = js.native
  def logoutUrl(redirectUrl: java.lang.String): java.lang.String = js.native
  def middleware(): expressLib.expressMod.eNs.RequestHandler = js.native
  def middleware(options: keycloakDashConnectLib.keycloakDashConnectMod.KeycloakNs.MiddlewareOptions): expressLib.expressMod.eNs.RequestHandler = js.native
  def protect(): expressLib.expressMod.eNs.RequestHandler = js.native
  def protect(spec: java.lang.String): expressLib.expressMod.eNs.RequestHandler = js.native
  def protect(spec: keycloakDashConnectLib.keycloakDashConnectMod.KeycloakNs.SpecHandler): expressLib.expressMod.eNs.RequestHandler = js.native
  def redirectToLogin(request: expressLib.expressMod.eNs.Request): scala.Boolean = js.native
  def storeGrant(
    grant: keycloakDashConnectLib.keycloakDashConnectMod.KeycloakNs.Grant,
    request: expressLib.expressMod.eNs.Request,
    response: expressLib.expressMod.eNs.Response
  ): keycloakDashConnectLib.keycloakDashConnectMod.KeycloakNs.Grant = js.native
  def unstoreGrant(sessionId: java.lang.String): scala.Unit = js.native
}

