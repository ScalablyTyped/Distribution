package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloudNs.KiiMqttInstallationResponse
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailureResponseSuccess extends js.Object {
  def failure(error: Error): js.Any
  def success(response: KiiMqttInstallationResponse): js.Any
}

object Anon_ErrorFailureResponseSuccess {
  @scala.inline
  def apply(failure: Error => js.Any, success: KiiMqttInstallationResponse => js.Any): Anon_ErrorFailureResponseSuccess = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_ErrorFailureResponseSuccess]
  }
}

