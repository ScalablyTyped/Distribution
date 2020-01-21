package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiMqttEndpoint
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorFailureResponseSuccessAny extends js.Object {
  def failure(error: Error): js.Any
  def success(response: KiiMqttEndpoint): js.Any
}

object AnonErrorFailureResponseSuccessAny {
  @scala.inline
  def apply(failure: Error => js.Any, success: KiiMqttEndpoint => js.Any): AnonErrorFailureResponseSuccessAny = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[AnonErrorFailureResponseSuccessAny]
  }
}

