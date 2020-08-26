package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The GetNotificationChannelVerificationCode request.
  */
@js.native
trait SchemaGetNotificationChannelVerificationCodeResponse extends js.Object {
  /**
    * The verification code, which may be used to verify other channels that
    * have an equivalent identity (i.e. other channels of the same type with
    * the same fingerprint such as other email channels with the same email
    * address or other sms channels with the same number).
    */
  var code: js.UndefOr[String] = js.native
  /**
    * The expiration time associated with the code that was returned. If an
    * expiration was provided in the request, this is the minimum of the
    * requested expiration in the request and the max permitted expiration.
    */
  var expireTime: js.UndefOr[String] = js.native
}

object SchemaGetNotificationChannelVerificationCodeResponse {
  @scala.inline
  def apply(): SchemaGetNotificationChannelVerificationCodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetNotificationChannelVerificationCodeResponse]
  }
  @scala.inline
  implicit class SchemaGetNotificationChannelVerificationCodeResponseOps[Self <: SchemaGetNotificationChannelVerificationCodeResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setExpireTime(value: String): Self = this.set("expireTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpireTime: Self = this.set("expireTime", js.undefined)
  }
  
}

