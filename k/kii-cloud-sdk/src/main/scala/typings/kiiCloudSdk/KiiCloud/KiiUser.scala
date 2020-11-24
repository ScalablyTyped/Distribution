package typings.kiiCloudSdk.KiiCloud

import org.scalablytyped.runtime.StringDictionary
import typings.kiiCloudSdk.anon.`32`
import typings.kiiCloudSdk.anon.`33`
import typings.kiiCloudSdk.anon.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a KiiUser object
  */
@js.native
trait KiiUser extends KiiACLSubject {
  
  /**
    * Creates a reference to a bucket for this user
    *
    * <br><br>The bucket will be created/accessed within this user's scope
    *
    * @param bucketName The name of the bucket the user should create/access
    *
    * @return A working KiiBucket object
    *
    * @example
    *     var user = . . .; // a KiiUser
    *     var bucket = user.bucketWithName("myBucket");
    */
  def bucketWithName(bucketName: String): KiiBucket = js.native
  
  /**
    * Change email of logged in user.
    * If the email address verification is required by your app configuration,
    * User's email would not changed to new one until the new email verification has been done.
    * In this case, new mail address can be obtained by {@link KiiUser#getPendingEmailAddress()}.
    * This API does not refresh the KiiUser automatically.
    * Please execute {@link KiiUser#refresh()} before checking the value of {@link KiiUser#getEmailAddress()} or {@link KiiUser#getPendingEmailAddress()}
    *
    * @param newEmail The new email address to change to
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(theUser). theUser is KiiUser instance which this method was called on.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiUser instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var user = Kii.currentUser();
    *     user.changeEmail('mynewemail@kii.com', {
    *         success: function(theUser) {
    *             // do something on success
    *         },
    *
    *         failure: function(theUser, anErrorString) {
    *             // do something with the error response
    *         }
    *     });
    *
    *     // example to use Promise
    *     var user = Kii.currentUser();
    *     user.changeEmail('mynewemail@kii.com').then(
    *         function(theUser) {
    *             // do something on success
    *         },
    *         function(error) {
    *             // do something with the error response
    *         }
    *     );
    */
  def changeEmail(newEmail: String): js.Promise[KiiUser] = js.native
  def changeEmail(newEmail: String, callbacks: `32`): js.Promise[KiiUser] = js.native
  
  /**
    * Change phone number of logged in user.
    * If the phone number verification is required by your app configuration,
    * User's phone number would not changed to new one until the new phone number verification has been done.
    * In this case, new phone can be obtained by {@link KiiUser#getPendingPhoneNumber()}.
    * This API does not refresh the KiiUser automatically.
    * Please execute {@link KiiUser#refresh()} before checking the value of {@link KiiUser#getPhoneNumber()} or {@link KiiUser#getPendingPhoneNumber()}.
    *
    * @param newPhoneNumber The new phone number to change to
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(theUser). theUser is KiiUser instance which this method was called on.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiUser instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var user = Kii.currentUser();
    *     user.changePhone('+19415551234', {
    *         success: function(theUser) {
    *             // do something on success
    *         },
    *
    *         failure: function(theUser, anErrorString) {
    *             // do something with the error response
    *         }
    *     });
    *
    *     // example to use Promise
    *     var user = Kii.currentUser();
    *     user.changePhone('+19415551234').then(
    *         function(theUser) {
    *             // do something on success
    *         },
    *         function(error) {
    *             // do something with the error response
    *         }
    *     );
    */
  def changePhone(newPhoneNumber: String): js.Promise[KiiUser] = js.native
  def changePhone(newPhoneNumber: String, callbacks: `32`): js.Promise[KiiUser] = js.native
  
  /**
    * Delete the user from the server
    *
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(theDeletedUser). theDeletedUser is KiiUser instance.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiUser instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var user = Kii.getCurrentUser(); // a KiiUser
    *     user.delete({
    *         success: function(theDeletedUser) {
    *             // do something
    *         },
    *
    *         failure: function(theUser, anErrorString) {
    *             // do something with the error response
    *         }
    *     });
    *
    *     // example to use Promise
    *     var user = Kii.getCurrentUser(); // a KiiUser
    *     user.delete().then(
    *         function(theDeletedUser) {
    *             // do something
    *         },
    *         function(error) {
    *             // do something with the error response
    *         }
    *     );
    */
  def delete(): js.Promise[KiiUser] = js.native
  def delete(callbacks: `32`): js.Promise[KiiUser] = js.native
  
