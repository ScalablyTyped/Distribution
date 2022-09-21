package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJobMetadata extends StObject {
  
  /**
    * Output only. The job id.
    */
  var jobId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Operation type.
    */
  var operationType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Job submission time.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Most recent job status.
    */
  var status: js.UndefOr[SchemaJobStatus] = js.undefined
}
object SchemaJobMetadata {
  
  inline def apply(): SchemaJobMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobMetadata]
  }
  
  extension [Self <: SchemaJobMetadata](x: Self) {
    
    inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdNull: Self = StObject.set(x, "jobId", null)
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setOperationType(value: String): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def setOperationTypeNull: Self = StObject.set(x, "operationType", null)
    
    inline def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: SchemaJobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
