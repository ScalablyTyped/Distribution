package typings.kiiCloudSdk.KiiCloud

import typings.kiiCloudSdk.AnonErrorExisted
import typings.kiiCloudSdk.AnonErrorFailureMessage
import typings.kiiCloudSdk.AnonErrorFailureSuccessTopic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Topic object.
  */
@JSGlobal("KiiCloud.KiiTopic")
@js.native
class KiiTopic () extends js.Object {
  /**
    * Get ACL object of this topic.
    * Access to topic can be configured by adding/removing KiiACLEntry
    * to/from obtained acl object.
    *
    * @return acl object of this topic.
    */
  def acl(): KiiACL = js.native
  /**
    * Delete the topic.
    *
    * @param callbacks callback functions.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(theDeletedTopic). theDeletedTopic is a KiiTopic instance.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiTopic instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     // assume topic is already instantiated.
    *     topic.deleteTopic({
    *         success: function(topic) {
    *             // Delete topic succeeded.
    *         },
    *         failure: function(error) {
    *             // Handle error.
    *         }
    *     });
    *
    *     // example to use Promise
    *     // assume topic is already instantiated.
    *     topic.deleteTopic().then(
    *         function(topic) {
    *             // Delete topic succeeded.
    *         },
    *         function(error) {
    *             // Handle error.
    *         }
    *     );
    */
  def deleteTopic(): js.Promise[KiiTopic] = js.native
  def deleteTopic(callbacks: AnonErrorFailureSuccessTopic): js.Promise[KiiTopic] = js.native
  /**
    * Checks whether the topic already exists or not.
    *
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(existed). true if the topic exists.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiTopic instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     // assume topic is already instantiated.
    *     topic.exists({
    *         success: function(existed) {
    *         },
    *         failure: function(error) {
    *             // Handle error.
    *         }
    *     });
    *
    *     // example to use Promise
    *     // assume topic is already instantiated.
    *     topic.exists().then(
    *         function(existed){
    *         },
    *         function(error){
    *             // Handle error.
    *         });
    */
  def exists(): js.Promise[Boolean] = js.native
  def exists(callbacks: AnonErrorExisted): js.Promise[Boolean] = js.native
  /**
    * get name of this topic
    *
    * @return name of this topic.
    */
  def getName(): String = js.native
  /**
    * Save this topic on Kii Cloud.
    * Note that only app admin can save application scope topic.
    *
    * @param callbacks callback functions.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(theSavedTopic). theSavedTopic is a KiiTopic instance.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiTopic instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     // assume topic is already instantiated.
    *     topic.save({
    *         success: function(topic) {
    *             // Save topic succeeded.
    *         },
    *         failure: function(error) {
    *             // Handle error.
    *         }
    *     });
    *
    *     // example to use Promise
    *     // assume topic is already instantiated.
    *     topic.save().then(
    *         function(topic) {
    *             // Save topic succeeded.
    *         },
    *         function(error) {
    *             // Handle error.
    *         }
    *     );
    */
  def save(): js.Promise[KiiTopic] = js.native
  def save(callbacks: AnonErrorFailureSuccessTopic): js.Promise[KiiTopic] = js.native
  /**
    * Send message to the topic.
    *
    * @param message to be sent.
    * @param callbacks callback functions.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(params). params is an Array instance.
    *       <ul>
    *         <li>params[0] is the KiiTopic instance which this method was called on.</li>
    *         <li>params[1] is the message object to send.</li>
    *       </ul>
    *     </li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiTopic instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     // assume topic is already instantiated.
    *     var contents = {
    *         message : "hello push!"
    *     };
    *     var message = new KiiPushMessageBuilder(contents).build();
    *     topic.sendMessage(message, {
    *         success: function(topic, message) {
    *             // Send message succeeded.
    *         },
    *         failure: function(error) {
    *             // Handle error.
    *         }
    *     });
    *
    *     // example to use Promise
    *     // assume topic is already instantiated.
    *     var contents = {
    *         message : "hello push!"
    *     };
    *     var message = new KiiPushMessageBuilder(contents).build();
    *     topic.sendMessage(message).then(
    *         function(params) {
    *             // Send message succeeded.
    *         },
    *         function(error) {
    *             // Handle error.
    *         }
    *     );
    */
  def sendMessage[T](message: T): js.Promise[js.Tuple2[KiiTopic, T]] = js.native
  def sendMessage[T](message: T, callbacks: AnonErrorFailureMessage[T]): js.Promise[js.Tuple2[KiiTopic, T]] = js.native
}