  /**
    * Return true if the user is disabled, false when enabled and undefined
    * when user is not refreshed.
    * Call {@link KiiUser#refresh()} prior calling this method to get
    * correct status.
    */
  def disabled(): Unit = js.native
  
  /**
    * Creates a reference to a encrypted bucket for this user
    *
    * <br><br>The bucket will be created/accessed within this user's scope
    *
    * @param bucketName The name of the bucket the user should create/access
    *
    * @return A working KiiEncryptedBucket object
    *
    * @example
    *     var user = . . .; // a KiiUser
    *     var bucket = user.encryptedBucketWithName("myBucket");
    */
  def encryptedBucketWithName(bucketName: String): KiiBucket = js.native
  
  /**
    * Gets the value associated with the given key
    *
    * @param key The key to retrieve
    *
    * @return The object associated with the key. null or undefined if none exists
    *
    * @example
    *     var user = . . .; // a KiiUser
    *     var score = user.get("score");
    */
  def get[T](key: String): T = js.native
  
  /**
    * Get the access token for the user - only available if the user is currently logged in
    *
    */
  def getAccessToken(): String = js.native
  
  /**
    * Return the access token and token expire time in a object.
    * <table border=4 width=250>
    *   <tr>
    *     <th>Key</th>
    *     <th>Type</th>
    *     <th>Value</th>
    *   </tr>
    *   <tr>
    *     <td>"access_token"</td>
    *     <td>String</td>
    *     <td>required for accessing KiiCloud</td>
    *   </tr>
    *   <tr>
    *     <td>"expires_at"</td>
    *     <td>Date</td>
    *     <td>Access token expiration time, null if the user is not login user.</td>
    *   </tr>
    * </table>
    *
    * @return Access token and token expires in a object.
    */
  def getAccessTokenObject(): KiiAccessTokenObject = js.native
  
  /**
    * Get the country code associated with this user
    *
    */
  def getCountry(): String = js.native
  
  /**
    * Get the server's creation date of this user
    *
    */
  def getCreated(): String = js.native
  
  /**
    * Get the display name associated with this user
    *
    */
  def getDisplayName(): String = js.native
  
  /**
    * Get the email address associated with this user
    *
    */
  def getEmailAddress(): String = js.native
  
  /**
    * Get the status of the user's email verification. This field is assigned by the server
    *
    * @return true if the user's email address has been verified by the user, false otherwise.
    *     Could be undefined if haven't obtained value from server or not allowed to see the value.
    *     Should be used by current login user to check the email verification status.
    */
  def getEmailVerified(): Boolean = js.native
  
  /**
    * Get the ID of the current KiiUser instance.
    *
    * @return Id of the user or null if the user has not saved to cloud.
    */
  def getID(): String = js.native
  
  /**
    * Get the social accounts that is linked to this user.
    * Refresh the user by {@link KiiUser#refresh()} prior call the method.
    * Otherwise, it returns empty object.
    *
    * @return Social network name as key and account info as value.
    */
  def getLinkedSocialAccounts(): StringDictionary[KiiSocialAccountInfo] = js.native
  
  /**
    * Get the locale associated with this user
    *
    */
  def getLocale(): String = js.native
  
  /**
    *
    *
    * @deprecated Get the modified date of the given user, assigned by the server
    *
    */
  def getModified(): String = js.native
  
  /**
    * Get the email of this user that has not been verified.
    * When the user's email has been changed and email verification is required in you app configuration,
    * New email is stored as pending email.
    * After the new email has been verified, the address can be obtained by {@link KiiUser.getEmailAddress}
    *
    * @return User's new email address has not been verified.
    *     null if no pending email field is included in refresh
    *     response or undefined when no refresh operation has been done before.
    */
  def getPendingEmailAddress(): String = js.native
  
  /**
    * Get the phone of this user that has not been verified.
    * When the user's phone has been changed and phone verification is required in you app configuration,
    * New phone is stored as pending phone.
    * After the new phone has been verified, the address can be obtained by {@link KiiUser.getPhoneNumber}
    *
    * @return User's new phone number has not been verified.
    *     null if no pending phone field is included in refresh
    *     response or undefined when no refresh operation has been done before.
    */
  def getPendingPhoneNumber(): String = js.native
  
  /**
    * Get the phone number associated with this user
    *
    */
  def getPhoneNumber(): String = js.native
  
