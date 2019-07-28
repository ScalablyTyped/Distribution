package typings.gtoken.gtokenMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gtoken", "GoogleToken")
@js.native
/**
  * Create a GoogleToken.
  *
  * @param options  Configuration object.
  */
class GoogleToken () extends js.Object {
  def this(options: TokenOptions) = this()
  var additionalClaims: js.UndefOr[js.Object] = js.native
  /**
    * Configure the GoogleToken for re-use.
    * @param  {object} options Configuration object.
    */
  var configure: js.Any = js.native
  var email: js.UndefOr[String] = js.native
  var ensureEmail: js.Any = js.native
  var expiresAt: js.UndefOr[Double | Null] = js.native
  var getTokenAsync: js.Any = js.native
  var iss: js.UndefOr[String] = js.native
  var key: js.UndefOr[String] = js.native
  var keyFile: js.UndefOr[String] = js.native
  var rawToken: TokenData | Null = js.native
  /**
    * Request the token from Google.
    */
  var requestToken: js.Any = js.native
  var revokeTokenAsync: js.Any = js.native
  var scope: js.UndefOr[String] = js.native
  var sub: js.UndefOr[String] = js.native
  var token: js.UndefOr[String | Null] = js.native
  var tokenExpires: Double | Null = js.native
  /**
    * Given a keyFile, extract the key and client email if available
    * @param keyFile Path to a json, pem, or p12 file that contains the key.
    * @returns an object with privateKey and clientEmail properties
    */
  def getCredentials(keyFile: String): js.Promise[Credentials] = js.native
  /**
    * Returns a cached token or retrieves a new one from Google.
    *
    * @param callback The callback function.
    */
  def getToken(): js.Promise[js.UndefOr[String | Null]] = js.native
  def getToken(callback: js.Function2[/* err */ Error | Null, /* token */ js.UndefOr[String | Null], Unit]): Unit = js.native
  /**
    * Returns whether the token has expired.
    *
    * @return true if the token has expired, false otherwise.
    */
  def hasExpired(): Boolean = js.native
  /**
    * Revoke the token if one is set.
    *
    * @param callback The callback function.
    */
  def revokeToken(): js.Promise[Unit] = js.native
  def revokeToken(callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
}

