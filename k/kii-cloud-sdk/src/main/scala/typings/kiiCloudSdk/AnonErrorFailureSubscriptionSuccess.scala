package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiPushSubscription
import typings.kiiCloudSdk.KiiCloud.KiiTopic
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorFailureSubscriptionSuccess extends js.Object {
  def failure(error: Error): js.Any
  def success(subscription: KiiPushSubscription, topic: KiiTopic): js.Any
}

object AnonErrorFailureSubscriptionSuccess {
  @scala.inline
  def apply(failure: Error => js.Any, success: (KiiPushSubscription, KiiTopic) => js.Any): AnonErrorFailureSubscriptionSuccess = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[AnonErrorFailureSubscriptionSuccess]
  }
}

