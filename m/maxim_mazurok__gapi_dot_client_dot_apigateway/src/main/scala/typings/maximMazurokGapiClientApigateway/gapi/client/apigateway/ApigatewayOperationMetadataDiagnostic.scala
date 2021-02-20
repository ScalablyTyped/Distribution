package typings.maximMazurokGapiClientApigateway.gapi.client.apigateway

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApigatewayOperationMetadataDiagnostic extends StObject {
  
  /** Location of the diagnostic. */
  var location: js.UndefOr[String] = js.native
  
  /** The diagnostic message. */
  var message: js.UndefOr[String] = js.native
}
object ApigatewayOperationMetadataDiagnostic {
  
  @scala.inline
  def apply(): ApigatewayOperationMetadataDiagnostic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApigatewayOperationMetadataDiagnostic]
  }
  
  @scala.inline
  implicit class ApigatewayOperationMetadataDiagnosticMutableBuilder[Self <: ApigatewayOperationMetadataDiagnostic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
