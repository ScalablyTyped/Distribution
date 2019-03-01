package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailureIsSubscribed[T /* <: kiiDashCloudDashSdkLib.KiiCloudNs.KiiBucket | kiiDashCloudDashSdkLib.KiiCloudNs.KiiTopic */] extends js.Object {
  def failure(error: stdLib.Error): js.Any
  def success(
    subscription: kiiDashCloudDashSdkLib.KiiCloudNs.KiiPushSubscription,
    topic: T,
    isSubscribed: scala.Boolean
  ): js.Any
}

object Anon_ErrorFailureIsSubscribed {
  @scala.inline
  def apply[T /* <: kiiDashCloudDashSdkLib.KiiCloudNs.KiiBucket | kiiDashCloudDashSdkLib.KiiCloudNs.KiiTopic */](
    failure: js.Function1[stdLib.Error, js.Any],
    success: js.Function3[kiiDashCloudDashSdkLib.KiiCloudNs.KiiPushSubscription, T, scala.Boolean, js.Any]
  ): Anon_ErrorFailureIsSubscribed[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(failure)
    __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_ErrorFailureIsSubscribed[T]]
  }
}

