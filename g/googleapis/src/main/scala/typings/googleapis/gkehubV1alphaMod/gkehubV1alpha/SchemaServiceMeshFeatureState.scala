package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServiceMeshFeatureState extends StObject {
  
  /**
    * Output only. Results of running Service Mesh analyzers.
    */
  var analysisMessages: js.UndefOr[js.Array[SchemaServiceMeshAnalysisMessage]] = js.undefined
}
object SchemaServiceMeshFeatureState {
  
  inline def apply(): SchemaServiceMeshFeatureState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceMeshFeatureState]
  }
  
  extension [Self <: SchemaServiceMeshFeatureState](x: Self) {
    
    inline def setAnalysisMessages(value: js.Array[SchemaServiceMeshAnalysisMessage]): Self = StObject.set(x, "analysisMessages", value.asInstanceOf[js.Any])
    
    inline def setAnalysisMessagesUndefined: Self = StObject.set(x, "analysisMessages", js.undefined)
    
    inline def setAnalysisMessagesVarargs(value: SchemaServiceMeshAnalysisMessage*): Self = StObject.set(x, "analysisMessages", js.Array(value*))
  }
}
