package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiPushSubscription
import typings.kiiCloudSdk.KiiCloud.KiiTopic
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `23` extends js.Object {
  def failure(error: Error): js.Any
  def success(subscription: KiiPushSubscription, topic: KiiTopic, isSubscribed: Boolean): js.Any
}

object `23` {
  @scala.inline
  def apply(failure: Error => js.Any, success: (KiiPushSubscription, KiiTopic, Boolean) => js.Any): `23` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction3(success))
    __obj.asInstanceOf[`23`]
  }
}

