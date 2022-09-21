package typings.googleapis.languageV1Mod.languageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDocumentsAnalyzesyntax
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAnalyzeSyntaxRequest] = js.undefined
}
object ParamsResourceDocumentsAnalyzesyntax {
  
  inline def apply(): ParamsResourceDocumentsAnalyzesyntax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDocumentsAnalyzesyntax]
  }
  
  extension [Self <: ParamsResourceDocumentsAnalyzesyntax](x: Self) {
    
    inline def setRequestBody(value: SchemaAnalyzeSyntaxRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
