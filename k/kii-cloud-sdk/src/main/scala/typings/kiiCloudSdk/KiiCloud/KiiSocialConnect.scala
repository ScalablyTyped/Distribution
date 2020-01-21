package typings.kiiCloudSdk.KiiCloud

import typings.kiiCloudSdk.AnonAnErrorStringFailureNetwork
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a KiiSocialConnect object
  */
@JSGlobal("KiiCloud.KiiSocialConnect")
@js.native
class KiiSocialConnect () extends js.Object

/* static members */
@JSGlobal("KiiCloud.KiiSocialConnect")
@js.native
object KiiSocialConnect extends js.Object {
  /**
    * Retrieve the current user's access token expiration date from a social network
    *
    * The network must be set up and linked to the current user. It is recommended you save this to preferences for multi-session use.
    *
    * @deprecated Use {@link KiiSocialConnect.getAccessTokenObjectForNetwork} instead.
    *
    * @param networkName One of the supported KiiSocialNetworkName values
    *
    * @return The current access token expiration date, null if unavailable
    */
  def getAccessTokenExpirationForNetwork(networkName: KiiSocialNetworkName): String = js.native
  /**
    * Retrieve the current user's access token from a social network
    * The network must be set up and linked to the current user. It is recommended you save this to preferences for multi-session use.
    *
    * @deprecated Use {@link KiiSocialConnect.getAccessTokenObjectForNetwork} instead.
    *
    * @param networkName One of the supported KiiSocialNetworkName values
    *
    * @return The current access token, null if unavailable
    */
  def getAccessTokenForNetwork(networkName: KiiSocialNetworkName): String = js.native
  /**
    * Retrieve the current user's access token object from a social network
    *
    * The network must be set up and linked to the current user.
    * It is recommended you save this to preferences for multi-session use.<br><br>
    * Following parameters can be assigned to object.<br><br>
    * <b>Facebook</b>
    * <li>access_token</li>
    * <li>expires_in</li>
    * <li>kii_new_user</li>
    * <br>
    * <b>Twitter</b>
    * <li>oauth_token</li>
    * <li>oauth_token_secret</li>
    * <li>kii_new_user</li>
    * <br>
    * <b>Google</b>
    * <li>access_token</li>
    * <li>kii_new_user</li>
    * <br>
    * <b>RenRen</b>
    * <li>access_token</li>
    * <li>kii_new_user</li>
    * <br>
    * <b>QQ</b>
    * <li>access_token</li>
    * <li>openID</li>
    * <li>kii_new_user</li>
    *
    * @param networkName One of the supported KiiSocialNetworkName values
    *
    * @return tokenObject The current access token object, null if unavailable.
    */
  def getAccessTokenObjectForNetwork(networkName: KiiSocialNetworkName): js.Any = js.native
  /**
    * Link the currently logged in user with a social network
    *
    *  This will initiate the login process for the given network, which for SSO-enabled services like Facebook, will send the user to the Facebook site for authentication. There must be a
    *  currently authenticated KiiUser. Otherwise, you can use the logIn: method to create and log in a KiiUser using a network. The network must already be set up via setupNetwork<br>
    *  If there is not logged-in user to link with, callbacks.failure or reject callback of promise will be called. <br>
    *  If the opitons is invalid, callbacks.failure or reject callback of promise will be called. <br>
    *
    * @param networkName One of the supported KiiSocialNetworkName values
    * @param options A dictionary of key/values to pass to KiiSocialConnect
    *   <br><b> Facebook </b>
    *   <table border="1" cellspacing="0">
    *   <thead>
    *   <tr bgcolor="#CCCCFF">
    *   <th>Key</th>
    *   <th>Value type</th>
    *   <th>Value</th>
    *   <th>Note</th>
    *   </tr>
    *   </thead>
    *   <tbody>
    *   <tr>
    *   <td>access_token</td>
    *   <td>String</td>
    *   <td>Access token of Facebook.</td>
    *   <td>This is mandatory.</td>
    *   </tr>
    *   </tbody>
    *   </table>
    *
    *   <br><b> Twitter </b>
    *   <table border="1" cellspacing="0">
    *   <thead>
    *   <tr bgcolor="#CCCCFF">
    *   <th>Key</th>
    *   <th>Value type</th>
    *   <th>Value</th>
    *   <th>Note</th>
    *   </tr>
    *   </thead>
    *   <tbody>
    *   <tr>
    *   <td>oauth_token</td>
    *   <td>String</td>
    *   <td>OAuth access token of twitter.</td>
    *   <td>This is mandatory.</td>
    *   </tr>
    *   <tr>
    *   <td>oauth_token_secret</td>
    *   <td>String</td>
    *   <td>OAuth access token secret of twitter.</td>
    *   <td>This is mandatory.</td>
    *   </tr>
    *   </tbody>
    *   </table>
    *
    *   <br><b> Google </b>
    *   <table border="1" cellspacing="0">
    *   <thead>
    *   <tr bgcolor="#CCCCFF">
    *   <th>Key</th>
    *   <th>Value type</th>
    *   <th>Value</th>
    *   <th>Note</th>
    *   </tr>
    *   </thead>
    *   <tbody>
    *   <tr>
    *   <td>access_token</td>
    *   <td>String</td>
    *   <td>Access token of Google.</td>
    *   <td>This is mandatory.</td>
    *   </tr>
    *   </tbody>
    *   </table>
    *
    *   <br><b> Renren </b>
    *   <table border="1" cellspacing="0">
    *   <thead>
    *   <tr bgcolor="#CCCCFF">
    *   <th>Key</th>
    *   <th>Value type</th>
    *   <th>Value</th>
    *   <th>Note</th>
    *   </tr>
    *   </thead>
    *   <tbody>
    *   <tr>
    *   <td>access_token</td>
    *   <td>String</td>
    *   <td>Access token of Renren.</td>
    *   <td>This is mandatory.</td>
    *   </tr>
    *   </tbody>
    *   </table>
    *
    *   <br><b> QQ </b>
    *   <table border="1" cellspacing="0">
    *   <thead>
    *   <tr bgcolor="#CCCCFF">
    *   <th>Key</th>
    *   <th>Value type</th>
    *   <th>Value</th>
    *   <th>Note</th>
    *   </tr>
    *   </thead>
    *   <tbody>
    *   <tr>
    *   <td>access_token</td>
    *   <td>String</td>
    *   <td>Access token of QQ.</td>
    *   <td>This is mandatory. </td>
    *   </tr>
    *   <tr>
    *   <td>openID</td>
    *   <td>String</td>
    *   <td>OpenID of QQ.</td>
    *   <td>This is mandatory.</td>
    *   </tr>
    *   </tbody>
    *   </table>
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(params). params is Array instance.
    *       <ul>
    *         <li>params[0] is a linked KiiUser instance.</li>
    *         <li>params[1] is the KiiSocialNetworkName used to link.</li>
    *       </ul>
    *     </li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is current logged-in KiiUser instance. If there is not logged-in user, it will be null.</li>
    *         <li>error.message</li>
    *         <li>error.network is the KiiSocialNetworkName used to link.</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *      // example to use callbacks directly
    *      // Example of using no option
    *      KiiSocialConnect.linkCurrentUserWithNetwork(KiiSocialNetworkName.FACEBOOK, null, {
    *
    *          success: function(user, network) {
    *              // do something now that the user is linked
    *          },
    *
    *          failure: function(user, network, anErrorString) {
    *              // do something with the error response
    *          }
    *      });
    *
    *      // example to use Promise
    *      // Example of using no option
    *      KiiSocialConnect.linkCurrentUserWithNetwork(KiiSocialNetworkName.FACEBOOK, null).then(
    *          function(params) {
    *              // do something now that the user is linked
    *          },
    *          function(error) {
    *              // do something with the error response
    *          }
    *      );
    */
  def linkCurrentUserWithNetwork(networkName: KiiSocialNetworkName, options: KiiSocialConnectOptions): js.Promise[js.Tuple2[KiiUser, KiiSocialNetworkName]] = js.native
  def linkCurrentUserWithNetwork(
    networkName: KiiSocialNetworkName,
    options: KiiSocialConnectOptions,
    callbacks: AnonAnErrorStringFailureNetwork
  ): js.Promise[js.Tuple2[KiiUser, KiiSocialNetworkName]] = js.native
  /**
    * Log a user into the social network provided
    *
    *  This will initiate the login process for the given network. If user has already linked with the specified social network,
    *  sign-in with the social network. Otherwise, this will sign-up and create new user authenticated by the specified social network.
    *  If sign-up successful, the user is cached inside SDK as current user,and accessible via {@link KiiUser.getCurrentUser()}.
    *  User token and token expiration is also cached and can be get by {@link KiiUser#getAccessTokenObject()}.
    *  Access token won't be expired unless you set it explicitly by {@link Kii.setAccessTokenExpiration()}.
    *  The network must already be set up via setupNetwork<br>
    *  If the opitons is invalid, callbacks.failure or reject callback of promise will be called. <br>
    *
    * @param networkName One of the supported KiiSocialNetworkName values
    * @param options A dictionary of key/values to pass to KiiSocialConnect
    *
    *   <br><b> Facebook </b>
    *   <table border="1" cellspacing="0">
    *   <thead>
    *   <tr bgcolor="#CCCCFF">
    *   <th>Key</th>
    *   <th>Value type</th>
    *   <th>Value</th>
    *   <th>Note</th>
    *   </tr>
    *   </thead>
    *   <tbody>
    *   <tr>
    *   <td>access_token</td>
    *   <td>String</td>
    *   <td>Access token of Facebook.</td>
    *   <td>This is mandatory.</td>
    *   </tr>
    *   </tbody>
    *   </table>
    *
    *   <br><b> Twitter </b>
    *   <table border="1" cellspacing="0">
    *   <thead>
    *   <tr bgcolor="#CCCCFF">
    *   <th>Key</th>
    *   <th>Value type</th>
    *   <th>Value</th>
    *   <th>Note</th>
    *   </tr>
    *   </thead>
    *   <tbody>
    *   <tr>
    *   <td>oauth_token</td>
    *   <td>String</td>
    *   <td>OAuth access token of twitter.</td>
    *   <td>This is mandatory. </td>
    *   </tr>
    *   <tr>
    *   <td>oauth_token_secret</td>
    *   <td>String</td>
    *   <td>OAuth access token secret of twitter.</td>
    *   <td>This is mandatory.</td>
    *   </tr>
    *   </tbody>
    *   </table>
    *
    *   <br><b> Google </b>
    *   <table border="1" cellspacing="0">
    *   <thead>
    *   <tr bgcolor="#CCCCFF">
    *   <th>Key</th>
    *   <th>Value type</th>
    *   <th>Value</th>
    *   <th>Note</th>
    *   </tr>
    *   </thead>
    *   <tbody>
    *   <tr>
    *   <td>access_token</td>
    *   <td>String</td>
    *   <td>Access token of Google.</td>
    *   <td>This is mandatory.</td>
    *   </tr>
    *   </tbody>
    *   </table>
    *
    *   <br><b> Renren </b>
    *   <table border="1" cellspacing="0">
    *   <thead>
    *   <tr bgcolor="#CCCCFF">
    *   <th>Key</th>
    *   <th>Value type</th>
    *   <th>Value</th>
    *   <th>Note</th>
    *   </tr>
    *   </thead>
    *   <tbody>
    *   <tr>
    *   <td>access_token</td>
    *   <td>String</td>
    *   <td>Access token of Renren.</td>
    *   <td>This is mandatory.</td>
    *   </tr>
    *   </tbody>
    *   </table>
    *
    *   <br><b> QQ </b>
    *   <table border="1" cellspacing="0">
    *   <thead>
    *   <tr bgcolor="#CCCCFF">
    *   <th>Key</th>
    *   <th>Value type</th>
    *   <th>Value</th>
    *   <th>Note</th>
    *   </tr>
    *   </thead>
    *   <tbody>
    *   <tr>
    *   <td>access_token</td>
    *   <td>String</td>
    *   <td>Access token of QQ.</td>
    *   <td>This is mandatory. </td>
    *   </tr>
    *   <tr>
    *   <td>openID</td>
    *   <td>String</td>
    *   <td>OpenID of QQ.</td>
    *   <td>This is mandatory.</td>
    *   </tr>
    *   </tbody>
    *   </table>
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(params). params is Array instance.
    *       <ul>
    *         <li>params[0] is a logged in KiiUser instance.</li>
    *         <li>params[1] is the KiiSocialNetworkName used to login.</li>
    *       </ul>
    *     </li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.message</li>
    *         <li>error.network is the KiiSocialNetworkName used to login.</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *      // example to use callbacks directly
    *      // Example of using no option
    *      KiiSocialConnect.logIn(KiiSocialNetworkName.FACEBOOK, null, {
    *
    *          success: function(user, network) {
    *              // do something now that the user is logged in
    *          },
    *
    *          failure: function(user, network, anErrorString) {
    *              // do something with the error response
    *          }
    *      });
    *
    *      // example to use Promise
    *      KiiSocialConnect.logIn(KiiSocialNetworkName.FACEBOOK, null).then(
    *          function(params) {
    *              // do something now that the user is logged in
    *          },
    *          function(error) {
    *              // do something with the error response
    *          }
    *      );
    */
  def logIn(networkName: KiiSocialNetworkName, options: KiiSocialConnectOptions): js.Promise[js.Tuple2[KiiUser, KiiSocialNetworkName]] = js.native
  def logIn(
    networkName: KiiSocialNetworkName,
    options: KiiSocialConnectOptions,
    callbacks: AnonAnErrorStringFailureNetwork
  ): js.Promise[js.Tuple2[KiiUser, KiiSocialNetworkName]] = js.native
  /**
    *
    *
    * @deprecated You don't have to call this method.
    *   Set up a reference to one of the supported KiiSocialNetworks.
    *
    *   Set up the network. Need to be called before accessing other methods.
    *   <br><b> Facebook </b>
    *   <table border="1" cellspacing="0">
    *   <thead>
    *   <tr bgcolor="#CCCCFF">
    *   <th>Argument</th>
    *   <th>Value Type</th>
    *   <th>Value</th>
    *   <th>Note</th>
    *   </tr>
    *   </thead>
    *   <tbody>
    *   <tr>
    *   <td>networkName</td>
    *   <td>Number</td>
    *   <td>KiiSocialNetworkName.FACEBOOK</td>
    *   <td>Specify Facebook</td>
    *   </tr>
    *   <tr>
    *   <td>apiKey</td>
    *   <td>String</td>
    *   <td>null</td>
    *   <td>Facebook does not requires this argument.</td>
    *   </tr>
    *   <tr>
    *   <td>apiSecret</td>
    *   <td>String</td>
    *   <td>null</td>
    *   <td>Facebook does not requires this argument.</td>
    *   </tr>
    *   <tr>
    *   <td>extras</td>
    *   <td>Object</td>
    *   <td>null</td>
    *   <td>Facebook does not requires this argument.</td>
    *   </tr>
    *   </tbody>
    *   </table>
    *
    *   <br><b> Twitter </b>
    *   <table border="1" cellspacing="0">
    *   <thead>
    *   <tr bgcolor="#CCCCFF">
    *   <th>Argument</th>
    *   <th>Value Type</th>
    *   <th>Value</th>
    *   <th>Note</th>
    *   </tr>
    *   </thead>
    *   <tbody>
    *   <tr>
    *   <td>networkName</td>
    *   <td>Number</td>
    *   <td>KiiSocialNetworkName.TWITTER</td>
    *   <td>Specify Twitter</td>
    *   </tr>
    *   <tr>
    *   <td>apiKey</td>
    *   <td>String</td>
    *   <td>null</td>
    *   <td>Twitter does not requires this argument.</td>
    *   </tr>
    *   <tr>
    *   <td>apiSecret</td>
    *   <td>String</td>
    *   <td>null</td>
    *   <td>Twitter does not requires this argument.</td>
    *   </tr>
    *   <tr>
    *   <td>extras</td>
    *   <td>Object</td>
    *   <td>null</td>
    *   <td>Twitter does not requires this argument.</td>
    *   </tr>
    *   </tbody>
    *   </table>
    *   <br><b> QQ </b>
    *   <table border="1" cellspacing="0">
    *   <thead>
    *   <tr bgcolor="#CCCCFF">
    *   <th>Argument</th>
    *   <th>Value Type</th>
    *   <th>Value</th>
    *   <th>Note</th>
    *   </tr>
    *   </thead>
    *   <tbody>
    *   <tr>
    *   <td>networkName</td>
    *   <td>Number</td>
    *   <td>KiiSocialNetworkName.QQ</td>
    *   <td>Specify QQ</td>
    *   </tr>
    *   <tr>
    *   <td>apiKey</td>
    *   <td>String</td>
    *   <td>null</td>
    *   <td>QQ does not requires this argument.</td>
    *   </tr>
    *   <tr>
    *   <td>apiSecret</td>
    *   <td>String</td>
    *   <td>null</td>
    *   <td>QQ does not requires this argument.</td>
    *   </tr>
    *   <tr>
    *   <td>extras</td>
    *   <td>Object</td>
    *   <td>null</td>
    *   <td>QQ does not requires this argument.</td>
    *   </tr>
    *   </tbody>
    *   </table>
    *
    * @param networkName One of the supported KiiSocialNetworkName values
    * @param apiKey The SDK key assigned by the social network provider. For details refer to the table above.
    * @param apiSecret The SDK secret assigned by the social network provider. For details refer to the table above.
    * @param extras Extra options that should be passed to the SNS. For details refer to the table above.
    *
    * @throws For details refer to the table above
    */
  def setupNetwork(networkName: KiiSocialNetworkName, apiKey: String, apiSecret: String, extras: js.Any): Unit = js.native
  /**
    * Unlink the currently logged in user with a social network
    *
    *  The network must already be set up via setupNetwork
    *
    * @param networkName One of the supported KiiSocialNetworkName values
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(params). params is Array instance.
    *       <ul>
    *         <li>params[0] is a unlinked KiiUser instance.</li>
    *         <li>params[1] is the KiiSocialNetworkName used to unlink.</li>
    *       </ul>
    *     </li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is current logged-in KiiUser instance. If there is not logged-in user, it will be null.</li>
    *         <li>error.message</li>
    *         <li>error.network is the KiiSocialNetworkName used to unlink.</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *
    *      // example to use callbacks directly
    *      KiiSocialConnect.unLinkCurrentUserFromNetwork(KiiSocialNetworkName.FACEBOOK, {
    *
    *          success: function(user, network) {
    *              // do something now that the user is unlinked
    *          },
    *
    *          failure: function(user, network, anErrorString) {
    *              // do something with the error response
    *          }
    *      });
    *
    *      // example to use Promise
    *      KiiSocialConnect.unLinkCurrentUserFromNetwork(KiiSocialNetworkName.FACEBOOK).then(
    *          function(params) {
    *              // do something now that the user is unlinked
    *          },
    *          function(error) {
    *              // do something with the error response
    *          }
    *      );
    */
  def unLinkCurrentUserFromNetwork(networkName: KiiSocialNetworkName): js.Promise[js.Tuple2[KiiUser, KiiSocialNetworkName]] = js.native
  def unLinkCurrentUserFromNetwork(networkName: KiiSocialNetworkName, callbacks: AnonAnErrorStringFailureNetwork): js.Promise[js.Tuple2[KiiUser, KiiSocialNetworkName]] = js.native
}

