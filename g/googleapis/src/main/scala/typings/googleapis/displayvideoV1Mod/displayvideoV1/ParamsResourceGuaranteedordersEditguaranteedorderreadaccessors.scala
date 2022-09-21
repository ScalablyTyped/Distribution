package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceGuaranteedordersEditguaranteedorderreadaccessors
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the guaranteed order to edit. The ID is of the format `{exchange\}-{legacy_guaranteed_order_id\}`
    */
  var guaranteedOrderId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEditGuaranteedOrderReadAccessorsRequest] = js.undefined
}
object ParamsResourceGuaranteedordersEditguaranteedorderreadaccessors {
  
  inline def apply(): ParamsResourceGuaranteedordersEditguaranteedorderreadaccessors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGuaranteedordersEditguaranteedorderreadaccessors]
  }
  
  extension [Self <: ParamsResourceGuaranteedordersEditguaranteedorderreadaccessors](x: Self) {
    
    inline def setGuaranteedOrderId(value: String): Self = StObject.set(x, "guaranteedOrderId", value.asInstanceOf[js.Any])
    
    inline def setGuaranteedOrderIdUndefined: Self = StObject.set(x, "guaranteedOrderId", js.undefined)
    
    inline def setRequestBody(value: SchemaEditGuaranteedOrderReadAccessorsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
