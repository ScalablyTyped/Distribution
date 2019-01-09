package typings
package jsforceLib.oauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/oauth2", "OAuth2")
@js.native
class OAuth2 () extends js.Object {
  def this(options: OAuth2Options) = this()
  var authzServiceUrl: java.lang.String = js.native
  var clientId: java.lang.String = js.native
  var clientSecret: java.lang.String = js.native
  var loginUrl: java.lang.String = js.native
  var redirectUri: java.lang.String = js.native
  var revokeServiceUrl: java.lang.String = js.native
  var tokenServiceUrl: java.lang.String = js.native
  def authenticate(username: java.lang.String, password: java.lang.String): js.Promise[TokenResponse] = js.native
  def authenticate(
    username: java.lang.String,
    password: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* tokenResponse */ TokenResponse, scala.Unit]
  ): js.Promise[TokenResponse] = js.native
  def getAuthorizationUrl(params: jsforceLib.Anon_Scope): java.lang.String = js.native
  def refreshToken(code: java.lang.String): js.Promise[TokenResponse] = js.native
  def refreshToken(
    code: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* tokenResponse */ TokenResponse, scala.Unit]
  ): js.Promise[TokenResponse] = js.native
  def requestToken(code: java.lang.String): js.Promise[TokenResponse] = js.native
  def requestToken(
    code: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* tokenResponse */ TokenResponse, scala.Unit]
  ): js.Promise[TokenResponse] = js.native
  def revokeToken(accessToken: java.lang.String): js.Promise[js.UndefOr[scala.Nothing]] = js.native
  def revokeToken(accessToken: java.lang.String, callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): js.Promise[js.UndefOr[scala.Nothing]] = js.native
}

