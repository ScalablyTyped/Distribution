package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloud.KiiPushSubscription
import typings.kiiDashCloudDashSdk.KiiCloud.KiiTopic
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailureSubscriptionSuccess extends js.Object {
  def failure(error: Error): js.Any
  def success(subscription: KiiPushSubscription, topic: KiiTopic): js.Any
}

object Anon_ErrorFailureSubscriptionSuccess {
  @scala.inline
  def apply(failure: Error => js.Any, success: (KiiPushSubscription, KiiTopic) => js.Any): Anon_ErrorFailureSubscriptionSuccess = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[Anon_ErrorFailureSubscriptionSuccess]
  }
}

