package typings.keycloakDashConnect.keycloakDashConnectMod

import typings.express.expressMod.Request
import typings.express.expressMod.RequestHandler
import typings.express.expressMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keycloak extends js.Object {
  def accessDenied(request: Request, response: Response): Unit = js.native
  def accountUrl(): String = js.native
  def authenticated(request: Request): Unit = js.native
  def deauthenticated(request: Request): Unit = js.native
  def getAccount(token: Token): js.Promise[_] = js.native
  def getGrant(request: Request, response: Response): js.Promise[Grant] = js.native
  def getGrantFromCode(code: String, request: Request, response: Response): js.Promise[Grant] = js.native
  def loginUrl(uuid: String, redirectUrl: String): String = js.native
  def logoutUrl(redirectUrl: String): String = js.native
  def middleware(): RequestHandler = js.native
  def middleware(options: MiddlewareOptions): RequestHandler = js.native
  def protect(): RequestHandler = js.native
  def protect(spec: String): RequestHandler = js.native
  def protect(spec: SpecHandler): RequestHandler = js.native
  def redirectToLogin(request: Request): Boolean = js.native
  def storeGrant(grant: Grant, request: Request, response: Response): Grant = js.native
  def unstoreGrant(sessionId: String): Unit = js.native
}

