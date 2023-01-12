package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaslAuthenticateArgs[ParseResult] extends StObject {
  
  var request: SaslAuthenticationRequest
  
  var response: js.UndefOr[SaslAuthenticationResponse[ParseResult]] = js.undefined
}
object SaslAuthenticateArgs {
  
  inline def apply[ParseResult](request: SaslAuthenticationRequest): SaslAuthenticateArgs[ParseResult] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaslAuthenticateArgs[ParseResult]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SaslAuthenticateArgs[?], ParseResult] (val x: Self & SaslAuthenticateArgs[ParseResult]) extends AnyVal {
    
    inline def setRequest(value: SaslAuthenticationRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: SaslAuthenticationResponse[ParseResult]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
