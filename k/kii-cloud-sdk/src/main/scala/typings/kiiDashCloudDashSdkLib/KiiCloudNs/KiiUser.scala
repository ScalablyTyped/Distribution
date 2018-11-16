package typings
package kiiDashCloudDashSdkLib.KiiCloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents a KiiUser object
     */
@JSGlobal("KiiCloud.KiiUser")
@js.native
class KiiUser () extends js.Object {
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
  def bucketWithName(bucketName: java.lang.String): KiiBucket = js.native
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
  def changeEmail(newEmail: java.lang.String): stdLib.Promise[KiiUser] = js.native
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
  def changeEmail(newEmail: java.lang.String, callbacks: kiiDashCloudDashSdkLib.Anon_FailureTheUser): stdLib.Promise[KiiUser] = js.native
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
  def changePhone(newPhoneNumber: java.lang.String): stdLib.Promise[KiiUser] = js.native
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
  def changePhone(newPhoneNumber: java.lang.String, callbacks: kiiDashCloudDashSdkLib.Anon_FailureTheUser): stdLib.Promise[KiiUser] = js.native
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
  def delete(): stdLib.Promise[KiiUser] = js.native
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
  def delete(callbacks: kiiDashCloudDashSdkLib.Anon_FailureTheUser): stdLib.Promise[KiiUser] = js.native
  /**
           * Return true if the user is disabled, false when enabled and undefined
           * when user is not refreshed.
           * Call {@link KiiUser#refresh()} prior calling this method to get
           * correct status.
           */
  def disabled(): scala.Unit = js.native
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
  def encryptedBucketWithName(bucketName: java.lang.String): KiiBucket = js.native
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
  def get[T](key: java.lang.String): T = js.native
  /**
           * Get the access token for the user - only available if the user is currently logged in
           *
           */
  def getAccessToken(): java.lang.String = js.native
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
  def getCountry(): java.lang.String = js.native
  /**
           * Get the server's creation date of this user
           *
           */
  def getCreated(): java.lang.String = js.native
  /**
           * Get the display name associated with this user
           *
           */
  def getDisplayName(): java.lang.String = js.native
  /**
           * Get the email address associated with this user
           *
           */
  def getEmailAddress(): java.lang.String = js.native
  /**
           * Get the status of the user's email verification. This field is assigned by the server
           *
           * @return true if the user's email address has been verified by the user, false otherwise.
           *     Could be undefined if haven't obtained value from server or not allowed to see the value.
           *     Should be used by current login user to check the email verification status.
           */
  def getEmailVerified(): scala.Boolean = js.native
  /**
           * Get the ID of the current KiiUser instance.
           *
           * @return Id of the user or null if the user has not saved to cloud.
           */
  def getID(): java.lang.String = js.native
  /**
           * Get the social accounts that is linked to this user.
           * Refresh the user by {@link KiiUser#refresh()} prior call the method.
           * Otherwise, it returns empty object.
           *
           * @return Social network name as key and account info as value.
           */
  def getLinkedSocialAccounts(): ScalablyTyped.runtime.StringDictionary[KiiSocialAccountInfo] = js.native
  /**
           * Get the locale associated with this user
           *
           */
  def getLocale(): java.lang.String = js.native
  /**
           *
           *
           * @deprecated Get the modified date of the given user, assigned by the server
           *
           */
  def getModified(): java.lang.String = js.native
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
  def getPendingEmailAddress(): java.lang.String = js.native
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
  def getPendingPhoneNumber(): java.lang.String = js.native
  /**
           * Get the phone number associated with this user
           *
           */
  def getPhoneNumber(): java.lang.String = js.native
  /**
           * Get the status of the user's phone number verification. This field is assigned by the server
           *
           * @return true if the user's email address has been verified by the user, false otherwise
           *     Could be undefined if haven't obtained value from server or not allowed to see the value.
           *     Should be used by current login user to check the phone verification status.
           */
  def getPhoneVerified(): scala.Boolean = js.native
  /**
           *
           *
           * @deprecated Use {@link KiiUser.getId} instead.
           *   Get the UUID of the given user, assigned by the server
           *
           */
  def getUUID(): java.lang.String = js.native
  /**
           * Get the username of the given user
           *
           */
  def getUsername(): java.lang.String = js.native
  /**
           * Get whether or not the user is pseudo user.
           * If this method is not called for current login user, calling
           * {@link KiiUser#refresh()} method is necessary to get a correct value.
           *
           * @return whether this user is pseudo user or not.
           */
  def isPseudoUser(): scala.Boolean = js.native
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
  def listTopics(): stdLib.Promise[js.Tuple2[js.Array[KiiTopic], java.lang.String]] = js.native
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
  def listTopics(callbacks: kiiDashCloudDashSdkLib.Anon_FailureAnErrorString): stdLib.Promise[js.Tuple2[js.Array[KiiTopic], java.lang.String]] = js.native
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
  def listTopics(callbacks: kiiDashCloudDashSdkLib.Anon_FailureAnErrorString, paginationKey: java.lang.String): stdLib.Promise[js.Tuple2[js.Array[KiiTopic], java.lang.String]] = js.native
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
  def memberOfGroups(): stdLib.Promise[js.Tuple2[KiiUser, js.Array[KiiGroup]]] = js.native
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
  def memberOfGroups(callbacks: kiiDashCloudDashSdkLib.Anon_FailureTheUserAnErrorString): stdLib.Promise[js.Tuple2[KiiUser, js.Array[KiiGroup]]] = js.native
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
  def objectURI(): java.lang.String = js.native
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
  def ownerOfGroups(): stdLib.Promise[js.Tuple2[KiiUser, js.Array[KiiGroup]]] = js.native
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
  def ownerOfGroups(callbacks: kiiDashCloudDashSdkLib.Anon_FailureTheUserAnErrorString): stdLib.Promise[js.Tuple2[KiiUser, js.Array[KiiGroup]]] = js.native
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
  def putIdentity(identityData: identityData, password: java.lang.String): stdLib.Promise[KiiUser] = js.native
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
  def putIdentity(
    identityData: identityData,
    password: java.lang.String,
    callbacks: kiiDashCloudDashSdkLib.Anon_FailureUser
  ): stdLib.Promise[KiiUser] = js.native
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
  def putIdentity(
    identityData: identityData,
    password: java.lang.String,
    callbacks: kiiDashCloudDashSdkLib.Anon_FailureUser,
    userFields: js.Any
  ): stdLib.Promise[KiiUser] = js.native
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
  def putIdentity(
    identityData: identityData,
    password: java.lang.String,
    callbacks: kiiDashCloudDashSdkLib.Anon_FailureUser,
    userFields: js.Any,
    removeFields: js.Array[java.lang.String]
  ): stdLib.Promise[KiiUser] = js.native
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
  def refresh(): stdLib.Promise[KiiUser] = js.native
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
  def refresh(callbacks: kiiDashCloudDashSdkLib.Anon_FailureTheUser): stdLib.Promise[KiiUser] = js.native
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
  def register(): stdLib.Promise[KiiUser] = js.native
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
  def register(callbacks: kiiDashCloudDashSdkLib.Anon_FailureTheUser): stdLib.Promise[KiiUser] = js.native
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
  def resendEmailVerification(): stdLib.Promise[KiiUser] = js.native
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
  def resendEmailVerification(callbacks: kiiDashCloudDashSdkLib.Anon_FailureTheUser): stdLib.Promise[KiiUser] = js.native
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
  def resendPhoneNumberVerification(): stdLib.Promise[KiiUser] = js.native
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
  def resendPhoneNumberVerification(callbacks: kiiDashCloudDashSdkLib.Anon_FailureTheUser): stdLib.Promise[KiiUser] = js.native
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
  def save(): stdLib.Promise[KiiUser] = js.native
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
  def save(callbacks: kiiDashCloudDashSdkLib.Anon_FailureTheUser): stdLib.Promise[KiiUser] = js.native
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
  def set(key: java.lang.String, value: js.Any): scala.Unit = js.native
  /**
           * Set the country code associated with this user
           *
           * @param value The country code to set. Must be 2 alphabetic characters. Ex: US, JP, CN
           *
           * @throws If the country code is not a valid format
           */
  def setCountry(value: java.lang.String): scala.Unit = js.native
  /**
           * Set the display name associated with this user. Cannot be used for logging a user in; is non-unique
           *
           * @param value Must be between 1-50 alphanumeric characters.
           *
           * @throws If the displayName is not a valid format
           */
  def setDisplayName(value: java.lang.String): scala.Unit = js.native
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
  def setLocale(value: java.lang.String): scala.Unit = js.native
  /**
           * Instantiate topic belongs to this user.
           *
           * @param topicName name of the topic. Must be a not empty string.
           *
           * @return topic instance.
           */
  def topicWithName(topicName: java.lang.String): KiiTopic = js.native
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
  def update(identityData: identityData): stdLib.Promise[KiiUser] = js.native
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
  def update(identityData: identityData, callbacks: kiiDashCloudDashSdkLib.Anon_FailureUser): stdLib.Promise[KiiUser] = js.native
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
  def update(identityData: identityData, callbacks: kiiDashCloudDashSdkLib.Anon_FailureUser, userFields: js.Any): stdLib.Promise[KiiUser] = js.native
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
  def update(
    identityData: identityData,
    callbacks: kiiDashCloudDashSdkLib.Anon_FailureUser,
    userFields: js.Any,
    removeFields: js.Array[java.lang.String]
  ): stdLib.Promise[KiiUser] = js.native
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
  def updatePassword(fromPassword: java.lang.String, toPassword: java.lang.String): stdLib.Promise[KiiUser] = js.native
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
  def updatePassword(
    fromPassword: java.lang.String,
    toPassword: java.lang.String,
    callbacks: kiiDashCloudDashSdkLib.Anon_FailureTheUser
  ): stdLib.Promise[KiiUser] = js.native
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
  def verifyPhoneNumber(verificationCode: java.lang.String): stdLib.Promise[KiiUser] = js.native
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
  def verifyPhoneNumber(verificationCode: java.lang.String, callbacks: kiiDashCloudDashSdkLib.Anon_FailureTheUser): stdLib.Promise[KiiUser] = js.native
}

