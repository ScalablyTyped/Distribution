package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDiscovered extends StObject {
  
  /**
    * The list of analysis that were completed for a resource.
    */
  var analysisCompleted: js.UndefOr[SchemaAnalysisCompleted] = js.undefined
  
  /**
    * Indicates any errors encountered during analysis of a resource. There could be 0 or more of these errors.
    */
  var analysisError: js.UndefOr[js.Array[SchemaStatus]] = js.undefined
  
  /**
    * The status of discovery for the resource.
    */
  var analysisStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When an error is encountered this will contain a LocalizedMessage under details to show to the user. The LocalizedMessage output only and populated by the API.
    */
  var analysisStatusError: js.UndefOr[SchemaStatus] = js.undefined
  
  /**
    * The time occurrences related to this discovery occurrence were archived.
    */
  var archiveTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the resource is continuously analyzed.
    */
  var continuousAnalysis: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The CPE of the resource being scanned.
    */
  var cpe: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The last time this resource was scanned.
    */
  var lastScanTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. An operation that indicates the status of the current scan. This field is deprecated, do not use.
    */
  var operation: js.UndefOr[SchemaOperation] = js.undefined
}
object SchemaDiscovered {
  
  inline def apply(): SchemaDiscovered = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiscovered]
  }
  
  extension [Self <: SchemaDiscovered](x: Self) {
    
    inline def setAnalysisCompleted(value: SchemaAnalysisCompleted): Self = StObject.set(x, "analysisCompleted", value.asInstanceOf[js.Any])
    
    inline def setAnalysisCompletedUndefined: Self = StObject.set(x, "analysisCompleted", js.undefined)
    
    inline def setAnalysisError(value: js.Array[SchemaStatus]): Self = StObject.set(x, "analysisError", value.asInstanceOf[js.Any])
    
    inline def setAnalysisErrorUndefined: Self = StObject.set(x, "analysisError", js.undefined)
    
    inline def setAnalysisErrorVarargs(value: SchemaStatus*): Self = StObject.set(x, "analysisError", js.Array(value*))
    
    inline def setAnalysisStatus(value: String): Self = StObject.set(x, "analysisStatus", value.asInstanceOf[js.Any])
    
    inline def setAnalysisStatusError(value: SchemaStatus): Self = StObject.set(x, "analysisStatusError", value.asInstanceOf[js.Any])
    
    inline def setAnalysisStatusErrorUndefined: Self = StObject.set(x, "analysisStatusError", js.undefined)
    
    inline def setAnalysisStatusNull: Self = StObject.set(x, "analysisStatus", null)
    
    inline def setAnalysisStatusUndefined: Self = StObject.set(x, "analysisStatus", js.undefined)
    
    inline def setArchiveTime(value: String): Self = StObject.set(x, "archiveTime", value.asInstanceOf[js.Any])
    
    inline def setArchiveTimeNull: Self = StObject.set(x, "archiveTime", null)
    
    inline def setArchiveTimeUndefined: Self = StObject.set(x, "archiveTime", js.undefined)
    
    inline def setContinuousAnalysis(value: String): Self = StObject.set(x, "continuousAnalysis", value.asInstanceOf[js.Any])
    
    inline def setContinuousAnalysisNull: Self = StObject.set(x, "continuousAnalysis", null)
    
    inline def setContinuousAnalysisUndefined: Self = StObject.set(x, "continuousAnalysis", js.undefined)
    
    inline def setCpe(value: String): Self = StObject.set(x, "cpe", value.asInstanceOf[js.Any])
    
    inline def setCpeNull: Self = StObject.set(x, "cpe", null)
    
    inline def setCpeUndefined: Self = StObject.set(x, "cpe", js.undefined)
    
    inline def setLastScanTime(value: String): Self = StObject.set(x, "lastScanTime", value.asInstanceOf[js.Any])
    
    inline def setLastScanTimeNull: Self = StObject.set(x, "lastScanTime", null)
    
    inline def setLastScanTimeUndefined: Self = StObject.set(x, "lastScanTime", js.undefined)
    
    inline def setOperation(value: SchemaOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
  }
}
