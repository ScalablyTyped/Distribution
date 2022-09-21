package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceGuaranteedordersGet
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the advertiser that has access to the guaranteed order.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the guaranteed order to fetch. The ID is of the format `{exchange\}-{legacy_guaranteed_order_id\}`
    */
  var guaranteedOrderId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the partner that has access to the guaranteed order.
    */
  var partnerId: js.UndefOr[String] = js.undefined
}
object ParamsResourceGuaranteedordersGet {
  
  inline def apply(): ParamsResourceGuaranteedordersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGuaranteedordersGet]
  }
  
  extension [Self <: ParamsResourceGuaranteedordersGet](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setGuaranteedOrderId(value: String): Self = StObject.set(x, "guaranteedOrderId", value.asInstanceOf[js.Any])
    
    inline def setGuaranteedOrderIdUndefined: Self = StObject.set(x, "guaranteedOrderId", js.undefined)
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
  }
}
