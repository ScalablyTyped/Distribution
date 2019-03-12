package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailureResponseSuccess extends js.Object {
  def failure(error: stdLib.Error): js.Any
  def success(response: kiiDashCloudDashSdkLib.KiiCloudNs.KiiMqttInstallationResponse): js.Any
}

object Anon_ErrorFailureResponseSuccess {
  @scala.inline
  def apply(
    failure: stdLib.Error => js.Any,
    success: kiiDashCloudDashSdkLib.KiiCloudNs.KiiMqttInstallationResponse => js.Any
  ): Anon_ErrorFailureResponseSuccess = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_ErrorFailureResponseSuccess]
  }
}

