package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailureSuccessTopic extends js.Object {
  def failure(error: stdLib.Error): js.Any
  def success(topic: kiiDashCloudDashSdkLib.KiiCloudNs.KiiTopic): js.Any
}

object Anon_ErrorFailureSuccessTopic {
  @scala.inline
  def apply(
    failure: js.Function1[stdLib.Error, js.Any],
    success: js.Function1[kiiDashCloudDashSdkLib.KiiCloudNs.KiiTopic, js.Any]
  ): Anon_ErrorFailureSuccessTopic = {
    val __obj = js.Dynamic.literal(failure = failure, success = success)
  
    __obj.asInstanceOf[Anon_ErrorFailureSuccessTopic]
  }
}