/**
     * Represents a KiiUser object
     */
@JSGlobal("KiiCloud.KiiUser")
@js.native
object KiiUser extends js.Object {
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
  def authenticate(userIdentifier: java.lang.String, password: java.lang.String): stdLib.Promise[kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser] = js.native
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
  def authenticate(
    userIdentifier: java.lang.String,
    password: java.lang.String,
    callbacks: kiiDashCloudDashSdkLib.Anon_FailureTheUser
  ): stdLib.Promise[kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser] = js.native
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
  def authenticateWithToken(accessToken: java.lang.String): stdLib.Promise[kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser] = js.native
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
  def authenticateWithToken(accessToken: java.lang.String, callbacks: kiiDashCloudDashSdkLib.Anon_FailureTheUser): stdLib.Promise[kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser] = js.native
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
  def authenticateWithToken(
    accessToken: java.lang.String,
    callbacks: kiiDashCloudDashSdkLib.Anon_FailureTheUser,
    expiresAt: stdLib.Date
  ): stdLib.Promise[kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser] = js.native
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
  def completeResetPassword(userIdentifier: java.lang.String, pinCode: java.lang.String): stdLib.Promise[scala.Unit] = js.native
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
  def completeResetPassword(userIdentifier: java.lang.String, pinCode: java.lang.String, newPassword: java.lang.String): stdLib.Promise[scala.Unit] = js.native
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
  def completeResetPassword(
    userIdentifier: java.lang.String,
    pinCode: java.lang.String,
    newPassword: java.lang.String,
    callbacks: kiiDashCloudDashSdkLib.Anon_FailureErrorSuccessAny
  ): stdLib.Promise[scala.Unit] = js.native
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
  def findUserByEmail(email: java.lang.String): stdLib.Promise[kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser] = js.native
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
  def findUserByEmail(email: java.lang.String, callbacks: kiiDashCloudDashSdkLib.Anon_FailureAnErrorStringSuccess): stdLib.Promise[kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser] = js.native
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
  def findUserByPhone(phone: java.lang.String): stdLib.Promise[kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser] = js.native
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
  def findUserByPhone(phone: java.lang.String, callbacks: kiiDashCloudDashSdkLib.Anon_FailureAnErrorStringSuccess): stdLib.Promise[kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser] = js.native
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
  def findUserByUsername(username: java.lang.String): stdLib.Promise[kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser] = js.native
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
  def findUserByUsername(username: java.lang.String, callbacks: kiiDashCloudDashSdkLib.Anon_FailureAnErrorStringSuccess): stdLib.Promise[kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser] = js.native
  /**
           * The currently authenticated user
           *
           * @example
           *         var user = KiiUser.getCurrentUser();
           */
  def getCurrentUser(): kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser = js.native
  /**
           * Logs the currently logged-in user out of the KiiSDK
           *
           * @example
           *         KiiUser.logOut();
           */
  def logOut(): scala.Unit = js.native
  /**
           * Checks to see if there is a user authenticated with the SDK
           *
           * @example
           *         if(KiiUser.loggedIn()) {
           *             // do something
           *         }
           */
  def loggedIn(): scala.Boolean = js.native
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
  def registerAsPseudoUser(): stdLib.Promise[kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser] = js.native
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
  def registerAsPseudoUser(callbacks: kiiDashCloudDashSdkLib.Anon_FailureTheUser): stdLib.Promise[kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser] = js.native
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
  def registerAsPseudoUser(callbacks: kiiDashCloudDashSdkLib.Anon_FailureTheUser, userFields: js.Any): stdLib.Promise[kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser] = js.native
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
  def resetPassword(userIdentifier: java.lang.String): stdLib.Promise[scala.Unit] = js.native
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
  def resetPassword(
    userIdentifier: java.lang.String,
    callbacks: kiiDashCloudDashSdkLib.Anon_FailureAnErrorStringSuccessString
  ): stdLib.Promise[scala.Unit] = js.native
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
  def resetPasswordWithNotificationMethod(userIdentifier: java.lang.String, notificationMethod: java.lang.String): stdLib.Promise[scala.Unit] = js.native
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
  def resetPasswordWithNotificationMethod(
    userIdentifier: java.lang.String,
    notificationMethod: java.lang.String,
    callbacks: kiiDashCloudDashSdkLib.Anon_FailureErrString
  ): stdLib.Promise[scala.Unit] = js.native
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
  def userWithCredentials(
    emailAddress: java.lang.String,
    phoneNumber: java.lang.String,
    username: java.lang.String,
    password: java.lang.String
  ): kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser = js.native
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
  def userWithEmailAddress(emailAddress: java.lang.String, password: java.lang.String): kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser = js.native
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
  def userWithEmailAddressAndPhoneNumber(emailAddress: java.lang.String, phoneNumber: java.lang.String, password: java.lang.String): kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser = js.native
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
  def userWithEmailAddressAndUsername(emailAddress: java.lang.String, username: java.lang.String, password: java.lang.String): kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser = js.native
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
  def userWithID(userID: java.lang.String): kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser = js.native
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
  def userWithPhoneNumber(phoneNumber: java.lang.String, password: java.lang.String): kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser = js.native
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
  def userWithPhoneNumberAndUsername(phoneNumber: java.lang.String, username: java.lang.String, password: java.lang.String): kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser = js.native
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
  def userWithURI(uri: java.lang.String): kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser = js.native
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
  def userWithUsername(username: java.lang.String, password: java.lang.String): kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser = js.native
}

