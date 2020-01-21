package typings.ibmCloudSdkCore.v1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ibm-cloud-sdk-core/iam-token-manager/v1", "IamTokenManagerV1")
@js.native
class IamTokenManagerV1 protected () extends js.Object {
  /**
    * IAM Token Manager Service
    *
    * Retreives, stores, and refreshes IAM tokens.
    *
    * @param {Object} options
    * @param {String} options.iamApikey
    * @param {String} options.iamAccessToken
    * @param {String} options.iamUrl - url of the iam api to retrieve tokens from
    * @constructor
    */
  def this(options: Options) = this()
  var iamApikey: js.Any = js.native
  var iamUrl: String = js.native
  /**
    * Used as a fail-safe to prevent the condition of a refresh token expiring,
    * which could happen after around 30 days. This function will return true
    * if it has been at least 7 days and 1 hour since the last token was
    * retrieved.
    *
    * @private
    * @returns {boolean}
    */
  var isRefreshTokenExpired: js.Any = js.native
  /**
    * Check if currently stored token is expired.
    *
    * Using a buffer to prevent the edge case of the
    * token expiring before the request could be made.
    *
    * The buffer will be a fraction of the total TTL. Using 80%.
    *
    * @private
    * @returns {boolean}
    */
  var isTokenExpired: js.Any = js.native
  var name: String = js.native
  /**
    * Refresh an IAM token using a refresh token.
    *
    * @param {Function} cb - The callback that handles the response.
    * @returns {void}
    */
  var refreshToken: js.Any = js.native
  /**
    * Request an IAM token using an API key.
    *
    * @param {Function} cb - The callback that handles the response.
    * @returns {void}
    */
  var requestToken: js.Any = js.native
  /**
    * Save the response from the IAM service request to the object's state.
    *
    * @param {IamTokenData} tokenResponse - Response object from IAM service request
    * @private
    * @returns {void}
    */
  var saveTokenInfo: js.Any = js.native
  var serviceVersion: String = js.native
  var tokenInfo: IamTokenData = js.native
  var userAccessToken: js.Any = js.native
  /**
    * This function sends an access token back through a callback. The source of the token
    * is determined by the following logic:
    * 1. If user provides their own managed access token, assume it is valid and send it
    * 2. If this class is managing tokens and does not yet have one, make a request for one
    * 3. If this class is managing tokens and the token has expired, refresh it
    * 4. If this class is managing tokens and has a valid token stored, send it
    *
    * @param {Function} cb - callback function that the token will be passed to
    */
  def getToken(cb: js.Function): js.Any = js.native
  /**
    * Set a self-managed IAM access token.
    * The access token should be valid and not yet expired.
    *
    * By using this method, you accept responsibility for managing the
    * access token yourself. You must set a new access token before this
    * one expires. Failing to do so will result in authentication errors
    * after this token expires.
    *
    * @param {string} iamAccessToken - A valid, non-expired IAM access token
    * @returns {void}
    */
  def setAccessToken(iamAccessToken: String): Unit = js.native
}