  /**
    * Get the status of the user's phone number verification. This field is assigned by the server
    *
    * @return true if the user's email address has been verified by the user, false otherwise
    *     Could be undefined if haven't obtained value from server or not allowed to see the value.
    *     Should be used by current login user to check the phone verification status.
    */
  def getPhoneVerified(): Boolean = js.native
  
  /**
    *
    *
    * @deprecated Use {@link KiiUser.getId} instead.
    *   Get the UUID of the given user, assigned by the server
    *
    */
  def getUUID(): String = js.native
  
  /**
    * Get the username of the given user
    *
    */
  def getUsername(): String = js.native
  
  /**
    * Get whether or not the user is pseudo user.
    * If this method is not called for current login user, calling
    * {@link KiiUser#refresh()} method is necessary to get a correct value.
    *
    * @return whether this user is pseudo user or not.
    */
  def isPseudoUser(): Boolean = js.native
  
  /**
    * Gets a list of topics in this user scope
    *
    * @param callbacks An object with callback methods defined
    * @param paginationKey You can specify the pagination key with the nextPaginationKey passed by callbacks.success. If empty string or no string object is provided, this API regards no
    * paginationKey specified.
    *
    * @return return promise object.
    *     <ul>
    *       <li>fulfill callback function: function(params). params is Array instance.
    *         <ul>
    *           <li>params[0] is array of KiiTopic instances.</li>
    *           <li>params[1] is string of nextPaginationKey.</li>
    *         </ul>
    *       </li>
    *       <li>reject callback function: function(error). error is an Error instance.
    *         <ul>
    *           <li>error.target is the KiiUser instance which this method was called on. </li>
    *           <li>error.message</li>
    *         </ul>
    *       </li>
    *     </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var user = . . .; // a KiiUser
    *     user.listTopics({
    *         success: function(topicList, nextPaginationKey) {
    *             // do something with the result
    *             for(var i=0; i&lt;topicList.length; i++){
    *                 var topic = topicList[i];
    *             }
    *             if (nextPaginationKey != null) {
    *                 user.listTopics({
    *                     success: function(topicList, nextPaginationKey) {...},
    *                     failure: function(anErrorString) {...}
    *                 }, nextPaginationKey);
    *             }
    *         },
    *         failure: function(anErrorString) {
    *             // do something with the error response
    *         }
    *     });
    *
    *     // example to use callbacks directly
    *     var user = . . .; // a KiiUser
    *     user.listTopics().then(
    *         function(params) {
    *             var topicList = params[0];
    *             var nextPaginationKey = params[1];
    *             // do something with the result
    *             for(var i=0; i&lt;topicList.length; i++){
    *                 var topic = topicList[i];
    *             }
    *             if (nextPaginationKey != null) {
    *                 user.listTopics(null, nextPaginationKey).then(
    *                     function(params) {...},
    *                     function(error) {...}
    *                 );
    *             }
    *         },
    *         function(error) {
    *             // do something with the error response
    *         }
    *     );
    */
  def listTopics(): js.Promise[js.Tuple2[js.Array[KiiTopic], String]] = js.native
  def listTopics(callbacks: js.UndefOr[scala.Nothing], paginationKey: String): js.Promise[js.Tuple2[js.Array[KiiTopic], String]] = js.native
  def listTopics(callbacks: `4`): js.Promise[js.Tuple2[js.Array[KiiTopic], String]] = js.native
  def listTopics(callbacks: `4`, paginationKey: String): js.Promise[js.Tuple2[js.Array[KiiTopic], String]] = js.native
  
  /**
    * Retrieve a list of groups which the user is a member of
    *
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(params). params is Array instance.
    *       <ul>
    *         <li>params[0] is the KiiUser instance which this method was called on.</li>
    *         <li>params[1] is array of KiiGroup instances.</li>
    *       </ul>
    *     </li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiUser instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var user = Kii.currentUser();
    *     user.memberOfGroups({
    *         success: function(theUser, groupList) {
    *             // do something with the results
    *             for(var i=0; i&lt;groupList.length; i++) {
    *                 var g = groupList[i]; // a KiiGroup object
    *             }
    *         },
    *
    *         failure: function(theUser, anErrorString) {
    *             // do something with the error response
    *         }
    *     });
    *
    *     // example to use Promise
    *     var user = Kii.currentUser();
    *     user.memberOfGroups().then(
    *         function(params) {
    *             // do something with the results
    *             var theUser = params[0];
    *             var groupList = params[1];
    *             for(var i=0; i&lt;groupList.length; i++) {
    *                 var g = groupList[i]; // a KiiGroup object
    *             }
    *         },
    *         function(error) {
    *             // do something with the error response
    *         }
    *     );
    */
  def memberOfGroups(): js.Promise[js.Tuple2[KiiUser, js.Array[KiiGroup]]] = js.native
  def memberOfGroups(callbacks: `33`): js.Promise[js.Tuple2[KiiUser, js.Array[KiiGroup]]] = js.native
  
