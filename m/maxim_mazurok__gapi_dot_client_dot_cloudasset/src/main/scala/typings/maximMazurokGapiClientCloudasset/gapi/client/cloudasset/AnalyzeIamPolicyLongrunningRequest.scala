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
  
  @scala.inline
  def apply(): AnalyzeIamPolicyLongrunningRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyzeIamPolicyLongrunningRequest]
  }
  
  @scala.inline
  implicit class AnalyzeIamPolicyLongrunningRequestMutableBuilder[Self <: AnalyzeIamPolicyLongrunningRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalysisQuery(value: IamPolicyAnalysisQuery): Self = StObject.set(x, "analysisQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalysisQueryUndefined: Self = StObject.set(x, "analysisQuery", js.undefined)
    
    @scala.inline
    def setOutputConfig(value: IamPolicyAnalysisOutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
  }
}
