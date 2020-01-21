package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiTopic
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorFailureSuccessTopic extends js.Object {
  def failure(error: Error): js.Any
  def success(topic: KiiTopic): js.Any
}

object AnonErrorFailureSuccessTopic {
  @scala.inline
  def apply(failure: Error => js.Any, success: KiiTopic => js.Any): AnonErrorFailureSuccessTopic = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[AnonErrorFailureSuccessTopic]
  }
}

