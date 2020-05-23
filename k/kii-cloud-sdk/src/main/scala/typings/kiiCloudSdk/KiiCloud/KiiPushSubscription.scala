package typings.kiiCloudSdk.KiiCloud

import typings.kiiCloudSdk.anon.`20`
import typings.kiiCloudSdk.anon.`21`
import typings.kiiCloudSdk.anon.`22`
import typings.kiiCloudSdk.anon.`23`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a KiiPushSubscription.
  */
@js.native
trait KiiPushSubscription extends js.Object {
  /**
    * Check subscription of bucket, topic.
    *
    * @param target to check subscription. KiiBucket or KiiTopic instance.
    * @param callbacks object contains callback functions.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(params). params is an Array instance.
    *       <ul>
    *         <li>params[0] is a KiiPushSubscription instance.</li>
    *         <li>params[1] is the KiiTopic instance to subscribe.</li>
    *         <li>params[2] is Boolean value. true if subscirbed, otherwise false.</li>
    *       </ul>
    *     </li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is a KiiPushSubscription instance.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var topic = Kii.topicWithName("myAppTopic");
    *     var user = KiiUser.getCurrentUser();
    *     user.pushSubscription().isSubscribed(topic, {
    *         success: function(subscription, topic, isSubscribed) {
    *             // Succeeded.
    *             if (isSubscribed) {
    *                 // The topic is subscribed by current user.
    *             } else {
    *                 // The topic is not subscribed by current user.
    *             }
    *         },
    *         failure: function(error) {
    *             // Handle error.
    *         }
    *     });
    *
    *     // example to use Promise
    *     var topic = Kii.topicWithName("myAppTopic");
    *     var user = KiiUser.getCurrentUser();
    *     user.pushSubscription().isSubscribed(topic).then(
    *         function(params) {
    *             // Succeeded.
    *             var subscription = params[0];
    *             var topic = params[1];
    *             var isSubscribed = params[2];
    *             if (isSubscribed) {
    *                 // The topic is subscribed by current user.
    *             } else {
    *                 // The topic is not subscribed by current user.
    *             }
    *         },
    *         function(error) {
    *             // Handle error.
    *         }
    *     );
    */
  def isSubscribed(target: KiiBucket): js.Promise[js.Tuple3[KiiPushSubscription, KiiBucket, Boolean]] = js.native
  def isSubscribed(target: KiiBucket, callbacks: `22`): js.Promise[js.Tuple3[KiiPushSubscription, KiiBucket, Boolean]] = js.native
  def isSubscribed(target: KiiTopic): js.Promise[js.Tuple3[KiiPushSubscription, KiiTopic, Boolean]] = js.native
  def isSubscribed(target: KiiTopic, callbacks: `23`): js.Promise[js.Tuple3[KiiPushSubscription, KiiTopic, Boolean]] = js.native
  /**
    * Subscribe to bucket or topic.
    *
    * @param target to be subscribed. KiiBucket or KiiTopic instance.
    * @param callbacks object contains callback functions.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(params). params is an Array instance.
    *       <ul>
    *         <li>params[0] is a KiiPushSubscription instance.</li>
    *         <li>params[1] is the KiiTopic instance to subscribe.</li>
    *       </ul>
    *     </li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is a KiiPushSubscription instance.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var topic = Kii.topicWithName("myAppTopic");
    *     var user = KiiUser.getCurrentUser();
    *     user.pushSubscription().subscribe(topic, {
    *         success: function(subscription, topic) {
    *             // Succeeded.
    *         },
    *         failure: function(error) {
    *             // Handle error.
    *         }
    *     });
    *
    *     // example to use Promise
    *     var topic = Kii.topicWithName("myAppTopic");
    *     var user = KiiUser.getCurrentUser();
    *     user.pushSubscription().subscribe(topic).then(
    *         function(params) {
    *             var subscription = params[0];
    *             var topic = params[1];
    *             // Succeeded.
    *         },
    *         function(error) {
    *             // Handle error.
    *         }
    *     );
    */
  def subscribe(target: KiiBucket): js.Promise[js.Tuple2[KiiPushSubscription, KiiBucket]] = js.native
  def subscribe(target: KiiBucket, callbacks: `20`): js.Promise[js.Tuple2[KiiPushSubscription, KiiBucket]] = js.native
  def subscribe(target: KiiTopic): js.Promise[js.Tuple2[KiiPushSubscription, KiiTopic]] = js.native
  def subscribe(target: KiiTopic, callbacks: `21`): js.Promise[js.Tuple2[KiiPushSubscription, KiiTopic]] = js.native
  /**
    * Unsubscribe to bucket or topic.
    *
    * @param target to be unsubscribed. KiiBucket or KiiTopic instance.
    * @param callbacks object contains callback functions.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(params). params is an Array instance.
    *       <ul>
    *         <li>params[0] is a KiiPushSubscription instance.</li>
    *         <li>params[1] is the KiiTopic instance to unsubscribe.</li>
    *       </ul>
    *     </li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is a KiiPushSubscription instance.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var topic = Kii.topicWithName("myAppTopic");
    *     var user = KiiUser.getCurrentUser();
    *     user.pushSubscription().unsubscribe(topic, {
    *         success: function(subscription, topic) {
    *             // Succeeded.
    *         },
    *         failure: function(error) {
    *             // Handle error.
    *         }
    *     });
    *
    *     // example to use Promise
    *     var topic = Kii.topicWithName("myAppTopic");
    *     var user = KiiUser.getCurrentUser();
    *     user.pushSubscription().unsubscribe(topic).then(
    *         function(params) {
    *             var subscription = params[0];
    *             var topic = params[1];
    *             // Succeeded.
    *         },
    *         function(error) {
    *             // Handle error.
    *         }
    *     );
    */
  def unsubscribe(target: KiiBucket): js.Promise[js.Tuple2[KiiPushSubscription, KiiBucket]] = js.native
  def unsubscribe(target: KiiBucket, callbacks: `20`): js.Promise[js.Tuple2[KiiPushSubscription, KiiBucket]] = js.native
  def unsubscribe(target: KiiTopic): js.Promise[js.Tuple2[KiiPushSubscription, KiiTopic]] = js.native
  def unsubscribe(target: KiiTopic, callbacks: `21`): js.Promise[js.Tuple2[KiiPushSubscription, KiiTopic]] = js.native
}

