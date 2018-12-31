package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FailureErrorSuccessSubscriptionTopic[T /* <: kiiDashCloudDashSdkLib.KiiCloudNs.KiiBucket | kiiDashCloudDashSdkLib.KiiCloudNs.KiiTopic */] extends js.Object {
  def failure(error: stdLib.Error): js.Any
  def success(subscription: kiiDashCloudDashSdkLib.KiiCloudNs.KiiPushSubscription, topic: T): js.Any
}

