package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDatafeedstatusesCustomBatchResponseEntry extends StObject {
  
  /**
    * The ID of the request entry this entry responds to.
    */
  var batchId: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The requested data feed status. Defined if and only if the request was successful.
    */
  var datafeedStatus: js.UndefOr[SchemaDatafeedStatus] = js.undefined
  
  /**
    * A list of errors defined if and only if the request failed.
    */
  var errors: js.UndefOr[SchemaErrors] = js.undefined
}
object SchemaDatafeedstatusesCustomBatchResponseEntry {
  
  inline def apply(): SchemaDatafeedstatusesCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatafeedstatusesCustomBatchResponseEntry]
  }
  
  extension [Self <: SchemaDatafeedstatusesCustomBatchResponseEntry](x: Self) {
    
    inline def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setBatchIdNull: Self = StObject.set(x, "batchId", null)
    
    inline def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    inline def setDatafeedStatus(value: SchemaDatafeedStatus): Self = StObject.set(x, "datafeedStatus", value.asInstanceOf[js.Any])
    
    inline def setDatafeedStatusUndefined: Self = StObject.set(x, "datafeedStatus", js.undefined)
    
    inline def setErrors(value: SchemaErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
  }
}
