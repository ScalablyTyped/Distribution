package typings.ibmDashCloudDashSdkDashCore.libBaseUnderscoreServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ibm-cloud-sdk-core/lib/base_service", "BaseService")
@js.native
class BaseService protected () extends js.Object {
  /**
    * Internal base class that other services inherit from
    * @param {UserOptions} options
    * @param {string} [options.username] - required unless use_unauthenticated is set
    * @param {string} [options.password] - required unless use_unauthenticated is set
    * @param {boolean} [options.use_unauthenticated] - skip credential requirement
    * @param {HeaderOptions} [options.headers]
    * @param {boolean} [options.headers.X-Watson-Learning-Opt-Out=false] - opt-out of data collection
    * @param {string} [options.url] - override default service base url
    * @private
    * @abstract
    * @constructor
    * @throws {Error}
    * @returns {BaseService}
    */
  def this(userOptions: UserOptions) = this()
  var _options: BaseServiceOptions = js.native
  /**
    * Pulls credentials from VCAP_SERVICES env property that bluemix sets
    * @param {string} vcap_services_name
    * @private
    * @returns {Credentials}
    */
  var getCredentialsFromBluemix: js.Any = js.native
  /**
    * Pulls credentials from env properties
    *
    * Property checked is uppercase service.name suffixed by _USERNAME and _PASSWORD
    *
    * For example, if service.name is speech_to_text,
    * env properties are SPEECH_TO_TEXT_USERNAME and SPEECH_TO_TEXT_PASSWORD
    *
    * @private
    * @param {string} name - the service snake case name
    * @returns {Credentials}
    */
  var getCredentialsFromEnvironment: js.Any = js.native
  /**
    * @private
    * @param {UserOptions} options
    * @returns {BaseServiceOptions}
    */
  var initCredentials: js.Any = js.native
  var name: String = js.native
  var serviceDefaults: js.Object = js.native
  var serviceVersion: String = js.native
  var tokenManager: js.Any = js.native
  /**
    * Wrapper around `sendRequest` that determines whether or not IAM tokens
    * are being used to authenticate the request. If so, the token is
    * retrieved by the token manager.
    *
    * @param {Object} parameters - service request options passed in by user
    * @param {Function} callback - callback function to pass the response back to
    * @returns {ReadableStream|undefined}
    */
  /* protected */ def createRequest(parameters: js.Any, callback: js.Any): js.Any = js.native
  /**
    * Retrieve this service's credentials - useful for passing to the authorization service
    *
    * Only returns a URL when token auth is used.
    *
    * @returns {Credentials}
    */
  def getServiceCredentials(): Credentials = js.native
  /**
    * Guarantee that the next request you make will be IAM authenticated. This
    * performs any requests necessary to get a valid IAM token so that if your
    * next request involves a streaming operation, it will not be interrupted.
    *
    * @param {Function} callback - callback function to return flow of execution
    *
    * @returns {void}
    */
  /* protected */ def preAuthenticate(callback: js.Any): Unit = js.native
  /**
    * Set an IAM access token to use when authenticating with the service.
    * The access token should be valid and not yet expired.
    *
    * By using this method, you accept responsibility for managing the
    * access token yourself. You must set a new access token before this
    * one expires. Failing to do so will result in authentication errors
    * after this token expires.
    *
    * @param {string} iam_access_token - A valid, non-expired IAM access token
    * @returns {void}
    */
  def setAccessToken(iam_access_token: String): Unit = js.native
}

/* static members */
@JSImport("ibm-cloud-sdk-core/lib/base_service", "BaseService")
@js.native
object BaseService extends js.Object {
  var URL: String = js.native
}

