package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailureSubscription[T /* <: kiiDashCloudDashSdkLib.KiiCloudNs.KiiBucket | kiiDashCloudDashSdkLib.KiiCloudNs.KiiTopic */] extends js.Object {
  def failure(error: stdLib.Error): js.Any
  def success(subscription: kiiDashCloudDashSdkLib.KiiCloudNs.KiiPushSubscription, topic: T): js.Any
}

object Anon_ErrorFailureSubscription {
  @scala.inline
  def apply[T /* <: kiiDashCloudDashSdkLib.KiiCloudNs.KiiBucket | kiiDashCloudDashSdkLib.KiiCloudNs.KiiTopic */](
    failure: stdLib.Error => js.Any,
    success: (kiiDashCloudDashSdkLib.KiiCloudNs.KiiPushSubscription, T) => js.Any
  ): Anon_ErrorFailureSubscription[T] = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[Anon_ErrorFailureSubscription[T]]
  }
}