  /**
    * Get a specifically formatted string referencing the user
    *
    * <br><br>The user must exist in the cloud (have a valid UUID).
    *
    * @return A URI string based on the given user. null if a URI couldn't be generated.
    *
    * @example
    *     var user = . . .; // a KiiUser
    *     var uri = user.objectURI();
    */
  def objectURI(): String = js.native
  
  /**
    * Retrieve the groups owned by this user. Group in the groupList
    * does not contain all the property of group. To get all the
    * property from cloud, a {@link KiiGroup#refresh(callback)} is necessary.
    *
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(params). params is Array instance.
    *       <ul>
    *         <li>params[0] is the KiiUser instance which this method was called on.</li>
    *         <li>params[1] is array of KiiGroup instances.</li>
    *       </ul>
    *     </li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiUser instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var user = Kii.currentUser();
    *     user.ownerOfGroups({
    *         success: function(theUser, groupList) {
    *             // do something with the results
    *             for(var i=0; i&lt;groupList.length; i++) {
    *                 var g = groupList[i]; // a KiiGroup object
    *             }
    *         },
    *
    *         failure: function(theUser, anErrorString) {
    *             // do something with the error response
    *         }
    *     });
    *
    *     // example to use Promise
    *     var user = Kii.currentUser();
    *     user.ownerOfGroups().then(
    *         function(params) {
    *             // do something with the results
    *             var theUser = params[0];
    *             var groupList = params[1];
    *             for(var i=0; i&lt;groupList.length; i++) {
    *                 var g = groupList[i]; // a KiiGroup object
    *             }
    *         },
    *         function(error) {
    *             // do something with the error response
    *         }
    *     );
    */
  def ownerOfGroups(): js.Promise[js.Tuple2[KiiUser, js.Array[KiiGroup]]] = js.native
  def ownerOfGroups(callbacks: `33`): js.Promise[js.Tuple2[KiiUser, js.Array[KiiGroup]]] = js.native
  
  /**
    * Instantiate push installation for this user.
    *
    * @return push installation object.
    */
  def pushInstallation(): KiiPushInstallation = js.native
  
  /**
    * Instantiate push subscription for this user.
    *
    * @return push subscription object.
    */
  def pushSubscription(): KiiPushSubscription = js.native
  
