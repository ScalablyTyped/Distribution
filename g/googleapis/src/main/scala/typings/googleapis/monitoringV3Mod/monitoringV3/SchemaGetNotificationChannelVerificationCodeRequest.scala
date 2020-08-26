package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The GetNotificationChannelVerificationCode request.
  */
@js.native
trait SchemaGetNotificationChannelVerificationCodeRequest extends js.Object {
  /**
    * The desired expiration time. If specified, the API will guarantee that
    * the returned code will not be valid after the specified timestamp;
    * however, the API cannot guarantee that the returned code will be valid
    * for at least as long as the requested time (the API puts an upper bound
    * on the amount of time for which a code may be valid). If omitted, a
    * default expiration will be used, which may be less than the max
    * permissible expiration (so specifying an expiration may extend the
    * code&#39;s lifetime over omitting an expiration, even though the API does
    * impose an upper limit on the maximum expiration that is permitted).
    */
  var expireTime: js.UndefOr[String] = js.native
}

object SchemaGetNotificationChannelVerificationCodeRequest {
  @scala.inline
  def apply(): SchemaGetNotificationChannelVerificationCodeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetNotificationChannelVerificationCodeRequest]
  }
  @scala.inline
  implicit class SchemaGetNotificationChannelVerificationCodeRequestOps[Self <: SchemaGetNotificationChannelVerificationCodeRequest] (val x: Self) extends AnyVal {
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
    def setExpireTime(value: String): Self = this.set("expireTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpireTime: Self = this.set("expireTime", js.undefined)
  }
  
}

