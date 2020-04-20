package typings.instagramPrivateApi.uploadVideoOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadRetryContext extends js.Object {
  var num_reupload: Double
  var num_step_auto_retry: Double
  var num_step_manual_retry: Double
}

object UploadRetryContext {
  @scala.inline
  def apply(num_reupload: Double, num_step_auto_retry: Double, num_step_manual_retry: Double): UploadRetryContext = {
    val __obj = js.Dynamic.literal(num_reupload = num_reupload.asInstanceOf[js.Any], num_step_auto_retry = num_step_auto_retry.asInstanceOf[js.Any], num_step_manual_retry = num_step_manual_retry.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadRetryContext]
  }
}

