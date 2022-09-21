package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdvertisersInsertionordersPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Output only. The unique ID of the advertiser the insertion order belongs to.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The unique ID of the insertion order. Assigned by the system.
    */
  var insertionOrderId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaInsertionOrder] = js.undefined
  
  /**
    * Required. The mask to control which fields to update.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdvertisersInsertionordersPatch {
  
  inline def apply(): ParamsResourceAdvertisersInsertionordersPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdvertisersInsertionordersPatch]
  }
  
  extension [Self <: ParamsResourceAdvertisersInsertionordersPatch](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setInsertionOrderId(value: String): Self = StObject.set(x, "insertionOrderId", value.asInstanceOf[js.Any])
    
    inline def setInsertionOrderIdUndefined: Self = StObject.set(x, "insertionOrderId", js.undefined)
    
    inline def setRequestBody(value: SchemaInsertionOrder): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
