package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyzeIamPolicyLongrunningRequest extends StObject {
  
  /** Required. The request query. */
  var analysisQuery: js.UndefOr[IamPolicyAnalysisQuery] = js.undefined
  
  /** Required. Output configuration indicating where the results will be output to. */
  var outputConfig: js.UndefOr[IamPolicyAnalysisOutputConfig] = js.undefined
}
object AnalyzeIamPolicyLongrunningRequest {
  
  inline def apply(): AnalyzeIamPolicyLongrunningRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyzeIamPolicyLongrunningRequest]
  }
  
  extension [Self <: AnalyzeIamPolicyLongrunningRequest](x: Self) {
    
    inline def setAnalysisQuery(value: IamPolicyAnalysisQuery): Self = StObject.set(x, "analysisQuery", value.asInstanceOf[js.Any])
    
    inline def setAnalysisQueryUndefined: Self = StObject.set(x, "analysisQuery", js.undefined)
    
    inline def setOutputConfig(value: IamPolicyAnalysisOutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
  }
}
