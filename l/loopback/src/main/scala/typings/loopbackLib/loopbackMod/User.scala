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
class User ()
  extends loopbackLib.loopbackMod.lNs.User {
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
object User extends js.Object {
  /**
               * Confirm the user's identity
               * @param {Any} userId
               * @param {string} token The validation token
               * @param {string} redirect URL to redirect the user to once confirmed
               * @callback {() => void} callback
               * @param {Error} er
               */
  def confirm(userId: js.Any, token: java.lang.String, redirect: java.lang.String): stdLib.Promise[scala.Unit] | scala.Unit = js.native
  /**
               * Confirm the user's identity
               * @param {Any} userId
               * @param {string} token The validation token
               * @param {string} redirect URL to redirect the user to once confirmed
               * @callback {() => void} callback
               * @param {Error} er
               */
  def confirm(
    userId: js.Any,
    token: java.lang.String,
    redirect: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): stdLib.Promise[scala.Unit] | scala.Unit = js.native
  /**
               * A default verification token generator which accepts the user the token is
               * being generated for and a callback function to indicate completion.
               * This one uses the crypto library and 64 random bytes (converted to hex)
               * for the token. When used in combination with the user.verify() method this
               * function will be called with the `user` object as it's context (`this`)
               * @param {any} user The User this token is being generated for.
               * @param {() => void} cb The generator must pass back the new token with this function cal
               */
  def generateVerificationToken(user: js.Any): stdLib.Promise[scala.Unit] | scala.Unit = js.native
  /**
               * A default verification token generator which accepts the user the token is
               * being generated for and a callback function to indicate completion.
               * This one uses the crypto library and 64 random bytes (converted to hex)
               * for the token. When used in combination with the user.verify() method this
               * function will be called with the `user` object as it's context (`this`)
               * @param {any} user The User this token is being generated for.
               * @param {() => void} cb The generator must pass back the new token with this function cal
               */
  def generateVerificationToken(user: js.Any, callback: js.Function0[scala.Unit]): stdLib.Promise[scala.Unit] | scala.Unit = js.native
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
  def login(credentials: js.Any): stdLib.Promise[loopbackLib.loopbackMod.lNs.AccessToken] | scala.Unit = js.native
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
  def login(credentials: js.Any, include: java.lang.String): stdLib.Promise[loopbackLib.loopbackMod.lNs.AccessToken] | scala.Unit = js.native
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
  def login(
    credentials: js.Any,
    include: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* token */ loopbackLib.loopbackMod.lNs.AccessToken, 
      scala.Unit
    ]
  ): stdLib.Promise[loopbackLib.loopbackMod.lNs.AccessToken] | scala.Unit = js.native
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
  def login(credentials: js.Any, include: js.Array[java.lang.String]): stdLib.Promise[loopbackLib.loopbackMod.lNs.AccessToken] | scala.Unit = js.native
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
  def login(
    credentials: js.Any,
    include: js.Array[java.lang.String],
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* token */ loopbackLib.loopbackMod.lNs.AccessToken, 
      scala.Unit
    ]
  ): stdLib.Promise[loopbackLib.loopbackMod.lNs.AccessToken] | scala.Unit = js.native
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
  def logout(accessTokenID: java.lang.String): stdLib.Promise[scala.Unit] | scala.Unit = js.native
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
  def logout(accessTokenID: java.lang.String, callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): stdLib.Promise[scala.Unit] | scala.Unit = js.native
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
  def resetPassword(options: js.Object): stdLib.Promise[scala.Unit] | scala.Unit = js.native
  /**
               * Create a short lived acess token for temporary login. Allows users
               * to change passwords if forgotten
               * @options {any} options
               * @prop {string} email The user's email address
               * @callback {() => void} callback
               * @param {Error} er
               */
  def resetPassword(options: js.Object, callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): stdLib.Promise[scala.Unit] | scala.Unit = js.native
}

