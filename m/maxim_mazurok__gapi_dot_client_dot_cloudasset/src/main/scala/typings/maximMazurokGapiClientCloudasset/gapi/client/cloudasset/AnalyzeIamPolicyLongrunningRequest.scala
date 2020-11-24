package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyzeIamPolicyLongrunningRequest extends js.Object {
  
  /** Required. The request query. */
  var analysisQuery: js.UndefOr[IamPolicyAnalysisQuery] = js.native
  
  /** Required. Output configuration indicating where the results will be output to. */
  var outputConfig: js.UndefOr[IamPolicyAnalysisOutputConfig] = js.native
}
object AnalyzeIamPolicyLongrunningRequest {
  
  @scala.inline
  def apply(): AnalyzeIamPolicyLongrunningRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyzeIamPolicyLongrunningRequest]
  }
  
  @scala.inline
  implicit class AnalyzeIamPolicyLongrunningRequestOps[Self <: AnalyzeIamPolicyLongrunningRequest] (val x: Self) extends AnyVal {
    
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
    def setOutputConfig(value: IamPolicyAnalysisOutputConfig): Self = this.set("outputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputConfig: Self = this.set("outputConfig", js.undefined)
  }
}
