package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrdersSetLineItemMetadataRequest extends StObject {
  
  var annotations: js.UndefOr[js.Array[SchemaOrderMerchantProvidedAnnotation]] = js.undefined
  
  /**
    * The ID of the line item to set metadata. Either lineItemId or productId is required.
    */
  var lineItemId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the operation. Unique across all operations for a given order.
    */
  var operationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the product to set metadata. This is the REST ID used in the products service. Either lineItemId or productId is required.
    */
  var productId: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrdersSetLineItemMetadataRequest {
  
  inline def apply(): SchemaOrdersSetLineItemMetadataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersSetLineItemMetadataRequest]
  }
  
  extension [Self <: SchemaOrdersSetLineItemMetadataRequest](x: Self) {
    
    inline def setAnnotations(value: js.Array[SchemaOrderMerchantProvidedAnnotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(value: SchemaOrderMerchantProvidedAnnotation*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setLineItemId(value: String): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
    
    inline def setLineItemIdNull: Self = StObject.set(x, "lineItemId", null)
    
    inline def setLineItemIdUndefined: Self = StObject.set(x, "lineItemId", js.undefined)
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdNull: Self = StObject.set(x, "operationId", null)
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdNull: Self = StObject.set(x, "productId", null)
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
