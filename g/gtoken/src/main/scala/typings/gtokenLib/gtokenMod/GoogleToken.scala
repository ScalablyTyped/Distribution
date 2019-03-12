package typings
package gtokenLib.gtokenMod

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
  var email: js.UndefOr[java.lang.String] = js.native
  var ensureEmail: js.Any = js.native
  var expiresAt: js.UndefOr[scala.Double | scala.Null] = js.native
  var getTokenAsync: js.Any = js.native
  var iss: js.UndefOr[java.lang.String] = js.native
  var key: js.UndefOr[java.lang.String] = js.native
  var keyFile: js.UndefOr[java.lang.String] = js.native
  var rawToken: TokenData | scala.Null = js.native
  /**
    * Request the token from Google.
    */
  var requestToken: js.Any = js.native
  var revokeTokenAsync: js.Any = js.native
  var scope: js.UndefOr[java.lang.String] = js.native
  var sub: js.UndefOr[java.lang.String] = js.native
  var token: js.UndefOr[java.lang.String | scala.Null] = js.native
  var tokenExpires: scala.Double | scala.Null = js.native
  /**
    * Given a keyFile, extract the key and client email if available
    * @param keyFile Path to a json, pem, or p12 file that contains the key.
    * @returns an object with privateKey and clientEmail properties
    */
  def getCredentials(keyFile: java.lang.String): js.Promise[Credentials] = js.native
  /**
    * Returns a cached token or retrieves a new one from Google.
    *
    * @param callback The callback function.
    */
  def getToken(): js.Promise[js.UndefOr[java.lang.String | scala.Null]] = js.native
  def getToken(
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* token */ js.UndefOr[java.lang.String | scala.Null], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Returns whether the token has expired.
    *
    * @return true if the token has expired, false otherwise.
    */
  def hasExpired(): scala.Boolean = js.native
  /**
    * Revoke the token if one is set.
    *
    * @param callback The callback function.
    */
  def revokeToken(): js.Promise[scala.Unit] = js.native
  def revokeToken(callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]): scala.Unit = js.native
}

