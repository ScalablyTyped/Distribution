package typings.googleapis.languageV1beta2Mod.languageV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDocumentsAnalyzesentiment
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAnalyzeSentimentRequest] = js.undefined
}
object ParamsResourceDocumentsAnalyzesentiment {
  
  inline def apply(): ParamsResourceDocumentsAnalyzesentiment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDocumentsAnalyzesentiment]
  }
  
  extension [Self <: ParamsResourceDocumentsAnalyzesentiment](x: Self) {
    
    inline def setRequestBody(value: SchemaAnalyzeSentimentRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
