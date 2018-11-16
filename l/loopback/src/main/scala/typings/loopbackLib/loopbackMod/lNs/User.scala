package typings
package loopbackLib.loopbackMod.lNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
       * Built-in User model.
       * Extends LoopBack [PersistedModel](#persistedmodel-new-persistedmodel)
       * Default `User` ACLs
       * - DENY EVERYONE `*`
       * - ALLOW EVERYONE `create`
       * - ALLOW OWNER `deleteById`
       * - ALLOW EVERYONE `login`
       * - ALLOW EVERYONE `logout`
       * - ALLOW OWNER `findById`
       * - ALLOW OWNER `updateAttributes`
       *
       * @property {string} username Must be unique.
       * @property {string} password Hidden from remote clients.
       * @property {string} email Must be valid email.
       * @property {boolean} emailVerified Set when a user's email has been verified via `confirm()`.
       * @property {string} verificationToken Set when `verify()` is called.
       * @property {string} realm The namespace the user belongs to. See [Partitioning users with realms](docs.strongloop.com/display/public/LB/Partitioning+users+with+realms) for details.
       * @property {Date} created The property is not used by LoopBack, you are free to use it for your own purposes.
       * @property {Date} lastUpdated The property is not used by LoopBack, you are free to use it for your own purposes.
       * @property {string} status The property is not used by LoopBack, you are free to use it for your own purposes.
       * @property {any} settings Extends the `Model.settings` object.
       * @property {boolean} settings.emailVerificationRequired Require the email verification
       * process before allowing a login.
       * @property {number} settings.ttl Default time to live (in seconds) for the `AccessToken` created by `User.login() / user.createAccessToken()`.
       * Default is `1209600` (2 weeks)
       * @property {number} settings.maxTTL The max value a user can request a token to be alive / valid for.
       * Default is `31556926` (1 year)
       * @property {boolean} settings.realmRequired Require a realm when logging in a user.
       * @property {string} settings.realmDelimiter When set a realm is required.
       * @property {number} settings.resetPasswordTokenTTL Time to live for password reset `AccessToken`. Default is `900` (15 minutes).
       * @property {number} settings.saltWorkFactor The `bcrypt` salt work factor. Default is `10`.
       * @property {boolean} settings.caseSensitiveEmail Enable case sensitive email.
       *
       * @class User
       * @inherits {PersistedModel}
       */
@js.native
trait User extends PersistedModel {
  /** The property is not used by LoopBack, you are free to use it for your own purposes. */
  var created: stdLib.Date = js.native
  /** Must be valid email. */
  var email: java.lang.String = js.native
  /** Set when a user's email has been verified via `confirm()`. */
  var emailVerified: scala.Boolean = js.native
  /** The property is not used by LoopBack, you are free to use it for your own purposes. */
  var lastUpdate: stdLib.Date = js.native
  /** Hidden from remote clients. */
  var password: java.lang.String = js.native
  /** The namespace the user belongs to. See [Partitioning users with realms](docs.strongloop.com/display/public/LB/Partitioning+users+with+realms) for details. */
  var realm: java.lang.String = js.native
  /**
               * ettings Extends the `Model.settings` object.
               * settings.emailVerificationRequired Require the email verification
               * process before allowing a login.
               * settings.ttl Default time to live (in seconds) for the `AccessToken` created by `User.login() / user.createAccessToken()`.
               * Default is `1209600` (2 weeks)
               * settings.maxTTL The max value a user can request a token to be alive / valid for.
               * Default is `31556926` (1 year)
               * settings.realmRequired Require a realm when logging in a user.
               * settings.realmDelimiter When set a realm is required.
               * settings.resetPasswordTokenTTL Time to live for password reset `AccessToken`. Default is `900` (15 minutes).
               * settings.saltWorkFactor The `bcrypt` salt work factor. Default is `10`.
               * settings.caseSensitiveEmail Enable case sensitive email.
               */
  @JSName("settings")
  var settings_User: loopbackLib.Anon_RealmDelimiter = js.native
  /** The property is not used by LoopBack, you are free to use it for your own purposes. */
  var status: java.lang.String = js.native
  /** Must be unique. */
  var username: java.lang.String = js.native
  /** Set when `verify()` is called. */
  var verificationToken: java.lang.String = js.native
  /**
               * Create access token for the logged in user. This method can be overridden to
               * customize how access tokens are generate
               * @param {number} ttl The requested ttl
               * @param {any} [options] The options for access token, such as scope, appId
               * @callback {() => void} cb The callback function
               * @param {string|Error} err The error string or object
               * @param {AccessToken} token The generated access token object
               */
  def createAccessToken(ttl: scala.Double): stdLib.Promise[AccessToken] | scala.Unit = js.native
  /**
               * Create access token for the logged in user. This method can be overridden to
               * customize how access tokens are generate
               * @param {number} ttl The requested ttl
               * @param {any} [options] The options for access token, such as scope, appId
               * @callback {() => void} cb The callback function
               * @param {string|Error} err The error string or object
               * @param {AccessToken} token The generated access token object
               */
  def createAccessToken(ttl: scala.Double, options: js.Any): stdLib.Promise[AccessToken] | scala.Unit = js.native
  /**
               * Create access token for the logged in user. This method can be overridden to
               * customize how access tokens are generate
               * @param {number} ttl The requested ttl
               * @param {any} [options] The options for access token, such as scope, appId
               * @callback {() => void} cb The callback function
               * @param {string|Error} err The error string or object
               * @param {AccessToken} token The generated access token object
               */
  def createAccessToken(
    ttl: scala.Double,
    options: js.Any,
    callback: js.Function2[/* err */ java.lang.String | nodeLib.Error, /* token */ AccessToken, scala.Unit]
  ): stdLib.Promise[AccessToken] | scala.Unit = js.native
  /**
               * Compare the given `password` with the users hashed password
               * @param {string} password The plain text password
               * @callback {() => void} callback Callback function
               * @param {Error} err Error object
               * @param {boolean} isMatch Returns true if the given `password` matches recor
               */
  def hasPassword(password: java.lang.String): stdLib.Promise[scala.Boolean] | scala.Unit = js.native
  /**
               * Compare the given `password` with the users hashed password
               * @param {string} password The plain text password
               * @callback {() => void} callback Callback function
               * @param {Error} err Error object
               * @param {boolean} isMatch Returns true if the given `password` matches recor
               */
  def hasPassword(
    password: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* isMatch */ scala.Boolean, scala.Unit]
  ): stdLib.Promise[scala.Boolean] | scala.Unit = js.native
  /**
               * Verify a user's identity by sending them a confirmation email
               *  ```js
               *   var options = {
               *     type: 'email',
               *     to: user.email,
               *     template: 'verify.ejs',
               *     redirect: '/',
               *     tokenGenerator: function (user, cb) { cb("random-token"); }
               *   };
               *
               *   user.verify(options, next);
               * ```
               *
               * @options {any} options
               * @property {string} type Must be 'email'.
               * @property {string} to Email address to which verification email is sent.
               * @property {string} from Sender email addresss, for example
               *   `'noreply@myapp.com'`.
               * @property {string} subject Subject line text.
               * @property {string} text Text of email.
               * @property {string} template Name of template that displays verification
               *  page, for example, `'verify.ejs'.
               * @property {string} redirect Page to which user will be redirected after
               *  they verify their email, for example `'/'` for root URI.
               * @property {() => void} generateVerificationToken A function to be used to
               *  generate the verification token. It must accept the user object and a
               *  callback function. This function should NOT add the token to the user
               *  object, instead simply execute the callback with the token! User saving
               *  and email sending will be handled in the `verify()` method
               */
  def verify(options: loopbackLib.Anon_SubjectRedirect): scala.Unit = js.native
}

