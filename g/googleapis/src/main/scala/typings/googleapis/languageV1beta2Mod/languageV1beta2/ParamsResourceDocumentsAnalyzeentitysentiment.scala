package typings.googleapis.languageV1beta2Mod.languageV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDocumentsAnalyzeentitysentiment
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAnalyzeEntitySentimentRequest] = js.undefined
}
object ParamsResourceDocumentsAnalyzeentitysentiment {
  
  inline def apply(): ParamsResourceDocumentsAnalyzeentitysentiment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDocumentsAnalyzeentitysentiment]
  }
  
  extension [Self <: ParamsResourceDocumentsAnalyzeentitysentiment](x: Self) {
    
    inline def setRequestBody(value: SchemaAnalyzeEntitySentimentRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
