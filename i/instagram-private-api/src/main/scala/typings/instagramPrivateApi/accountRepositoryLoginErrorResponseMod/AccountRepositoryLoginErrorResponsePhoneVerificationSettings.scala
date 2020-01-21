package typings.instagramPrivateApi.accountRepositoryLoginErrorResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountRepositoryLoginErrorResponsePhoneVerificationSettings extends js.Object {
  var max_sms_count: Double
  var resend_sms_delay_sec: Double
  var robocall_after_max_sms: Boolean
  var robocall_count_down_time_sec: Double
}

object AccountRepositoryLoginErrorResponsePhoneVerificationSettings {
  @scala.inline
  def apply(
    max_sms_count: Double,
    resend_sms_delay_sec: Double,
    robocall_after_max_sms: Boolean,
    robocall_count_down_time_sec: Double
  ): AccountRepositoryLoginErrorResponsePhoneVerificationSettings = {
    val __obj = js.Dynamic.literal(max_sms_count = max_sms_count.asInstanceOf[js.Any], resend_sms_delay_sec = resend_sms_delay_sec.asInstanceOf[js.Any], robocall_after_max_sms = robocall_after_max_sms.asInstanceOf[js.Any], robocall_count_down_time_sec = robocall_count_down_time_sec.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AccountRepositoryLoginErrorResponsePhoneVerificationSettings]
  }
}

