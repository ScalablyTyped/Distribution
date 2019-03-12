package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailureMessage[T] extends js.Object {
  def failure(error: stdLib.Error): js.Any
  def success(topic: kiiDashCloudDashSdkLib.KiiCloudNs.KiiTopic, message: T): js.Any
}

object Anon_ErrorFailureMessage {
  @scala.inline
  def apply[T](
    failure: stdLib.Error => js.Any,
    success: (kiiDashCloudDashSdkLib.KiiCloudNs.KiiTopic, T) => js.Any
  ): Anon_ErrorFailureMessage[T] = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[Anon_ErrorFailureMessage[T]]
  }
}

