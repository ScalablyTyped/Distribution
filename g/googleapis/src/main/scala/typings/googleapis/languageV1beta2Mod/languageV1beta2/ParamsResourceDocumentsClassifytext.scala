package typings.googleapis.languageV1beta2Mod.languageV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDocumentsClassifytext
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaClassifyTextRequest] = js.undefined
}
object ParamsResourceDocumentsClassifytext {
  
  inline def apply(): ParamsResourceDocumentsClassifytext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDocumentsClassifytext]
  }
  
  extension [Self <: ParamsResourceDocumentsClassifytext](x: Self) {
    
    inline def setRequestBody(value: SchemaClassifyTextRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
