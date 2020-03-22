package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiBucket
import typings.kiiCloudSdk.KiiCloud.KiiPushSubscription
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon22 extends js.Object {
  def failure(error: Error): js.Any
  def success(subscription: KiiPushSubscription, topic: KiiBucket): js.Any
}

object Anon22 {
  @scala.inline
  def apply(failure: Error => js.Any, success: (KiiPushSubscription, KiiBucket) => js.Any): Anon22 = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[Anon22]
  }
}

