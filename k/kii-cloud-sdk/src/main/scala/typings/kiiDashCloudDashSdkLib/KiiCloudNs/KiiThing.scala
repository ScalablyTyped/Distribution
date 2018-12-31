package typings
package kiiDashCloudDashSdkLib.KiiCloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Thing object
  */
@JSGlobal("KiiCloud.KiiThing")
@js.native
class KiiThing () extends js.Object {
  /**
    * of this thing.
    * For details refer to {@link KiiThing.register}
    */
  var fields: KiiThingFields = js.native
  /**
    * Instantiate bucket belongs to this thing.
    *
    * @param bucketName name of the bucket.
    *
    * @return bucket instance.
    */
  def bucketWithName(bucketName: java.lang.String): KiiBucket = js.native
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
  def deleteThing(callbacks: kiiDashCloudDashSdkLib.Anon_FailureErrorSuccessThing): js.Promise[KiiThing] = js.native
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
  def disable(callbacks: kiiDashCloudDashSdkLib.Anon_FailureErrorSuccessThing): js.Promise[KiiThing] = js.native
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
  def enable(callbacks: kiiDashCloudDashSdkLib.Anon_FailureErrorSuccessThing): js.Promise[KiiThing] = js.native
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
  def encryptedBucketWithName(bucketName: java.lang.String): KiiBucket = js.native
  /**
    * Get access token of this thing.
    *
    * @return access token of this thing.
    */
  def getAccessToken(): java.lang.String = js.native
  /**
    * Get created time of this thing.
    *
    * @return created time of this thing.
    */
  def getCreated(): stdLib.Date = js.native
  /**
    * Get disabled status of this thing.
    *
    * @return true if thing is disabled, false otherwise.
    */
  def getDisabled(): scala.Boolean = js.native
  /**
    * Get online status modified date of the thing.
    *
    * @return online status modified time of this thing. The date will be null initially until the thing is connected for the first time.
    */
  def getOnlineStatusModifiedAt(): stdLib.Date = js.native
  /**
    * Get thing ID.
    *
    * @return thing id
    */
  def getThingID(): java.lang.String = js.native
  /**
    * Get vendor thing ID.
    *
    * @return vendor thing id
    */
  def getVendorThingID(): java.lang.String = js.native
  /**
    * Get online status of the thing.
    *
    * @return true if the thing is online, false otherwise. The return value will be null initially until the thing is connected for the first time.
    */
  def isOnline(): scala.Boolean = js.native
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
  def isOwner[T /* <: KiiUser | KiiGroup */](owner: T): js.Promise[js.Tuple3[KiiThing, T, scala.Boolean]] = js.native
  def isOwner[T /* <: KiiUser | KiiGroup */](owner: T, callbacks: kiiDashCloudDashSdkLib.Anon_FailureErrorSuccessThingUser[T]): js.Promise[js.Tuple3[KiiThing, T, scala.Boolean]] = js.native
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
  def listTopics(): js.Promise[js.Tuple2[js.Array[KiiTopic], java.lang.String]] = js.native
  def listTopics(callbacks: kiiDashCloudDashSdkLib.Anon_FailureAnErrorString): js.Promise[js.Tuple2[js.Array[KiiTopic], java.lang.String]] = js.native
  def listTopics(callbacks: kiiDashCloudDashSdkLib.Anon_FailureAnErrorString, paginationKey: java.lang.String): js.Promise[js.Tuple2[js.Array[KiiTopic], java.lang.String]] = js.native
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
  def refresh(callbacks: kiiDashCloudDashSdkLib.Anon_FailureErrorSuccessThing): js.Promise[KiiThing] = js.native
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
  def registerOwner[T /* <: KiiUser | KiiGroup */](owner: T): js.Promise[js.Tuple2[KiiThing, T]] = js.native
  def registerOwner[T /* <: KiiUser | KiiGroup */](owner: T, callbacks: kiiDashCloudDashSdkLib.Anon_FailureErrorSuccessThingGroup[T]): js.Promise[js.Tuple2[KiiThing, T]] = js.native
  /**
    * Instantiate topic belongs to this thing.
    *
    * @param topicName name of the topic. Must be a not empty string.
    *
    * @return topic instance.
    */
  def topicWithName(topicName: java.lang.String): KiiTopic = js.native
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
  def unregisterOwner[T /* <: KiiUser | KiiGroup */](owner: T): js.Promise[js.Tuple2[KiiThing, T]] = js.native
  def unregisterOwner[T /* <: KiiUser | KiiGroup */](owner: T, callbacks: kiiDashCloudDashSdkLib.Anon_FailureErrorSuccessThingGroup[T]): js.Promise[js.Tuple2[KiiThing, T]] = js.native
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
  def update(callbacks: kiiDashCloudDashSdkLib.Anon_FailureErrorSuccessThing): js.Promise[KiiThing] = js.native
}

