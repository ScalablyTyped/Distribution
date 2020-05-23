package typings.jsforce.oauth2Mod

import typings.jsforce.anon.Scope
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/oauth2", "OAuth2")
@js.native
class OAuth2 () extends js.Object {
  def this(options: OAuth2Options) = this()
  var authzServiceUrl: String = js.native
  var clientId: String = js.native
  var clientSecret: String = js.native
  var loginUrl: String = js.native
  var redirectUri: String = js.native
  var revokeServiceUrl: String = js.native
  var tokenServiceUrl: String = js.native
  def authenticate(username: String, password: String): js.Promise[TokenResponse] = js.native
  def authenticate(
    username: String,
    password: String,
    callback: js.Function2[/* err */ Error, /* tokenResponse */ TokenResponse, Unit]
  ): js.Promise[TokenResponse] = js.native
  def getAuthorizationUrl(params: Scope): String = js.native
  def refreshToken(code: String): js.Promise[TokenResponse] = js.native
  def refreshToken(code: String, callback: js.Function2[/* err */ Error, /* tokenResponse */ TokenResponse, Unit]): js.Promise[TokenResponse] = js.native
  def requestToken(code: String): js.Promise[TokenResponse] = js.native
  def requestToken(code: String, callback: js.Function2[/* err */ Error, /* tokenResponse */ TokenResponse, Unit]): js.Promise[TokenResponse] = js.native
  def revokeToken(accessToken: String): js.Promise[js.UndefOr[scala.Nothing]] = js.native
  def revokeToken(accessToken: String, callback: js.Function1[/* err */ Error, Unit]): js.Promise[js.UndefOr[scala.Nothing]] = js.native
}

