package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The GetNotificationChannelVerificationCode request.
  */
trait SchemaGetNotificationChannelVerificationCodeRequest extends StObject {
  
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
  var expireTime: js.UndefOr[String] = js.undefined
}
object SchemaGetNotificationChannelVerificationCodeRequest {
  
  inline def apply(): SchemaGetNotificationChannelVerificationCodeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetNotificationChannelVerificationCodeRequest]
  }
  
  extension [Self <: SchemaGetNotificationChannelVerificationCodeRequest](x: Self) {
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
  }
}
