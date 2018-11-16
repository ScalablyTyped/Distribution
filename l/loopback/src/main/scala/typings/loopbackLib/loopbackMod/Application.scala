package typings
package loopbackLib.loopbackMod

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
class Application ()
  extends loopbackLib.loopbackMod.lNs.Application {
  /** Contains additional model settings. */
  /* CompleteClass */
  override var settings: loopbackLib.loopbackMod.lNs.Settings = js.native
  /* CompleteClass */
  override def afterRemote(
    method: java.lang.String,
    callback: js.Function3[
      /* ctx */ loopbackLib.loopbackMod.lNs.Context, 
      /* modelInstanceOrNext */ this.type | expressLib.expressMod.eNs.NextFunction, 
      /* next */ js.UndefOr[expressLib.expressMod.eNs.NextFunction], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def afterRemoteError(method: java.lang.String, callback: expressLib.expressMod.eNs.NextFunction): scala.Unit = js.native
  /**
               * loopback 3.x Remote hooks
               * http://loopback.io/doc/en/lb3/Remote-hooks.html
               * @param method
               * @param backback
               */
  /* CompleteClass */
  override def beforeRemote(
    method: java.lang.String,
    callback: js.Function3[
      /* ctx */ loopbackLib.loopbackMod.lNs.Context, 
      /* modelInstanceOrNext */ this.type | expressLib.expressMod.eNs.NextFunction, 
      /* next */ js.UndefOr[expressLib.expressMod.eNs.NextFunction], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

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
  
  def authenticate(
    appId: js.Any,
    key: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* matched */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
               * Register a new application
               * @param {string} owner Owner's user ID.
               * @param {string} name  Name of the application
               * @param {any} options  Other options
               * @param {() => void} callback  Callback function
               */
  
  def register(
    owner: java.lang.String,
    name: java.lang.String,
    options: js.Any,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
               * Reset keys for the application instance
               * @callback {() => void} callback
               * @param {Error} err
               */
  
  def resetKeys(callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
}

