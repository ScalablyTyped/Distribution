package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisCompleted extends StObject {
  
  var analysisType: js.UndefOr[js.Array[String]] = js.undefined
}
object AnalysisCompleted {
  
  inline def apply(): AnalysisCompleted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisCompleted]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisCompleted] (val x: Self) extends AnyVal {
    
    inline def setAnalysisType(value: js.Array[String]): Self = StObject.set(x, "analysisType", value.asInstanceOf[js.Any])
    
    inline def setAnalysisTypeUndefined: Self = StObject.set(x, "analysisType", js.undefined)
    
    inline def setAnalysisTypeVarargs(value: String*): Self = StObject.set(x, "analysisType", js.Array(value*))
  }
}
