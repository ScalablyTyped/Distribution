package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReturnpolicyCustomBatchResponseEntry extends StObject {
  
  /**
    * The ID of the request entry to which this entry responds.
    */
  var batchId: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A list of errors defined if, and only if, the request failed.
    */
  var errors: js.UndefOr[SchemaErrors] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "`content#returnpolicyCustomBatchResponseEntry`"
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The retrieved return policy.
    */
  var returnPolicy: js.UndefOr[SchemaReturnPolicy] = js.undefined
}
object SchemaReturnpolicyCustomBatchResponseEntry {
  
  inline def apply(): SchemaReturnpolicyCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReturnpolicyCustomBatchResponseEntry]
  }
  
  extension [Self <: SchemaReturnpolicyCustomBatchResponseEntry](x: Self) {
    
    inline def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setBatchIdNull: Self = StObject.set(x, "batchId", null)
    
    inline def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    inline def setErrors(value: SchemaErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setReturnPolicy(value: SchemaReturnPolicy): Self = StObject.set(x, "returnPolicy", value.asInstanceOf[js.Any])
    
    inline def setReturnPolicyUndefined: Self = StObject.set(x, "returnPolicy", js.undefined)
  }
}
