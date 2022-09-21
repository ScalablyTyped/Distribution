package typings.googleapis.v1p4beta1Mod.cloudassetV1p4beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExportIamPolicyAnalysisRequest extends StObject {
  
  /**
    * Required. The request query.
    */
  var analysisQuery: js.UndefOr[SchemaIamPolicyAnalysisQuery] = js.undefined
  
  /**
    * Optional. The request options.
    */
  var options: js.UndefOr[SchemaOptions] = js.undefined
  
  /**
    * Required. Output configuration indicating where the results will be output to.
    */
  var outputConfig: js.UndefOr[SchemaIamPolicyAnalysisOutputConfig] = js.undefined
}
object SchemaExportIamPolicyAnalysisRequest {
  
  inline def apply(): SchemaExportIamPolicyAnalysisRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExportIamPolicyAnalysisRequest]
  }
  
  extension [Self <: SchemaExportIamPolicyAnalysisRequest](x: Self) {
    
    inline def setAnalysisQuery(value: SchemaIamPolicyAnalysisQuery): Self = StObject.set(x, "analysisQuery", value.asInstanceOf[js.Any])
    
    inline def setAnalysisQueryUndefined: Self = StObject.set(x, "analysisQuery", js.undefined)
    
    inline def setOptions(value: SchemaOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOutputConfig(value: SchemaIamPolicyAnalysisOutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
  }
}
