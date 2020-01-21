package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The VerifyNotificationChannel request.
  */
@js.native
trait SchemaVerifyNotificationChannelRequest extends js.Object {
  /**
    * The verification code that was delivered to the channel as a result of
    * invoking the SendNotificationChannelVerificationCode API method or that
    * was retrieved from a verified channel via
    * GetNotificationChannelVerificationCode. For example, one might have
    * &quot;G-123456&quot; or &quot;TKNZGhhd2EyN3I1MnRnMjRv&quot; (in general,
    * one is only guaranteed that the code is valid UTF-8; one should not make
    * any assumptions regarding the structure or format of the code).
    */
  var code: js.UndefOr[String] = js.native
}

object SchemaVerifyNotificationChannelRequest {
  @scala.inline
  def apply(code: String = null): SchemaVerifyNotificationChannelRequest = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVerifyNotificationChannelRequest]
  }
}