  /**
    * Sets credentials data and custom fields to pseudo user.
    *
    * <br><br>This method is exclusive to pseudo user.
    * <br>password is mandatory and needs to provide at least one of login name, email address or phone number.
    *
    * @param password The user's password. Valid pattern is ^[\x20-\x7E]{4,50}$.
    * @param callbacks An object with callback methods defined.
    *   This argument is mandatory and can't be ommited.
    * @param userFields Custom Fields to add to the user. This is optional and can be omitted.
    * @param removeFields An array of field names to remove from the user custom fields. Default fields are not removed from server.
    *   This is optional and can be omitted.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(user). user is KiiUser instance which this method was called on.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiUser instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var identityData = { "username": "__USER_NAME_" };
    *     var userFields = { "displayName":"__DISPLAY_NAME","score":12344300 };
    *     var removeFields = ["age"];
    *     user.putIdentity(
    *         identityData,
    *         "__PASSWORD__",
    *         {
    *             success: function(user) {
    *               // do something with the updated user.
    *             },
    *             failure: function(user, errorString) {
    *               // check error response.
    *             }
    *         },
    *         userFields,
    *         removeFields
    *     );
    *
    *     // example to use Promise
    *     var identityData = { "username": "__USER_NAME_" };
    *     var userFields = { "displayName":"__DISPLAY_NAME","score":12344300 };
    *     var removeFields = ["age"];
    *     user.putIdentity(
    *         identityData,
    *         "__PASSWORD__",
    *         null,
    *         userFields,
    *         removeFields
    *     ).then(
    *         function(user) {
    *             // do something with the updated user.
    *         },
    *         function(error) {
    *             // check error response.
    *         }
    *     );
    */
  def putIdentity(identityData: identityData, password: String): js.Promise[KiiUser] = js.native
  def putIdentity(
    identityData: identityData,
    password: String,
    callbacks: js.UndefOr[scala.Nothing],
    userFields: js.UndefOr[scala.Nothing],
    removeFields: js.Array[String]
  ): js.Promise[KiiUser] = js.native
  def putIdentity(
    identityData: identityData,
    password: String,
    callbacks: js.UndefOr[scala.Nothing],
    userFields: js.Any
  ): js.Promise[KiiUser] = js.native
  def putIdentity(
    identityData: identityData,
    password: String,
    callbacks: js.UndefOr[scala.Nothing],
    userFields: js.Any,
    removeFields: js.Array[String]
  ): js.Promise[KiiUser] = js.native
  def putIdentity(identityData: identityData, password: String, callbacks: `32`): js.Promise[KiiUser] = js.native
  def putIdentity(
    identityData: identityData,
    password: String,
    callbacks: `32`,
    userFields: js.UndefOr[scala.Nothing],
    removeFields: js.Array[String]
  ): js.Promise[KiiUser] = js.native
  def putIdentity(identityData: identityData, password: String, callbacks: `32`, userFields: js.Any): js.Promise[KiiUser] = js.native
  def putIdentity(
    identityData: identityData,
    password: String,
    callbacks: `32`,
    userFields: js.Any,
    removeFields: js.Array[String]
  ): js.Promise[KiiUser] = js.native
  
  /**
    * Updates the local user's data with the user data on the server
    *
    * <br><br>The user must exist on the server. Local data will be overwritten.
    *
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(theRefreshedUser). theRefreshedUser is KiiUser instance.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiUser instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var user = Kii.getCurrentUser(); // a KiiUser
    *     user.refresh({
    *         success: function(theRefreshedUser) {
    *             // do something with the refreshed user
    *         },
    *
    *         failure: function(theUser, anErrorString) {
    *             // do something with the error response
    *         }
    *     });
    *
    *     // example to use Promise
    *     var user = Kii.getCurrentUser(); // a KiiUser
    *     user.refresh().then(
    *         function(theRefreshedUser) {
    *             // do something with the refreshed user
    *         },
    *         function(error) {
    *             // do something with the error response
    *         }
    *     );
    */
  def refresh(): js.Promise[KiiUser] = js.native
  def refresh(callbacks: `32`): js.Promise[KiiUser] = js.native
  
  /**
    * Registers a user with the server
    *
    * <br><br>The user object must have an associated email/password combination.
    *
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(theAuthenticatedUser). theAuthenticatedUser is KiiUser instance.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is a KiiUser instance.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var user = KiiUser.userWithUsername("myusername", "mypassword");
    *     user.register({
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
    *     var user = KiiUser.userWithUsername("myusername", "mypassword");
    *     user.register().then(
    *         function(params) {
    *             // do something with the authenticated user
    *         },
    *         function(error) {
    *             // do something with the error response
    *         }
    *     );
    */
  def register(): js.Promise[KiiUser] = js.native
  def register(callbacks: `32`): js.Promise[KiiUser] = js.native
  
  /**
    * Resend the email verification code to the user
    *
    * <br><br>This method will re-send the email verification to the currently logged in user
    *
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(theUser). theUser is KiiUser instance which this method was called on.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiUser instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var user = Kii.currentUser();
    *     user.resendEmailVerification({
    *         success: function(theUser) {
    *             // do something
    *         },
    *
    *         failure: function(theUser, anErrorString) {
    *             // do something with the error response
    *         }
    *     });
    *
    *     // example to use Promise
    *     var user = Kii.currentUser();
    *     user.resendEmailVerification().then(
    *         function(theUser) {
    *             // do something
    *         },
    *         function(error) {
    *             // do something with the error response
    *         }
    *     );
    */
  def resendEmailVerification(): js.Promise[KiiUser] = js.native
  def resendEmailVerification(callbacks: `32`): js.Promise[KiiUser] = js.native
  
