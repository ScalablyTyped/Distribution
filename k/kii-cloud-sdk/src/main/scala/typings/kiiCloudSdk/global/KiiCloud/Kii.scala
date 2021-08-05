package typings.kiiCloudSdk.global.KiiCloud

import typings.kiiCloudSdk.anon.`34`
import typings.kiiCloudSdk.anon.`35`
import typings.kiiCloudSdk.anon.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The main SDK class
  */
@JSGlobal("KiiCloud.Kii")
@js.native
class Kii ()
  extends StObject
     with typings.kiiCloudSdk.KiiCloud.Kii
object Kii {
  
  @JSGlobal("KiiCloud.Kii")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Authenticate as app admin.
    * <br><br>
    * <b>This api call must not placed on code which can be accessed by browser.
    * This api is intended to be used by server side code like Node.js.
    * If you use this api in code accessible by browser, your application id and application secret could be stolen.
    * Attacker will be act as appadmin and all the data in your application will be suffered.
    * </b>
    *
    * @param clientId assigned to your application.
    * @param clientSecret assigned to your application.
    * @param callbacks The callback methods called when authentication succeeded/failed.
    *
    * @return return promise object.
    *     <ul>
    *       <li>fulfill callback function: function(adminContext). adminContext is a KiiAppAdminContext instance.</li>
    *       <li>reject callback function: function(error). error is an Error instance.
    *         <ul>
    *           <li>error.message</li>
    *         </ul>
    *       </li>
    *     </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     Kii.authenticateAsAppAdmin("your client id", "your client secret", {
    *         success: function(adminContext) {
    *             // adminContext : KiiAppAdminContext instance
    *             // Operate entities with adminContext.
    *         },
    *         failure: function(error, statusCode) {
    *             // Authentication failed.
    *         }
    *     );
    *
    *     // example to use Promise
    *     Kii.authenticateAsAppAdmin("your client id", "your client secret").then(
    *         function(adminContext) { // fulfill callback function
    *             // adminContext : KiiAppAdminContext instance
    *             // Operate entities with adminContext.
    *
    *         },
    *         function(error) { // reject callback function
    *             // Authentication failed.
    *             var errorString = error.message;
    *         }
    *     );
    */
  /* static member */
  inline def authenticateAsAppAdmin(clientId: String, clientSecret: String): js.Promise[typings.kiiCloudSdk.KiiCloud.KiiAppAdminContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticateAsAppAdmin")(clientId.asInstanceOf[js.Any], clientSecret.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.kiiCloudSdk.KiiCloud.KiiAppAdminContext]]
  inline def authenticateAsAppAdmin(clientId: String, clientSecret: String, callbacks: `34`): js.Promise[typings.kiiCloudSdk.KiiCloud.KiiAppAdminContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticateAsAppAdmin")(clientId.asInstanceOf[js.Any], clientSecret.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.kiiCloudSdk.KiiCloud.KiiAppAdminContext]]
  
  /**
    * Authenticate as Thing.
    * <br><br>
    * <b>This api is intended to be used in a Thing device, where the user
    * credentials or app admin context is not configured. This Thing must be
    * already registered in Kii Cloud.
    * </b>
    *
    * @param vendorThingID vendorThingID of a registered Thing.
    * @param password password for the registered Thing.
    * @param callbacks The callback methods called when authentication succeeded/failed.
    *
    * @return return promise object.
    *     <ul>
    *       <li>fulfill callback function: function(thingAuthContext). thingAuthContext is a KiiThingContext instance.</li>
    *       <li>reject callback function: function(error). error is an Error instance.
    *         <ul>
    *           <li>error.message</li>
    *         </ul>
    *       </li>
    *     </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     Kii.authenticateAsThing("vendor thing id", "password of this thing", {
    *         success: function(thingAuthContext) {
    *             // thingAuthContext : KiiThingContext instance
    *             // Operate entities with thingAuthContext.
    *         },
    *         failure: function(error) {
    *             // Authentication failed.
    *         }
    *     );
    *
    *     // example to use Promise
    *     Kii.authenticateAsThing("vendor thing id", "password of this thing").then(
    *         function(thingAuthContext) { // fulfill callback function
    *             // thingAuthContext : KiiThingContext instance
    *             // Operate entities with thingAuthContext.
    *
    *         },
    *         function(error) { // reject callback function
    *             // Authentication failed.
    *             var errorString = error.message;
    *         }
    *     );
    */
  /* static member */
  inline def authenticateAsThing(vendorThingID: String, password: String): js.Promise[typings.kiiCloudSdk.KiiCloud.KiiThingContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticateAsThing")(vendorThingID.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.kiiCloudSdk.KiiCloud.KiiThingContext]]
  inline def authenticateAsThing(vendorThingID: String, password: String, callbacks: `35`): js.Promise[typings.kiiCloudSdk.KiiCloud.KiiThingContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticateAsThing")(vendorThingID.asInstanceOf[js.Any], password.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.kiiCloudSdk.KiiCloud.KiiThingContext]]
  
  /**
    * Create a KiiThingContext reference
    * <br><br>
    * <b>This api is intended to be used in a Thing device, where the user
    * credentials or app admin context is not configured. This Thing must be
    * already registered in Kii Cloud.
    * </b>
    *
    * @param thingID thingID of a registered Thing.
    * @param token token for the registered Thing.
    * @param callbacks The callback methods called when creation succeeded/failed.
    *
    * @return return promise object.
    *     <ul>
    *       <li>fulfill callback function: function(thingContext). thingContext is a KiiThingContext instance.</li>
    *       <li>reject callback function: function(error). error is an Error instance.
    *         <ul>
    *           <li>error.message</li>
    *         </ul>
    *       </li>
    *     </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     Kii.authenticateAsThingWithToken("thing_id", "thing_token", {
    *         success: function(thingContext) {
    *             // thingContext : KiiThingContext instance
    *             // Operate entities with thingContext.
    *         },
    *         failure: function(error) {
    *             // Creation failed.
    *         }
    *     );
    *
    *     // example to use Promise
    *     Kii.authenticateAsThingWithToken("thing_id", "thing_token").then(
    *         function(thingContext) { // fulfill callback function
    *             // thingContext : KiiThingContext instance
    *             // Operate entities with thingContext.
    *
    *         },
    *         function(error) { // reject callback function
    *             // Creation failed.
    *             var errorString = error.message;
    *         }
    *     );
    */
  /* static member */
  inline def authenticateAsThingWithToken(thingID: String, token: String): js.Promise[typings.kiiCloudSdk.KiiCloud.KiiThingContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticateAsThingWithToken")(thingID.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.kiiCloudSdk.KiiCloud.KiiThingContext]]
  inline def authenticateAsThingWithToken(thingID: String, token: String, callbacks: `35`): js.Promise[typings.kiiCloudSdk.KiiCloud.KiiThingContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticateAsThingWithToken")(thingID.asInstanceOf[js.Any], token.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.kiiCloudSdk.KiiCloud.KiiThingContext]]
  
  /**
    * Creates a reference to a bucket for this app
    *
    *     <br><br>The bucket will be created/accessed within this app's scope
    *
    * @param bucketName The name of the bucket the app should create/access
    *
    * @return A working KiiBucket object
    *
    * @example
    *         var bucket = Kii.bucketWithName("myBucket");
    */
  /* static member */
  inline def bucketWithName(bucketName: String): typings.kiiCloudSdk.KiiCloud.KiiBucket = ^.asInstanceOf[js.Dynamic].applyDynamic("bucketWithName")(bucketName.asInstanceOf[js.Any]).asInstanceOf[typings.kiiCloudSdk.KiiCloud.KiiBucket]
  
  /**
    * Creates a reference to a encrypted bucket for this app
    *
    *     <br><br>The bucket will be created/accessed within this app's scope
    *
    * @param bucketName The name of the bucket the app should create/access
    *
    * @return A working KiiEncryptedBucket object
    *
    * @example
    *         var bucket = Kii.encryptedBucketWithName("myBucket");
    */
  /* static member */
  inline def encryptedBucketWithName(bucketName: String): typings.kiiCloudSdk.KiiCloud.KiiBucket = ^.asInstanceOf[js.Dynamic].applyDynamic("encryptedBucketWithName")(bucketName.asInstanceOf[js.Any]).asInstanceOf[typings.kiiCloudSdk.KiiCloud.KiiBucket]
  
  /**
    * Returns access token lifetime in seconds.
    *
    * If access token lifetime has not set explicitly by {@link Kii.setAccessTokenExpiration(expiresIn)}, returns 0.
    *
    * @return access token lifetime in seconds.
    *
    * @throws If Kii has not been initialized
    */
  /* static member */
  inline def getAccessTokenExpiration(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccessTokenExpiration")().asInstanceOf[Double]
  
  /**
    * Retrieve the current app ID
    *
    * @return The current app ID
    */
  /* static member */
  inline def getAppID(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppID")().asInstanceOf[String]
  
  /**
    * Retrieve the current app key
    *
    * @return The current app key
    */
  /* static member */
  inline def getAppKey(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppKey")().asInstanceOf[String]
  
  /**
    * Kii SDK Build Number
    *
    * @return current build number of the SDK
    */
  /* static member */
  inline def getBuildNumber(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBuildNumber")().asInstanceOf[String]
  
  /**
    * Kii SDK Version Number
    *
    * @return current version number of the SDK
    */
  /* static member */
  inline def getSDKVersion(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSDKVersion")().asInstanceOf[String]
  
  /**
    * Creates a reference to a group with the given name
    *
    * @param groupName An application-specific group name
    *
    * @return A new KiiGroup reference
    *
    * @example
    *         var group = new Kii.groupWithName("myGroup");
    */
  /* static member */
  inline def groupWithName(groupName: String): typings.kiiCloudSdk.KiiCloud.KiiGroup = ^.asInstanceOf[js.Dynamic].applyDynamic("groupWithName")(groupName.asInstanceOf[js.Any]).asInstanceOf[typings.kiiCloudSdk.KiiCloud.KiiGroup]
  
  /**
    * Creates a reference to a group with the given name and a list of default members
    *
    * @param groupName An application-specific group name
    * @param members An array of KiiUser objects to add to the group
    *
    * @return A new KiiGroup reference
    *
    * @example
    *         var group = new KiiGroup.groupWithName("myGroup", members);
    */
  /* static member */
  inline def groupWithNameAndMembers(groupName: String, members: js.Array[typings.kiiCloudSdk.KiiCloud.KiiUser]): typings.kiiCloudSdk.KiiCloud.KiiGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("groupWithNameAndMembers")(groupName.asInstanceOf[js.Any], members.asInstanceOf[js.Any])).asInstanceOf[typings.kiiCloudSdk.KiiCloud.KiiGroup]
  
  /**
    * Initialize the Kii SDK
    *
    * Should be the first Kii SDK action your application makes.
    * Meanwhile, Kii Analytics is initialized.
    *
    * @param appID The application ID found in your Kii developer console
    * @param appKey The application key found in your Kii developer console
    * @param analyticsOption An object used for initializing KiiAnalytics, If not provided or invalid object provided, KiiAnalytics won't be initialized. If provided, it can be empty object or
    * with analyticsOption.deviceId. <br> If provided, but deviceId is not provided, SDK generates a new deviceId and use it when upload events. It can be retrieved by {@link
    * KiiAnalytics.getDeviceId()}. It is recommended to retrieve the deviceId and store it to identify the device properly.
    *
    * @example
    *     // Disable KiiAnalytics
    *     Kii.initialize("my-app-id", "my-app-key");
    *
    *     // Enable KiiAnalytics with deviceId
    *     var analyticsOption = { deviceId: "my-device-id" };
    *     Kii.initialize("my-app-id", "my-app-key", analyticsOption);
    *
    *     // Enable KiiAnalytics without deviceId
    *     Kii.initialize("my-app-id", "my-app-key", {});
    */
  /* static member */
  inline def initialize(appID: String, appKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(appID.asInstanceOf[js.Any], appKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def initialize(appID: String, appKey: String, analyticsOption: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(appID.asInstanceOf[js.Any], appKey.asInstanceOf[js.Any], analyticsOption.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Initialize the Kii SDK with a specific URL
    *
    * Should be the first Kii SDK action your application makes.
    *
    * @param appID The application ID found in your Kii developer console
    * @param appKey The application key found in your Kii developer console
    * @param site Can be one of the constants KiiSite.US, KiiSite.JP, KiiSite.CN or KiiSite.SG depending on your location.
    * @param analyticsOption An object used for initializing KiiAnalytics, If not provided or invalid object provided, KiiAnalytics won't be initialized. If provided, it can be empty object or
    * with analyticsOption.deviceId.<br> If provided, but deviceId is not provided, SDK generates a new deviceId and use it when upload events. It can be retrieved by {@link
    * KiiAnalytics.getDeviceId()}. It is recommended to retrieve the deviceId and store it to identify the device properly.
    *
    * @example
    *     // Disable KiiAnalytics
    *     Kii.initializeWithSite("my-app-id", "my-app-key", KiiSite.JP);
    *
    *     // Enable KiiAnalytics with deviceId
    *     var analyticsOption = { deviceId: "my-device-id" };
    *     Kii.initializeWithSite("my-app-id", "my-app-key", KiiSite.JP, analyticsOption);
    *
    *     // Enable KiiAnalytics without deviceId
    *     Kii.initializeWithSite("my-app-id", "my-app-key", KiiSite.JP, {});
    */
  /* static member */
  inline def initializeWithSite(appID: String, appKey: String, site: typings.kiiCloudSdk.KiiCloud.KiiSite): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeWithSite")(appID.asInstanceOf[js.Any], appKey.asInstanceOf[js.Any], site.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def initializeWithSite(appID: String, appKey: String, site: typings.kiiCloudSdk.KiiCloud.KiiSite, analyticsOption: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeWithSite")(appID.asInstanceOf[js.Any], appKey.asInstanceOf[js.Any], site.asInstanceOf[js.Any], analyticsOption.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Gets a list of topics in app scope
    *
    * @param callbacks An object with callback methods defined
    * @param paginationKey You can specify the pagination key with the nextPaginationKey passed by callbacks.success or fullfill callback of promise. If empty string or no string object is
    * provided, this API regards no paginationKey specified.
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
    *           <li>error.message</li>
    *         </ul>
    *       </li>
    *     </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     Kii.listTopics({
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
    *     // example to use promise
    *     Kii.listTopics().then(
    *         function(params) {
    *             var topicList = params[0];
    *             var nextPaginationKey = params[1];
    *             // do something with the result
    *             for(var i=0; i&lt;topicList.length; i++){
    *                 var topic = topicList[i];
    *             }
    *             if (nextPaginationKey != null) {
    *                 Kii.listTopics(null, nextPaginationKey).then(
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
  /* static member */
  inline def listTopics(): js.Promise[js.Tuple2[js.Array[typings.kiiCloudSdk.KiiCloud.KiiTopic], String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listTopics")().asInstanceOf[js.Promise[js.Tuple2[js.Array[typings.kiiCloudSdk.KiiCloud.KiiTopic], String]]]
  inline def listTopics(callbacks: Unit, paginationKey: String): js.Promise[js.Tuple2[js.Array[typings.kiiCloudSdk.KiiCloud.KiiTopic], String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("listTopics")(callbacks.asInstanceOf[js.Any], paginationKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[js.Array[typings.kiiCloudSdk.KiiCloud.KiiTopic], String]]]
  inline def listTopics(callbacks: `4`): js.Promise[js.Tuple2[js.Array[typings.kiiCloudSdk.KiiCloud.KiiTopic], String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listTopics")(callbacks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Tuple2[js.Array[typings.kiiCloudSdk.KiiCloud.KiiTopic], String]]]
  inline def listTopics(callbacks: `4`, paginationKey: String): js.Promise[js.Tuple2[js.Array[typings.kiiCloudSdk.KiiCloud.KiiTopic], String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("listTopics")(callbacks.asInstanceOf[js.Any], paginationKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[js.Array[typings.kiiCloudSdk.KiiCloud.KiiTopic], String]]]
  
  /**
    * Instantiate KiiServerCodeEntry with specified entry name.
    *
    * @param entryName Name of the entry.
    *
    * @return KiiServerCodeEntry instance.
    *
    * @throws Thrown when entryName is invalid in the following cases:
    *     <li>not type of string </li>
    *     <li>empty string </li>
    *     <li>invalid string. Valid entryName pattern is "[a-zA-Z][_a-zA-Z0-9]*$".</li>
    *
    * @example
    *         var entry = Kii.serverCodeEntry("main");
    */
  /* static member */
  inline def serverCodeEntry(entryName: String): typings.kiiCloudSdk.KiiCloud.KiiServerCodeEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("serverCodeEntry")(entryName.asInstanceOf[js.Any]).asInstanceOf[typings.kiiCloudSdk.KiiCloud.KiiServerCodeEntry]
  
  /**
    * Instantiate serverCodeEntryWithVersion with specified entry name and version.
    *
    * @param entryName Name of the entry.
    * @param version Version of the entry.
    *
    * @return KiiServerCodeEntry instance.
    *
    * @throws Thrown in the following cases: <br>
    *     <li>entryName or version is not type of string </li>
    *     <li>entryName or version is empty string </li>
    *     <li>entryName is invalid string. Valid entryName pattern is "[a-zA-Z][_a-zA-Z0-9]*$".</li>
    *
    * @example
    *         var entry = Kii.serverCodeEntryWithVersion("main", "gulsdf6ful8jvf8uq6fe7vjy6");
    */
  /* static member */
  inline def serverCodeEntryWithVersion(entryName: String, version: String): typings.kiiCloudSdk.KiiCloud.KiiServerCodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("serverCodeEntryWithVersion")(entryName.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[typings.kiiCloudSdk.KiiCloud.KiiServerCodeEntry]
  
  /**
    * Set the access token lifetime in seconds.
    *
    * If you don't call this method or call it with 0, token won't be expired.
    * Call this method if you like the access token to be expired
    * after a certain period. Once called, token retrieved
    * by each future authentication will have the specified lifetime.
    * Note that, it will not update the lifetime of token received prior
    * calling this method. Once expired, you have to login again to renew the token.
    *
    * @param expiresIn The life time of access token in seconds.
    *
    * @throws If specified expiresIn is negative.
    * @throws If Kii has not been initialized
    *
    * @example
    *     Kii.setAccessTokenExpiration(3600);
    */
  /* static member */
  inline def setAccessTokenExpiration(expiresIn: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAccessTokenExpiration")(expiresIn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Instantiate topic belongs to application.
    *
    * @param topicName name of the topic. Must be a not empty string.
    *
    * @return topic instance.
    */
  /* static member */
  inline def topicWithName(topicName: String): typings.kiiCloudSdk.KiiCloud.KiiTopic = ^.asInstanceOf[js.Dynamic].applyDynamic("topicWithName")(topicName.asInstanceOf[js.Any]).asInstanceOf[typings.kiiCloudSdk.KiiCloud.KiiTopic]
}
