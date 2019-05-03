package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailureSubscription extends js.Object {
  def failure(error: stdLib.Error): js.Any
  def success(
    subscription: kiiDashCloudDashSdkLib.KiiCloudNs.KiiPushSubscription,
    topic: kiiDashCloudDashSdkLib.KiiCloudNs.KiiBucket
  ): js.Any
}

object Anon_ErrorFailureSubscription {
  @scala.inline
  def apply(
    failure: stdLib.Error => js.Any,
    success: (kiiDashCloudDashSdkLib.KiiCloudNs.KiiPushSubscription, kiiDashCloudDashSdkLib.KiiCloudNs.KiiBucket) => js.Any
  ): Anon_ErrorFailureSubscription = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[Anon_ErrorFailureSubscription]
  }
}

