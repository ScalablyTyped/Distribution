package typings
package kiiDashCloudDashSdkLib.KiiCloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a KiiPushSubscription.
  */
@JSGlobal("KiiCloud.KiiPushSubscription")
@js.native
class KiiPushSubscription () extends js.Object {
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
  def isSubscribed[T /* <: KiiBucket | KiiTopic */](target: T): js.Promise[js.Tuple3[KiiPushSubscription, T, scala.Boolean]] = js.native
  def isSubscribed[T /* <: KiiBucket | KiiTopic */](target: T, callbacks: kiiDashCloudDashSdkLib.Anon_FailureErrorSuccessSubscription[T]): js.Promise[js.Tuple3[KiiPushSubscription, T, scala.Boolean]] = js.native
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
  def subscribe[T /* <: KiiBucket | KiiTopic */](target: T): js.Promise[js.Tuple2[KiiPushSubscription, T]] = js.native
  def subscribe[T /* <: KiiBucket | KiiTopic */](target: T, callbacks: kiiDashCloudDashSdkLib.Anon_FailureErrorSuccessSubscriptionTopic[T]): js.Promise[js.Tuple2[KiiPushSubscription, T]] = js.native
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
  def unsubscribe[T /* <: KiiBucket | KiiTopic */](target: T): js.Promise[js.Tuple2[KiiPushSubscription, T]] = js.native
  def unsubscribe[T /* <: KiiBucket | KiiTopic */](target: T, callbacks: kiiDashCloudDashSdkLib.Anon_FailureErrorSuccessSubscriptionTopic[T]): js.Promise[js.Tuple2[KiiPushSubscription, T]] = js.native
}

