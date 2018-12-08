package typings
package gtokenLib.gtokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gtoken", "GoogleToken")
@js.native
class GoogleToken () extends js.Object {
  /**
       * Create a GoogleToken.
       *
       * @param options  Configuration object.
       */
  def this(options: TokenOptions) = this()
  var additionalClaims: js.UndefOr[js.Object] = js.native
  var email: js.UndefOr[java.lang.String] = js.native
  var expiresAt: js.UndefOr[scala.Double | scala.Null] = js.native
  var iss: js.UndefOr[java.lang.String] = js.native
  var key: js.UndefOr[java.lang.String] = js.native
  var keyFile: js.UndefOr[java.lang.String] = js.native
  var rawToken: TokenData | scala.Null = js.native
  var scope: js.UndefOr[java.lang.String] = js.native
  var sub: js.UndefOr[java.lang.String] = js.native
  var token: js.UndefOr[java.lang.String | scala.Null] = js.native
  var tokenExpires: scala.Double | scala.Null = js.native
  /**
       * Configure the GoogleToken for re-use.
       * @param  {object} options Configuration object.
       */
  /* private */ def configure(): js.Any = js.native
  /**
       * Configure the GoogleToken for re-use.
       * @param  {object} options Configuration object.
       */
  /* private */ def configure(options: js.Any): js.Any = js.native
  /* private */ def ensureEmail(): js.Any = js.native
  /**
       * Given a keyFile, extract the key and client email if available
       * @param keyFile Path to a json, pem, or p12 file that contains the key.
       * @returns an object with privateKey and clientEmail properties
       */
  def getCredentials(keyFile: java.lang.String): stdLib.Promise[Credentials] = js.native
  /**
       * Returns a cached token or retrieves a new one from Google.
       *
       * @param callback The callback function.
       */
  def getToken(): stdLib.Promise[js.UndefOr[java.lang.String | scala.Null]] = js.native
  def getToken(
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* token */ js.UndefOr[java.lang.String | scala.Null], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /* private */ def getTokenAsync(): js.Any = js.native
  /**
       * Returns whether the token has expired.
       *
       * @return true if the token has expired, false otherwise.
       */
  def hasExpired(): scala.Boolean = js.native
  /**
       * Request the token from Google.
       */
  /* private */ def requestToken(): js.Any = js.native
  /**
       * Revoke the token if one is set.
       *
       * @param callback The callback function.
       */
  def revokeToken(): stdLib.Promise[scala.Unit] = js.native
  def revokeToken(callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]): scala.Unit = js.native
  /* private */ def revokeTokenAsync(): js.Any = js.native
}

