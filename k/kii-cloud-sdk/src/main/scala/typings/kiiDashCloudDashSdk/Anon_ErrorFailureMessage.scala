package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloudNs.KiiTopic
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailureMessage[T] extends js.Object {
  def failure(error: Error): js.Any
  def success(topic: KiiTopic, message: T): js.Any
}

object Anon_ErrorFailureMessage {
  @scala.inline
  def apply[T](failure: Error => js.Any, success: (KiiTopic, T) => js.Any): Anon_ErrorFailureMessage[T] = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[Anon_ErrorFailureMessage[T]]
  }
}

