package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdvertisersManualtriggersDeactivate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the advertiser that the manual trigger belongs.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDeactivateManualTriggerRequest] = js.undefined
  
  /**
    * Required. The ID of the manual trigger to deactivate.
    */
  var triggerId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdvertisersManualtriggersDeactivate {
  
  inline def apply(): ParamsResourceAdvertisersManualtriggersDeactivate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdvertisersManualtriggersDeactivate]
  }
  
  extension [Self <: ParamsResourceAdvertisersManualtriggersDeactivate](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setRequestBody(value: SchemaDeactivateManualTriggerRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setTriggerId(value: String): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    inline def setTriggerIdUndefined: Self = StObject.set(x, "triggerId", js.undefined)
  }
}
