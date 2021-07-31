package typings.kiiCloudSdk.global.KiiCloud

import typings.kiiCloudSdk.anon.`19`
import typings.kiiCloudSdk.anon.`32`
import typings.kiiCloudSdk.anon.`37`
import typings.kiiCloudSdk.anon.`38`
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a KiiUser object
  */
@JSGlobal("KiiCloud.KiiUser")
@js.native
class KiiUser ()
  extends StObject
     with typings.kiiCloudSdk.KiiCloud.KiiUser
object KiiUser {
  
  @JSGlobal("KiiCloud.KiiUser")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Authenticates a user with the server.
    * If authentication successful, the user is cached inside SDK as current user,and accessible via
    * {@link KiiUser.getCurrentUser()}.
    * User token and token expiration is also cached and can be get by {@link KiiUser#getAccessTokenObject()}.
    * Access token won't be expired unless you set it explicitly by {@link Kii.setAccessTokenExpiration()}.<br>
    * If password or userIdentifier is invalid, callbacks.failure or reject callback of promise will be called. <br>
    *
    * @param userIdentifier The username, validated email address, or validated phone number of the user to authenticate
    * @param password The password of the user to authenticate
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(theAuthenticatedUser). theAuthenticatedUser is KiiUser instance.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is a KiiUser instance.If given password or userIdentifier is invalid, it will be null.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     KiiUser.authenticate("myusername", "mypassword", {
    *         success: function(theAuthenticatedUser) {
    *             // do something with the authenticated user
    *         },
    *
    *         failure: function(theUser, anErrorString) {
    *             // do something with the error response
    *         }
    *     });
    *
    *     // example to use Promise
    *     KiiUser.authenticate("myusername", "mypassword").then(
    *         function(theAuthenticatedUser) {
    *             // do something with the authenticated user
    *         },
    *         function(error) {
    *             // do something with the error response
    *         }
    *     );
    */
  /* static member */
  @scala.inline
  def authenticate(userIdentifier: String, password: String): js.Promise[typings.kiiCloudSdk.KiiCloud.KiiUser] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(userIdentifier.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.kiiCloudSdk.KiiCloud.KiiUser]]
  @scala.inline
  def authenticate(userIdentifier: String, password: String, callbacks: `32`): js.Promise[typings.kiiCloudSdk.KiiCloud.KiiUser] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(userIdentifier.asInstanceOf[js.Any], password.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.kiiCloudSdk.KiiCloud.KiiUser]]
  
  /**
    * Asynchronously authenticates a user with the server using specified access token.
    * This method is non-blocking.<br><br>
    * Specified expiresAt won't be used by SDK. IF login successful,
    * we set this property so that you can get it later along with token
    * by {@link KiiUser#getAccessTokenObject()}.<br>
    * Also, if successful, the user is cached inside SDK as current user
    * and accessible via {@link KiiUser.getCurrentUser()}.<br>
    *
    * Note that, if not specified, token expiration time is not cached
    * and set to value equivalant to 275760 years.<br>
    *
    * If the specified token is expired, authenticataiton will be failed.
    * Authenticate the user again to renew the token.<br>
    *
    * If expiresAt is invalid, callbacks.failure or reject callback of promise will be called. <br>
    *
    * @param accessToken A valid access token associated with the desired user
    * @param callbacks An object with callback methods defined
    * @param expiresAt Access token expire time that has received by {@link KiiUser#getAccessTokenObject()}. This param is optional and can be omitted.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(theAuthenticatedUser). theAuthenticatedUser is KiiUser instance.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is a KiiUser instance.If expiresAt is invalid, it will be null.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     // Assume you stored the object get from KiiUser#getAccessTokenObject()
    *     // and now accessing by 'tokenObject' var.
    *     var token = tokenObject["access_token"];
    *     var expiresAt = tokenObject["expires_at"];
    *     expireDate.setHours(expireDate.getHours() + 24);
    *     KiiUser.authenticateWithToken(token, {
    *         success: function(theAuthenticatedUser) {
    *             // do something with the authenticated user
    *         },
    *
    *         failure: function(theUser, anErrorString) {
    *             // do something with the error response
    *         }
    *     }, expiresAt);
    *
    *     // example to use Promise
    *     // Assume you stored the object get from KiiUser#getAccessTokenObject()
    *     // and now accessing by 'tokenObject' var.
    *     var token = tokenObject["access_token"];
    *     var expiresAt = tokenObject["expires_at"];
    *     expireDate.setHours(expireDate.getHours() + 24);
    *     KiiUser.authenticateWithToken(token, null, expiresAt).then(
    *         function(theAuthenticatedUser) {
    *             // do something with the authenticated user
    *         },
    *         function(error) {
    *             // do something with the error response
    *         }
    *     );
    */
  /* static member */
  @scala.inline
  def authenticateWithToken(accessToken: String): js.Promise[typings.kiiCloudSdk.KiiCloud.KiiUser] = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticateWithToken")(accessToken.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.kiiCloudSdk.KiiCloud.KiiUser]]
  @scala.inline
  def authenticateWithToken(accessToken: String, callbacks: Unit, expiresAt: Date): js.Promise[typings.kiiCloudSdk.KiiCloud.KiiUser] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticateWithToken")(accessToken.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any], expiresAt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.kiiCloudSdk.KiiCloud.KiiUser]]
  @scala.inline
  def authenticateWithToken(accessToken: String, callbacks: `32`): js.Promise[typings.kiiCloudSdk.KiiCloud.KiiUser] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticateWithToken")(accessToken.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.kiiCloudSdk.KiiCloud.KiiUser]]
  @scala.inline
  def authenticateWithToken(accessToken: String, callbacks: `32`, expiresAt: Date): js.Promise[typings.kiiCloudSdk.KiiCloud.KiiUser] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticateWithToken")(accessToken.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any], expiresAt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.kiiCloudSdk.KiiCloud.KiiUser]]
  
  /**
    * Reset password with the PIN code in receipt SMS
    * After {@link KiiUser.resetPasswordWithNotificationMethod} is called with
    * "SMS_PIN", SMS includes the PIN code will be sent to the user's phone.
    * User can request the new password for login with the PIN code.
    * Need to call method for authentication after the new password is determined.
    *
    * @param userIdentifier should be valid email address,
    *   global phone number or user identifier obtained by {@link #getID}.
    * @param pinCode Received PIN code.
    * @param newPassword New password for login.
    *   If the 'Password Reset Flow' in app's security setting is set to
    *   'Generate password', it would be ignored and null can be passed.
    *   In this case, new password is generated on Kii Cloud and sent to user's
    *   phone. Otherwise valid password is required.
    * @param callbacks object includes callback functions.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(). No parameter used.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // Example using callback
    *     KiiUser.completeResetPassword("john.doe@kii.com", "new-password", "223789",
    *     {
    *         success: function() {
    *             // Succeeded.
    *         },
    *         failure: function(error) {
    *             // Handle error here.
    *         }
    *     });
    *
    *     // Example using Promise
    *     KiiUser.completeResetPassword(
    *         "john.doe@kii.com", "new-password", "223789").then(function() {
    *             // Succeeded.
    *         }).catch(function(error) {
    *             // Handle error here.
    *         });
    */
  /* static member */
  @scala.inline
  def completeResetPassword(userIdentifier: String, pinCode: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("completeResetPassword")(userIdentifier.asInstanceOf[js.Any], pinCode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def completeResetPassword(userIdentifier: String, pinCode: String, newPassword: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("completeResetPassword")(userIdentifier.asInstanceOf[js.Any], pinCode.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def completeResetPassword(userIdentifier: String, pinCode: String, newPassword: String, callbacks: `19`): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("completeResetPassword")(userIdentifier.asInstanceOf[js.Any], pinCode.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def completeResetPassword(userIdentifier: String, pinCode: String, newPassword: Unit, callbacks: `19`): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("completeResetPassword")(userIdentifier.asInstanceOf[js.Any], pinCode.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Find registered KiiUser with the email.<br>
    * If there are no user registers with the specified email or if there are but not verified email yet,
    * callbacks.failure or reject callback of promise will be called.<br>
    * <br><br>
    * <b>Note:</b>
    * <ul>
    * <li>If "Expose Full User Data To Others" is enabled in the application console, the response will contain full of the user data.</li>
    * <li>Otherwise, the response will only contain "userID", "loginName" and "displayName" field values if exist.</li>
    * </ul>
    *
    * @param email The email to find KiiUser who owns it.<br>
    *   Don't add prefix of "EMAIL:" described in REST API documentation. SDK will take care of it.
    * @param callbacks An object with callback methods defined.
    *   This argument is mandatory and can't be ommited.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(theMatchedUser). theMatchedUser is KiiUser instance.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     KiiUser.findUserByEmail("user_to_find@example.com", {
    *         success: function(theMatchedUser) {
    *             // Do something with the found user
    *         },
    *         failure: function(anErrorString) {
    *             // Do something with the error response
    *         }
    *     });
    *
    *     // example to use Promise
    *     KiiUser.findUserByEmail("user_to_find@example.com").then(
    *         function(theMatchedUser) {
    *             // Do something with the matched user
    *         },
    *         function(error) {
    *             // Do something with the error response
    *         }
    *     );
    */
  /* static member */
  @scala.inline
  def findUserByEmail(email: String): js.Promise[typings.kiiCloudSdk.KiiCloud.KiiUser] = ^.asInstanceOf[js.Dynamic].applyDynamic("findUserByEmail")(email.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.kiiCloudSdk.KiiCloud.KiiUser]]
  @scala.inline
  def findUserByEmail(email: String, callbacks: `38`): js.Promise[typings.kiiCloudSdk.KiiCloud.KiiUser] = (^.asInstanceOf[js.Dynamic].applyDynamic("findUserByEmail")(email.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.kiiCloudSdk.KiiCloud.KiiUser]]
  
  /**
    * Find registered KiiUser with the phone.<br>
    * If there are no user registers with the specified phone or if there are but not verified phone yet,
    * callbacks.failure or reject callback of promise will be called.
    * <br><br>
    * <b>Note:</b>
    * <ul>
    * <li>If "Expose Full User Data To Others" is enabled in the application console, the response will contain full of the user data.</li>
    * <li>Otherwise, the response will only contain "userID", "loginName" and "displayName" field values if exist.</li>
    * </ul>
    *
    * @param phone The phone number to find KiiUser who owns it.<br>
    *   Don't add prefix of "PHONE:" described in REST API documentation. SDK will take care of it.
    * @param callbacks An object with callback methods defined.
    *   This argument is mandatory and can't be ommited.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(theMatchedUser). theMatchedUser is KiiUser instance.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     KiiUser.findUserByPhone("phone_number_to_find", {
    *         success: function(theMatchedUser) {
    *             // Do something with the found user
    *         },
    *         failure: function(anErrorString) {
    *             // Do something with the error response
    *         }
    *     });
    *
    *     // example to use Promise
    *     KiiUser.findUserByPhone("phone_number_to_find").then(
    *         function(theMatchedUser) {
    *             // Do something with the matched user
    *         },
    *         function(error) {
    *             // Do something with the error response
    *         }
    *     );
    */
  /* static member */
  @scala.inline
  def findUserByPhone(phone: String): js.Promise[typings.kiiCloudSdk.KiiCloud.KiiUser] = ^.asInstanceOf[js.Dynamic].applyDynamic("findUserByPhone")(phone.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.kiiCloudSdk.KiiCloud.KiiUser]]
  @scala.inline
  def findUserByPhone(phone: String, callbacks: `38`): js.Promise[typings.kiiCloudSdk.KiiCloud.KiiUser] = (^.asInstanceOf[js.Dynamic].applyDynamic("findUserByPhone")(phone.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.kiiCloudSdk.KiiCloud.KiiUser]]
  
  /**
    * Find registered KiiUser with the user name.<br>
    * If there are no user registers with the specified user name, callbacks.failure or reject callback of promise will be called.
    * <br><br>
    * <b>Note:</b>
    * <ul>
    * <li>If "Expose Full User Data To Others" is enabled in the application console, the response will contain full of the user data.</li>
    * <li>Otherwise, the response will only contain "userID", "loginName" and "displayName" field values if exist.</li>
    * </ul>
    *
    * @param username The user name to find KiiUser who owns it.<br>
    *   Don't add prefix of "LOGIN_NAME:" described in REST API documentation. SDK will take care of it.
    * @param callbacks An object with callback methods defined.
    *   This argument is mandatory and can't be ommited.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(theMatchedUser). theMatchedUser is KiiUser instance.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     KiiUser.findUserByUsername("user_name_to_find", {
    *         success: function(theMatchedUser) {
    *             // Do something with the found user
    *         },
    *         failure: function(anErrorString) {
    *             // Do something with the error response
    *         }
    *     });
    *
    *     // example to use Promise
    *     KiiUser.findUserByUsername("user_name_to_find").then(
    *         function(theMatchedUser) {
    *             // Do something with the matched user
    *         },
    *         function(error) {
    *             // Do something with the error response
    *         }
    *     );
    */
  /* static member */
  @scala.inline
  def findUserByUsername(username: String): js.Promise[typings.kiiCloudSdk.KiiCloud.KiiUser] = ^.asInstanceOf[js.Dynamic].applyDynamic("findUserByUsername")(username.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.kiiCloudSdk.KiiCloud.KiiUser]]
  @scala.inline
  def findUserByUsername(username: String, callbacks: `38`): js.Promise[typings.kiiCloudSdk.KiiCloud.KiiUser] = (^.asInstanceOf[js.Dynamic].applyDynamic("findUserByUsername")(username.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.kiiCloudSdk.KiiCloud.KiiUser]]
  
  /**
    * The currently authenticated user
    *
    * @example
    *         var user = KiiUser.getCurrentUser();
    */
  /* static member */
  @scala.inline
  def getCurrentUser(): typings.kiiCloudSdk.KiiCloud.KiiUser = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentUser")().asInstanceOf[typings.kiiCloudSdk.KiiCloud.KiiUser]
  
  /**
    * Logs the currently logged-in user out of the KiiSDK
    *
    * @example
    *         KiiUser.logOut();
    */
  /* static member */
  @scala.inline
  def logOut(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logOut")().asInstanceOf[Unit]
  
  /**
    * Checks to see if there is a user authenticated with the SDK
    *
    * @example
    *         if(KiiUser.loggedIn()) {
    *             // do something
    *         }
    */
  /* static member */
  @scala.inline
  def loggedIn(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("loggedIn")().asInstanceOf[Boolean]
  
  /**
    * Registers a user as pseudo user with the server
    *
    * @param callbacks An object with callback methods defined.
    *   This argument is mandatory and can't be ommited.
    * @param userFields Custom Fields to add to the user. This is optional and can be omitted.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(theAuthenticatedUser). theAuthenticatedUser is KiiUser instance.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var userFields = {"displayName":"yourName", "country":"JP", "age":30};
    *     KiiUser.registerAsPseudoUser({
    *         success: function(theAuthenticatedUser) {
    *             // do something with the authenticated user
    *         },
    *
    *         failure: function(theUser, anErrorString) {
    *             // do something with the error response
    *         }
    *     }, userFields);
    *
    *     // example to use Promise
    *     var userFields = {"displayName":"yourName", "country":"JP", "age":30};
    *     KiiUser.registerAsPseudoUser(null, userFields).then(
    *         function(theAuthenticatedUser) {
    *             // do something with the authenticated user
    *         },
    *         function(error) {
    *             // do something with the error response
    *         }
    *     );
    */
  /* static member */
  @scala.inline
  def registerAsPseudoUser(): js.Promise[typings.kiiCloudSdk.KiiCloud.KiiUser] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAsPseudoUser")().asInstanceOf[js.Promise[typings.kiiCloudSdk.KiiCloud.KiiUser]]
  @scala.inline
  def registerAsPseudoUser(callbacks: Unit, userFields: js.Any): js.Promise[typings.kiiCloudSdk.KiiCloud.KiiUser] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAsPseudoUser")(callbacks.asInstanceOf[js.Any], userFields.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.kiiCloudSdk.KiiCloud.KiiUser]]
  @scala.inline
  def registerAsPseudoUser(callbacks: `32`): js.Promise[typings.kiiCloudSdk.KiiCloud.KiiUser] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAsPseudoUser")(callbacks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.kiiCloudSdk.KiiCloud.KiiUser]]
  @scala.inline
  def registerAsPseudoUser(callbacks: `32`, userFields: js.Any): js.Promise[typings.kiiCloudSdk.KiiCloud.KiiUser] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAsPseudoUser")(callbacks.asInstanceOf[js.Any], userFields.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.kiiCloudSdk.KiiCloud.KiiUser]]
  
  /**
    * Reset a user's password on the server
    *
    * <br><br>Reset a user's password on the server. The user is determined by the specified userIdentifier - which is an email address that has already been associated with an account. Reset
    * instructions will be sent to that identifier.
    * <br><br><b>Please Note:</b> This will reset the user's access token, so if they are currently logged in - their session will no longer be valid.
    *
    * @param userIdentifier The user's email address
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(). No parameter used.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     KiiUser.resetPassword("johndoe@example.com", {
    *         success: function() {
    *             // do something
    *         },
    *
    *         failure: function(anErrorString) {
    *             // do something with the error response
    *         }
    *     });
    *
    *     // example to use Promise
    *     KiiUser.resetPassword("johndoe@example.com").then(
    *         function() {
    *             // do something
    *         },
    *         function(error) {
    *             // do something with the error response
    *         }
    *     );
    */
  /* static member */
  @scala.inline
  def resetPassword(userIdentifier: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("resetPassword")(userIdentifier.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def resetPassword(userIdentifier: String, callbacks: `37`): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("resetPassword")(userIdentifier.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Reset the password of user <br>
    * Reset the password of user specified by given identifier. <br>
    * This api does not execute login after reset password.
    *
    * @param userIdentifier should be valid email address,
    *   global phone number or user identifier obtained by {@link #getID}.
    * @param notificationMethod specify the destination of message include link
    *   of resetting password. must one of "EMAIL", "SMS" or "SMS_PIN".
    *   - "EMAIL": Send email include link URL to reset password or password.
    *   (Contents are depends on 'Password Reset Flow' setting in app's
    *   Security settings.)
    *   - "SMS" : Send SMS include link URL to reset password.
    *   - "SMS_PIN" : Send SMS include PIN Code for reset password.
    *   different type of identifier and destination can be used
    *   as long as user have verified email, phone.
    *   (ex. User registers both email and phone. Identifier is email and
    *   notificationMethod is SMS.)
    * @param callbacks object includes callback functions.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(). No parameter used.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     KiiUser.resetPasswordWithNotificationMethod("+819001234567", "SMS", {
    *         success: function() {
    *             // Operation succeeded.
    *         },
    *         failure: function(errString) {
    *             // Handle error.
    *         }
    *     });
    *
    *     // example to use Promise
    *     KiiUser.resetPasswordWithNotificationMethod("+819001234567", "SMS").then(
    *         function() {
    *             // Operation succeeded.
    *         },
    *         function(error) {
    *             // Handle error.
    *         }
    *     );
    */
  /* static member */
  @scala.inline
  def resetPasswordWithNotificationMethod(userIdentifier: String, notificationMethod: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("resetPasswordWithNotificationMethod")(userIdentifier.asInstanceOf[js.Any], notificationMethod.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def resetPasswordWithNotificationMethod(userIdentifier: String, notificationMethod: String, callbacks: `37`): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("resetPasswordWithNotificationMethod")(userIdentifier.asInstanceOf[js.Any], notificationMethod.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Create a user object to prepare for registration with credentials pre-filled
    *
    * <br><br>Creates an pre-filled user object for registration. This user will not be authenticated until the registration method is called on it. It can be treated as any other KiiUser before
    * it is registered.
    *
    * @param emailAddress The user's email address
    * @param phoneNumber The user's phone number
    * @param username The user's desired username. Must be between 3 and 64 characters, which can include alphanumeric characters as well as underscores '_', dashes '-' and periods '.'
    * @param password The user's password. Must be at least 4 characters, made up of alphanumeric and/or: @,#,$,%,^,&
    *
    * @return a working KiiUser object
    *
    * @throws If the phone number is not in the proper format
    * @throws If the phone number is not in the proper format
    * @throws If the username is not in the proper format
    * @throws If the password is not in the proper format
    *
    * @example
    *     var user = KiiUser.userWithCredentials("johndoe@example.com", "+874012345678", "johndoe", "mypassword");
    */
  /* static member */
  @scala.inline
  def userWithCredentials(emailAddress: String, phoneNumber: String, username: String, password: String): typings.kiiCloudSdk.KiiCloud.KiiUser = (^.asInstanceOf[js.Dynamic].applyDynamic("userWithCredentials")(emailAddress.asInstanceOf[js.Any], phoneNumber.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.kiiCloudSdk.KiiCloud.KiiUser]
  
  /**
    * Create a user object to prepare for registration with credentials pre-filled
    *
    * <br><br>Creates an pre-filled user object for registration. This user will not be authenticated until the registration method is called on it. It can be treated as any other KiiUser before
    * it is registered.
    *
    * @param emailAddress The user's email address
    * @param password The user's password. Must be at least 4 characters, made up of alphanumeric and/or: @,#,$,%,^,&
    *
    * @return a working KiiUser object
    *
    * @throws If the password is not in the proper format
    * @throws If the email address is not in the proper format
    *
    * @example
    *     var user = KiiUser.userWithEmailAddress("johndoe@example.com", "mypassword");
    */
  /* static member */
  @scala.inline
  def userWithEmailAddress(emailAddress: String, password: String): typings.kiiCloudSdk.KiiCloud.KiiUser = (^.asInstanceOf[js.Dynamic].applyDynamic("userWithEmailAddress")(emailAddress.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.kiiCloudSdk.KiiCloud.KiiUser]
  
  /**
    * Create a user object to prepare for registration with credentials pre-filled
    *
    * <br><br>Creates an pre-filled user object for registration. This user will not be authenticated until the registration method is called on it. It can be treated as any other KiiUser before
    * it is registered.
    *
    * @param emailAddress The user's email address
    * @param phoneNumber The user's phone number
    * @param password The user's password. Must be at least 4 characters, made up of alphanumeric and/or: @,#,$,%,^,&
    *
    * @return a working KiiUser object
    *
    * @throws If the phone number is not in the proper format
    * @throws If the password is not in the proper format
    * @throws If the phone number is not in the proper format
    *
    * @example
    *     var user = KiiUser.userWithEmailAddressAndPhoneNumber("johndoe@example.com", "+874012345678", "mypassword");
    */
  /* static member */
  @scala.inline
  def userWithEmailAddressAndPhoneNumber(emailAddress: String, phoneNumber: String, password: String): typings.kiiCloudSdk.KiiCloud.KiiUser = (^.asInstanceOf[js.Dynamic].applyDynamic("userWithEmailAddressAndPhoneNumber")(emailAddress.asInstanceOf[js.Any], phoneNumber.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.kiiCloudSdk.KiiCloud.KiiUser]
  
  /**
    * Create a user object to prepare for registration with credentials pre-filled
    *
    * <br><br>Creates an pre-filled user object for registration. This user will not be authenticated until the registration method is called on it. It can be treated as any other KiiUser before
    * it is registered.
    *
    * @param emailAddress The user's email address
    * @param username The user's desired username. Must be between 3 and 64 characters, which can include alphanumeric characters as well as underscores '_', dashes '-' and periods '.'
    * @param password The user's password. Must be at least 4 characters, made up of alphanumeric and/or: @,#,$,%,^,&
    *
    * @return a working KiiUser object
    *
    * @throws If the username is not in the proper format
    * @throws If the password is not in the proper format
    * @throws If the phone number is not in the proper format
    *
    * @example
    *     var user = KiiUser.userWithEmailAddressAndUsername("johndoe@example.com", "johndoe", "mypassword");
    */
  /* static member */
  @scala.inline
  def userWithEmailAddressAndUsername(emailAddress: String, username: String, password: String): typings.kiiCloudSdk.KiiCloud.KiiUser = (^.asInstanceOf[js.Dynamic].applyDynamic("userWithEmailAddressAndUsername")(emailAddress.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.kiiCloudSdk.KiiCloud.KiiUser]
  
  /**
    * Instantiate KiiUser that refers to existing user which has specified ID.
    * You have to specify the ID of existing KiiUser. Unlike KiiObject,
    * you can not assign ID in the client side.<br>
    * <b>NOTE</b>: This API does not access to the server.
    * After instantiation, call {@link KiiUser#refresh} to fetch the properties.
    *
    * @param userID ID of the KiiUser to instantiate.
    *
    * @return instance of KiiUser.
    *
    * @throws when passed userID is empty or null.
    *
    * @example
    *     var user = new KiiUser.userWithID("__USER_ID__");
    */
  /* static member */
  @scala.inline
  def userWithID(userID: String): typings.kiiCloudSdk.KiiCloud.KiiUser = ^.asInstanceOf[js.Dynamic].applyDynamic("userWithID")(userID.asInstanceOf[js.Any]).asInstanceOf[typings.kiiCloudSdk.KiiCloud.KiiUser]
  
  /**
    * Create a user object to prepare for registration with credentials pre-filled
    *
    * <br><br>Creates an pre-filled user object for registration. This user will not be authenticated until the registration method is called on it. It can be treated as any other KiiUser before
    * it is registered.
    *
    * @param phoneNumber The user's phone number
    * @param password The user's password. Must be at least 4 characters, made up of alphanumeric and/or: @,#,$,%,^,&
    *
    * @return a working KiiUser object
    *
    * @throws If the password is not in the proper format
    * @throws If the phone number is not in the proper format
    *
    * @example
    *     var user = KiiUser.userWithPhoneNumber("+874012345678", "mypassword");
    */
  /* static member */
  @scala.inline
  def userWithPhoneNumber(phoneNumber: String, password: String): typings.kiiCloudSdk.KiiCloud.KiiUser = (^.asInstanceOf[js.Dynamic].applyDynamic("userWithPhoneNumber")(phoneNumber.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.kiiCloudSdk.KiiCloud.KiiUser]
  
  /**
    * Create a user object to prepare for registration with credentials pre-filled
    *
    * <br><br>Creates an pre-filled user object for registration. This user will not be authenticated until the registration method is called on it. It can be treated as any other KiiUser before
    * it is registered.
    *
    * @param phoneNumber The user's phone number
    * @param username The user's desired username. Must be between 3 and 64 characters, which can include alphanumeric characters as well as underscores '_', dashes '-' and periods '.'
    * @param password The user's password. Must be at least 4 characters, made up of alphanumeric and/or: @,#,$,%,^,&
    *
    * @return a working KiiUser object
    *
    * @throws If the username is not in the proper format
    * @throws If the password is not in the proper format
    * @throws If the phone number is not in the proper format
    *
    * @example
    *     var user = KiiUser.userWithPhoneNumberAndUsername("+874012345678", "johndoe", "mypassword");
    */
  /* static member */
  @scala.inline
  def userWithPhoneNumberAndUsername(phoneNumber: String, username: String, password: String): typings.kiiCloudSdk.KiiCloud.KiiUser = (^.asInstanceOf[js.Dynamic].applyDynamic("userWithPhoneNumberAndUsername")(phoneNumber.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.kiiCloudSdk.KiiCloud.KiiUser]
  
  /**
    * Generate a new KiiUser based on a given URI
    *
    * @param uri The URI of the object to be represented
    *
    * @return A new KiiUser with its parameters filled in from the URI
    *
    * @throws If the URI is not in the proper format
    *
    * @example
    *     var user = new KiiUser.userWithURI("kiicloud://myuri");
    */
  /* static member */
  @scala.inline
  def userWithURI(uri: String): typings.kiiCloudSdk.KiiCloud.KiiUser = ^.asInstanceOf[js.Dynamic].applyDynamic("userWithURI")(uri.asInstanceOf[js.Any]).asInstanceOf[typings.kiiCloudSdk.KiiCloud.KiiUser]
  
  /**
    * Create a user object to prepare for registration with credentials pre-filled
    *
    * <br><br>Creates an pre-filled user object for manipulation. This user will not be authenticated until one of the authentication methods are called on it. It can be treated as any other
    * KiiObject before it is authenticated.
    *
    * @param username The user's desired username. Must be between 3 and 64 characters, which can include alphanumeric characters as well as underscores '_', dashes '-' and periods '.'
    * @param password The user's password. Must be between 4-50 characters, made up of ascii characters excludes control characters.
    *
    * @return a working KiiUser object
    *
    * @throws If the username is not in the proper format
    * @throws If the password is not in the proper format
    *
    * @example
    *     var user = KiiUser.userWithUsername("myusername", "mypassword");
    */
  /* static member */
  @scala.inline
  def userWithUsername(username: String, password: String): typings.kiiCloudSdk.KiiCloud.KiiUser = (^.asInstanceOf[js.Dynamic].applyDynamic("userWithUsername")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.kiiCloudSdk.KiiCloud.KiiUser]
}
