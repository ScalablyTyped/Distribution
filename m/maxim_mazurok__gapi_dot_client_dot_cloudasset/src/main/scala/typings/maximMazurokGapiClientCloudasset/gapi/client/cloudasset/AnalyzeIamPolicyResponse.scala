package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyzeIamPolicyResponse extends js.Object {
  
  /** Represents whether all entries in the main_analysis and service_account_impersonation_analysis have been fully explored to answer the query in the request. */
  var fullyExplored: js.UndefOr[Boolean] = js.native
  
  /** The main analysis that matches the original request. */
  var mainAnalysis: js.UndefOr[IamPolicyAnalysis] = js.native
  
  /** The service account impersonation analysis if AnalyzeIamPolicyRequest.analyze_service_account_impersonation is enabled. */
  var serviceAccountImpersonationAnalysis: js.UndefOr[js.Array[IamPolicyAnalysis]] = js.native
}
object AnalyzeIamPolicyResponse {
  
  @scala.inline
  def apply(): AnalyzeIamPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyzeIamPolicyResponse]
  }
  
  @scala.inline
  implicit class AnalyzeIamPolicyResponseOps[Self <: AnalyzeIamPolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFullyExplored(value: Boolean): Self = this.set("fullyExplored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullyExplored: Self = this.set("fullyExplored", js.undefined)
    
    @scala.inline
    def setMainAnalysis(value: IamPolicyAnalysis): Self = this.set("mainAnalysis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainAnalysis: Self = this.set("mainAnalysis", js.undefined)
    
    @scala.inline
    def setServiceAccountImpersonationAnalysisVarargs(value: IamPolicyAnalysis*): Self = this.set("serviceAccountImpersonationAnalysis", js.Array(value :_*))
    
    @scala.inline
    def setServiceAccountImpersonationAnalysis(value: js.Array[IamPolicyAnalysis]): Self = this.set("serviceAccountImpersonationAnalysis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccountImpersonationAnalysis: Self = this.set("serviceAccountImpersonationAnalysis", js.undefined)
  }
}
