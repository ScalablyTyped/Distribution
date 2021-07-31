package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnaddressCustomBatchResponseEntry extends StObject {
  
  /** The ID of the request entry to which this entry responds. */
  var batchId: js.UndefOr[Double] = js.undefined
  
  /** A list of errors defined if, and only if, the request failed. */
  var errors: js.UndefOr[Errors] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#returnaddressCustomBatchResponseEntry`" */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The retrieved return address. */
  var returnAddress: js.UndefOr[ReturnAddress] = js.undefined
}
object ReturnaddressCustomBatchResponseEntry {
  
  @scala.inline
  def apply(): ReturnaddressCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnaddressCustomBatchResponseEntry]
  }
  
  @scala.inline
  implicit class ReturnaddressCustomBatchResponseEntryMutableBuilder[Self <: ReturnaddressCustomBatchResponseEntry] (val x: Self) extends AnyVal {
    
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
    def setReturnAddress(value: ReturnAddress): Self = StObject.set(x, "returnAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnAddressUndefined: Self = StObject.set(x, "returnAddress", js.undefined)
  }
}
