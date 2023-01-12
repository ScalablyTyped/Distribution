package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyzeIamPolicyLongrunningRequest extends StObject {
  
  /** Required. The request query. */
  var analysisQuery: js.UndefOr[IamPolicyAnalysisQuery] = js.undefined
  
  /** Required. Output configuration indicating where the results will be output to. */
  var outputConfig: js.UndefOr[IamPolicyAnalysisOutputConfig] = js.undefined
  
  /**
    * Optional. The name of a saved query, which must be in the format of: * projects/project_number/savedQueries/saved_query_id * folders/folder_number/savedQueries/saved_query_id *
    * organizations/organization_number/savedQueries/saved_query_id If both `analysis_query` and `saved_analysis_query` are provided, they will be merged together with the
    * `saved_analysis_query` as base and the `analysis_query` as overrides. For more details of the merge behavior, please refer to the
    * [MergeFrom](https://developers.google.com/protocol-buffers/docs/reference/cpp/google.protobuf.message#Message.MergeFrom.details) doc. Note that you cannot override primitive fields
    * with default value, such as 0 or empty string, etc., because we use proto3, which doesn't support field presence yet.
    */
  var savedAnalysisQuery: js.UndefOr[String] = js.undefined
}
object AnalyzeIamPolicyLongrunningRequest {
  
  inline def apply(): AnalyzeIamPolicyLongrunningRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyzeIamPolicyLongrunningRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalyzeIamPolicyLongrunningRequest] (val x: Self) extends AnyVal {
    
    inline def setAnalysisQuery(value: IamPolicyAnalysisQuery): Self = StObject.set(x, "analysisQuery", value.asInstanceOf[js.Any])
    
    inline def setAnalysisQueryUndefined: Self = StObject.set(x, "analysisQuery", js.undefined)
    
    inline def setOutputConfig(value: IamPolicyAnalysisOutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
    
    inline def setSavedAnalysisQuery(value: String): Self = StObject.set(x, "savedAnalysisQuery", value.asInstanceOf[js.Any])
    
    inline def setSavedAnalysisQueryUndefined: Self = StObject.set(x, "savedAnalysisQuery", js.undefined)
  }
}
