package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnpolicyCustomBatchResponseEntry extends StObject {
  
  /** The ID of the request entry to which this entry responds. */
  var batchId: js.UndefOr[Double] = js.undefined
  
  /** A list of errors defined if, and only if, the request failed. */
  var errors: js.UndefOr[Errors] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#returnpolicyCustomBatchResponseEntry`" */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The retrieved return policy. */
  var returnPolicy: js.UndefOr[ReturnPolicy] = js.undefined
}
object ReturnpolicyCustomBatchResponseEntry {
  
  inline def apply(): ReturnpolicyCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnpolicyCustomBatchResponseEntry]
  }
  
  extension [Self <: ReturnpolicyCustomBatchResponseEntry](x: Self) {
    
    inline def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    inline def setErrors(value: Errors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setReturnPolicy(value: ReturnPolicy): Self = StObject.set(x, "returnPolicy", value.asInstanceOf[js.Any])
    
    inline def setReturnPolicyUndefined: Self = StObject.set(x, "returnPolicy", js.undefined)
  }
}
