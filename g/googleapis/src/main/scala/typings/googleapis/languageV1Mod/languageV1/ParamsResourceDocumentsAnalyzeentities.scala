package typings.googleapis.languageV1Mod.languageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDocumentsAnalyzeentities
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAnalyzeEntitiesRequest] = js.undefined
}
object ParamsResourceDocumentsAnalyzeentities {
  
  inline def apply(): ParamsResourceDocumentsAnalyzeentities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDocumentsAnalyzeentities]
  }
  
  extension [Self <: ParamsResourceDocumentsAnalyzeentities](x: Self) {
    
    inline def setRequestBody(value: SchemaAnalyzeEntitiesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
