package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdvertisersManualtriggersActivate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the advertiser that the manual trigger belongs.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaActivateManualTriggerRequest] = js.undefined
  
  /**
    * Required. The ID of the manual trigger to activate.
    */
  var triggerId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdvertisersManualtriggersActivate {
  
  inline def apply(): ParamsResourceAdvertisersManualtriggersActivate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdvertisersManualtriggersActivate]
  }
  
  extension [Self <: ParamsResourceAdvertisersManualtriggersActivate](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setRequestBody(value: SchemaActivateManualTriggerRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setTriggerId(value: String): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    inline def setTriggerIdUndefined: Self = StObject.set(x, "triggerId", js.undefined)
  }
}
