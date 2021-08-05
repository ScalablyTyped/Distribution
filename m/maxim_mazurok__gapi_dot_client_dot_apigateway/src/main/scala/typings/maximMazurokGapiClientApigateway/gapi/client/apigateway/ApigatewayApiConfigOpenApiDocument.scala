package typings.maximMazurokGapiClientApigateway.gapi.client.apigateway

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApigatewayApiConfigOpenApiDocument extends StObject {
  
  /** The OpenAPI Specification document file. */
  var document: js.UndefOr[ApigatewayApiConfigFile] = js.undefined
}
object ApigatewayApiConfigOpenApiDocument {
  
  inline def apply(): ApigatewayApiConfigOpenApiDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApigatewayApiConfigOpenApiDocument]
  }
  
  extension [Self <: ApigatewayApiConfigOpenApiDocument](x: Self) {
    
    inline def setDocument(value: ApigatewayApiConfigFile): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
  }
}