  /**
    * Resend the SMS verification code to the user
    *
    * <br><br>This method will re-send the SMS verification to the currently logged in user
    *
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(theUser). theUser is KiiUser instance which this method was called on.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiUser instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var user = Kii.currentUser();
    *     user.resendPhoneNumberVerification({
    *         success: function(theUser) {
    *             // do something
    *         },
    *
    *         failure: function(theUser, anErrorString) {
    *             // do something with the error response
    *         }
    *     });
    *
    *     // example to use Promise
    *     var user = Kii.currentUser();
    *     user.resendPhoneNumberVerification().then(
    *         function(theUser) {
    *             // do something
    *         },
    *         function(error) {
    *             // do something with the error response
    *         }
    *     );
    */
  def resendPhoneNumberVerification(): js.Promise[KiiUser] = js.native
  def resendPhoneNumberVerification(callbacks: `32`): js.Promise[KiiUser] = js.native
  
  /**
    * Saves the latest user values to the server
    *
    * <br><br>If the user does not yet exist, it will NOT be created. Otherwise, the fields that have changed will be updated accordingly.
    *
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(theSavedUser). theSavedUser is KiiUser instance.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiUser instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var user = Kii.getCurrentUser(); // a KiiUser
    *     user.save({
    *         success: function(theSavedUser) {
    *             // do something with the saved user
    *         },
    *
    *         failure: function(theUser, anErrorString) {
    *             // do something with the error response
    *         }
    *     });
    *
    *     // example to use Promise
    *     var user = Kii.getCurrentUser(); // a KiiUser
    *     user.save().then(
    *         function(theSavedUser) {
    *             // do something with the saved user
    *         },
    *         function(error) {
    *             // do something with the error response
    *         }
    *     );
    */
  def save(): js.Promise[KiiUser] = js.native
  def save(callbacks: `32`): js.Promise[KiiUser] = js.native
  
  /**
    * Sets a key/value pair to a KiiUser
    *
    * <br><br>If the key already exists, its value will be written over. If key is empty or starting with '_', it will do nothing. Accepted types are any JSON-encodable objects.
    *
    * @param key The key to set. The key must not be a system key (created, metadata, modified, type, uuid) or begin with an underscore (_)
    * @param value The value to be set. Object must be of a JSON-encodable type (Ex: dictionary, array, string, number, etc)
    *
    * @example
    *     var user = . . .; // a KiiUser
    *     user.set("score", 4298);
    */
  def set(key: String, value: js.Any): Unit = js.native
  
  /**
    * Set the country code associated with this user
    *
    * @param value The country code to set. Must be 2 alphabetic characters. Ex: US, JP, CN
    *
    * @throws If the country code is not a valid format
    */
  def setCountry(value: String): Unit = js.native
  
  /**
    * Set the display name associated with this user. Cannot be used for logging a user in; is non-unique
    *
    * @param value Must be between 1-50 alphanumeric characters.
    *
    * @throws If the displayName is not a valid format
    */
  def setDisplayName(value: String): Unit = js.native
  
  /**
    * Set the locale associated with this user
    * The locale argument must be BCP 47 language tag.
    * Examples:
    * "en": English
    * "de-AT": German as used in Austria.
    * "zh-Hans-CN": Chinese written in simplified characters as used in China.
    *
    * @param value The locale to set.
    */
  def setLocale(value: String): Unit = js.native
  
  /**
    * Instantiate topic belongs to this user.
    *
    * @param topicName name of the topic. Must be a not empty string.
    *
    * @return topic instance.
    */
  def topicWithName(topicName: String): KiiTopic = js.native
  
