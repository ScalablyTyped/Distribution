package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloud.KiiPushSubscription
import typings.kiiDashCloudDashSdk.KiiCloud.KiiTopic
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailureIsSubscribedSubscription extends js.Object {
  def failure(error: Error): js.Any
  def success(subscription: KiiPushSubscription, topic: KiiTopic, isSubscribed: Boolean): js.Any
}

object Anon_ErrorFailureIsSubscribedSubscription {
  @scala.inline
  def apply(failure: Error => js.Any, success: (KiiPushSubscription, KiiTopic, Boolean) => js.Any): Anon_ErrorFailureIsSubscribedSubscription = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction3(success))
  
    __obj.asInstanceOf[Anon_ErrorFailureIsSubscribedSubscription]
  }
}

