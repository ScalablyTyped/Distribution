package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IamPolicyAnalysis extends js.Object {
  
  /** The analysis query. */
  var analysisQuery: js.UndefOr[IamPolicyAnalysisQuery] = js.native
  
  /** A list of IamPolicyAnalysisResult that matches the analysis query, or empty if no result is found. */
  var analysisResults: js.UndefOr[js.Array[IamPolicyAnalysisResult]] = js.native
  
  /** Represents whether all entries in the analysis_results have been fully explored to answer the query. */
  var fullyExplored: js.UndefOr[Boolean] = js.native
  
  /** A list of non-critical errors happened during the query handling. */
  var nonCriticalErrors: js.UndefOr[js.Array[IamPolicyAnalysisState]] = js.native
}
object IamPolicyAnalysis {
  
  @scala.inline
  def apply(): IamPolicyAnalysis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IamPolicyAnalysis]
  }
  
  @scala.inline
  implicit class IamPolicyAnalysisOps[Self <: IamPolicyAnalysis] (val x: Self) extends AnyVal {
    
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
    def setAnalysisQuery(value: IamPolicyAnalysisQuery): Self = this.set("analysisQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalysisQuery: Self = this.set("analysisQuery", js.undefined)
    
    @scala.inline
    def setAnalysisResultsVarargs(value: IamPolicyAnalysisResult*): Self = this.set("analysisResults", js.Array(value :_*))
    
    @scala.inline
    def setAnalysisResults(value: js.Array[IamPolicyAnalysisResult]): Self = this.set("analysisResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalysisResults: Self = this.set("analysisResults", js.undefined)
    
    @scala.inline
    def setFullyExplored(value: Boolean): Self = this.set("fullyExplored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullyExplored: Self = this.set("fullyExplored", js.undefined)
    
    @scala.inline
    def setNonCriticalErrorsVarargs(value: IamPolicyAnalysisState*): Self = this.set("nonCriticalErrors", js.Array(value :_*))
    
    @scala.inline
    def setNonCriticalErrors(value: js.Array[IamPolicyAnalysisState]): Self = this.set("nonCriticalErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonCriticalErrors: Self = this.set("nonCriticalErrors", js.undefined)
  }
}