/**
  * Represents a Thing object
  */
@JSGlobal("KiiCloud.KiiThing")
@js.native
object KiiThing extends js.Object {
  /**
    * Load thing with thing id given by Kii Cloud.
    * <br>This API is authorized by owner of thing.
    * <br>Need user login who owns this thing before execute this API.
    * <br>To let users to own Thing, please call {@link KiiThing#registerOwner}
    * <br>Note: if you obtain thing instance from {@link KiiAppAdminContext},
    * API is authorized by app admin.<br>
    *
    * thing id can be obtained by {@link thingID}
    *
    * @param thingID registered thing id.
    * @param callbacks object holds callback functions.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(thing). thing is a KiiThing instance.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     KiiThing.loadWithThingID("thing-xxxx-yyyy",{
    *         success: function(thing) {
    *             // Load succeeded.
    *         },
    *         failure: function(error) {
    *             // Handle error.
    *         }
    *     });
    *
    *     // example to use Promise
    *     KiiThing.loadWithVendorThingID("thing-xxxx-yyyy").then(
    *         function(thing) {
    *             // Load succeeded.
    *         },
    *         function(error) {
    *             // Handle error.
    *         }
    *     );
    */
  def loadWithThingID(thingID: java.lang.String): js.Promise[kiiDashCloudDashSdkLib.KiiCloudNs.KiiThing] = js.native
  def loadWithThingID(thingID: java.lang.String, callbacks: kiiDashCloudDashSdkLib.Anon_FailureErrorSuccessThing): js.Promise[kiiDashCloudDashSdkLib.KiiCloudNs.KiiThing] = js.native
  /**
    * Load thing with given vendor thing id.
    * <br>This API is authorized by owner of thing.
    * <br>Need user login who owns this thing before execute this API.
    * <br>To let users to own Thing, please call {@link KiiThing#registerOwner}
    * <br>Note: if you obtain thing instance from {@link KiiAppAdminContext},
    * API is authorized by app admin.<br>
    *
    * @param vendorThingID registered vendor thing id.
    * @param callbacks object holds callback functions.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(thing). thing is a KiiThing instance.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     KiiThing.loadWithVendorThingID("thing-xxxx-yyyy",{
    *         success: function(thing) {
    *             // Load succeeded.
    *         },
    *         failure: function(error) {
    *             // Handle error.
    *         }
    *     });
    *
    *     // example to use Promise
    *     KiiThing.loadWithVendorThingID("thing-xxxx-yyyy").then(
    *         function(thing) {
    *             // Load succeeded.
    *         },
    *         function(error) {
    *             // Handle error.
    *         }
    *     );
    */
  def loadWithVendorThingID(vendorThingID: java.lang.String): js.Promise[kiiDashCloudDashSdkLib.KiiCloudNs.KiiThing] = js.native
  def loadWithVendorThingID(vendorThingID: java.lang.String, callbacks: kiiDashCloudDashSdkLib.Anon_FailureErrorSuccessThing): js.Promise[kiiDashCloudDashSdkLib.KiiCloudNs.KiiThing] = js.native
  /**
    * Register thing in KiiCloud.<br>
    * This API doesnt require users login Anonymous user can register thing.
    * <br>
    * Propertis started with '_' in the fields is reserved by Kii Cloud.<br>
    * Those properties are indexed in Kii Cloud storage.<br>
    * Properties not started with '_' is custom properties defined by developer.<br>
    * Custom properties are not indexed in KiiCloud storage.<br>
    * Following properties are readonly and ignored on creation/{@link #update} of thing.<br>
    * '_thingID', '_created', '_accessToken' <br>
    * Following properties are readonly after creation and will be ignored on {@link #update} of thing.<br>
    * '_vendorThingID', '_password'<br>
    * As Property prefixed with '_' is reserved by Kii Cloud,
    * properties other than ones described in the parameter secion
    * and '_layoutPosition' are ignored on creation/{@link #update} of thing.<br>
    * Those ignored properties won't be removed from fields object passed as argument.
    * However it won't be reflected to fields object property of created/updated Thing.
    *
    * @param fields of the thing to be registered.
    * @param callbacks object holds callback functions.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(thing). thing is a KiiThing instance.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiThing instance.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     KiiThing.register(
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
    *             },
    *             failure: function(error) {
    *                 // Handle error.
    *             }
    *         }
    *     );
    *
    *     // example to use Promise
    *     KiiThing.register(
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
    *         },
    *         function(error) {
    *             // Handle error.
    *         }
    *     );
    */
  def register(fields: kiiDashCloudDashSdkLib.KiiCloudNs.KiiThingFields): js.Promise[kiiDashCloudDashSdkLib.KiiCloudNs.KiiThing] = js.native
  def register(
    fields: kiiDashCloudDashSdkLib.KiiCloudNs.KiiThingFields,
    callbacks: kiiDashCloudDashSdkLib.Anon_FailureErrorSuccessThing
  ): js.Promise[kiiDashCloudDashSdkLib.KiiCloudNs.KiiThing] = js.native
  /**
    * Register user/group as owner of specified thing.
    * <br>Need user login before execute this API.
    * <br>Note: if you obtain thing instance from {@link KiiAppAdminContext},
    * API is authorized by app admin.<br>
    *
    * @param thingID The ID of thing
    * @param owner instance of KiiUser/KiiGroup to be registered as owner.
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
    *     KiiThing.registerOwnerWithThingID("th.xxxx-yyyy-zzzz", group, {
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
    *     KiiThing.registerOwnerWithThingID("th.xxxx-yyyy-zzzz", group).then(
    *         function(params) {
    *             // Register owner succeeded.
    *             var group = params[0];
    *         },
    *         function(error) {
    *             // Handle error.
    *         }
    *     );
    */
  def registerOwnerWithThingID[T /* <: kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser | kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup */](thingID: java.lang.String, owner: T): js.Promise[T] = js.native
  def registerOwnerWithThingID[T /* <: kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser | kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup */](
    thingID: java.lang.String,
    owner: T,
    callbacks: kiiDashCloudDashSdkLib.Anon_FailureErrorSuccessGroup[T]
  ): js.Promise[T] = js.native
  /**
    * Register user/group as owner of specified thing.
    * <br>Need user login before execute this API.
    * <br>Note: if you obtain thing instance from {@link KiiAppAdminContext},
    * API is authorized by app admin.<br>
    *
    * @param vendorThingID The vendor thing ID of thing
    * @param owner instance of KiiUser/KiiGroup to be registered as owner.
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
    *     KiiThing.registerOwnerWithVendorThingID("xxxx-yyyy-zzzz", group, {
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
    *     KiiThing.registerOwnerWithVendorThingID("xxxx-yyyy-zzzz", group).then(
    *         function(group) {
    *             // Register owner succeeded.
    *         },
    *         function(error) {
    *             // Handle error.
    *         }
    *     );
    */
  def registerOwnerWithVendorThingID[T /* <: kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser | kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup */](vendorThingID: java.lang.String, owner: T): js.Promise[T] = js.native
  def registerOwnerWithVendorThingID[T /* <: kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser | kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup */](
    vendorThingID: java.lang.String,
    owner: T,
    callbacks: kiiDashCloudDashSdkLib.Anon_FailureErrorSuccessGroup[T]
  ): js.Promise[T] = js.native
}

