package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiBucket
import typings.kiiCloudSdk.KiiCloud.KiiPushSubscription
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon24 extends js.Object {
  def failure(error: Error): js.Any
  def success(subscription: KiiPushSubscription, topic: KiiBucket, isSubscribed: Boolean): js.Any
}

object Anon24 {
  @scala.inline
  def apply(failure: Error => js.Any, success: (KiiPushSubscription, KiiBucket, Boolean) => js.Any): Anon24 = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction3(success))
    __obj.asInstanceOf[Anon24]
  }
}

