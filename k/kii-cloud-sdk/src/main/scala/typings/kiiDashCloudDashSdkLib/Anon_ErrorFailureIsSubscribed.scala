package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailureIsSubscribed extends js.Object {
  def failure(error: stdLib.Error): js.Any
  def success(
    subscription: kiiDashCloudDashSdkLib.KiiCloudNs.KiiPushSubscription,
    topic: kiiDashCloudDashSdkLib.KiiCloudNs.KiiBucket,
    isSubscribed: scala.Boolean
  ): js.Any
}

object Anon_ErrorFailureIsSubscribed {
  @scala.inline
  def apply(
    failure: stdLib.Error => js.Any,
    success: (kiiDashCloudDashSdkLib.KiiCloudNs.KiiPushSubscription, kiiDashCloudDashSdkLib.KiiCloudNs.KiiBucket, scala.Boolean) => js.Any
  ): Anon_ErrorFailureIsSubscribed = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction3(success))
  
    __obj.asInstanceOf[Anon_ErrorFailureIsSubscribed]
  }
}

