package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductstatusesCustomBatchResponseEntry extends StObject {
  
  /** The ID of the request entry this entry responds to. */
  var batchId: js.UndefOr[Double] = js.native
  
  /** A list of errors, if the request failed. */
  var errors: js.UndefOr[Errors] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#productstatusesCustomBatchResponseEntry`" */
  var kind: js.UndefOr[String] = js.native
  
  /** The requested product status. Only defined if the request was successful. */
  var productStatus: js.UndefOr[ProductStatus] = js.native
}
object ProductstatusesCustomBatchResponseEntry {
  
  @scala.inline
  def apply(): ProductstatusesCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductstatusesCustomBatchResponseEntry]
  }
  
  @scala.inline
  implicit class ProductstatusesCustomBatchResponseEntryMutableBuilder[Self <: ProductstatusesCustomBatchResponseEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    @scala.inline
    def setErrors(value: Errors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setProductStatus(value: ProductStatus): Self = StObject.set(x, "productStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductStatusUndefined: Self = StObject.set(x, "productStatus", js.undefined)
  }
}
