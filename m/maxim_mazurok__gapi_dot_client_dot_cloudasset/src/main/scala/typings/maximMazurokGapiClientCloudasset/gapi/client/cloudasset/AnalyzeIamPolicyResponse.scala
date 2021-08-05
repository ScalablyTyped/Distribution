package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyzeIamPolicyResponse extends StObject {
  
  /** Represents whether all entries in the main_analysis and service_account_impersonation_analysis have been fully explored to answer the query in the request. */
  var fullyExplored: js.UndefOr[Boolean] = js.undefined
  
  /** The main analysis that matches the original request. */
  var mainAnalysis: js.UndefOr[IamPolicyAnalysis] = js.undefined
  
  /** The service account impersonation analysis if AnalyzeIamPolicyRequest.analyze_service_account_impersonation is enabled. */
  var serviceAccountImpersonationAnalysis: js.UndefOr[js.Array[IamPolicyAnalysis]] = js.undefined
}
object AnalyzeIamPolicyResponse {
  
  inline def apply(): AnalyzeIamPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyzeIamPolicyResponse]
  }
  
  extension [Self <: AnalyzeIamPolicyResponse](x: Self) {
    
    inline def setFullyExplored(value: Boolean): Self = StObject.set(x, "fullyExplored", value.asInstanceOf[js.Any])
    
    inline def setFullyExploredUndefined: Self = StObject.set(x, "fullyExplored", js.undefined)
    
    inline def setMainAnalysis(value: IamPolicyAnalysis): Self = StObject.set(x, "mainAnalysis", value.asInstanceOf[js.Any])
    
    inline def setMainAnalysisUndefined: Self = StObject.set(x, "mainAnalysis", js.undefined)
    
    inline def setServiceAccountImpersonationAnalysis(value: js.Array[IamPolicyAnalysis]): Self = StObject.set(x, "serviceAccountImpersonationAnalysis", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountImpersonationAnalysisUndefined: Self = StObject.set(x, "serviceAccountImpersonationAnalysis", js.undefined)
    
    inline def setServiceAccountImpersonationAnalysisVarargs(value: IamPolicyAnalysis*): Self = StObject.set(x, "serviceAccountImpersonationAnalysis", js.Array(value :_*))
  }
}
