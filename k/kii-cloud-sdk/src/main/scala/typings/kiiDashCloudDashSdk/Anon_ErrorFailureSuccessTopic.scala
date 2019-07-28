package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloudNs.KiiTopic
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailureSuccessTopic extends js.Object {
  def failure(error: Error): js.Any
  def success(topic: KiiTopic): js.Any
}

object Anon_ErrorFailureSuccessTopic {
  @scala.inline
  def apply(failure: Error => js.Any, success: KiiTopic => js.Any): Anon_ErrorFailureSuccessTopic = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_ErrorFailureSuccessTopic]
  }
}

