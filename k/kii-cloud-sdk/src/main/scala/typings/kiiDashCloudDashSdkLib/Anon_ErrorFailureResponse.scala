package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailureResponse extends js.Object {
  def failure(error: stdLib.Error): js.Any
  def success(response: kiiDashCloudDashSdkLib.KiiCloudNs.KiiGcmInstallationResponse): js.Any
}

object Anon_ErrorFailureResponse {
  @scala.inline
  def apply(
    failure: stdLib.Error => js.Any,
    success: kiiDashCloudDashSdkLib.KiiCloudNs.KiiGcmInstallationResponse => js.Any
  ): Anon_ErrorFailureResponse = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_ErrorFailureResponse]
  }
}

