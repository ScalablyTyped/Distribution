package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsNotificationchannelsSendverificationcode
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The notification channel to which to send a verification code.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSendNotificationChannelVerificationCodeRequest] = js.undefined
}
object ParamsResourceProjectsNotificationchannelsSendverificationcode {
  
  inline def apply(): ParamsResourceProjectsNotificationchannelsSendverificationcode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsNotificationchannelsSendverificationcode]
  }
  
  extension [Self <: ParamsResourceProjectsNotificationchannelsSendverificationcode](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaSendNotificationChannelVerificationCodeRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
