package typings.kiiCloudSdk.KiiCloud

import typings.kiiCloudSdk.anon.FailureSuccess
import typings.kiiCloudSdk.anon.`0`
import typings.kiiCloudSdk.anon.`1`
import typings.kiiCloudSdk.anon.`2`
import typings.kiiCloudSdk.anon.`3`
import typings.kiiCloudSdk.anon.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents the app admin context
  * <br><br>
  * <B>This class must not referred from code accessible from browser.
  * This class is intended to be used by server side code like Node.js.
  * If you use this class in code accessible by browser, your application client id and client secret could be stolen.
  * Attacker will be act as application admin and all the data in your application will be suffered.
  * </B>
  * Application administrator context. Entities obtained from this class will be manipulated by application admin.
  */
@js.native
trait KiiAppAdminContext extends js.Object {
  /**
    * Creates a reference to a bucket operated by app admin.
    *     <br><br>The bucket will be created/accessed within this app's scope
    *
    * @param bucketName The name of the bucket the app should create/access
    *
    * @return A working KiiBucket object
    *
    * @example
    *         Kii.authenticateAsAppAdmin("client-id", "client-secret", {
    *             success: function(adminContext) {
    *                 var bucket = adminContext.bucketWithName("myBucket");
    *                 // KiiBucket operation by app admin is available now.
    *             },
    *             failure: function(errorString, errorCode) {
    *                 // auth failed.
    *             }
    *         });
    */
  def bucketWithName(bucketName: String): KiiBucket = js.native
  /**
    * Creates a reference to a encrypted bucket operated by app admin.
    *     <br><br>The bucket will be created/accessed within this app's scope
    *
    * @param bucketName The name of the bucket the app should create/access
    *
    * @return A working KiiBucket object
    *
    * @example
    *         Kii.authenticateAsAppAdmin("client-id", "client-secret", {
    *             success: function(adminContext) {
    *                 var bucket = adminContext.encryptedBucketWithName("myBucket");
    *                 // KiiBucket operation by app admin is available now.
    *             },
    *             failure: function(errorString, errorCode) {
    *                 // auth failed.
    *             }
    *         });
    */
  def encryptedBucketWithName(bucketName: String): KiiBucket = js.native
  /**
    * Find registered KiiUser with the email.<br>
    * If there are no user registers with the specified email or if there are but not verified email yet,
    * callbacks.failure or reject callback of promise will be called.<br>
    * If the email is null or empty, callbacks.failure or reject callback of promise will be callded.
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
    *   This argument is mandatory and can't be omitted.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(params). params is Array instance.
    *       <ul>
    *         <li>params[0] is a KiiAppAdminContext instance which this method was called on.</li>
    *         <li>params[1] is a found KiiUser instance.</li>
    *       </ul>
    *     </li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is a KiiAppAdminContext instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     Kii.authenticateAsAppAdmin("client-id", "client-secret", {
    *         success: function(adminContext) {
    *             adminContext.findUserByEmail("user_to_find@example.com", {
    *                 success: function(adminContext, theMatchedUser) {
    *                     // Do something with the found user
    *                 },
    *                 failure: function(adminContext, anErrorString) {
    *                     // Do something with the error response
    *                 }
    *             });
    *         },
    *         failure: function(errorString, errorCode) {
    *             // Auth failed.
    *         }
    *     });
    *
    *     // example to use Promise
    *     Kii.authenticateAsAppAdmin("client-id", "client-secret").then(
    *         function(adminContext) {
    *             adminContext.findUserByEmail("user_to_find@example.com").then(
    *                 function(params) { // fullfill callback function
    *                     var adminContext = params[0];
    *                     var theMatchedUser = params[1];
    *                     // Do something with the found user
    *                 },
    *                 function(error) { // reject callback function
    *                     var adminContext = error.target;
    *                     var anErrorString = error.message;
    *                     // Do something with the error response
    *                 }
    *             );
    *         },
    *         function(error) {
    *           // Auth failed.
    *         }
    *     );
    */
  def findUserByEmail(email: String): js.Promise[js.Tuple2[KiiAppAdminContext, KiiUser]] = js.native
  def findUserByEmail(email: String, callbacks: `0`): js.Promise[js.Tuple2[KiiAppAdminContext, KiiUser]] = js.native
  /**
    * Find registered KiiUser with the phone.<br>
    * If there are no user registers with the specified phone or if there are but not verified phone yet,
    * callbacks.failure or reject callback of promise will be called.<br>
    * If the phone is null or empty, callbacks.failure or reject callback of promise will be called.
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
    *   This argument is mandatory and can't be omitted.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(params). params is Array instance.
    *       <ul>
    *         <li>params[0] is a KiiAppAdminContext instance which this method was called on.</li>
    *         <li>params[1] is a found KiiUser instance.</li>
    *       </ul>
    *     </li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is a KiiAppAdminContext instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     Kii.authenticateAsAppAdmin("client-id", "client-secret", {
    *         success: function(adminContext) {
    *             adminContext.findUserByPhone("phone_number_to_find", {
    *                 success: function(adminContext, theMatchedUser) {
    *                     // Do something with the found user
    *                 },
    *                 failure: function(adminContext, anErrorString) {
    *                     // Do something with the error response
    *                 }
    *             });
    *         },
    *         failure: function(errorString, errorCode) {
    *             // Auth failed.
    *         }
    *     });
    *
    *     // example to use Promise
    *     Kii.authenticateAsAppAdmin("client-id", "client-secret").then(
    *         function(adminContext) {
    *             adminContext.findUserByPhone("phone_number_to_find").then(
    *                 function(params) { // fullfill callback function
    *                     var adminContext = params[0];
    *                     var theMatchedUser = params[1];
    *                     // Do something with the found user
    *                 },
    *                 function(error) { // reject callback function
    *                     var adminContext = error.target;
    *                     var anErrorString = error.message;
    *                     // Do something with the error response
    *                 }
    *             );
    *         },
    *         function(error) {
    *           // Auth failed.
    *         }
    *     );
    */
  def findUserByPhone(phone: String): js.Promise[js.Tuple2[KiiAppAdminContext, KiiUser]] = js.native
  def findUserByPhone(phone: String, callbacks: `0`): js.Promise[js.Tuple2[KiiAppAdminContext, KiiUser]] = js.native
  /**
    * Find registered KiiUser with the user name.<br>
    * If there are no user registers with the specified user name, callbacks.failure or reject callback of promise will be called.<br>
    * If the user name is null or empty, callbacks.failure or reject callback of promise will be called.
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
    *   This argument is mandatory and can't be omitted.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(params). params is Array instance.
    *       <ul>
    *         <li>params[0] is a KiiAppAdminContext instance which this method was called on.</li>
    *         <li>params[1] is a found KiiUser instance.</li>
    *       </ul>
    *     </li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is a KiiAppAdminContext instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     Kii.authenticateAsAppAdmin("client-id", "client-secret", {
    *         success: function(adminContext) {
    *             adminContext.findUserByUsername("user_name_to_find", {
    *                 success: function(adminContext, theMatchedUser) {
    *                     // Do something with the found user
    *                 },
    *                 failure: function(adminContext, anErrorString) {
    *                     // Do something with the error response
    *                 }
    *             });
    *         },
    *         failure: function(errorString, errorCode) {
    *             // Auth failed.
    *         }
    *     });
    *     // example to use Promise
    *     Kii.authenticateAsAppAdmin("client-id", "client-secret").then(
    *         function(adminContext) {
    *             adminContext.findUserByUsername("user_name_to_find").then(
    *                 function(params) { // fullfill callback function
    *                     var adminContext = params[0];
    *                     var theMatchedUser = params[1];
    *                     // Do something with the found user
    *                 },
    *                 function(error) { // reject callback function
    *                     var adminContext = error.target;
    *                     var anErrorString = error.message;
    *                     // Do something with the error response
    *                 }
    *             );
    *         },
    *         function(error) {
    *           // Auth failed.
    *         }
    *     );
    */
  def findUserByUsername(username: String): js.Promise[js.Tuple2[KiiAppAdminContext, KiiUser]] = js.native
  def findUserByUsername(username: String, callbacks: `0`): js.Promise[js.Tuple2[KiiAppAdminContext, KiiUser]] = js.native
  /**
    * Creates a reference to a group operated by app admin using group's ID.
    *     <br><br>
    *     <b>Note:</b>
    *     Returned instance from this API can operate existing KiiGroup.<br>
    *     If you want to create a new KiiGroup, please use {@link KiiAppAdminContext#groupWithName}.
    *
    * @param group ID.
    *
    * @return A working KiiGroup object
    *
    * @throws Thrown if passed groupID is null or empty.
    *
    * @example
    *         Kii.authenticateAsAppAdmin("client-id", "client-secret", {
    *             success: function(adminContext) {
    *                 var groupID = "0123456789abcdefghijklmno";
    *                 var group = adminContext.groupWithID(groupID);
    *                 // KiiGroup operation by app admin is available now.
    *             },
    *             failure: function(errorString, errorCode) {
    *                 // auth failed.
    *             }
    *         });
    */
  def groupWithID(group: String): KiiGroup = js.native
  /**
    * Creates a reference to a group operated by app admin.
    *     <br><br>
    *     <b>Note:</b>
    *     Returned instance from this API can not operate existing KiiGroup.<br>
    *     If you want to operate existing KiiGroup, please use {@link KiiAppAdminContext#groupWithURI} or {@link KiiAppAdminContext#groupWithID}.
    *
    * @param group name.
    *
    * @return A working KiiGroup object
    *
    * @example
    *         Kii.authenticateAsAppAdmin("client-id", "client-secret", {
    *             success: function(adminContext) {
    *                 var group = adminContext.groupWithName("newGroup");
    *                 // KiiGroup operation by app admin is available now.
    *             },
    *             failure: function(errorString, errorCode) {
    *                 // auth failed.
    *             }
    *         });
    */
  def groupWithName(group: String): KiiGroup = js.native
  /**
    * Creates a reference to a group operated by app admin using group's URI.
    *     <br><br>
    *     <b>Note:</b>
    *     Returned instance from this API can operate existing KiiGroup.<br>
    *     If you want to create a new KiiGroup, please use {@link KiiAppAdminContext#groupWithName}.
    *
    * @param group URI.
    *
    * @return A working KiiGroup object
    *
    * @throws Thrown if the URI is null, empty or does not have correct format.
    *
    * @example
    *         Kii.authenticateAsAppAdmin("client-id", "client-secret", {
    *             success: function(adminContext) {
    *                 var groupUri = ...; // KiiGroup's URI
    *                 var group = adminContext.groupWithURI(groupUri);
    *                 // KiiGroup operation by app admin is available now.
    *             },
    *             failure: function(errorString, errorCode) {
    *                 // auth failed.
    *             }
    *         });
    */
  def groupWithURI(group: String): KiiGroup = js.native
  /**
    * Gets a list of topics in app scope
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
    *           <li>error.target is a KiiAppAdminContext instance which this method was called on.</li>
    *           <li>error.message</li>
    *         </ul>
    *       </li>
    *     </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     // Assume you already have adminContext instance.
    *     adminContext.listTopics({
    *         success: function(topicList, nextPaginationKey) {
    *             // do something with the result
    *             for(var i=0; i&lt;topicList.length; i++){
    *                 var topic = topicList[i];
    *             }
    *             if (nextPaginationKey != null) {
    *                 Kii.listTopics({
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
    *     // example to use Promise
    *     // Assume you already have adminContext instance.
    *     adminContext.listTopics().then(
    *         function(params) {
    *             var topicList = params[0];
    *             var nextPaginationKey = params[1];
    *             // do something with the result
    *             for(var i=0; i&lt;topicList.length; i++){
    *                 var topic = topicList[i];
    *             }
    *             if (nextPaginationKey != null) {
    *                 adminContext.listTopics(null, nextPaginationKey).then(
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
    * Load thing with thing ID by app admin.
    * Method interface is same as {@link KiiThing#loadWithThingID()}.
    * Please refer to KiiThing document for details.
    *
    * @param thingID registered thing id.
    * @param callbacks object holds callback functions.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(thing). thing is KiiThing instance with adminToken.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     // Assume you already have adminContext instance.
    *     adminContext.loadThingWithThingID("thing-xxxx-yyyy",{
    *         success: function(thing) {
    *             // Load succeeded.
    *             // Operation using thing instance in the parameter
    *             // is authored by app admin.
    *         },
    *         failure: function(error) {
    *             // Handle error.
    *         }
    *     });
    *
    *     // example to use Promise
    *     // Assume you already have adminContext instance.
    *     adminContext.loadThingWithThingID("thing-xxxx-yyyy").then(
    *         function(thing) {
    *             // Load succeeded.
    *             // Operation using thing instance in the parameter
    *             // is authored by app admin.
    *         },
    *         function(error) {
    *             // Handle error.
    *         }
    *     );
    */
  def loadThingWithThingID(thingID: String): js.Promise[KiiThing] = js.native
  def loadThingWithThingID(thingID: String, callbacks: `1`): js.Promise[KiiThing] = js.native
  /**
    * Load thing with vendor thing ID by app admin.
    * Method interface is same as {@link KiiThing#loadWithVendorThingID()}.
    * Please refer to KiiThing document for details.
    *
    * @param vendorThingID registered vendor thing id.
    * @param callbacks object holds callback functions.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(thing). thing is KiiThing instance with adminToken.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     // Assume you already have adminContext instance.
    *     adminContext.loadThingWithVendorThingID("thing-xxxx-yyyy",{
    *         success: function(thing) {
    *             // Load succeeded.
    *             // Operation using thing instance in the parameter
    *             // is authored by app admin.
    *         },
    *         failure: function(error) {
    *             // Handle error.
    *         }
    *     });
    *
    *     // example to use Promise
    *     // Assume you already have adminContext instance.
    *     adminContext.loadThingWithVendorThingID("thing-xxxx-yyyy").then(
    *         function(thing) {
    *             // Load succeeded.
    *             // Operation using thing instance in the parameter
    *             // is authored by app admin.
    *         },
    *         function(error) {
    *             // Handle error.
    *         }
    *     );
    */
  def loadThingWithVendorThingID(vendorThingID: String): js.Promise[KiiThing] = js.native
  def loadThingWithVendorThingID(vendorThingID: String, callbacks: `1`): js.Promise[KiiThing] = js.native
  /**
    * Creates a reference to an object operated by app admin using object`s URI.
    *
    * @param object URI.
    *
    * @return A working KiiObject instance
    *
    * @throws If the URI is null, empty or does not have correct format.
    */
  def objectWithURI(`object`: String): KiiObject = js.native
  /**
    * Register new group own by specified user on Kii Cloud with specified ID.
    * This method can be used only by app admin.
    *
    * <br><br>If the group that has specified id already exists, registration will be failed.
    *
    * @param groupID ID of the KiiGroup
    * @param groupName Name of the KiiGroup
    * @param user id of owner
    * @param members An array of KiiUser objects to add to the group
    *
    * @return return promise object.
    *       <ul>
    *         <li>fulfill callback function: function(theSavedGroup). theSavedGroup is KiiGroup instance.</li>
    *         <li>reject callback function: function(error). error is an Error instance.
    *           <ul>
    *             <li>error.target is the KiiGroup instance which this method was called on.</li>
    *             <li>error.message</li>
    *             <li>error.addMembersArray is array of KiiUser to be added as memebers of this group.</li>
    *             <li>error.removeMembersArray is array of KiiUser to be removed from the memebers list of this group.</li>
    *           </ul>
    *         </li>
    *       </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     Kii.authenticateAsAppAdmin("client-id", "client-secret", {
    *         success: function(adminContext) {
    *             var members = [];
    *             members.push(KiiUser.userWithID("Member User Id"));
    *             adminContext.registerGroupWithOwnerAndID("Group ID", "Group Name", "Owner User ID", members, {
    *                 success: function(theSavedGroup) {
    *                     // do something with the saved group
    *                 },
    *                 failure: function(theGroup, anErrorString, addMembersArray, removeMembersArray) {
    *                     // do something with the error response
    *                 }
    *             });
    *         },
    *         failure: function(errorString, errorCode) {
    *             // auth failed.
    *         }
    *     });
    *     // example to use Promise
    *     Kii.authenticateAsAppAdmin("client-id", "client-secret").then(
    *         function(adminContext) {
    *             var members = [];
    *             members.push(KiiUser.userWithID("Member User Id"));
    *             return adminContext.registerGroupWithOwnerAndID("Group ID", "Group Name", "Owner User ID", members);
    *         }
    *     ).then(
    *         function(group) {
    *             // do something with the saved group
    *         }
    *     );
    */
  def registerGroupWithOwnerAndID(groupID: String, groupName: String, user: String, members: js.Array[KiiUser]): js.Promise[KiiAppAdminContext] = js.native
  def registerGroupWithOwnerAndID(
    groupID: String,
    groupName: String,
    user: String,
    members: js.Array[KiiUser],
    callbacks: FailureSuccess
  ): js.Promise[KiiAppAdminContext] = js.native
  def registerOwnerWithThingID(thingID: String, owner: KiiGroup): js.Promise[KiiGroup] = js.native
  def registerOwnerWithThingID(thingID: String, owner: KiiGroup, callbacks: `3`): js.Promise[KiiGroup] = js.native
  /**
    * Register user/group as owner of specified thing by app admin.
    *
    * @param thingID The ID of thing
    * @param owner instnce of KiiUser/KiiGroup to be registered as owner.
    * @param callbacks object holds callback functions.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(params). params is an Array instance.
    *       <ul>
    *         <li>params[0] is a KiiUser/KiiGroup instance.</li>
    *       </ul>
    *     </li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     // assume thing/group is already registered.
    *     var group = KiiGroup.groupWithURI("kiicloud://groups/xxxyyyy");
    *     // example to use Promise
    *     // Assume you already have adminContext instance.
    *     adminContext.registerOwnerWithThingID("th.xxxx-yyyy-zzzz", group, {
    *         success: function(group) {
    *             // Register owner succeeded.
    *         },
    *         failure: function(error) {
    *             // Handle error.
    *         }
    *     });
    *
    *     // example to use Promise
    *     // assume thing/group is already registered.
    *     var group = KiiGroup.groupWithURI("kiicloud://groups/xxxyyyy");
    *     // example to use Promise
    *     // Assume you already have adminContext instance.
    *     adminContext.registerOwnerWithThingID("th.xxxx-yyyy-zzzz", group).then(
    *         function(params) {
    *             // Register owner succeeded.
    *             var group = params[0];
    *         },
    *         function(error) {
    *             // Handle error.
    *         }
    *     );
    */
  def registerOwnerWithThingID(thingID: String, owner: KiiUser): js.Promise[KiiUser] = js.native
  def registerOwnerWithThingID(thingID: String, owner: KiiUser, callbacks: `2`): js.Promise[KiiUser] = js.native
  def registerOwnerWithVendorThingID(vendorThingID: String, owner: KiiGroup): js.Promise[KiiGroup] = js.native
  def registerOwnerWithVendorThingID(vendorThingID: String, owner: KiiGroup, callbacks: `3`): js.Promise[KiiGroup] = js.native
  /**
    * Register user/group as owner of specified thing by app admin.
    *
    * @param vendorThingID The vendor thing ID of thing
    * @param owner instance of KiiUser/KiiGroupd to be registered as owner.
    * @param callbacks object holds callback functions.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(params). params is an Array instance.
    *       <ul>
    *         <li>params[0] is a KiiUser/KiiGroup instance.</li>
    *       </ul>
    *     </li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     // assume thing/group is already registered.
    *     var group = KiiGroup.groupWithURI("kiicloud://groups/xxxyyyy");
    *     // example to use Promise
    *     // Assume you already have adminContext instance.
    *     adminContext.registerOwnerWithVendorThingID("xxxx-yyyy-zzzz", group, {
    *         success: function(group) {
    *             // Register owner succeeded.
    *         },
    *         failure: function(error) {
    *             // Handle error.
    *         }
    *     });
    *
    *     // example to use Promise
    *     // assume thing/group is already registered.
    *     var group = KiiGroup.groupWithURI("kiicloud://groups/xxxyyyy");
    *     // example to use Promise
    *     // Assume you already have adminContext instance.
    *     adminContext.registerOwnerWithVendorThingID("xxxx-yyyy-zzzz", group).then(
    *         function(group) {
    *             // Register owner succeeded.
    *         },
    *         function(error) {
    *             // Handle error.
    *         }
    *     );
    */
  def registerOwnerWithVendorThingID(vendorThingID: String, owner: KiiUser): js.Promise[KiiUser] = js.native
  def registerOwnerWithVendorThingID(vendorThingID: String, owner: KiiUser, callbacks: `2`): js.Promise[KiiUser] = js.native
  /**
    * Register thing by app admin.
    * Method interface is same as {@link KiiThing#register()}.
    * Please refer to KiiThing document for details.
    *
    * @param fields of the thing to be registered. Please refer to {@link KiiThing#register()} for the details of fields.
    * @param callbacks object holds callback functions.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(thing). thing is KiiThing instance with adminToken.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     // Assume you already have adminContext instance.
    *     adminContext.registerThing(
    *         {
    *             _vendorThingID: "thing-XXXX-YYYY-ZZZZZ",
    *             _password: "thing-password",
    *             _thingType: "thermometer",
    *             yourCustomObj: // Arbitrary key can be used.
    *             { // Object, Array, Number, String can be used. Should be compatible with JSON.
    *                 yourCustomKey1: "value",
    *                 yourCustomKey2: 100
    *             }
    *         },
    *         {
    *             success: function(thing) {
    *                 // Register Thing succeeded.
    *                 // Operation using thing instance in the parameter
    *                 // is authored by app admin.
    *             },
    *             failure: function(error) {
    *                 // Handle error.
    *             }
    *         }
    *     );
    *
    *     // example to use Promise
    *     // Assume you already have adminContext instance.
    *     adminContext.registerThing(
    *         {
    *             _vendorThingID: "thing-XXXX-YYYY-ZZZZZ",
    *             _password: "thing-password",
    *             _thingType: "thermometer",
    *             yourCustomObj: // Arbitrary key can be used.
    *             { // Object, Array, Number, String can be used. Should be compatible with JSON.
    *                 yourCustomKey1: "value",
    *                 yourCustomKey2: 100
    *             }
    *         }
    *     ).then(
    *         function(thing) {
    *             // Register Thing succeeded.
    *             // Operation using thing instance in the parameter
    *             // is authored by app admin.
    *         },
    *         function(error) {
    *             // Handle error.
    *         }
    *     );
    */
  def registerThing(fields: KiiThingFields): js.Promise[KiiThing] = js.native
  def registerThing(fields: KiiThingFields, callbacks: `1`): js.Promise[KiiThing] = js.native
  /**
    * Creates a reference to a thing operated by app admin.
    *
    * @param thing id.
    *
    * @return A working KiiThing object
    *
    * @example
    *         // Assume you already have adminContext instance.
    *         adminContext.thingWithID(thingID);
    */
  def thingWithID(thing: String): KiiThing = js.native
  /**
    * Creates a reference to a topic operated by app admin
    *
    * @param topicName name of the topic. Must be a not empty string.
    *
    * @return topic instance.
    */
  def topicWithName(topicName: String): KiiTopic = js.native
  /**
    * Creates a reference to a user operated by app admin.
    *
    * @param user id.
    *
    * @return A working KiiUser object
    *
    * @example
    *         Kii.authenticateAsAppAdmin("client-id", "client-secret", {
    *             success: function(adminContext) {
    *                 var user = adminContext.userWithID("userid");
    *                 // KiiUser operation by app admin is available now.
    *             },
    *             failure: function(errorString, errorCode) {
    *                 // auth failed.
    *             }
    *         });
    */
  def userWithID(user: String): KiiUser = js.native
}

