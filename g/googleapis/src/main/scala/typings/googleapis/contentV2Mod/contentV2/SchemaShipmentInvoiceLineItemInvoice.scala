package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaShipmentInvoiceLineItemInvoice extends StObject {
  
  /**
    * ID of the line item. Either lineItemId or productId must be set.
    */
  var lineItemId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of the product. This is the REST ID used in the products service. Either lineItemId or productId must be set.
    */
  var productId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [required] The shipment unit ID is assigned by the merchant and defines individual quantities within a line item. The same ID can be assigned to units that are the same while units that differ must be assigned a different ID (for example: free or promotional units).
    */
  var shipmentUnitIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * [required] Invoice details for a single unit.
    */
  var unitInvoice: js.UndefOr[SchemaUnitInvoice] = js.undefined
}
object SchemaShipmentInvoiceLineItemInvoice {
  
  inline def apply(): SchemaShipmentInvoiceLineItemInvoice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShipmentInvoiceLineItemInvoice]
  }
  
  extension [Self <: SchemaShipmentInvoiceLineItemInvoice](x: Self) {
    
    inline def setLineItemId(value: String): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
    
    inline def setLineItemIdNull: Self = StObject.set(x, "lineItemId", null)
    
    inline def setLineItemIdUndefined: Self = StObject.set(x, "lineItemId", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdNull: Self = StObject.set(x, "productId", null)
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setShipmentUnitIds(value: js.Array[String]): Self = StObject.set(x, "shipmentUnitIds", value.asInstanceOf[js.Any])
    
    inline def setShipmentUnitIdsNull: Self = StObject.set(x, "shipmentUnitIds", null)
    
    inline def setShipmentUnitIdsUndefined: Self = StObject.set(x, "shipmentUnitIds", js.undefined)
    
    inline def setShipmentUnitIdsVarargs(value: String*): Self = StObject.set(x, "shipmentUnitIds", js.Array(value*))
    
    inline def setUnitInvoice(value: SchemaUnitInvoice): Self = StObject.set(x, "unitInvoice", value.asInstanceOf[js.Any])
    
    inline def setUnitInvoiceUndefined: Self = StObject.set(x, "unitInvoice", js.undefined)
  }
}
