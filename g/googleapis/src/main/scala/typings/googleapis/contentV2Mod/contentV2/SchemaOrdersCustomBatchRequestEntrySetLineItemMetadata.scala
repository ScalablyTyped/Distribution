package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrdersCustomBatchRequestEntrySetLineItemMetadata extends StObject {
  
  var annotations: js.UndefOr[js.Array[SchemaOrderMerchantProvidedAnnotation]] = js.native
  
  /**
    * The ID of the line item to set metadata. Either lineItemId or productId
    * is required.
    */
  var lineItemId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the product to set metadata. This is the REST ID used in the
    * products service. Either lineItemId or productId is required.
    */
  var productId: js.UndefOr[String] = js.native
}
object SchemaOrdersCustomBatchRequestEntrySetLineItemMetadata {
  
  @scala.inline
  def apply(): SchemaOrdersCustomBatchRequestEntrySetLineItemMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCustomBatchRequestEntrySetLineItemMetadata]
  }
  
  @scala.inline
  implicit class SchemaOrdersCustomBatchRequestEntrySetLineItemMetadataMutableBuilder[Self <: SchemaOrdersCustomBatchRequestEntrySetLineItemMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotations(value: js.Array[SchemaOrderMerchantProvidedAnnotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    @scala.inline
    def setAnnotationsVarargs(value: SchemaOrderMerchantProvidedAnnotation*): Self = StObject.set(x, "annotations", js.Array(value :_*))
    
    @scala.inline
    def setLineItemId(value: String): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItemIdUndefined: Self = StObject.set(x, "lineItemId", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
