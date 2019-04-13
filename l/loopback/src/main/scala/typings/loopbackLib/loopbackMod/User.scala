package typings
package loopbackLib.loopbackMod

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
@JSImport("loopback", "User")
@js.native
class User () extends PersistedModel {
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
  var settings_User: loopbackLib.Anon_AclsCaseSensitiveEmail = js.native
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
  def createAccessToken(ttl: scala.Double): js.Promise[AccessToken] | scala.Unit = js.native
  def createAccessToken(ttl: scala.Double, options: js.Any): js.Promise[AccessToken] | scala.Unit = js.native
  def createAccessToken(
    ttl: scala.Double,
    options: js.Any,
    callback: js.Function2[/* err */ java.lang.String | stdLib.Error, /* token */ AccessToken, scala.Unit]
  ): js.Promise[AccessToken] | scala.Unit = js.native
  /**
    * Compare the given `password` with the users hashed password
    * @param {string} password The plain text password
    * @callback {() => void} callback Callback function
    * @param {Error} err Error object
    * @param {boolean} isMatch Returns true if the given `password` matches recor
    */
  def hasPassword(password: java.lang.String): js.Promise[scala.Boolean] | scala.Unit = js.native
  def hasPassword(
    password: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* isMatch */ scala.Boolean, scala.Unit]
  ): js.Promise[scala.Boolean] | scala.Unit = js.native
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
  def verify(options: loopbackLib.Anon_FromGenerateVerificationToken): scala.Unit = js.native
}

/* static members */
@JSImport("loopback", "User")
@js.native
object User extends js.Object {
  /**
    * Confirm the user's identity
    * @param {Any} userId
    * @param {string} token The validation token
    * @param {string} redirect URL to redirect the user to once confirmed
    * @callback {() => void} callback
    * @param {Error} er
    */
  def confirm(userId: js.Any, token: java.lang.String, redirect: java.lang.String): js.Promise[scala.Unit] | scala.Unit = js.native
  def confirm(
    userId: js.Any,
    token: java.lang.String,
    redirect: java.lang.String,
    callback: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): js.Promise[scala.Unit] | scala.Unit = js.native
  /**
    * A default verification token generator which accepts the user the token is
    * being generated for and a callback function to indicate completion.
    * This one uses the crypto library and 64 random bytes (converted to hex)
    * for the token. When used in combination with the user.verify() method this
    * function will be called with the `user` object as it's context (`this`)
    * @param {any} user The User this token is being generated for.
    * @param {() => void} cb The generator must pass back the new token with this function cal
    */
  def generateVerificationToken(user: js.Any): js.Promise[scala.Unit] | scala.Unit = js.native
  def generateVerificationToken(user: js.Any, callback: js.Function0[scala.Unit]): js.Promise[scala.Unit] | scala.Unit = js.native
  /**
    * Login a user by with the given `credentials`
    *
    * ```js
    *    User.login({username: 'foo', password: 'bar'}, function (err, token) {
    *          console.log(token.id);
    *    });
    * ```
    *
    * @param {any} credentials username/password or email/password
    * @param {string[]|string} [include] Optionally set it to "user" to include
    * the user info
    * @callback {() => void} callback Callback function
    * @param {Error} err Error object
    * @param {AccessToken} token Access token if login is successfu
    */
  def login(credentials: js.Any): js.Promise[loopbackLib.loopbackMod.AccessToken] | scala.Unit = js.native
  def login(credentials: js.Any, include: java.lang.String): js.Promise[loopbackLib.loopbackMod.AccessToken] | scala.Unit = js.native
  def login(
    credentials: js.Any,
    include: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* token */ loopbackLib.loopbackMod.AccessToken, scala.Unit]
  ): js.Promise[loopbackLib.loopbackMod.AccessToken] | scala.Unit = js.native
  def login(credentials: js.Any, include: js.Array[java.lang.String]): js.Promise[loopbackLib.loopbackMod.AccessToken] | scala.Unit = js.native
  def login(
    credentials: js.Any,
    include: js.Array[java.lang.String],
    callback: js.Function2[/* err */ stdLib.Error, /* token */ loopbackLib.loopbackMod.AccessToken, scala.Unit]
  ): js.Promise[loopbackLib.loopbackMod.AccessToken] | scala.Unit = js.native
  /**
    * Logout a user with the given accessToken id
    *
    * ```js
    *    User.logout('asd0a9f8dsj9s0s3223mk', function (err) {
    *     console.log(err || 'Logged out');
    *   });
    * ```
    *
    * @param {string} accessTokenID
    * @callback {() => void} callback
    * @param {Error} er
    */
  def logout(accessTokenID: java.lang.String): js.Promise[scala.Unit] | scala.Unit = js.native
  def logout(accessTokenID: java.lang.String, callback: js.Function1[/* err */ stdLib.Error, scala.Unit]): js.Promise[scala.Unit] | scala.Unit = js.native
  /**
    * Normalize the credentials
    * @param {any} credentials The credential object
    * @param {boolean} realmRequired
    * @param {string} realmDelimiter The realm delimiter, if not set, no realm is needed
    * @returns {any} The normalized credential objec
    */
  def normalizeCredentials(credentials: js.Any, realmRequired: scala.Boolean, realmDelimiter: java.lang.String): js.Any = js.native
  /**
    * Create a short lived acess token for temporary login. Allows users
    * to change passwords if forgotten
    * @options {any} options
    * @prop {string} email The user's email address
    * @callback {() => void} callback
    * @param {Error} er
    */
  def resetPassword(options: js.Object): js.Promise[scala.Unit] | scala.Unit = js.native
  def resetPassword(options: js.Object, callback: js.Function1[/* err */ stdLib.Error, scala.Unit]): js.Promise[scala.Unit] | scala.Unit = js.native
}

