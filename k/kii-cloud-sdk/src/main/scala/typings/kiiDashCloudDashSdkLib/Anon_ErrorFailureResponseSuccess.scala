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
    failure: js.Function1[stdLib.Error, js.Any],
    success: js.Function1[kiiDashCloudDashSdkLib.KiiCloudNs.KiiMqttInstallationResponse, js.Any]
  ): Anon_ErrorFailureResponseSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(failure)
    __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_ErrorFailureResponseSuccess]
  }
}

