package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiGcmInstallationResponse
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorFailureResponse extends js.Object {
  def failure(error: Error): js.Any
  def success(response: KiiGcmInstallationResponse): js.Any
}

object AnonErrorFailureResponse {
  @scala.inline
  def apply(failure: Error => js.Any, success: KiiGcmInstallationResponse => js.Any): AnonErrorFailureResponse = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[AnonErrorFailureResponse]
  }
}

