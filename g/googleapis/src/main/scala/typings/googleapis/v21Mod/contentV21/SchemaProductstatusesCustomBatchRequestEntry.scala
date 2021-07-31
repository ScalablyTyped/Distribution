package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A batch entry encoding a single non-batch productstatuses request.
  */
trait SchemaProductstatusesCustomBatchRequestEntry extends StObject {
  
  /**
    * An entry ID, unique within the batch request.
    */
  var batchId: js.UndefOr[Double] = js.undefined
  
  /**
    * If set, only issues for the specified destinations are returned,
    * otherwise only issues for the Shopping destination.
    */
  var destinations: js.UndefOr[js.Array[String]] = js.undefined
  
  var includeAttributes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the managing account.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the product whose status to get.
    */
  var productId: js.UndefOr[String] = js.undefined
}
object SchemaProductstatusesCustomBatchRequestEntry {
  
  @scala.inline
  def apply(): SchemaProductstatusesCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductstatusesCustomBatchRequestEntry]
  }
  
  @scala.inline
  implicit class SchemaProductstatusesCustomBatchRequestEntryMutableBuilder[Self <: SchemaProductstatusesCustomBatchRequestEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    @scala.inline
    def setDestinations(value: js.Array[String]): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationsUndefined: Self = StObject.set(x, "destinations", js.undefined)
    
    @scala.inline
    def setDestinationsVarargs(value: String*): Self = StObject.set(x, "destinations", js.Array(value :_*))
    
    @scala.inline
    def setIncludeAttributes(value: Boolean): Self = StObject.set(x, "includeAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeAttributesUndefined: Self = StObject.set(x, "includeAttributes", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
