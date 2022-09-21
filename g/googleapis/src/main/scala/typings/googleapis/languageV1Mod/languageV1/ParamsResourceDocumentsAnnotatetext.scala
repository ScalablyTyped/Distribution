package typings.googleapis.languageV1Mod.languageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDocumentsAnnotatetext
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAnnotateTextRequest] = js.undefined
}
object ParamsResourceDocumentsAnnotatetext {
  
  inline def apply(): ParamsResourceDocumentsAnnotatetext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDocumentsAnnotatetext]
  }
  
  extension [Self <: ParamsResourceDocumentsAnnotatetext](x: Self) {
    
    inline def setRequestBody(value: SchemaAnnotateTextRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
