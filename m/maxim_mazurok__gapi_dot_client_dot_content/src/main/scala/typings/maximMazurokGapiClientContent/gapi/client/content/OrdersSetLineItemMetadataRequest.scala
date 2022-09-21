package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrdersSetLineItemMetadataRequest extends StObject {
  
  var annotations: js.UndefOr[js.Array[OrderMerchantProvidedAnnotation]] = js.undefined
  
  /** The ID of the line item to set metadata. Either lineItemId or productId is required. */
  var lineItemId: js.UndefOr[String] = js.undefined
  
  /** The ID of the operation. Unique across all operations for a given order. */
  var operationId: js.UndefOr[String] = js.undefined
  
  /** The ID of the product to set metadata. This is the REST ID used in the products service. Either lineItemId or productId is required. */
  var productId: js.UndefOr[String] = js.undefined
}
object OrdersSetLineItemMetadataRequest {
  
  inline def apply(): OrdersSetLineItemMetadataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersSetLineItemMetadataRequest]
  }
  
  extension [Self <: OrdersSetLineItemMetadataRequest](x: Self) {
    
    inline def setAnnotations(value: js.Array[OrderMerchantProvidedAnnotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(value: OrderMerchantProvidedAnnotation*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setLineItemId(value: String): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
    
    inline def setLineItemIdUndefined: Self = StObject.set(x, "lineItemId", js.undefined)
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
