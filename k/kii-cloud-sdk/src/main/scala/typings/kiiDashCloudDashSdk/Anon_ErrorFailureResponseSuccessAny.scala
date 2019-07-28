package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloudNs.KiiMqttEndpoint
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailureResponseSuccessAny extends js.Object {
  def failure(error: Error): js.Any
  def success(response: KiiMqttEndpoint): js.Any
}

object Anon_ErrorFailureResponseSuccessAny {
  @scala.inline
  def apply(failure: Error => js.Any, success: KiiMqttEndpoint => js.Any): Anon_ErrorFailureResponseSuccessAny = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_ErrorFailureResponseSuccessAny]
  }
}