  /**
    * Update user attributes.
    *
    *
    * <br><br>If you want to update identity data of pseudo user, you must use KiiUser.putIdentity instead.
    *
    * @param callbacks An object with callback methods defined.
    *   This argument is mandatory and can't be ommited.
    * @param userFields Custom Fields to add to the user.
    * @param removeFields An array of field names to remove from the user custom fields. Default fields are not removed from server.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(user). user is KiiUser instance which this method was called on.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is a KiiUser instance.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var identityData = { "username": "__USER_NAME_" };
    *     var userFields = { "displayName":"__DISPLAY_NAME","score":12344300 };
    *     var removeFields = ["age"];
    *     user.update(
    *         identityData,
    *         {
    *             success: function(user) {
    *               // do something with the updated user.
    *             },
    *             failure: function(user, errorString) {
    *               // check error response.
    *             }
    *         },
    *         userFields,
    *         removeFields
    *     );
    *
    *     // example to use Promise
    *     var identityData = { "username": "__USER_NAME_" };
    *     var userFields = { "displayName":"__DISPLAY_NAME","score":12344300 };
    *     var removeFields = ["age"];
    *     user.update(
    *         identityData,
    *         null,
    *         userFields,
    *         removeFields
    *     ).then(
    *         function(user) {
    *             // do something with the updated user.
    *         },
    *         function(error) {
    *             // check error response.
    *         }
    *     );
    */
  def update(identityData: identityData): js.Promise[KiiUser] = js.native
  def update(
    identityData: identityData,
    callbacks: js.UndefOr[scala.Nothing],
    userFields: js.UndefOr[scala.Nothing],
    removeFields: js.Array[String]
  ): js.Promise[KiiUser] = js.native
  def update(identityData: identityData, callbacks: js.UndefOr[scala.Nothing], userFields: js.Any): js.Promise[KiiUser] = js.native
  def update(
    identityData: identityData,
    callbacks: js.UndefOr[scala.Nothing],
    userFields: js.Any,
    removeFields: js.Array[String]
  ): js.Promise[KiiUser] = js.native
  def update(identityData: identityData, callbacks: `32`): js.Promise[KiiUser] = js.native
  def update(
    identityData: identityData,
    callbacks: `32`,
    userFields: js.UndefOr[scala.Nothing],
    removeFields: js.Array[String]
  ): js.Promise[KiiUser] = js.native
  def update(identityData: identityData, callbacks: `32`, userFields: js.Any): js.Promise[KiiUser] = js.native
  def update(identityData: identityData, callbacks: `32`, userFields: js.Any, removeFields: js.Array[String]): js.Promise[KiiUser] = js.native
  
  /**
    * Update a user's password on the server
    *
    * <br><br>Update a user's password with the server. The fromPassword must be equal to the current password associated with the account in order to succeed.
    *
    * @param fromPassword The user's current password
    * @param toPassword The user's desired password. Must be at least 4 characters, made up of alphanumeric and/or: @,#,$,%,^,&
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(theUser). theUser is KiiUser instance which this method was called on.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiUser instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var user = Kii.currentUser();
    *     user.updatePassword("oldpassword", "newpassword", {
    *         success: function(theUser) {
    *             // do something
    *         },
    *
    *         failure: function(theUser, anErrorString) {
    *             // do something with the error response
    *         }
    *     });
    *
    *     // example to use Promise
    *     var user = Kii.currentUser();
    *     user.updatePassword("oldpassword", "newpassword").then(
    *         function(theUser) {
    *             // do something
    *         },
    *         function(error) {
    *             // do something with the error response
    *         }
    *     );
    */
  def updatePassword(fromPassword: String, toPassword: String): js.Promise[KiiUser] = js.native
  def updatePassword(fromPassword: String, toPassword: String, callbacks: `32`): js.Promise[KiiUser] = js.native
  
  /**
    * Verify the current user's phone number
    * <br><br>This method is used to verify the phone number of user currently
    * logged in.<br>
    * Verification code is sent from Kii Cloud when new user is registered with
    * phone number or user requested to change their phone number in the
    * application which requires phone verification.<br>
    * (You can enable/disable phone verification through the console in
    * developer.kii.com)<br>
    * After the verification succeeded, new phone number becomes users phone
    * number and user is able to login with the phone number.<br>
    * To get the new phone number, please call {@link #refresh()} and call
    * {@link #getPhoneNumber()}<br>
    * Before completion of {@link #refresh()}, {@link #getPhoneNumber()} returns
    * cached phone number. It could be old phone number or undefined.
    *
    * @param verificationCode The code which verifies the currently logged in user
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(theUser). theUser is KiiUser instance which this method was called on.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiUser instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var user = Kii.currentUser();
    *     user.verifyPhoneNumber("012345", {
    *         success: function(theUser) {
    *             // do something
    *         },
    *
    *         failure: function(theUser, anErrorString) {
    *             // do something with the error response
    *         }
    *     });
    *
    *     // example to use Promise
    *     var user = Kii.currentUser();
    *     user.verifyPhoneNumber("012345").then(
    *         function(theUser) {
    *             // do something
    *         },
    *         function(error) {
    *             // do something with the error response
    *         }
    *     );
    */
  def verifyPhoneNumber(verificationCode: String): js.Promise[KiiUser] = js.native
  def verifyPhoneNumber(verificationCode: String, callbacks: `32`): js.Promise[KiiUser] = js.native
}
