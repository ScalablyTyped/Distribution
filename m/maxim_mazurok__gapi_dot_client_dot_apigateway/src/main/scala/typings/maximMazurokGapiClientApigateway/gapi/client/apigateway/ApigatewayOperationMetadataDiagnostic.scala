package typings.maximMazurokGapiClientApigateway.gapi.client.apigateway

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApigatewayOperationMetadataDiagnostic extends StObject {
  
  /** Location of the diagnostic. */
  var location: js.UndefOr[String] = js.undefined
  
  /** The diagnostic message. */
  var message: js.UndefOr[String] = js.undefined
}
object ApigatewayOperationMetadataDiagnostic {
  
  inline def apply(): ApigatewayOperationMetadataDiagnostic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApigatewayOperationMetadataDiagnostic]
  }
  
  extension [Self <: ApigatewayOperationMetadataDiagnostic](x: Self) {
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
