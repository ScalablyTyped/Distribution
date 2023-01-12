package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryContent extends StObject {
  
  /** An IAM Policy Analysis query, which could be used in the AssetService.AnalyzeIamPolicy rpc or the AssetService.AnalyzeIamPolicyLongrunning rpc. */
  var iamPolicyAnalysisQuery: js.UndefOr[IamPolicyAnalysisQuery] = js.undefined
}
object QueryContent {
  
  inline def apply(): QueryContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryContent] (val x: Self) extends AnyVal {
    
    inline def setIamPolicyAnalysisQuery(value: IamPolicyAnalysisQuery): Self = StObject.set(x, "iamPolicyAnalysisQuery", value.asInstanceOf[js.Any])
    
    inline def setIamPolicyAnalysisQueryUndefined: Self = StObject.set(x, "iamPolicyAnalysisQuery", js.undefined)
  }
}
