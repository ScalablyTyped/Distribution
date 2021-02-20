package typings.maximMazurokGapiClientApigateway.gapi.client.apigateway

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApigatewayApiConfigOpenApiDocument extends StObject {
  
  /** The OpenAPI Specification document file. */
  var document: js.UndefOr[ApigatewayApiConfigFile] = js.native
}
object ApigatewayApiConfigOpenApiDocument {
  
  @scala.inline
  def apply(): ApigatewayApiConfigOpenApiDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApigatewayApiConfigOpenApiDocument]
  }
  
  @scala.inline
  implicit class ApigatewayApiConfigOpenApiDocumentMutableBuilder[Self <: ApigatewayApiConfigOpenApiDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: ApigatewayApiConfigFile): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
  }
}
