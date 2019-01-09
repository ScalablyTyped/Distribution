package typings
package kiiDashCloudDashSdkLib.KiiCloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a KiiThingContext object
  */
@JSGlobal("KiiCloud.KiiThingContext")
@js.native
class KiiThingContext () extends js.Object {
  /**
    * Creates a reference to a bucket in App scope operated by thing.
    *
    * @param bucketName The name of the bucket the app should create/access
    *
    * @return A working KiiBucket object
    *
    * @example
    *         Kii.authenticateAsThing("vendorThingID", "password", {
    *             success: function(thingAuthContext) {
    *                 var bucket = thingAuthContext.bucketWithName("myAppBucket");
    *             },
    *             failure: function(errorString, errorCode) {
    *                 // auth failed.
    *             }
    *         });
    */
  def bucketWithName(bucketName: java.lang.String): KiiBucket = js.native
  /**
    * Creates a reference to a encrypted bucket in App scope operated by thing.
    *     <br><br>The bucket will be created/accessed within this app's scope
    *
    * @param bucketName The name of the bucket the app should create/access
    *
    * @return A working KiiBucket object
    *
    * @example
    *         Kii.authenticateAsThing("vendorThingID", "password", {
    *             success: function(thingAuthContext) {
    *                 var bucket = thingAuthContext.encryptedBucketWithName("myAppBucket");
    *             },
    *             failure: function(errorString, errorCode) {
    *                 // auth failed.
    *             }
    *         });
    */
  def encryptedBucketWithName(bucketName: java.lang.String): KiiBucket = js.native
  /**
    * Gets authenticated KiiThing instance.
    * <br>Returned thing instance only have thingID, vendorThingID and accessToken.
    * (vendorThingID is not included when you used
    * {@link Kii.authenticateAsThingWithToken()} to obtain KiiThingContext.)
    * <br>Please execute {@link KiiThing#refresh()} to obtain other properties.
    *
    * @return return authenticated KiiThing instance.
    */
  def getAuthenticatedThing(): KiiThing = js.native
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
    *     // Assume you already have thingAuthContext instance.
    *     thingAuthContext.listTopics({
    *         success: function(topicList, nextPaginationKey) {
    *             // do something with the result
    *             for(var i=0; i&lt;topicList.length; i++){
    *                 var topic = topicList[i];
    *             }
    *             if (nextPaginationKey != null) {
    *                 thingAuthContext.listTopics({
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
    *     // Assume you already have thingAuthContext instance.
    *     thingAuthContext.listTopics().then(
    *         function(params) {
    *             var topicList = params[0];
    *             var nextPaginationKey = params[1];
    *             // do something with the result
    *             for(var i=0; i&lt;topicList.length; i++){
    *                 var topic = topicList[i];
    *             }
    *             if (nextPaginationKey != null) {
    *                 thingAuthContext.listTopics(null, nextPaginationKey).then(
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
  def listTopics(callbacks: kiiDashCloudDashSdkLib.Anon_AnErrorString): js.Promise[js.Tuple2[js.Array[KiiTopic], java.lang.String]] = js.native
  def listTopics(callbacks: kiiDashCloudDashSdkLib.Anon_AnErrorString, paginationKey: java.lang.String): js.Promise[js.Tuple2[js.Array[KiiTopic], java.lang.String]] = js.native
  /**
    * Creates a reference to an object operated by thing using object`s URI.
    *
    * @param object URI.
    *
    * @return A working KiiObject instance
    *
    * @throws If the URI is null, empty or does not have correct format.
    */
  def objectWithURI(`object`: java.lang.String): KiiObject = js.native
  /**
    * Instantiate push installation for this thing.
    *
    * @return push installation object.
    */
  def pushInstallation(): KiiPushInstallation = js.native
  /**
    * Creates a reference to a topic in App scope operated by thing.
    * <br><br>The Topic will be created/accessed within this app's scope
    *
    * @param topicName name of the topic. Must be a not empty string.
    *
    * @return topic instance.
    */
  def topicWithName(topicName: java.lang.String): KiiTopic = js.native
}

