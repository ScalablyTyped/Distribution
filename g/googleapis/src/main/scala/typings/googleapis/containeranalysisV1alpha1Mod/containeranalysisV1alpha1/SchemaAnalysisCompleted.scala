package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAnalysisCompleted extends StObject {
  
  /**
    * type of analysis that were completed on a resource.
    */
  var analysisType: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaAnalysisCompleted {
  
  inline def apply(): SchemaAnalysisCompleted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnalysisCompleted]
  }
  
  extension [Self <: SchemaAnalysisCompleted](x: Self) {
    
    inline def setAnalysisType(value: js.Array[String]): Self = StObject.set(x, "analysisType", value.asInstanceOf[js.Any])
    
    inline def setAnalysisTypeNull: Self = StObject.set(x, "analysisType", null)
    
    inline def setAnalysisTypeUndefined: Self = StObject.set(x, "analysisType", js.undefined)
    
    inline def setAnalysisTypeVarargs(value: String*): Self = StObject.set(x, "analysisType", js.Array(value*))
  }
}
