package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceGuaranteedordersPatch
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the advertiser that the request is being made within.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The unique identifier of the guaranteed order. The guaranteed order IDs have the format `{exchange\}-{legacy_guaranteed_order_id\}`.
    */
  var guaranteedOrderId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the partner that the request is being made within.
    */
  var partnerId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGuaranteedOrder] = js.undefined
  
  /**
    * Required. The mask to control which fields to update.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceGuaranteedordersPatch {
  
  inline def apply(): ParamsResourceGuaranteedordersPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGuaranteedordersPatch]
  }
  
  extension [Self <: ParamsResourceGuaranteedordersPatch](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setGuaranteedOrderId(value: String): Self = StObject.set(x, "guaranteedOrderId", value.asInstanceOf[js.Any])
    
    inline def setGuaranteedOrderIdUndefined: Self = StObject.set(x, "guaranteedOrderId", js.undefined)
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
    
    inline def setRequestBody(value: SchemaGuaranteedOrder): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
