package typings.kiiCloudSdk.KiiCloud

import typings.kiiCloudSdk.anon.`1`
import typings.kiiCloudSdk.anon.`25`
import typings.kiiCloudSdk.anon.`26`
import typings.kiiCloudSdk.anon.`27`
import typings.kiiCloudSdk.anon.`28`
import typings.kiiCloudSdk.anon.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Thing object
  */
@js.native
trait KiiThing
  extends StObject
     with KiiACLSubject {
  
  /**
    * Instantiate bucket belongs to this thing.
    *
    * @param bucketName name of the bucket.
    *
    * @return bucket instance.
    */
  def bucketWithName(bucketName: String): KiiBucket = js.native
  
  /**
    * Delete registered thing in Kii Cloud.
    * <br>This API is authorized by owner of thing.
    * <br>Need user login who owns this thing before execute this API.
    * <br>To let users to own thing, please call {@link KiiThing#registerOwner}
    * <br>Note: if you obtain thing instance from {@link KiiAppAdminContext},
    * API is authorized by app admin.<br>
    *
    * It will delete bucket, topic which belongs to this thing,
    * entity belongs to the bucket/topic and all ownership information of thing.
    * This operation can not be reverted. Please carefully use this.
    *
    * @param callbacks object holds callback functions.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(thing). thing is a KiiThing instance.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiThing instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     // assume thing is already registered.
    *     thing.deleteThing({
    *         success: function(thing) {
    *             // Delete succeeded.
    *         },
    *         failure: function(error) {
    *             // Handle error.
    *         }
    *     });
    *
    *     // example to use Promise
    *     // assume thing is already registered.
    *     thing.deleteThing().then(
    *         function(thing) {
    *             // Delete succeeded.
    *         },
    *         function(error) {
    *             // Handle error.
    *         }
    *     );
    */
  def deleteThing(): js.Promise[KiiThing] = js.native
  def deleteThing(callbacks: `1`): js.Promise[KiiThing] = js.native
  
  /**
    * Disable the thing.
    * <br>This API is authorized by owner of thing.
    * <br>Need user login who owns this thing before execute this API.
    * <br>To let users to own Thing, please call {@link KiiThing#registerOwner}
    * <br>Note: if you obtain thing instance from {@link KiiAppAdminContext},
    * API is authorized by app admin.<br>
    *
    * After succeeded, access token published for thing is disabled.
    * In a result, only the app administrator and owners of thing can access the thing.
    * Used when user lost the thing and avoid using by unknown users.
    * It doesn't throw error when the thing is already disabled.
    *
    * @param callbacks object holds callback functions.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(thing). thing is a KiiThing instance.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiThing instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     // assume thing is already registered.
    *     thing.disable({
    *         success: function(thing) {
    *             // Disable succeeded.
    *         },
    *         failure: function(error) {
    *             // Handle error.
    *         }
    *     });
    *
    *     // example to use Promise
    *     // assume thing is already registered.
    *     thing.disable().then(
    *         function(thing) {
    *             // Disable succeeded.
    *         },
    *         function(error) {
    *             // Handle error.
    *         }
    *     );
    */
  def disable(): js.Promise[KiiThing] = js.native
  def disable(callbacks: `1`): js.Promise[KiiThing] = js.native
  
  /**
    * Enable the thing.
    * <br>This API is authorized by owner of thing.
    * <br>Need user login who owns this thing before execute this API.
    * <br>To let users to own Thing, please call {@link KiiThing#registerOwner}
    * <br>Note: if you obtain thing instance from {@link KiiAppAdminContext},
    * API is authorized by app admin.<br>
    *
    * After succeeded, If thing is registered with "persistentToken" option,
    * token should be recovered (Access token which is used before disabling can be available).
    * Otherwise, it does not recovered.
    * It doesn't throw error when the thing is already enabled.
    *
    * @param callbacks object holds callback functions.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(thing). thing is a KiiThing instance.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiThing instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     // assume thing is already registered.
    *     thing.enable({
    *         success: function(thing) {
    *             // Enable succeeded.
    *         },
    *         failure: function(error) {
    *             // Handle error.
    *         }
    *     });
    *
    *     // example to use Promise
    *     // assume thing is already registered.
    *     thing.enable().then(
    *         function(thing) {
    *             // Disable succeeded.
    *         },
    *         function(error) {
    *             // Handle error.
    *         }
    *     );
    */
  def enable(): js.Promise[KiiThing] = js.native
  def enable(callbacks: `1`): js.Promise[KiiThing] = js.native
  
  /**
    * Creates a reference to a encrypted bucket for this thing
    *
    * <br><br>The bucket will be created/accessed within this thing's scope
    *
    * @param bucketName The name of the bucket the user should create/access
    *
    * @return A working KiiEncryptedBucket object
    *
    * @example
    *     var thing = . . .; // a KiiThing
    *     var bucket = thing.encryptedBucketWithName("myBucket");
    */
  def encryptedBucketWithName(bucketName: String): KiiBucket = js.native
  
  /**
    * of this thing.
    * For details refer to {@link KiiThing.register}
    */
  var fields: KiiThingFields = js.native
  
  /**
    * Get access token of this thing.
    *
    * @return access token of this thing.
    */
  def getAccessToken(): String = js.native
  
  /**
    * Get created time of this thing.
    *
    * @return created time of this thing.
    */
  def getCreated(): js.Date = js.native
  
  /**
    * Get disabled status of this thing.
    *
    * @return true if thing is disabled, false otherwise.
    */
  def getDisabled(): Boolean = js.native
  
  /**
    * Get online status modified date of the thing.
    *
    * @return online status modified time of this thing. The date will be null initially until the thing is connected for the first time.
    */
  def getOnlineStatusModifiedAt(): js.Date = js.native
  
  /**
    * Get thing ID.
    *
    * @return thing id
    */
  def getThingID(): String = js.native
  
  /**
    * Get vendor thing ID.
    *
    * @return vendor thing id
    */
  def getVendorThingID(): String = js.native
  
  /**
    * Get online status of the thing.
    *
    * @return true if the thing is online, false otherwise. The return value will be null initially until the thing is connected for the first time.
    */
  def isOnline(): Boolean = js.native
  
  def isOwner(owner: KiiGroup): js.Promise[js.Tuple3[KiiThing, KiiGroup, Boolean]] = js.native
  def isOwner(owner: KiiGroup, callbacks: `26`): js.Promise[js.Tuple3[KiiThing, KiiGroup, Boolean]] = js.native
  /**
    * Check if user/ group is owner of the thing.
    * <br>This API is authorized by owner of thing.
    * <br>Need user login before execute this API.
    * <br>To let users to own Thing, please call {@link KiiThing#registerOwner}
    * <br>Note: if you obtain thing instance from {@link KiiAppAdminContext},
    * API is authorized by app admin.<br>
    *
    * @param owner whether the instance is owner of thing or not.
    * @param callbacks object holds callback functions.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(params). params is an Array instance.
    *       <ul>
    *         <li>params[0] is the KiiThing instance which this method was called on.</li>
    *         <li>params[1] is a KiiUser/KiiGroup instance.</li>
    *         <li>params[2] is Boolean value, true is the user/group is owner of the thing, otherwise false.</li>
    *       </ul>
    *     </li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiThing instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     // assume thing/user is already registered.
    *     var user = KiiUser.userWithURI("kiicloud://users/xxxyyyy");
    *     thing.isOwner(user, {
    *         success: function(thing, user, isOwner) {
    *             if (isOwner) {
    *                 // user is owner of the thing.
    *             } else {
    *                 // user is not owner of the thing.
    *             }
    *         },
    *         failure: function(error) {
    *             // Handle error.
    *         }
    *     });
    *
    *     // example to use Promise
    *     // assume thing/user is already registered.
    *     var user = KiiUser.userWithURI("kiicloud://users/xxxyyyy");
    *     thing.isOwner(user).then(
    *         function(params) {
    *             var thing = params[0];
    *             var user = params[1];
    *             var isOwner = params[2];
    *             if (isOwner) {
    *                 // user is owner of the thing.
    *             } else {
    *                 // user is not owner of the thing.
    *             }
    *         },
    *         function(error) {
    *             // Handle error.
    *         }
    *     );
    */
  def isOwner(owner: KiiUser): js.Promise[js.Tuple3[KiiThing, KiiUser, Boolean]] = js.native
  def isOwner(owner: KiiUser, callbacks: `25`): js.Promise[js.Tuple3[KiiThing, KiiUser, Boolean]] = js.native
  
  /**
    * Gets a list of topics in this thing scope
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
    *           <li>error.target is the KiiThing instance which this method was called on. </li>
    *           <li>error.message</li>
    *         </ul>
    *       </li>
    *     </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var thing = . . .; // a KiiThing
    *     thing.listTopics({
    *         success: function(topicList, nextPaginationKey) {
    *             // do something with the result
    *             for(var i=0; i&lt;topicList.length; i++){
    *                 var topic = topicList[i];
    *             }
    *             if (nextPaginationKey != null) {
    *                 thing.listTopics({
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
    *     // example to use promise
    *     var thing = . . .; // a KiiThing
    *     thing.listTopics().then(
    *         function(params) {
    *             var topicList = params[0];
    *             var nextPaginationKey = params[1];
    *             // do something with the result
    *             for(var i=0; i&lt;topicList.length; i++){
    *                 var topic = topicList[i];
    *             }
    *             if (nextPaginationKey != null) {
    *                 thing.listTopics(null, nextPaginationKey).then(
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
  def listTopics(callbacks: Unit, paginationKey: String): js.Promise[js.Tuple2[js.Array[KiiTopic], String]] = js.native
  def listTopics(callbacks: `4`): js.Promise[js.Tuple2[js.Array[KiiTopic], String]] = js.native
  def listTopics(callbacks: `4`, paginationKey: String): js.Promise[js.Tuple2[js.Array[KiiTopic], String]] = js.native
  
  /**
    * Instantiate push subscription for this thing.
    *
    * @return push subscription object.
    */
  def pushSubscription(): KiiPushSubscription = js.native
  
  /**
    * Retrieve the latest thing information from KiiCloud.
    * <br>This API is authorized by owner of thing.
    * <br>Need user login who owns this thing before execute this API.
    * <br>To let users to own thing, please call {@link KiiThing#registerOwner}
    * <br>Note: if you obtain thing instance from {@link KiiAppAdminContext},
    * API is authorized by app admin.<br>
    *
    * @param callbacks object holds callback functions.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(thing). thing is KiiThing instance.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiThing instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     // assume thing is already registered.
    *     thing.refresh({
    *         success: function(thing) {
    *             // Refresh succeeded.
    *         },
    *         failure: function(error) {
    *             // Handle error.
    *         }
    *     });
    *
    *     // example to use Promise
    *     // assume thing is already registered.
    *     thing.refresh().then(
    *         function(thing) {
    *             // Refresh succeeded.
    *         },
    *         function(error) {
    *             // Handle error.
    *         }
    *     );
    */
  def refresh(): js.Promise[KiiThing] = js.native
  def refresh(callbacks: `1`): js.Promise[KiiThing] = js.native
  
  def registerOwner(owner: KiiGroup): js.Promise[js.Tuple2[KiiThing, KiiGroup]] = js.native
  def registerOwner(owner: KiiGroup, callbacks: `28`): js.Promise[js.Tuple2[KiiThing, KiiGroup]] = js.native
  /**
    * Register user/group as owner of this thing.
    * <br>Need user login before execute this API.
    * <br>Note: if you obtain thing instance from {@link KiiAppAdminContext},
    * API is authorized by app admin.<br>
    *
    * @param owner to be registered as owner.
    * @param callbacks object holds callback functions.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(params). params is an Array instance.
    *       <ul>
    *         <li>params[0] is the KiiThing instance which this method was called on.</li>
    *         <li>params[1] is a KiiUser/KiiGroup instance.</li>
    *       </ul>
    *     </li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiThing instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     // assume thing/group is already registered.
    *     var group = KiiGroup.groupWithURI("kiicloud://groups/xxxyyyy");
    *     thing.registerOwner(group, {
    *         success: function(thing, group) {
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
    *     thing.registerOwner(group).then(
    *         function(params) {
    *             // Register owner succeeded.
    *             var thing = params[0];
    *             var group = params[1];
    *         },
    *         function(error) {
    *             // Handle error.
    *         }
    *     );
    */
  def registerOwner(owner: KiiUser): js.Promise[js.Tuple2[KiiThing, KiiUser]] = js.native
  def registerOwner(owner: KiiUser, callbacks: `27`): js.Promise[js.Tuple2[KiiThing, KiiUser]] = js.native
  
  /**
    * Instantiate topic belongs to this thing.
    *
    * @param topicName name of the topic. Must be a not empty string.
    *
    * @return topic instance.
    */
  def topicWithName(topicName: String): KiiTopic = js.native
  
  def unregisterOwner(owner: KiiGroup): js.Promise[js.Tuple2[KiiThing, KiiGroup]] = js.native
  def unregisterOwner(owner: KiiGroup, callbacks: `28`): js.Promise[js.Tuple2[KiiThing, KiiGroup]] = js.native
  /**
    * Remove ownership of thing from specified user/group.
    * <br>This API is authorized by owner of thing.
    * <br>Need user login who owns this thing before execute this API.
    * <br>Note: if you obtain thing instance from {@link KiiAppAdminContext},
    * API is authorized by app admin.<br>
    *
    * @param owner to be unregistered.
    * @param callbacks object holds callback functions.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(params). params is an Array instance.
    *       <ul>
    *         <li>params[0] is the KiiThing instance which this method was called on.</li>
    *         <li>params[1] is a KiiUser/KiiGroup instance which had ownership of the thing removed.</li>
    *       </ul>
    *     </li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiThing instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     // assume thing/group is already registered.
    *     var group = KiiGroup.groupWithURI("kiicloud://groups/xxxyyyy");
    *     thing.unregisterOwner(group, {
    *         success: function(thing, group) {
    *             // Unregister owner succeeded.
    *         },
    *         failure: function(error) {
    *             // Handle error.
    *         }
    *     });
    *
    *     // example to use Promise
    *     // assume thing/group is already registered.
    *     var group = KiiGroup.groupWithURI("kiicloud://groups/xxxyyyy");
    *     thing.unregisterOwner(group).then(
    *         function(params) {
    *             // Unregister owner succeeded.
    *         },
    *         function(error) {
    *             // Handle error.
    *         }
    *     );
    */
  def unregisterOwner(owner: KiiUser): js.Promise[js.Tuple2[KiiThing, KiiUser]] = js.native
  def unregisterOwner(owner: KiiUser, callbacks: `27`): js.Promise[js.Tuple2[KiiThing, KiiUser]] = js.native
  
  /**
    * Update registered thing information in Kii Cloud
    * <br>This API is authorized by owner of thing.
    * <br>Need user login who owns this thing before execute this API.
    * <br>To let users to own thing, please call {@link KiiThing#registerOwner}
    * <br>Note: if you obtain thing instance from {@link KiiAppAdminContext},
    * API is authorized by app admin.<br>
    *
    * @param callbacks object holds callback functions.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(thing). thing is a KiiThing instance.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiThing instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @see KiiThing.register
    *
    * @example
    *     // example to use callbacks directly
    *     // assume thing is already registered.
    *     thing.fields._stringField1 = "new string value";
    *     thing.fields.customObject = {
    *         "customField1" : "abcd",
    *         "customField2" : 123
    *     };
    *     thing.update({
    *         success: function(thing) {
    *             // Update succeeded.
    *         },
    *         failure: function(error) {
    *             // Handle error.
    *         }
    *     });
    *
    *     // example to use Promise
    *     // assume thing is already registered.
    *     thing.fields._stringField1 = "new string value";
    *     thing.fields.customObject = {
    *         "customField1" : "abcd",
    *         "customField2" : 123
    *     };
    *     thing.update().then(
    *         function(thing) {
    *             // Update succeeded.
    *         },
    *         function(error) {
    *             // Handle error.
    *         }
    *     );
    */
  def update(): js.Promise[KiiThing] = js.native
  def update(callbacks: `1`): js.Promise[KiiThing] = js.native
}
