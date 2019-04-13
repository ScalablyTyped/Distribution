package typings
package keycloakDashConnectLib.keycloakDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keycloak extends js.Object {
  def accessDenied(request: expressLib.expressMod.Request, response: expressLib.expressMod.Response): scala.Unit = js.native
  def accountUrl(): java.lang.String = js.native
  def authenticated(request: expressLib.expressMod.Request): scala.Unit = js.native
  def deauthenticated(request: expressLib.expressMod.Request): scala.Unit = js.native
  def getAccount(token: Token): js.Promise[_] = js.native
  def getGrant(request: expressLib.expressMod.Request, response: expressLib.expressMod.Response): js.Promise[Grant] = js.native
  def getGrantFromCode(
    code: java.lang.String,
    request: expressLib.expressMod.Request,
    response: expressLib.expressMod.Response
  ): js.Promise[Grant] = js.native
  def loginUrl(uuid: java.lang.String, redirectUrl: java.lang.String): java.lang.String = js.native
  def logoutUrl(redirectUrl: java.lang.String): java.lang.String = js.native
  def middleware(): expressLib.expressMod.RequestHandler = js.native
  def middleware(options: MiddlewareOptions): expressLib.expressMod.RequestHandler = js.native
  def protect(): expressLib.expressMod.RequestHandler = js.native
  def protect(spec: java.lang.String): expressLib.expressMod.RequestHandler = js.native
  def protect(spec: SpecHandler): expressLib.expressMod.RequestHandler = js.native
  def redirectToLogin(request: expressLib.expressMod.Request): scala.Boolean = js.native
  def storeGrant(grant: Grant, request: expressLib.expressMod.Request, response: expressLib.expressMod.Response): Grant = js.native
  def unstoreGrant(sessionId: java.lang.String): scala.Unit = js.native
}

