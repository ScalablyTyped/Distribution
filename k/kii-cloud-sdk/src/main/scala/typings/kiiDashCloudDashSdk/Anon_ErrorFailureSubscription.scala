package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloudNs.KiiBucket
import typings.kiiDashCloudDashSdk.KiiCloudNs.KiiPushSubscription
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailureSubscription extends js.Object {
  def failure(error: Error): js.Any
  def success(subscription: KiiPushSubscription, topic: KiiBucket): js.Any
}

object Anon_ErrorFailureSubscription {
  @scala.inline
  def apply(failure: Error => js.Any, success: (KiiPushSubscription, KiiBucket) => js.Any): Anon_ErrorFailureSubscription = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[Anon_ErrorFailureSubscription]
  }
}

