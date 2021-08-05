package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the analysis status of a discovered resource.
  */
trait SchemaDiscovered extends StObject {
  
  /**
    * The status of discovery for the resource.
    */
  var analysisStatus: js.UndefOr[String] = js.undefined
  
  /**
    * When an error is encountered this will contain a LocalizedMessage under
    * details to show to the user. The LocalizedMessage is output only and
    * populated by the API.
    */
  var analysisStatusError: js.UndefOr[SchemaStatus] = js.undefined
  
  /**
    * Whether the resource is continuously analyzed.
    */
  var continuousAnalysis: js.UndefOr[String] = js.undefined
  
  /**
    * The last time continuous analysis was done for this resource. Deprecated,
    * do not use.
    */
  var lastAnalysisTime: js.UndefOr[String] = js.undefined
}
object SchemaDiscovered {
  
  inline def apply(): SchemaDiscovered = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiscovered]
  }
  
  extension [Self <: SchemaDiscovered](x: Self) {
    
    inline def setAnalysisStatus(value: String): Self = StObject.set(x, "analysisStatus", value.asInstanceOf[js.Any])
    
    inline def setAnalysisStatusError(value: SchemaStatus): Self = StObject.set(x, "analysisStatusError", value.asInstanceOf[js.Any])
    
    inline def setAnalysisStatusErrorUndefined: Self = StObject.set(x, "analysisStatusError", js.undefined)
    
    inline def setAnalysisStatusUndefined: Self = StObject.set(x, "analysisStatus", js.undefined)
    
    inline def setContinuousAnalysis(value: String): Self = StObject.set(x, "continuousAnalysis", value.asInstanceOf[js.Any])
    
    inline def setContinuousAnalysisUndefined: Self = StObject.set(x, "continuousAnalysis", js.undefined)
    
    inline def setLastAnalysisTime(value: String): Self = StObject.set(x, "lastAnalysisTime", value.asInstanceOf[js.Any])
    
    inline def setLastAnalysisTimeUndefined: Self = StObject.set(x, "lastAnalysisTime", js.undefined)
  }
}
