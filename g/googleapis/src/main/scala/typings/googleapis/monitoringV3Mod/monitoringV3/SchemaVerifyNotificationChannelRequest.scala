package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The VerifyNotificationChannel request.
  */
trait SchemaVerifyNotificationChannelRequest extends StObject {
  
  /**
    * The verification code that was delivered to the channel as a result of
    * invoking the SendNotificationChannelVerificationCode API method or that
    * was retrieved from a verified channel via
    * GetNotificationChannelVerificationCode. For example, one might have
    * &quot;G-123456&quot; or &quot;TKNZGhhd2EyN3I1MnRnMjRv&quot; (in general,
    * one is only guaranteed that the code is valid UTF-8; one should not make
    * any assumptions regarding the structure or format of the code).
    */
  var code: js.UndefOr[String] = js.undefined
}
object SchemaVerifyNotificationChannelRequest {
  
  @scala.inline
  def apply(): SchemaVerifyNotificationChannelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVerifyNotificationChannelRequest]
  }
  
  @scala.inline
  implicit class SchemaVerifyNotificationChannelRequestMutableBuilder[Self <: SchemaVerifyNotificationChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
  }
}
