package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrdersCustomBatchRequestEntryUpdateLineItemShippingDetails extends StObject {
  
  /**
    * Updated delivery by date, in ISO 8601 format. If not specified only ship by date is updated. Provided date should be within 1 year timeframe and can not be a date in the past.
    */
  var deliverByDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the line item to set metadata. Either lineItemId or productId is required.
    */
  var lineItemId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the product to set metadata. This is the REST ID used in the products service. Either lineItemId or productId is required.
    */
  var productId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Updated ship by date, in ISO 8601 format. If not specified only deliver by date is updated. Provided date should be within 1 year timeframe and can not be a date in the past.
    */
  var shipByDate: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrdersCustomBatchRequestEntryUpdateLineItemShippingDetails {
  
  inline def apply(): SchemaOrdersCustomBatchRequestEntryUpdateLineItemShippingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCustomBatchRequestEntryUpdateLineItemShippingDetails]
  }
  
  extension [Self <: SchemaOrdersCustomBatchRequestEntryUpdateLineItemShippingDetails](x: Self) {
    
    inline def setDeliverByDate(value: String): Self = StObject.set(x, "deliverByDate", value.asInstanceOf[js.Any])
    
    inline def setDeliverByDateNull: Self = StObject.set(x, "deliverByDate", null)
    
    inline def setDeliverByDateUndefined: Self = StObject.set(x, "deliverByDate", js.undefined)
    
    inline def setLineItemId(value: String): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
    
    inline def setLineItemIdNull: Self = StObject.set(x, "lineItemId", null)
    
    inline def setLineItemIdUndefined: Self = StObject.set(x, "lineItemId", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdNull: Self = StObject.set(x, "productId", null)
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setShipByDate(value: String): Self = StObject.set(x, "shipByDate", value.asInstanceOf[js.Any])
    
    inline def setShipByDateNull: Self = StObject.set(x, "shipByDate", null)
    
    inline def setShipByDateUndefined: Self = StObject.set(x, "shipByDate", js.undefined)
  }
}
