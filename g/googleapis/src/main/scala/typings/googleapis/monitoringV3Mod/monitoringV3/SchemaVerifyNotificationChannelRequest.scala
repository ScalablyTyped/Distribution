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
  def apply(): SchemaVerifyNotificationChannelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVerifyNotificationChannelRequest]
  }
  @scala.inline
  implicit class SchemaVerifyNotificationChannelRequestOps[Self <: SchemaVerifyNotificationChannelRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
  }
  
}

