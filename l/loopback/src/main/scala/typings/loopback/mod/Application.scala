package typings.loopback.mod

import typings.loopback.anon.Apns
import typings.std.Date
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Manage client applications and organize their users
  * @property {string} id  Generated ID.
  * @property {string} name Name; required.
  * @property {string} description Text description
  * @property {string} icon string Icon image URL.
  * @property {string} owner User ID of the developer who registers the application.
  * @property {string} email E-mail address
  * @property {boolean} emailVerified Whether the e-mail is verified.
  * @property {string} url OAuth 2.0  application URL.
  * @property {string}[]} callbackUrls The OAuth 2.0 code/token callback URL.
  * @property {string} status Status of the application; Either `production`, `sandbox` (default), or `disabled`.
  * @property {Date} created Date Application object was created.  Default: current date.
  * @property {Date} modified Date Application object was modified.  Default: current date
  * @property {any} pushSettings.apns APNS configuration, see the options
  *   below and also
  *   github.com/argon/node-apn/blob/master/doc/apn.markdown
  * @property {boolean} pushSettings.apns.production Whether to use production Apple Push Notification Service (APNS) servers to send push notifications.
  * If true, uses `gateway.push.apple.com:2195` and `feedback.push.apple.com:2196`.
  * If false, uses `gateway.sandbox.push.apple.com:2195` and `feedback.sandbox.push.apple.com:2196`
  * @property {string} pushSettings.apns.certData The certificate data loaded from the cert.pem file (APNS).
  * @property {string} pushSettings.apns.keyData The key data loaded from the key.pem file (APNS).
  * @property {string} pushSettings.apns.pushOptions.gateway (APNS).
  * @property {number} pushSettings.apns.pushOptions.port (APNS).
  * @property {string} pushSettings.apns.feedbackOptions.gateway  (APNS).
  * @property {number} pushSettings.apns.feedbackOptions.port (APNS).
  * @property {boolean} pushSettings.apns.feedbackOptions.batchFeedback (APNS).
  * @property {number} pushSettings.apns.feedbackOptions.interval (APNS).
  * @property {string} pushSettings.gcm.serverApiKey: Google Cloud Messaging API key
  * @property {boolean} authenticationEnabled
  * @property {boolean} anonymousAllowed
  * @property {Array} authenticationSchemes List of authentication schemes
  *  (see below).
  * @property {string} authenticationSchemes.scheme Scheme name.
  *   Supported values: `local`, `facebook`, `google`,
  *   `twitter`, `linkedin`, `github`.
  * @property {any} authenticationSchemes.credential
  *   Scheme-specific credentials
  * @class Application
  * @inherits {PersistedModel}
  */
@JSImport("loopback", "Application")
@js.native
class Application () extends PersistedModel {
  var anonymousAllowed: Boolean = js.native
  var authenticationEnabled: Boolean = js.native
  var authenticationSchemes: js.Array[String] = js.native
  /** The OAuth 2.0 code/token callback URL. */
  var callBackUrl: js.Array[String] = js.native
  /** Date Application object was created.  Default: current date. */
  var created: Date = js.native
  /** Text description */
  var description: String = js.native
  /** E-mail address */
  var email: String = js.native
  /** Whether the e-mail is verified. */
  var emailVerified: String = js.native
  /** string Icon image URL. */
  var icon: String = js.native
  /** Generated ID. */
  var id: String = js.native
  /** modified Date Application object was modified.  Default: current date. */
  var modified: Date = js.native
  /** Name; required. */
  var name: String = js.native
  /** User ID of the developer who registers the application. */
  var owner: String = js.native
  /**
    * pushSettings.apns APNS configuration, see the options
    *   below and also
    *   github.com/argon/node-apn/blob/master/doc/apn.markdown
    *  pushSettings.apns.production Whether to use production Apple Push Notification Service (APNS) servers to send push notifications.
    * If true, uses `gateway.push.apple.com:2195` and `feedback.push.apple.com:2196`.
    * If false, uses `gateway.sandbox.push.apple.com:2195` and `feedback.sandbox.push.apple.com:2196`
    *  pushSettings.apns.certData The certificate data loaded from the cert.pem file (APNS).
    *  pushSettings.apns.keyData The key data loaded from the key.pem file (APNS).
    *  pushSettings.apns.pushOptions.gateway (APNS).
    *  pushSettings.apns.pushOptions.port (APNS).
    *  pushSettings.apns.feedbackOptions.gateway  (APNS).
    *  pushSettings.apns.feedbackOptions.port (APNS).
    *  pushSettings.apns.feedbackOptions.batchFeedback (APNS).
    *  pushSettings.apns.feedbackOptions.interval (APNS).
    *  pushSettings.gcm.serverApiKey: Google Cloud Messaging API key.
    */
  var pushSetings: Apns = js.native
  /** Status of the application; Either `production`, `sandbox` (default), or `disabled`. */
  var status: String = js.native
  /** OAuth 2.0  application URL. */
  var url: String = js.native
  /**
    * Reset keys for a given application by the appId
    * @param {Any} appId
    * @callback {() => void} callback
    * @param {Error} err
    */
  def resetKeys(appId: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

/* static members */
@JSImport("loopback", "Application")
@js.native
object Application extends js.Object {
  /**
    * Authenticate the application id and key
    * @param {Any} appId
    * @param {string} key
    * @callback {() => void} callback
    * @param {Error} err
    * @param {string} matched The matching key; one of:
    * - clientKey
    * - javaScriptKey
    * - restApiKey
    * - windowsKey
    * - masterKe
    */
  def authenticate(appId: js.Any, key: String, callback: js.Function2[/* err */ Error, /* matched */ String, Unit]): Unit = js.native
  /**
    * Register a new application
    * @param {string} owner Owner's user ID.
    * @param {string} name  Name of the application
    * @param {any} options  Other options
    * @param {() => void} callback  Callback function
    */
  def register(owner: String, name: String, options: js.Any, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Reset keys for the application instance
    * @callback {() => void} callback
    * @param {Error} err
    */
  def resetKeys(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

