package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDiscovered extends StObject {
  
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
    * When an error is encountered this will contain a LocalizedMessage under details to show to the user. The LocalizedMessage is output only and populated by the API.
    */
  var analysisStatusError: js.UndefOr[SchemaStatus] = js.undefined
  
  /**
    * Whether the resource is continuously analyzed.
    */
  var continuousAnalysis: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The last time continuous analysis was done for this resource. Deprecated, do not use.
    */
  var lastAnalysisTime: js.UndefOr[String | Null] = js.undefined
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
    
    inline def setContinuousAnalysis(value: String): Self = StObject.set(x, "continuousAnalysis", value.asInstanceOf[js.Any])
    
    inline def setContinuousAnalysisNull: Self = StObject.set(x, "continuousAnalysis", null)
    
    inline def setContinuousAnalysisUndefined: Self = StObject.set(x, "continuousAnalysis", js.undefined)
    
    inline def setLastAnalysisTime(value: String): Self = StObject.set(x, "lastAnalysisTime", value.asInstanceOf[js.Any])
    
    inline def setLastAnalysisTimeNull: Self = StObject.set(x, "lastAnalysisTime", null)
    
    inline def setLastAnalysisTimeUndefined: Self = StObject.set(x, "lastAnalysisTime", js.undefined)
  }
}
